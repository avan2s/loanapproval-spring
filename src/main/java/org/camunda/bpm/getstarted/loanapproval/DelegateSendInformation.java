package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Created by Andy on 01.04.2017.
 */
public class DelegateSendInformation implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        RuntimeService runtimeService = execution.getProcessEngineServices().getRuntimeService();
        Long number = (Long) execution.getVariable("number");
        runtimeService.createMessageCorrelation("incomingInformation").processInstanceVariableEquals("referenceNumber", number).correlateAll();
    }
}
