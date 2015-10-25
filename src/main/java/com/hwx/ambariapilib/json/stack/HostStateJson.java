package com.hwx.ambariapilib.json.stack;

/**
 * Created by ajain on 10/21/15.
 */
public class HostStateJson {
    private String[] CURRENT;
    private String[] INSTALLED;
    private String[] INSTALLING;
    private String[] INSTALL_FAILED;
    private String[] OUT_OF_SYNC;
    private String[] UPGRADED;
    private String[] UPGRADE_FAILED;
    private String[] UPGRADING;

    public String[] getCURRENT() {
        return CURRENT;
    }

    public void setCURRENT(String[] CURRENT) {
        this.CURRENT = CURRENT;
    }

    public String[] getINSTALLED() {
        return INSTALLED;
    }

    public void setINSTALLED(String[] INSTALLED) {
        this.INSTALLED = INSTALLED;
    }

    public String[] getINSTALLING() {
        return INSTALLING;
    }

    public void setINSTALLING(String[] INSTALLING) {
        this.INSTALLING = INSTALLING;
    }

    public String[] getINSTALL_FAILED() {
        return INSTALL_FAILED;
    }

    public void setINSTALL_FAILED(String[] INSTALL_FAILED) {
        this.INSTALL_FAILED = INSTALL_FAILED;
    }

    public String[] getOUT_OF_SYNC() {
        return OUT_OF_SYNC;
    }

    public void setOUT_OF_SYNC(String[] OUT_OF_SYNC) {
        this.OUT_OF_SYNC = OUT_OF_SYNC;
    }

    public String[] getUPGRADED() {
        return UPGRADED;
    }

    public void setUPGRADED(String[] UPGRADED) {
        this.UPGRADED = UPGRADED;
    }

    public String[] getUPGRADE_FAILED() {
        return UPGRADE_FAILED;
    }

    public void setUPGRADE_FAILED(String[] UPGRADE_FAILED) {
        this.UPGRADE_FAILED = UPGRADE_FAILED;
    }

    public String[] getUPGRADING() {
        return UPGRADING;
    }

    public void setUPGRADING(String[] UPGRADING) {
        this.UPGRADING = UPGRADING;
    }
}
