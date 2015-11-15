package com.hwx.ambariapilib.json.alert;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Created by pankaj.singh on 11/13/15.
 */
public class Alert {
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("Alert")
    @Expose
    private AlertList Alertlist;
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
    public AlertList getAlert() {
        return Alertlist;
    }

    /**
     *
     * @param Alert
     * The Alert
     */
    public void setAlert(AlertList Alert) {
        this.Alertlist = Alert;
    }
}
