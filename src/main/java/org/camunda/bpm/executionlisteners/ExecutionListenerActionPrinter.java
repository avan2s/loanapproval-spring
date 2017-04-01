package org.camunda.bpm.executionlisteners;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.camunda.bpm.engine.runtime.Execution;
import org.camunda.bpm.engine.runtime.ProcessInstance;

import java.util.List;

/**
 * Created by Andy on 26.03.2017.
 */
public class ExecutionListenerActionPrinter implements ExecutionListener {
    public static final String ENTITY_ID = "entityId";

    public void notify(DelegateExecution execution) throws Exception {
        Long id = 10L;
        RuntimeService runtimeService = execution.getProcessEngineServices().getRuntimeService();
        List<ProcessInstance> piList = runtimeService.createProcessInstanceQuery().variableValueEquals(ENTITY_ID, id).list();
        List<Execution> executionList = runtimeService.createExecutionQuery().processVariableValueEquals(ENTITY_ID, id).list();


        System.out.println("listener called");
    }
}
