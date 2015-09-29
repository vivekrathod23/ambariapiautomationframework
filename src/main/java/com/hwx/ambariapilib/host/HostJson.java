package com.hwx.ambariapilib.host;

/**
 * Created by ajain on 9/28/15.
 */
public class HostJson {
    private String href;
    private Hosts Hosts;
    private AlertSummary alerts_summary;
    private KerberosIdentities[] kerberos_identities;
    private Alerts[] alerts;
    private StackVersions[] stack_versions;
    private HostComponents[] host_components;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public com.hwx.ambariapilib.host.Hosts getHosts() {
        return Hosts;
    }

    public void setHosts(com.hwx.ambariapilib.host.Hosts hosts) {
        Hosts = hosts;
    }

    public AlertSummary getAlerts_summary() {
        return alerts_summary;
    }

    public void setAlerts_summary(AlertSummary alerts_summary) {
        this.alerts_summary = alerts_summary;
    }

    public KerberosIdentities[] getKerberos_identities() {
        return kerberos_identities;
    }

    public void setKerberos_identities(KerberosIdentities[] kerberos_identities) {
        this.kerberos_identities = kerberos_identities;
    }

    public Alerts[] getAlerts() {
        return alerts;
    }

    public void setAlerts(Alerts[] alerts) {
        this.alerts = alerts;
    }

    public StackVersions[] getStack_versions() {
        return stack_versions;
    }

    public void setStack_versions(StackVersions[] stack_versions) {
        this.stack_versions = stack_versions;
    }

    public HostComponents[] getHost_components() {
        return host_components;
    }

    public void setHost_components(HostComponents[] host_components) {
        this.host_components = host_components;
    }
}
