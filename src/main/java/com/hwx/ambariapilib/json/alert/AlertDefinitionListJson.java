package com.hwx.ambariapilib.json.alert;

/**
 * Created by ajain on 9/30/15.
 */
public class AlertDefinitionListJson {
    private String href;
    private AlertDefinitionJson AlertDefinition;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public AlertDefinitionJson getAlertDefinition() {
        return AlertDefinition;
    }

    public void setAlertDefinition(AlertDefinitionJson alertDefinition) {
        AlertDefinition = alertDefinition;
    }
}
