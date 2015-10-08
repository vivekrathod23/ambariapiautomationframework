package com.hwx.ambariapilib.json.service;

/**
 * Created by ajain on 10/7/15.
 */
public class ServiceComponentJson {
    private String href;
    private ServiceComponentItemJson[] getServiceComponents;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ServiceComponentItemJson[] getGetServiceComponents() {
        return getServiceComponents;
    }

    public void setGetServiceComponents(ServiceComponentItemJson[] getServiceComponents) {
        this.getServiceComponents = getServiceComponents;
    }
}
