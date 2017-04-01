package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Created by Andy on 01.04.2017.
 */
public class DelegateLongLasting implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        boolean b = true;
        for (long i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        execution.setVariable("var", true);
    }

    public void throwException() throws Exception {
        throw new Exception("An error");
    }
}
