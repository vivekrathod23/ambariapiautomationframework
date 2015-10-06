package com.hwx.ambariapilib.json.service;

/**
 * Created by ajain on 10/5/15.
 */
public class ServiceListJson {
    private String href;
    private ServiceInfoJson ServiceInfo;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ServiceInfoJson getServiceInfo() {
        return ServiceInfo;
    }

    public void setServiceInfo(ServiceInfoJson serviceInfo) {
        ServiceInfo = serviceInfo;
    }
}
