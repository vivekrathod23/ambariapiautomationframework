package com.hwx.ambariapilib.json.ConfigProperties;

/**
 * Created by vrathod on 11/30/15.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class CoreSiteConfig {

    @SerializedName("cluster_name")
    @Expose
    private String clusterName;
    @SerializedName("stack_id")
    @Expose
    private String stackId;

    /**
     *
     * @return
     * The clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     *
     * @param clusterName
     * The cluster_name
     */
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     *
     * @return
     * The stackId
     */
    public String getStackId() {
        return stackId;
    }

    /**
     *
     * @param stackId
     * The stack_id
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    @Generated("org.jsonschema2pojo")
    public static class Item {

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
        private com.hwx.ambariapilib.json.ConfigProperties.CoreSiteConfig Config;
        @SerializedName("properties")
        @Expose
        private CoreSiteProperties properties;

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
        public com.hwx.ambariapilib.json.ConfigProperties.CoreSiteConfig getConfig() {
            return Config;
        }

        /**
         *
         * @param Config
         * The Config
         */
        public void setConfig(com.hwx.ambariapilib.json.ConfigProperties.CoreSiteConfig Config) {
            this.Config = Config;
        }

        /**
         *
         * @return
         * The properties
         */
        public CoreSiteProperties getProperties() {
            return properties;
        }

        /**
         *
         * @param properties
         * The properties
         */
        public void setProperties(CoreSiteProperties properties) {
            this.properties = properties;
        }

    }
}