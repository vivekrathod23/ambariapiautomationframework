package com.hwx.ambariapilib.json.host;

import com.hwx.ambariapilib.json.common.AlertSummaryJson;
import com.hwx.ambariapilib.json.common.AlertsJson;
import com.hwx.ambariapilib.json.service.KerberosIdentitiesJson;

/**
 * Created by ajain on 9/28/15.
 */
public class HostJson {
    private String href;
    private HostsJson Hosts;
    private AlertSummaryJson alerts_summary;
    private KerberosIdentitiesJson[] kerberos_identities;
    private AlertsJson[] alerts;
    private StackVersions[] stack_versions;
    private HostComponentsJson[] host_components;

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

    public AlertSummaryJson getAlerts_summary() {
        return alerts_summary;
    }

    public void setAlerts_summary(AlertSummaryJson alerts_summary) {
        this.alerts_summary = alerts_summary;
    }

    public KerberosIdentitiesJson[] getKerberos_identities() {
        return kerberos_identities;
    }

    public void setKerberos_identities(KerberosIdentitiesJson[] kerberos_identities) {
        this.kerberos_identities = kerberos_identities;
    }

    public AlertsJson[] getAlerts() {
        return alerts;
    }

    public void setAlerts(AlertsJson[] alerts) {
        this.alerts = alerts;
    }

    public StackVersions[] getStack_versions() {
        return stack_versions;
    }

    public void setStack_versions(StackVersions[] stack_versions) {
        this.stack_versions = stack_versions;
    }

    public HostComponentsJson[] getHost_components() {
        return host_components;
    }

    public void setHost_components(HostComponentsJson[] host_components) {
        this.host_components = host_components;
    }
}
