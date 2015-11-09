package com.hwx.ambariapilib.json.upgrade;

/**
 * Created by vsharma on 11/5/15.
 */
public class UpgradeStatusJson {

    private String href;
    private UpgradeJson Upgrade;
    private UpgradeGroupsJson[] upgrade_groups;

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

    public UpgradeGroupsJson[] getUpgrade_groups() {
        return upgrade_groups;
    }

    public void setUpgrade_groups(UpgradeGroupsJson[] upgrade_groups) {
        this.upgrade_groups = upgrade_groups;
    }
}
