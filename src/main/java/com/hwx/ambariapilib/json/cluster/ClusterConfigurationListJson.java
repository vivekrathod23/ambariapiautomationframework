package com.hwx.ambariapilib.json.cluster;

/**
 * Created by ajain on 9/30/15.
 */
public class ClusterConfigurationListJson {
    private String href;
    private String tag;
    private String type;
    private int version;
    private ClusterConfigJson Config;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public ClusterConfigJson getConfig() {
        return Config;
    }

    public void setConfig(ClusterConfigJson config) {
        Config = config;
    }
}
