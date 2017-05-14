package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.Execution;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Andy on 25.03.2017.
 */
public class Starter implements InitializingBean {

    @Autowired
    private RuntimeService runtimeService;

    public void afterPropertiesSet() throws Exception {
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("loanApproval", "businessKey-123");
        List<Execution> executionList = runtimeService.createExecutionQuery().messageEventSubscriptionName("m").list();
        System.out.println(executionList);
    }

    public void setRuntimeService(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }
}
