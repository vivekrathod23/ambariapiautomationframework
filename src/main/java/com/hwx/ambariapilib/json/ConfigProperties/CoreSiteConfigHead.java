package com.hwx.ambariapilib.json.ConfigProperties;
/**
 * Created by vrathod on 11/30/15.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class CoreSiteConfigHead {

    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("items")
    @Expose
    //private List<CoreSiteItem> items = new ArrayList<CoreSiteItem>();
    private CoreSiteItem[] items;

    public CoreSiteItem[] getItems() {
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