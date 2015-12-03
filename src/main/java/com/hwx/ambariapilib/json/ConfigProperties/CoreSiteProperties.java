package com.hwx.ambariapilib.json.ConfigProperties;

/**
 * Created by vrathod on 11/30/15.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class CoreSiteProperties {

    @SerializedName("fs.defaultFS")
    @Expose
    private String fsDefaultFS;
    @SerializedName("fs.trash.interval")
    @Expose
    private String fsTrashInterval;
    @SerializedName("ha.failover-controller.active-standby-elector.zk.op.retries")
    @Expose
    private String haFailoverControllerActiveStandbyElectorZkOpRetries;
    @SerializedName("hadoop.http.authentication.simple.anonymous.allowed")
    @Expose
    private String hadoopHttpAuthenticationSimpleAnonymousAllowed;
    @SerializedName("hadoop.security.auth_to_local")
    @Expose
    private String hadoopSecurityAuthToLocal;
    @SerializedName("hadoop.security.authentication")
    @Expose
    private String hadoopSecurityAuthentication;
    @SerializedName("hadoop.security.authorization")
    @Expose
    private String hadoopSecurityAuthorization;
    @SerializedName("hadoop.security.key.provider.path")
    @Expose
    private String hadoopSecurityKeyProviderPath;
    @SerializedName("io.compression.codecs")
    @Expose
    private String ioCompressionCodecs;
    @SerializedName("io.file.buffer.size")
    @Expose
    private String ioFileBufferSize;
    @SerializedName("io.serializations")
    @Expose
    private String ioSerializations;
    @SerializedName("ipc.client.connect.max.retries")
    @Expose
    private String ipcClientConnectMaxRetries;
    @SerializedName("ipc.client.connection.maxidletime")
    @Expose
    private String ipcClientConnectionMaxidletime;
    @SerializedName("ipc.client.idlethreshold")
    @Expose
    private String ipcClientIdlethreshold;
    @SerializedName("ipc.server.tcpnodelay")
    @Expose
    private String ipcServerTcpnodelay;
    @SerializedName("mapreduce.jobtracker.webinterface.trusted")
    @Expose
    private String mapreduceJobtrackerWebinterfaceTrusted;
    @SerializedName("net.topology.script.file.name")
    @Expose
    private String netTopologyScriptFileName;
    @SerializedName("proxyuser_group")
    @Expose
    private String proxyuserGroup;

    /**
     *
     * @return
     * The fsDefaultFS
     */
    public String getFsDefaultFS() {
        return fsDefaultFS;
    }

    /**
     *
     * @param fsDefaultFS
     * The fs.defaultFS
     */
    public void setFsDefaultFS(String fsDefaultFS) {
        this.fsDefaultFS = fsDefaultFS;
    }

    /**
     *
     * @return
     * The fsTrashInterval
     */
    public String getFsTrashInterval() {
        return fsTrashInterval;
    }

    /**
     *
     * @param fsTrashInterval
     * The fs.trash.interval
     */
    public void setFsTrashInterval(String fsTrashInterval) {
        this.fsTrashInterval = fsTrashInterval;
    }

    /**
     *
     * @return
     * The haFailoverControllerActiveStandbyElectorZkOpRetries
     */
    public String getHaFailoverControllerActiveStandbyElectorZkOpRetries() {
        return haFailoverControllerActiveStandbyElectorZkOpRetries;
    }

    /**
     *
     * @param haFailoverControllerActiveStandbyElectorZkOpRetries
     * The ha.failover-controller.active-standby-elector.zk.op.retries
     */
    public void setHaFailoverControllerActiveStandbyElectorZkOpRetries(String haFailoverControllerActiveStandbyElectorZkOpRetries) {
        this.haFailoverControllerActiveStandbyElectorZkOpRetries = haFailoverControllerActiveStandbyElectorZkOpRetries;
    }

    /**
     *
     * @return
     * The hadoopHttpAuthenticationSimpleAnonymousAllowed
     */
    public String getHadoopHttpAuthenticationSimpleAnonymousAllowed() {
        return hadoopHttpAuthenticationSimpleAnonymousAllowed;
    }

    /**
     *
     * @param hadoopHttpAuthenticationSimpleAnonymousAllowed
     * The hadoop.http.authentication.simple.anonymous.allowed
     */
    public void setHadoopHttpAuthenticationSimpleAnonymousAllowed(String hadoopHttpAuthenticationSimpleAnonymousAllowed) {
        this.hadoopHttpAuthenticationSimpleAnonymousAllowed = hadoopHttpAuthenticationSimpleAnonymousAllowed;
    }

    /**
     *
     * @return
     * The hadoopSecurityAuthToLocal
     */
    public String getHadoopSecurityAuthToLocal() {
        return hadoopSecurityAuthToLocal;
    }

    /**
     *
     * @param hadoopSecurityAuthToLocal
     * The hadoop.security.auth_to_local
     */
    public void setHadoopSecurityAuthToLocal(String hadoopSecurityAuthToLocal) {
        this.hadoopSecurityAuthToLocal = hadoopSecurityAuthToLocal;
    }

    /**
     *
     * @return
     * The hadoopSecurityAuthentication
     */
    public String getHadoopSecurityAuthentication() {
        return hadoopSecurityAuthentication;
    }

    /**
     *
     * @param hadoopSecurityAuthentication
     * The hadoop.security.authentication
     */
    public void setHadoopSecurityAuthentication(String hadoopSecurityAuthentication) {
        this.hadoopSecurityAuthentication = hadoopSecurityAuthentication;
    }

    /**
     *
     * @return
     * The hadoopSecurityAuthorization
     */
    public String getHadoopSecurityAuthorization() {
        return hadoopSecurityAuthorization;
    }

    /**
     *
     * @param hadoopSecurityAuthorization
     * The hadoop.security.authorization
     */
    public void setHadoopSecurityAuthorization(String hadoopSecurityAuthorization) {
        this.hadoopSecurityAuthorization = hadoopSecurityAuthorization;
    }

    /**
     *
     * @return
     * The hadoopSecurityKeyProviderPath
     */
    public String getHadoopSecurityKeyProviderPath() {
        return hadoopSecurityKeyProviderPath;
    }

    /**
     *
     * @param hadoopSecurityKeyProviderPath
     * The hadoop.security.key.provider.path
     */
    public void setHadoopSecurityKeyProviderPath(String hadoopSecurityKeyProviderPath) {
        this.hadoopSecurityKeyProviderPath = hadoopSecurityKeyProviderPath;
    }

    /**
     *
     * @return
     * The ioCompressionCodecs
     */
    public String getIoCompressionCodecs() {
        return ioCompressionCodecs;
    }

    /**
     *
     * @param ioCompressionCodecs
     * The io.compression.codecs
     */
    public void setIoCompressionCodecs(String ioCompressionCodecs) {
        this.ioCompressionCodecs = ioCompressionCodecs;
    }

    /**
     *
     * @return
     * The ioFileBufferSize
     */
    public String getIoFileBufferSize() {
        return ioFileBufferSize;
    }

    /**
     *
     * @param ioFileBufferSize
     * The io.file.buffer.size
     */
    public void setIoFileBufferSize(String ioFileBufferSize) {
        this.ioFileBufferSize = ioFileBufferSize;
    }

    /**
     *
     * @return
     * The ioSerializations
     */
    public String getIoSerializations() {
        return ioSerializations;
    }

    /**
     *
     * @param ioSerializations
     * The io.serializations
     */
    public void setIoSerializations(String ioSerializations) {
        this.ioSerializations = ioSerializations;
    }

    /**
     *
     * @return
     * The ipcClientConnectMaxRetries
     */
    public String getIpcClientConnectMaxRetries() {
        return ipcClientConnectMaxRetries;
    }

    /**
     *
     * @param ipcClientConnectMaxRetries
     * The ipc.client.connect.max.retries
     */
    public void setIpcClientConnectMaxRetries(String ipcClientConnectMaxRetries) {
        this.ipcClientConnectMaxRetries = ipcClientConnectMaxRetries;
    }

    /**
     *
     * @return
     * The ipcClientConnectionMaxidletime
     */
    public String getIpcClientConnectionMaxidletime() {
        return ipcClientConnectionMaxidletime;
    }

    /**
     *
     * @param ipcClientConnectionMaxidletime
     * The ipc.client.connection.maxidletime
     */
    public void setIpcClientConnectionMaxidletime(String ipcClientConnectionMaxidletime) {
        this.ipcClientConnectionMaxidletime = ipcClientConnectionMaxidletime;
    }

    /**
     *
     * @return
     * The ipcClientIdlethreshold
     */
    public String getIpcClientIdlethreshold() {
        return ipcClientIdlethreshold;
    }

    /**
     *
     * @param ipcClientIdlethreshold
     * The ipc.client.idlethreshold
     */
    public void setIpcClientIdlethreshold(String ipcClientIdlethreshold) {
        this.ipcClientIdlethreshold = ipcClientIdlethreshold;
    }

    /**
     *
     * @return
     * The ipcServerTcpnodelay
     */
    public String getIpcServerTcpnodelay() {
        return ipcServerTcpnodelay;
    }

    /**
     *
     * @param ipcServerTcpnodelay
     * The ipc.server.tcpnodelay
     */
    public void setIpcServerTcpnodelay(String ipcServerTcpnodelay) {
        this.ipcServerTcpnodelay = ipcServerTcpnodelay;
    }

    /**
     *
     * @return
     * The mapreduceJobtrackerWebinterfaceTrusted
     */
    public String getMapreduceJobtrackerWebinterfaceTrusted() {
        return mapreduceJobtrackerWebinterfaceTrusted;
    }

    /**
     *
     * @param mapreduceJobtrackerWebinterfaceTrusted
     * The mapreduce.jobtracker.webinterface.trusted
     */
    public void setMapreduceJobtrackerWebinterfaceTrusted(String mapreduceJobtrackerWebinterfaceTrusted) {
        this.mapreduceJobtrackerWebinterfaceTrusted = mapreduceJobtrackerWebinterfaceTrusted;
    }

    /**
     *
     * @return
     * The netTopologyScriptFileName
     */
    public String getNetTopologyScriptFileName() {
        return netTopologyScriptFileName;
    }

    /**
     *
     * @param netTopologyScriptFileName
     * The net.topology.script.file.name
     */
    public void setNetTopologyScriptFileName(String netTopologyScriptFileName) {
        this.netTopologyScriptFileName = netTopologyScriptFileName;
    }

    /**
     *
     * @return
     * The proxyuserGroup
     */
    public String getProxyuserGroup() {
        return proxyuserGroup;
    }

    /**
     *
     * @param proxyuserGroup
     * The proxyuser_group
     */
    public void setProxyuserGroup(String proxyuserGroup) {
        this.proxyuserGroup = proxyuserGroup;
    }

}