package com.hwx.ambariapilib.json.host;

/**
 * Created by ajain on 9/28/15.
 */
public class HostComponentJson {
    private String href;
    private HostRolesJson HostRoles;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public HostRolesJson getHostRoles() {
        return HostRoles;
    }

    public void setHostRoles(HostRolesJson hostRoles) {
        HostRoles = hostRoles;
    }
}
