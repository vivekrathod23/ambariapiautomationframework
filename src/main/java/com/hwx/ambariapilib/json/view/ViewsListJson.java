package com.hwx.ambariapilib.json.view;

/**
 * Created by ajain on 10/6/15.
 */
public class ViewsListJson {
    private String href;
    private ViewsItemJson[] items;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ViewsItemJson[] getItems() {
        return items;
    }

    public void setItems(ViewsItemJson[] items) {
        this.items = items;
    }
}
