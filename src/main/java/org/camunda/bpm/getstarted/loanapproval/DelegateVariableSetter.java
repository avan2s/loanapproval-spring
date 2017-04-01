package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.executionlisteners.ExecutionListenerActionPrinter;

/**
 * Created by Andy on 01.04.2017.
 */
public class DelegateVariableSetter implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Long id = 10L;
        delegateExecution.setVariable(ExecutionListenerActionPrinter.ENTITY_ID, id);
    }
}
