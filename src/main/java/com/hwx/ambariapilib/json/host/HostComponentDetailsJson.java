package com.hwx.ambariapilib.json.host;

import com.hwx.ambariapilib.json.service.ServiceComponentItemJson;

/**
 * Created by ajain on 10/8/15.
 */
public class HostComponentDetailsJson {
    private String href;
    private HostRolesDetailsJson HostRoles;
    private ShortHostJson host;
    private ServiceComponentItemJson[]  component;
    private HostProcesse[] processes;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public HostRolesDetailsJson getHostRoles() {
        return HostRoles;
    }

    public void setHostRoles(HostRolesDetailsJson hostRoles) {
        HostRoles = hostRoles;
    }

    public ShortHostJson getHost() {
        return host;
    }

    public void setHost(ShortHostJson host) {
        this.host = host;
    }

    public ServiceComponentItemJson[] getComponent() {
        return component;
    }

    public void setComponent(ServiceComponentItemJson[] component) {
        this.component = component;
    }

    public HostProcesse[] getProcesses() {
        return processes;
    }

    public void setProcesses(HostProcesse[] processes) {
        this.processes = processes;
    }
}
