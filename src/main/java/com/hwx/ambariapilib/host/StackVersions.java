package com.hwx.ambariapilib.host;

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

    public com.hwx.ambariapilib.host.HostStackVersions getHostStackVersions() {
        return HostStackVersions;
    }

    public void setHostStackVersions(com.hwx.ambariapilib.host.HostStackVersions hostStackVersions) {
        HostStackVersions = hostStackVersions;
    }
}
