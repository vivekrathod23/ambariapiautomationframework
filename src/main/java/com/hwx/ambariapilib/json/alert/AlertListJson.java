package com.hwx.ambariapilib.json.alert;

/**
 * Created by ajain on 9/28/15.
 */
public class AlertListJson {
    private String href;
    private AlertJson Alert;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public AlertJson getAlert() {
        return Alert;
    }

    public void setAlert(AlertJson alert) {
        Alert = alert;
    }
}
