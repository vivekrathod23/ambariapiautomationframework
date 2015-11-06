package com.hwx.ambariapilib.json.upgrade;

/**
 * Created by vsharma on 11/5/15.
 */
public class ItemsJson {
    private String href;
    private UpgradeJson Upgrade;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public UpgradeJson getUpgrade() {
        return Upgrade;
    }

    public void setUpgrade(UpgradeJson upgrade) {
        Upgrade = upgrade;
    }
}
