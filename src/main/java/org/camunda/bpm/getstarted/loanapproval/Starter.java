package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Andy on 25.03.2017.
 */
public class Starter implements InitializingBean {

    @Autowired
    private RuntimeService runtimeService;

    public void afterPropertiesSet() throws Exception {
        runtimeService.startProcessInstanceByKey("loanApproval");
    }

    public void setRuntimeService(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }
}
