package com.hwx.ambariapilib.json.service;

import com.hwx.ambariapilib.json.host.HostComponentJson;

/**
 * Created by ajain on 10/7/15.
 */
public class ServiceComponentDetailJson {
    private String href;
    private ServiceComponentLongInfoJson ServiceComponentInfo;
    private HostComponentJson[] host_components;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ServiceComponentLongInfoJson getServiceComponentInfo() {
        return ServiceComponentInfo;
    }

    public void setServiceComponentInfo(ServiceComponentLongInfoJson serviceComponentInfo) {
        ServiceComponentInfo = serviceComponentInfo;
    }

    public HostComponentJson[] getHost_components() {
        return host_components;
    }

}
