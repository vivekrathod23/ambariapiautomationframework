package com.hwx.ambariapilib.host;

/**
 * Created by ajain on 9/28/15.
 */
public class KerberosIdentities {
    private String href;
    private KerberosIdentity KerberosIdentity;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public com.hwx.ambariapilib.host.KerberosIdentity getKerberosIdentity() {
        return KerberosIdentity;
    }

    public void setKerberosIdentity(com.hwx.ambariapilib.host.KerberosIdentity kerberosIdentity) {
        KerberosIdentity = kerberosIdentity;
    }
}
