package com.hwx.ambariapilib.json.service;

/**
 * Created by ajain on 10/7/15.
 */
public class ServiceComponentJson {
    private String href;
    private ServiceComponentItemJson[] items;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ServiceComponentItemJson[] getGetServiceComponents() {
        return items;
    }

    public void setGetServiceComponents(ServiceComponentItemJson[] getServiceComponents) {
        this.items = getServiceComponents;
    }
}
