package com.hwx.ambariapilib.json.cluster;

/**
 * Created by ajain on 10/8/15.
 */
public class ClusterRequestListJson {
    private String href;
    private ClusterRequestJson Requests;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ClusterRequestJson getRequests() {
        return Requests;
    }

    public void setRequests(ClusterRequestJson requests) {
        Requests = requests;
    }
}
