package com.hwx.ambariapilib.json;

/**
 * Created by ajain on 9/28/15.
 */
public class StackVersions {
    private String href;
    private HostStackVersions HostStackVersions;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public com.hwx.ambariapilib.json.HostStackVersions getHostStackVersions() {
        return HostStackVersions;
    }

    public void setHostStackVersions(com.hwx.ambariapilib.json.HostStackVersions hostStackVersions) {
        HostStackVersions = hostStackVersions;
    }
}
