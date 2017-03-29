package org.camunda.bpm.tasklistener;

import org.camunda.bpm.engine.FormService;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.camunda.bpm.engine.form.FormField;
import org.camunda.bpm.engine.form.TaskFormData;
import org.camunda.bpm.engine.variable.VariableMap;

import java.util.List;
import java.util.Map;

/**
 * Created by Andy on  26.03.2017.
 */
public class TaskListener1 implements TaskListener {
    public void notify(DelegateTask task) {
        FormService formService = task.getProcessEngineServices().getFormService();
        TaskFormData taskFormData = formService.getTaskFormData(task.getId());
        List<FormField> formFields = taskFormData.getFormFields();
        for(FormField f : formFields){
            Map<String, String> properties = f.getProperties();
            System.out.println(properties);
        }
        VariableMap taskFormVariables = formService.getTaskFormVariables(task.getId());
        task.getId();
    }
}
