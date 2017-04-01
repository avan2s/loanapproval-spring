package org.camunda.bpm.tasklistener;

import org.camunda.bpm.engine.FormService;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.camunda.bpm.engine.form.FormField;
import org.camunda.bpm.engine.form.TaskFormData;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andy on  26.03.2017.
 */
public class TaskListener1 implements TaskListener {

    @Override
    public void notify(DelegateTask task) {

//        TaskFormData taskFormData = formService.getTaskFormData(task.getId());
//        List<FormField> formFields = taskFormData.getFormFields();
//        for(FormField f : formFields){
//            Map<String, String> properties = f.getProperties();
//  //          System.out.println(properties);
//        }
//        VariableMap taskFormVariables = formService.getTaskFormVariables(task.getId());
//        task.getId();
        System.out.println("is called");
    }


}
