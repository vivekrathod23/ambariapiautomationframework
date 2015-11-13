package com.hwx.ambariapilib.json.alert;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hwx.ambariapilib.json.alert.AlertDetailsJson;
/**
 * Created by pankaj.singh on 11/11/15.
 */
public class AlertDetails {
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("Alert")
    @Expose
    private AlertDetailsJson Alert;

    /**
     *
     * @return
     * The href
     */
    public String getHref() {
        return href;
    }

    /**
     *
     * @param href
     * The href
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     *
     * @return
     * The Alert
     */
    public AlertDetailsJson getAlert() {
        return Alert;
    }

    /**
     *
     * @param Alert
     * The Alert
     */
    public void setAlert(AlertDetailsJson Alert) {
        this.Alert = Alert;
    }
}
