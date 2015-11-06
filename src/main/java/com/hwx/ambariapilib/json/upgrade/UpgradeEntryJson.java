package com.hwx.ambariapilib.json.upgrade;

/**
 * Created by vsharma on 11/5/15.
 */
public class UpgradeEntryJson {
    private String href;
    private ItemsJson[] items;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ItemsJson[] getItems() {
        return items;
    }

    public void setItems(ItemsJson[] items) {
        this.items = items;
    }
}
