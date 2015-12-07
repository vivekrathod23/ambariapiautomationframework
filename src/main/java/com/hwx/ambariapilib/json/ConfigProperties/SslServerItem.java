package com.hwx.ambariapilib.json.ConfigProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hwx.ambariapilib.json.cluster.ClusterConfigJson;

import javax.annotation.Generated;

/**
 * Created by vrathod on 12/5/15.
 */

@Generated("org.jsonschema2pojo")
public class SslServerItem {

    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("tag")
    @Expose
    private String tag;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("version")
    @Expose
    private Integer version;
    @SerializedName("Config")
    @Expose
    private ClusterConfigJson Config;
    @SerializedName("properties")
    @Expose
    private SslServerProperties properties;

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
     * The tag
     */
    public String getTag() {
        return tag;
    }

    /**
     *
     * @param tag
     * The tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     *
     * @param version
     * The version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     *
     * @return
     * The Config
     */
    public ClusterConfigJson getConfig() {
        return Config;
    }

    /**
     *
     * @param Config
     * The Config
     */
    public void setConfig(ClusterConfigJson Config) {
        this.Config = Config;
    }
    /**
     *
     * @return
     * The properties
     */
    public SslServerProperties getProperties() {
        return properties;
    }

    /**
     *
     * @param properties
     * The properties
     */
    public void setProperties(SslServerProperties properties) {
        this.properties = properties;
    }

}