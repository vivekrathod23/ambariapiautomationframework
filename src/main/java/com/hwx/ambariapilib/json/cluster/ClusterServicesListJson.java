package com.hwx.ambariapilib.json.cluster;

import com.hwx.ambariapilib.json.service.ServiceListJson;

/**
 * Created by ajain on 10/5/15.
 */
public class ClusterServicesListJson {
    private String href;
    private ServiceListJson[] items;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ServiceListJson[] getItems() {
        return items;
    }

    public void setItems(ServiceListJson[] items) {
        this.items = items;
    }
}
