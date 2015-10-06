package com.hwx.ambariapilib.json.service;

/**
 * Created by ajain on 9/28/15.
 */
public class KerberosIdentitiesJson {
    private String href;
    private KerberosIdentityJson KerberosIdentity;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public KerberosIdentityJson getKerberosIdentity() {
        return KerberosIdentity;
    }

    public void setKerberosIdentity(KerberosIdentityJson kerberosIdentity) {
        KerberosIdentity = kerberosIdentity;
    }
}
