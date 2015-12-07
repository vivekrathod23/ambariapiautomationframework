package com.hwx.ambariapilib.json.ConfigProperties;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * Created by vrathod on 12/5/15.
 */
@Generated("org.jsonschema2pojo")
public class MapredSiteConfigHead {

    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("items")
    @Expose
    //private List<CoreSiteItem> items = new ArrayList<CoreSiteItem>();
    private MapredSiteItem[] items;

    public MapredSiteItem[] getItems() {
        return items;
    }

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

}