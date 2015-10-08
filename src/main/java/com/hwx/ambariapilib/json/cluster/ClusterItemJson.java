package com.hwx.ambariapilib.json.cluster;

/**
 * Created by ajain on 10/7/15.
 */
public class ClusterItemJson {

    private String href;
    private ClustersShortInfoJson Clusters;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ClustersShortInfoJson getClusters() {
        return Clusters;
    }

    public void setClusters(ClustersShortInfoJson clusters) {
        Clusters = clusters;
    }
}
