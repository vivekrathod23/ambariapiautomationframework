package com.hwx.ambariapilib.json.cluster;

/**
 * Created by ajain on 9/30/15.
 */
public class ClusterStackVersionListJson {
    private String href;
    private ClusterStackVersionJson ClusterStackVersions;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ClusterStackVersionJson getClusterStackVersions() {
        return ClusterStackVersions;
    }

    public void setClusterStackVersions(ClusterStackVersionJson clusterStackVersions) {
        ClusterStackVersions = clusterStackVersions;
    }
}
