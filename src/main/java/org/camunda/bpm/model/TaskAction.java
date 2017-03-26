package org.camunda.bpm.model;

import java.io.Serializable;

/**
 * Created by Andy on 26.03.2017.
 */
public class TaskAction implements Serializable{
    private String actionName;
    private String variableName;

    public TaskAction() {
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }
}
