package com.hwx.ambariapilib.json.alert;

/**
 * Created by pankaj.singh on 11/10/15.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hwx.ambariapilib.json.alert.ServiceComponentInfo;

public class Component {
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("ServiceComponentInfo")
    @Expose
    private ServiceComponentInfo ServiceComponentInfo;

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
     * The ServiceComponentInfo
     */
    public com.hwx.ambariapilib.json.alert.ServiceComponentInfo getServiceComponentInfo() {
        return ServiceComponentInfo;
    }

    /**
     *
     * @param ServiceComponentInfo
     * The ServiceComponentInfo
     */
    public void setServiceComponentInfo(ServiceComponentInfo ServiceComponentInfo) {
        this.ServiceComponentInfo = ServiceComponentInfo;
    }

}
