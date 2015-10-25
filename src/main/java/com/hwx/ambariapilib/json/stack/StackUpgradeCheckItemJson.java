package com.hwx.ambariapilib.json.stack;

/**
 * Created by ajain on 10/21/15.
 */
public class StackUpgradeCheckItemJson {
    private String href;
    private StackUpgradeCheckJson UpgradeChecks;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public StackUpgradeCheckJson getUpgradeChecks() {
        return UpgradeChecks;
    }

    public void setUpgradeChecks(StackUpgradeCheckJson upgradeChecks) {
        UpgradeChecks = upgradeChecks;
    }
}
