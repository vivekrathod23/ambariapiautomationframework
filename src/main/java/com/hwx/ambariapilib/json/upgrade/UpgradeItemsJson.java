package com.hwx.ambariapilib.json.upgrade;

/**
 * Created by vsharma on 11/5/15.
 */
public class UpgradeItemsJson {

    private String href;
    private UpgradeItemJson UpgradeItem;
    private TasksJson[] tasks;

    public String getHref() {
        return href;
    }

    public UpgradeItemJson getUpgradeItem() {
        return UpgradeItem;
    }

    public TasksJson[] getTasks() {
        return tasks;
    }
}
