package com.hwx.ambariapilib.host;

/**
 * Created by ajain on 9/28/15.
 */
public class HostComponents {
    private String href;
    private HostRoles HostRoles;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public com.hwx.ambariapilib.host.HostRoles getHostRoles() {
        return HostRoles;
    }

    public void setHostRoles(com.hwx.ambariapilib.host.HostRoles hostRoles) {
        HostRoles = hostRoles;
    }
}
