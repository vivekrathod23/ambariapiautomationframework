package com.hwx.ambariapilib.json;

/**
 * Created by ajain on 10/5/15.
 */
public class ComponentsJson {
    private String href;
    private ServiceComponentInfoJson ServiceComponentInfo;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ServiceComponentInfoJson getServiceComponentInfo() {
        return ServiceComponentInfo;
    }

    public void setServiceComponentInfo(ServiceComponentInfoJson serviceComponentInfo) {
        ServiceComponentInfo = serviceComponentInfo;
    }
}
