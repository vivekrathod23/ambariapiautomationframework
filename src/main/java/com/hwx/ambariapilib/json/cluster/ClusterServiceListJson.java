package com.hwx.ambariapilib.json.cluster;

/**
 * Created by ajain on 10/8/15.
 */
public class ClusterServiceListJson {
    private String href;
    private ClusterServiceInfoJson ServiceInfo;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ClusterServiceInfoJson getServiceInfo() {
        return ServiceInfo;
    }

    public void setServiceInfo(ClusterServiceInfoJson serviceInfo) {
        ServiceInfo = serviceInfo;
    }
}
