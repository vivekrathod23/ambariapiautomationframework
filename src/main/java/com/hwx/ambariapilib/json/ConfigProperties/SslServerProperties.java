package com.hwx.ambariapilib.json.ConfigProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
/**
 * Created by vrathod on 12/5/15.
 */
@Generated("org.jsonschema2pojo")
public class SslServerProperties {

    @SerializedName("ssl.server.keystore.keypassword")
    @Expose
    private String sslServerKeystoreKeypassword;
    @SerializedName("ssl.server.keystore.location")
    @Expose
    private String sslServerKeystoreLocation;
    @SerializedName("ssl.server.keystore.password")
    @Expose
    private String sslServerKeystorePassword;
    @SerializedName("ssl.server.keystore.type")
    @Expose
    private String sslServerKeystoreType;
    @SerializedName("ssl.server.truststore.location")
    @Expose
    private String sslServerTruststoreLocation;
    @SerializedName("ssl.server.truststore.password")
    @Expose
    private String sslServerTruststorePassword;
    @SerializedName("ssl.server.truststore.reload.interval")
    @Expose
    private String sslServerTruststoreReloadInterval;
    @SerializedName("ssl.server.truststore.type")
    @Expose
    private String sslServerTruststoreType;

    /**
     *
     * @return
     * The sslServerKeystoreKeypassword
     */
    public String getSslServerKeystoreKeypassword() {
        return sslServerKeystoreKeypassword;
    }

    /**
     *
     * @param sslServerKeystoreKeypassword
     * The ssl.server.keystore.keypassword
     */
    public void setSslServerKeystoreKeypassword(String sslServerKeystoreKeypassword) {
        this.sslServerKeystoreKeypassword = sslServerKeystoreKeypassword;
    }

    /**
     *
     * @return
     * The sslServerKeystoreLocation
     */
    public String getSslServerKeystoreLocation() {
        return sslServerKeystoreLocation;
    }

    /**
     *
     * @param sslServerKeystoreLocation
     * The ssl.server.keystore.location
     */
    public void setSslServerKeystoreLocation(String sslServerKeystoreLocation) {
        this.sslServerKeystoreLocation = sslServerKeystoreLocation;
    }

    /**
     *
     * @return
     * The sslServerKeystorePassword
     */
    public String getSslServerKeystorePassword() {
        return sslServerKeystorePassword;
    }

    /**
     *
     * @param sslServerKeystorePassword
     * The ssl.server.keystore.password
     */
    public void setSslServerKeystorePassword(String sslServerKeystorePassword) {
        this.sslServerKeystorePassword = sslServerKeystorePassword;
    }

    /**
     *
     * @return
     * The sslServerKeystoreType
     */
    public String getSslServerKeystoreType() {
        return sslServerKeystoreType;
    }

    /**
     *
     * @param sslServerKeystoreType
     * The ssl.server.keystore.type
     */
    public void setSslServerKeystoreType(String sslServerKeystoreType) {
        this.sslServerKeystoreType = sslServerKeystoreType;
    }

    /**
     *
     * @return
     * The sslServerTruststoreLocation
     */
    public String getSslServerTruststoreLocation() {
        return sslServerTruststoreLocation;
    }

    /**
     *
     * @param sslServerTruststoreLocation
     * The ssl.server.truststore.location
     */
    public void setSslServerTruststoreLocation(String sslServerTruststoreLocation) {
        this.sslServerTruststoreLocation = sslServerTruststoreLocation;
    }

    /**
     *
     * @return
     * The sslServerTruststorePassword
     */
    public String getSslServerTruststorePassword() {
        return sslServerTruststorePassword;
    }

    /**
     *
     * @param sslServerTruststorePassword
     * The ssl.server.truststore.password
     */
    public void setSslServerTruststorePassword(String sslServerTruststorePassword) {
        this.sslServerTruststorePassword = sslServerTruststorePassword;
    }

    /**
     *
     * @return
     * The sslServerTruststoreReloadInterval
     */
    public String getSslServerTruststoreReloadInterval() {
        return sslServerTruststoreReloadInterval;
    }

    /**
     *
     * @param sslServerTruststoreReloadInterval
     * The ssl.server.truststore.reload.interval
     */
    public void setSslServerTruststoreReloadInterval(String sslServerTruststoreReloadInterval) {
        this.sslServerTruststoreReloadInterval = sslServerTruststoreReloadInterval;
    }

    /**
     *
     * @return
     * The sslServerTruststoreType
     */
    public String getSslServerTruststoreType() {
        return sslServerTruststoreType;
    }

    /**
     *
     * @param sslServerTruststoreType
     * The ssl.server.truststore.type
     */
    public void setSslServerTruststoreType(String sslServerTruststoreType) {
        this.sslServerTruststoreType = sslServerTruststoreType;
    }

}