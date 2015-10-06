package com.hwx.ambariapilib.json.host;

/**
 * Created by ajain on 9/28/15.
 */
public class StackVersions {
    private String href;
    private HostStackVersionsJson HostStackVersions;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public HostStackVersionsJson getHostStackVersions() {
        return HostStackVersions;
    }

    public void setHostStackVersions(HostStackVersionsJson hostStackVersions) {
        HostStackVersions = hostStackVersions;
    }
}
