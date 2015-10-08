package com.hwx.ambariapilib.json.cluster;

/**
 * Created by ajain on 10/7/15.
 */
public class ClusterListJson {
    private String href;
    private ClusterItemJson[] items;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ClusterItemJson[] getItems() {
        return items;
    }

    public void setItems(ClusterItemJson[] items) {
        this.items = items;
    }
}
