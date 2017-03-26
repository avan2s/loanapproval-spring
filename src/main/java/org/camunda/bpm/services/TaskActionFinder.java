package org.camunda.bpm.services;

import org.camunda.bpm.engine.FormService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.form.TaskFormData;
import org.camunda.bpm.model.TaskAction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Created by Andy on 26.03.2017.
 */
public class TaskActionFinder {
    public Map<String, TaskAction> taskActions;

    @Autowired
    private ProcessEngine processEngine;

    public List<TaskAction> getTaskActions(String taskId){
        FormService formService = processEngine.getFormService();
        TaskFormData taskFormData = formService.getTaskFormData(taskId);
        return null;
    }

    public void setProcessEngine(ProcessEngine processEngine) {
        this.processEngine = processEngine;
    }
}
