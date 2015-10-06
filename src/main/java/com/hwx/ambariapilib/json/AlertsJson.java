package com.hwx.ambariapilib.json;

/**
 * Created by ajain on 9/28/15.
 */
public class AlertsJson {
    private String href;
    private Alert Alert;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public com.hwx.ambariapilib.json.Alert getAlert() {
        return Alert;
    }

    public void setAlert(com.hwx.ambariapilib.json.Alert alert) {
        Alert = alert;
    }
}
