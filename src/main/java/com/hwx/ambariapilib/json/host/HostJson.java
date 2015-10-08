package com.hwx.ambariapilib.json.host;

import com.hwx.ambariapilib.json.alert.AlertSummaryJson;
import com.hwx.ambariapilib.json.alert.AlertListJson;
import com.hwx.ambariapilib.json.service.KerberosIdentitiesJson;

/**
 * Created by ajain on 9/28/15.
 */
public class HostJson {
    private String href;
    private HostDetailJson Hosts;
    private AlertSummaryJson alerts_summary;
    private KerberosIdentitiesJson[] kerberos_identities;
    private AlertListJson[] alerts;
    private HostStackVersionList[] stack_versions;
    private HostComponentJson[] host_components;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public HostDetailJson getHosts() {
        return Hosts;
    }

    public void setHosts(HostDetailJson hosts) {
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

    public AlertListJson[] getAlerts() {
        return alerts;
    }

    public void setAlerts(AlertListJson[] alerts) {
        this.alerts = alerts;
    }

    public HostStackVersionList[] getStack_versions() {
        return stack_versions;
    }

    public void setStack_versions(HostStackVersionList[] stack_versions) {
        this.stack_versions = stack_versions;
    }

    public HostComponentJson[] getHost_components() {
        return host_components;
    }

    public void setHost_components(HostComponentJson[] host_components) {
        this.host_components = host_components;
    }
}
