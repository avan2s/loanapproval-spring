package org.camunda.bpm.executionlisteners;

import org.camunda.bpm.engine.delegate.DelegateExecution;

/**
 * Created by Andy on 25.03.2017.
 */
public class ExecutionListenerOutputVariables{

    public void notify(DelegateExecution delegateExecution) throws Exception {
        System.out.println("!!!!!!!!!!!HALASODJDIJFJDSOFJDFJPODSJFIOSDJFIODFIO DFJOIDFJ FJIOJDFOFODJSFJD SFJSDFJIODSJ!!!!!!!!!!!!!!");
        System.out.println(delegateExecution.getVariables().keySet());
    }
}
