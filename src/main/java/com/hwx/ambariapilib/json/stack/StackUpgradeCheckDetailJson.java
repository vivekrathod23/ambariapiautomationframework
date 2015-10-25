package com.hwx.ambariapilib.json.stack;

/**
 * Created by ajain on 10/21/15.
 */
public class StackUpgradeCheckDetailJson {

    private String href;
    private StackUpgradeCheckItemJson[] items;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public StackUpgradeCheckItemJson[] getItems() {
        return items;
    }

    public void setItems(StackUpgradeCheckItemJson[] items) {
        this.items = items;
    }
}
