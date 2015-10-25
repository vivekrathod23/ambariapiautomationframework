package com.hwx.ambariapilib.json.stack;

import com.hwx.ambariapilib.json.cluster.ClusterStackVersionListJson;

/**
 * Created by ajain on 10/14/15.
 */
public class StackVersionListJson {
    private String href;
    private ClusterStackVersionListJson[] items;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ClusterStackVersionListJson[] getItems() {
        return items;
    }

    public void setItems(ClusterStackVersionListJson[] items) {
        this.items = items;
    }
}
