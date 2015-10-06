package com.hwx.ambariapilib.json.host;

/**
 * Created by ajain on 9/30/15.
 */
public class ClusterHostsJson {
    private String href;
    private HostsJson Hosts;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public HostsJson getHosts() {
        return Hosts;
    }

    public void setHosts(HostsJson hosts) {
        Hosts = hosts;
    }
}
