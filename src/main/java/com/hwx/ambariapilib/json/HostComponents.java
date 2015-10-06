package com.hwx.ambariapilib.json;

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

    public com.hwx.ambariapilib.json.HostRoles getHostRoles() {
        return HostRoles;
    }

    public void setHostRoles(com.hwx.ambariapilib.json.HostRoles hostRoles) {
        HostRoles = hostRoles;
    }
}
