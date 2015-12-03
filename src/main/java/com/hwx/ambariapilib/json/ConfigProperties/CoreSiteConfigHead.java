package com.hwx.ambariapilib.json.ConfigProperties;

/**
 * Created by vrathod on 11/30/15.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class CoreSiteConfigHead {

    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("items")
    @Expose
    private List<CoreSiteConfig.Item> items = new ArrayList<CoreSiteConfig.Item>();

    /**
     *
     * @return
     * The href
     */
    public String getHref() {
        return href;
    }

    /**
     *
     * @param href
     * The href
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     *
     * @return
     * The items
     */
    public List<CoreSiteConfig.Item> getItems() {
        return items;
    }

    /**
     *
     * @param items
     * The items
     */
    public void setItems(List<CoreSiteConfig.Item> items) {
        this.items = items;
    }

}