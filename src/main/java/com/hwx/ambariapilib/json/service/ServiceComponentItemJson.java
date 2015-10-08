package com.hwx.ambariapilib.json.service;

/**
 * Created by ajain on 10/7/15.
 */
public class ServiceComponentItemJson {
    private String href;
    private ServiceComponentShortInfoJson ServiceComponentInfo;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ServiceComponentShortInfoJson getServiceComponentInfo() {
        return ServiceComponentInfo;
    }

    public void setServiceComponentInfo(ServiceComponentShortInfoJson serviceComponentInfo) {
        ServiceComponentInfo = serviceComponentInfo;
    }
}
