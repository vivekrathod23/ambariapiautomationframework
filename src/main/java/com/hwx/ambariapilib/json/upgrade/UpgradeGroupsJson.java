package com.hwx.ambariapilib.json.upgrade;

/**
 * Created by vsharma on 11/5/15.
 */
public class UpgradeGroupsJson {
    private String href;
    private UpgradeGroupJson UpgradeGroup;
    private UpgradeItemsJson[] upgrade_items;

    public String getHref() {
        return href;
    }

    public UpgradeGroupJson getUpgradeGroup() {
        return UpgradeGroup;
    }

    public UpgradeItemsJson[] getUpgrade_items() {
        return upgrade_items;
    }
}
