package org.camunda.bpm.executionlisteners;

import org.camunda.bpm.engine.FormService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

/**
 * Created by Andy on 26.03.2017.
 */
public class ExecutionListenerActionPrinter implements ExecutionListener {
    public void notify(DelegateExecution execution) throws Exception {
        FormService formService = execution.getProcessEngineServices().getFormService();

        System.out.println("listener called");
    }
}
