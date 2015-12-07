package com.hwx.ambariapilib.json.ConfigProperties;

/**
 * Created by vrathod on 12/5/15.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class HdfsSiteProperties {

    @SerializedName("dfs.block.access.token.enable")
    @Expose
    private String dfsBlockAccessTokenEnable;
    @SerializedName("dfs.blockreport.initialDelay")
    @Expose
    private String dfsBlockreportInitialDelay;
    @SerializedName("dfs.blocksize")
    @Expose
    private String dfsBlocksize;
    @SerializedName("dfs.client.read.shortcircuit")
    @Expose
    private String dfsClientReadShortcircuit;
    @SerializedName("dfs.client.read.shortcircuit.streams.cache.size")
    @Expose
    private String dfsClientReadShortcircuitStreamsCacheSize;
    @SerializedName("dfs.client.retry.policy.enabled")
    @Expose
    private String dfsClientRetryPolicyEnabled;
    @SerializedName("dfs.cluster.administrators")
    @Expose
    private String dfsClusterAdministrators;
    @SerializedName("dfs.content-summary.limit")
    @Expose
    private String dfsContentSummaryLimit;
    @SerializedName("dfs.datanode.address")
    @Expose
    private String dfsDatanodeAddress;
    @SerializedName("dfs.datanode.balance.bandwidthPerSec")
    @Expose
    private String dfsDatanodeBalanceBandwidthPerSec;
    @SerializedName("dfs.datanode.data.dir")
    @Expose
    private String dfsDatanodeDataDir;
    @SerializedName("dfs.datanode.data.dir.perm")
    @Expose
    private String dfsDatanodeDataDirPerm;
    @SerializedName("dfs.datanode.du.reserved")
    @Expose
    private String dfsDatanodeDuReserved;
    @SerializedName("dfs.datanode.failed.volumes.tolerated")
    @Expose
    private String dfsDatanodeFailedVolumesTolerated;
    @SerializedName("dfs.datanode.http.address")
    @Expose
    private String dfsDatanodeHttpAddress;
    @SerializedName("dfs.datanode.https.address")
    @Expose
    private String dfsDatanodeHttpsAddress;
    @SerializedName("dfs.datanode.ipc.address")
    @Expose
    private String dfsDatanodeIpcAddress;
    @SerializedName("dfs.datanode.max.transfer.threads")
    @Expose
    private String dfsDatanodeMaxTransferThreads;
    @SerializedName("dfs.domain.socket.path")
    @Expose
    private String dfsDomainSocketPath;
    @SerializedName("dfs.encrypt.data.transfer.cipher.suites")
    @Expose
    private String dfsEncryptDataTransferCipherSuites;
    @SerializedName("dfs.encryption.key.provider.uri")
    @Expose
    private String dfsEncryptionKeyProviderUri;
    @SerializedName("dfs.heartbeat.interval")
    @Expose
    private String dfsHeartbeatInterval;
    @SerializedName("dfs.hosts.exclude")
    @Expose
    private String dfsHostsExclude;
    @SerializedName("dfs.http.policy")
    @Expose
    private String dfsHttpPolicy;
    @SerializedName("dfs.https.port")
    @Expose
    private String dfsHttpsPort;
    @SerializedName("dfs.journalnode.edits.dir")
    @Expose
    private String dfsJournalnodeEditsDir;
    @SerializedName("dfs.journalnode.http-address")
    @Expose
    private String dfsJournalnodeHttpAddress;
    @SerializedName("dfs.journalnode.https-address")
    @Expose
    private String dfsJournalnodeHttpsAddress;
    @SerializedName("dfs.namenode.accesstime.precision")
    @Expose
    private String dfsNamenodeAccesstimePrecision;
    @SerializedName("dfs.namenode.audit.log.async")
    @Expose
    private String dfsNamenodeAuditLogAsync;
    @SerializedName("dfs.namenode.avoid.read.stale.datanode")
    @Expose
    private String dfsNamenodeAvoidReadStaleDatanode;
    @SerializedName("dfs.namenode.avoid.write.stale.datanode")
    @Expose
    private String dfsNamenodeAvoidWriteStaleDatanode;
    @SerializedName("dfs.namenode.checkpoint.dir")
    @Expose
    private String dfsNamenodeCheckpointDir;
    @SerializedName("dfs.namenode.checkpoint.edits.dir")
    @Expose
    private String dfsNamenodeCheckpointEditsDir;
    @SerializedName("dfs.namenode.checkpoint.period")
    @Expose
    private String dfsNamenodeCheckpointPeriod;
    @SerializedName("dfs.namenode.checkpoint.txns")
    @Expose
    private String dfsNamenodeCheckpointTxns;
    @SerializedName("dfs.namenode.fslock.fair")
    @Expose
    private String dfsNamenodeFslockFair;
    @SerializedName("dfs.namenode.handler.count")
    @Expose
    private String dfsNamenodeHandlerCount;
    @SerializedName("dfs.namenode.http-address")
    @Expose
    private String dfsNamenodeHttpAddress;
    @SerializedName("dfs.namenode.https-address")
    @Expose
    private String dfsNamenodeHttpsAddress;
    @SerializedName("dfs.namenode.name.dir")
    @Expose
    private String dfsNamenodeNameDir;
    @SerializedName("dfs.namenode.name.dir.restore")
    @Expose
    private String dfsNamenodeNameDirRestore;
    @SerializedName("dfs.namenode.rpc-address")
    @Expose
    private String dfsNamenodeRpcAddress;
    @SerializedName("dfs.namenode.safemode.threshold-pct")
    @Expose
    private String dfsNamenodeSafemodeThresholdPct;
    @SerializedName("dfs.namenode.secondary.http-address")
    @Expose
    private String dfsNamenodeSecondaryHttpAddress;
    @SerializedName("dfs.namenode.stale.datanode.interval")
    @Expose
    private String dfsNamenodeStaleDatanodeInterval;
    @SerializedName("dfs.namenode.startup.delay.block.deletion.sec")
    @Expose
    private String dfsNamenodeStartupDelayBlockDeletionSec;
    @SerializedName("dfs.namenode.write.stale.datanode.ratio")
    @Expose
    private String dfsNamenodeWriteStaleDatanodeRatio;
    @SerializedName("dfs.permissions.enabled")
    @Expose
    private String dfsPermissionsEnabled;
    @SerializedName("dfs.permissions.superusergroup")
    @Expose
    private String dfsPermissionsSuperusergroup;
    @SerializedName("dfs.replication")
    @Expose
    private String dfsReplication;
    @SerializedName("dfs.replication.max")
    @Expose
    private String dfsReplicationMax;
    @SerializedName("dfs.support.append")
    @Expose
    private String dfsSupportAppend;
    @SerializedName("dfs.webhdfs.enabled")
    @Expose
    private String dfsWebhdfsEnabled;
    @SerializedName("fs.permissions.umask-mode")
    @Expose
    private String fsPermissionsUmaskMode;
    @SerializedName("nfs.exports.allowed.hosts")
    @Expose
    private String nfsExportsAllowedHosts;
    @SerializedName("nfs.file.dump.dir")
    @Expose
    private String nfsFileDumpDir;

    /**
     *
     * @return
     * The dfsBlockAccessTokenEnable
     */
    public String getDfsBlockAccessTokenEnable() {
        return dfsBlockAccessTokenEnable;
    }

    /**
     *
     * @param dfsBlockAccessTokenEnable
     * The dfs.block.access.token.enable
     */
    public void setDfsBlockAccessTokenEnable(String dfsBlockAccessTokenEnable) {
        this.dfsBlockAccessTokenEnable = dfsBlockAccessTokenEnable;
    }

    /**
     *
     * @return
     * The dfsBlockreportInitialDelay
     */
    public String getDfsBlockreportInitialDelay() {
        return dfsBlockreportInitialDelay;
    }

    /**
     *
     * @param dfsBlockreportInitialDelay
     * The dfs.blockreport.initialDelay
     */
    public void setDfsBlockreportInitialDelay(String dfsBlockreportInitialDelay) {
        this.dfsBlockreportInitialDelay = dfsBlockreportInitialDelay;
    }

    /**
     *
     * @return
     * The dfsBlocksize
     */
    public String getDfsBlocksize() {
        return dfsBlocksize;
    }

    /**
     *
     * @param dfsBlocksize
     * The dfs.blocksize
     */
    public void setDfsBlocksize(String dfsBlocksize) {
        this.dfsBlocksize = dfsBlocksize;
    }

    /**
     *
     * @return
     * The dfsClientReadShortcircuit
     */
    public String getDfsClientReadShortcircuit() {
        return dfsClientReadShortcircuit;
    }

    /**
     *
     * @param dfsClientReadShortcircuit
     * The dfs.client.read.shortcircuit
     */
    public void setDfsClientReadShortcircuit(String dfsClientReadShortcircuit) {
        this.dfsClientReadShortcircuit = dfsClientReadShortcircuit;
    }

    /**
     *
     * @return
     * The dfsClientReadShortcircuitStreamsCacheSize
     */
    public String getDfsClientReadShortcircuitStreamsCacheSize() {
        return dfsClientReadShortcircuitStreamsCacheSize;
    }

    /**
     *
     * @param dfsClientReadShortcircuitStreamsCacheSize
     * The dfs.client.read.shortcircuit.streams.cache.size
     */
    public void setDfsClientReadShortcircuitStreamsCacheSize(String dfsClientReadShortcircuitStreamsCacheSize) {
        this.dfsClientReadShortcircuitStreamsCacheSize = dfsClientReadShortcircuitStreamsCacheSize;
    }

    /**
     *
     * @return
     * The dfsClientRetryPolicyEnabled
     */
    public String getDfsClientRetryPolicyEnabled() {
        return dfsClientRetryPolicyEnabled;
    }

    /**
     *
     * @param dfsClientRetryPolicyEnabled
     * The dfs.client.retry.policy.enabled
     */
    public void setDfsClientRetryPolicyEnabled(String dfsClientRetryPolicyEnabled) {
        this.dfsClientRetryPolicyEnabled = dfsClientRetryPolicyEnabled;
    }

    /**
     *
     * @return
     * The dfsClusterAdministrators
     */
    public String getDfsClusterAdministrators() {
        return dfsClusterAdministrators;
    }

    /**
     *
     * @param dfsClusterAdministrators
     * The dfs.cluster.administrators
     */
    public void setDfsClusterAdministrators(String dfsClusterAdministrators) {
        this.dfsClusterAdministrators = dfsClusterAdministrators;
    }

    /**
     *
     * @return
     * The dfsContentSummaryLimit
     */
    public String getDfsContentSummaryLimit() {
        return dfsContentSummaryLimit;
    }

    /**
     *
     * @param dfsContentSummaryLimit
     * The dfs.content-summary.limit
     */
    public void setDfsContentSummaryLimit(String dfsContentSummaryLimit) {
        this.dfsContentSummaryLimit = dfsContentSummaryLimit;
    }

    /**
     *
     * @return
     * The dfsDatanodeAddress
     */
    public String getDfsDatanodeAddress() {
        return dfsDatanodeAddress;
    }

    /**
     *
     * @param dfsDatanodeAddress
     * The dfs.datanode.address
     */
    public void setDfsDatanodeAddress(String dfsDatanodeAddress) {
        this.dfsDatanodeAddress = dfsDatanodeAddress;
    }

    /**
     *
     * @return
     * The dfsDatanodeBalanceBandwidthPerSec
     */
    public String getDfsDatanodeBalanceBandwidthPerSec() {
        return dfsDatanodeBalanceBandwidthPerSec;
    }

    /**
     *
     * @param dfsDatanodeBalanceBandwidthPerSec
     * The dfs.datanode.balance.bandwidthPerSec
     */
    public void setDfsDatanodeBalanceBandwidthPerSec(String dfsDatanodeBalanceBandwidthPerSec) {
        this.dfsDatanodeBalanceBandwidthPerSec = dfsDatanodeBalanceBandwidthPerSec;
    }

    /**
     *
     * @return
     * The dfsDatanodeDataDir
     */
    public String getDfsDatanodeDataDir() {
        return dfsDatanodeDataDir;
    }

    /**
     *
     * @param dfsDatanodeDataDir
     * The dfs.datanode.data.dir
     */
    public void setDfsDatanodeDataDir(String dfsDatanodeDataDir) {
        this.dfsDatanodeDataDir = dfsDatanodeDataDir;
    }

    /**
     *
     * @return
     * The dfsDatanodeDataDirPerm
     */
    public String getDfsDatanodeDataDirPerm() {
        return dfsDatanodeDataDirPerm;
    }

    /**
     *
     * @param dfsDatanodeDataDirPerm
     * The dfs.datanode.data.dir.perm
     */
    public void setDfsDatanodeDataDirPerm(String dfsDatanodeDataDirPerm) {
        this.dfsDatanodeDataDirPerm = dfsDatanodeDataDirPerm;
    }

    /**
     *
     * @return
     * The dfsDatanodeDuReserved
     */
    public String getDfsDatanodeDuReserved() {
        return dfsDatanodeDuReserved;
    }

    /**
     *
     * @param dfsDatanodeDuReserved
     * The dfs.datanode.du.reserved
     */
    public void setDfsDatanodeDuReserved(String dfsDatanodeDuReserved) {
        this.dfsDatanodeDuReserved = dfsDatanodeDuReserved;
    }

    /**
     *
     * @return
     * The dfsDatanodeFailedVolumesTolerated
     */
    public String getDfsDatanodeFailedVolumesTolerated() {
        return dfsDatanodeFailedVolumesTolerated;
    }

    /**
     *
     * @param dfsDatanodeFailedVolumesTolerated
     * The dfs.datanode.failed.volumes.tolerated
     */
    public void setDfsDatanodeFailedVolumesTolerated(String dfsDatanodeFailedVolumesTolerated) {
        this.dfsDatanodeFailedVolumesTolerated = dfsDatanodeFailedVolumesTolerated;
    }

    /**
     *
     * @return
     * The dfsDatanodeHttpAddress
     */
    public String getDfsDatanodeHttpAddress() {
        return dfsDatanodeHttpAddress;
    }

    /**
     *
     * @param dfsDatanodeHttpAddress
     * The dfs.datanode.http.address
     */
    public void setDfsDatanodeHttpAddress(String dfsDatanodeHttpAddress) {
        this.dfsDatanodeHttpAddress = dfsDatanodeHttpAddress;
    }

    /**
     *
     * @return
     * The dfsDatanodeHttpsAddress
     */
    public String getDfsDatanodeHttpsAddress() {
        return dfsDatanodeHttpsAddress;
    }

    /**
     *
     * @param dfsDatanodeHttpsAddress
     * The dfs.datanode.https.address
     */
    public void setDfsDatanodeHttpsAddress(String dfsDatanodeHttpsAddress) {
        this.dfsDatanodeHttpsAddress = dfsDatanodeHttpsAddress;
    }

    /**
     *
     * @return
     * The dfsDatanodeIpcAddress
     */
    public String getDfsDatanodeIpcAddress() {
        return dfsDatanodeIpcAddress;
    }

    /**
     *
     * @param dfsDatanodeIpcAddress
     * The dfs.datanode.ipc.address
     */
    public void setDfsDatanodeIpcAddress(String dfsDatanodeIpcAddress) {
        this.dfsDatanodeIpcAddress = dfsDatanodeIpcAddress;
    }

    /**
     *
     * @return
     * The dfsDatanodeMaxTransferThreads
     */
    public String getDfsDatanodeMaxTransferThreads() {
        return dfsDatanodeMaxTransferThreads;
    }

    /**
     *
     * @param dfsDatanodeMaxTransferThreads
     * The dfs.datanode.max.transfer.threads
     */
    public void setDfsDatanodeMaxTransferThreads(String dfsDatanodeMaxTransferThreads) {
        this.dfsDatanodeMaxTransferThreads = dfsDatanodeMaxTransferThreads;
    }

    /**
     *
     * @return
     * The dfsDomainSocketPath
     */
    public String getDfsDomainSocketPath() {
        return dfsDomainSocketPath;
    }

    /**
     *
     * @param dfsDomainSocketPath
     * The dfs.domain.socket.path
     */
    public void setDfsDomainSocketPath(String dfsDomainSocketPath) {
        this.dfsDomainSocketPath = dfsDomainSocketPath;
    }

    /**
     *
     * @return
     * The dfsEncryptDataTransferCipherSuites
     */
    public String getDfsEncryptDataTransferCipherSuites() {
        return dfsEncryptDataTransferCipherSuites;
    }

    /**
     *
     * @param dfsEncryptDataTransferCipherSuites
     * The dfs.encrypt.data.transfer.cipher.suites
     */
    public void setDfsEncryptDataTransferCipherSuites(String dfsEncryptDataTransferCipherSuites) {
        this.dfsEncryptDataTransferCipherSuites = dfsEncryptDataTransferCipherSuites;
    }

    /**
     *
     * @return
     * The dfsEncryptionKeyProviderUri
     */
    public String getDfsEncryptionKeyProviderUri() {
        return dfsEncryptionKeyProviderUri;
    }

    /**
     *
     * @param dfsEncryptionKeyProviderUri
     * The dfs.encryption.key.provider.uri
     */
    public void setDfsEncryptionKeyProviderUri(String dfsEncryptionKeyProviderUri) {
        this.dfsEncryptionKeyProviderUri = dfsEncryptionKeyProviderUri;
    }

    /**
     *
     * @return
     * The dfsHeartbeatInterval
     */
    public String getDfsHeartbeatInterval() {
        return dfsHeartbeatInterval;
    }

    /**
     *
     * @param dfsHeartbeatInterval
     * The dfs.heartbeat.interval
     */
    public void setDfsHeartbeatInterval(String dfsHeartbeatInterval) {
        this.dfsHeartbeatInterval = dfsHeartbeatInterval;
    }

    /**
     *
     * @return
     * The dfsHostsExclude
     */
    public String getDfsHostsExclude() {
        return dfsHostsExclude;
    }

    /**
     *
     * @param dfsHostsExclude
     * The dfs.hosts.exclude
     */
    public void setDfsHostsExclude(String dfsHostsExclude) {
        this.dfsHostsExclude = dfsHostsExclude;
    }

    /**
     *
     * @return
     * The dfsHttpPolicy
     */
    public String getDfsHttpPolicy() {
        return dfsHttpPolicy;
    }

    /**
     *
     * @param dfsHttpPolicy
     * The dfs.http.policy
     */
    public void setDfsHttpPolicy(String dfsHttpPolicy) {
        this.dfsHttpPolicy = dfsHttpPolicy;
    }

    /**
     *
     * @return
     * The dfsHttpsPort
     */
    public String getDfsHttpsPort() {
        return dfsHttpsPort;
    }

    /**
     *
     * @param dfsHttpsPort
     * The dfs.https.port
     */
    public void setDfsHttpsPort(String dfsHttpsPort) {
        this.dfsHttpsPort = dfsHttpsPort;
    }

    /**
     *
     * @return
     * The dfsJournalnodeEditsDir
     */
    public String getDfsJournalnodeEditsDir() {
        return dfsJournalnodeEditsDir;
    }

    /**
     *
     * @param dfsJournalnodeEditsDir
     * The dfs.journalnode.edits.dir
     */
    public void setDfsJournalnodeEditsDir(String dfsJournalnodeEditsDir) {
        this.dfsJournalnodeEditsDir = dfsJournalnodeEditsDir;
    }

    /**
     *
     * @return
     * The dfsJournalnodeHttpAddress
     */
    public String getDfsJournalnodeHttpAddress() {
        return dfsJournalnodeHttpAddress;
    }

    /**
     *
     * @param dfsJournalnodeHttpAddress
     * The dfs.journalnode.http-address
     */
    public void setDfsJournalnodeHttpAddress(String dfsJournalnodeHttpAddress) {
        this.dfsJournalnodeHttpAddress = dfsJournalnodeHttpAddress;
    }

    /**
     *
     * @return
     * The dfsJournalnodeHttpsAddress
     */
    public String getDfsJournalnodeHttpsAddress() {
        return dfsJournalnodeHttpsAddress;
    }

    /**
     *
     * @param dfsJournalnodeHttpsAddress
     * The dfs.journalnode.https-address
     */
    public void setDfsJournalnodeHttpsAddress(String dfsJournalnodeHttpsAddress) {
        this.dfsJournalnodeHttpsAddress = dfsJournalnodeHttpsAddress;
    }

    /**
     *
     * @return
     * The dfsNamenodeAccesstimePrecision
     */
    public String getDfsNamenodeAccesstimePrecision() {
        return dfsNamenodeAccesstimePrecision;
    }

    /**
     *
     * @param dfsNamenodeAccesstimePrecision
     * The dfs.namenode.accesstime.precision
     */
    public void setDfsNamenodeAccesstimePrecision(String dfsNamenodeAccesstimePrecision) {
        this.dfsNamenodeAccesstimePrecision = dfsNamenodeAccesstimePrecision;
    }

    /**
     *
     * @return
     * The dfsNamenodeAuditLogAsync
     */
    public String getDfsNamenodeAuditLogAsync() {
        return dfsNamenodeAuditLogAsync;
    }

    /**
     *
     * @param dfsNamenodeAuditLogAsync
     * The dfs.namenode.audit.log.async
     */
    public void setDfsNamenodeAuditLogAsync(String dfsNamenodeAuditLogAsync) {
        this.dfsNamenodeAuditLogAsync = dfsNamenodeAuditLogAsync;
    }

    /**
     *
     * @return
     * The dfsNamenodeAvoidReadStaleDatanode
     */
    public String getDfsNamenodeAvoidReadStaleDatanode() {
        return dfsNamenodeAvoidReadStaleDatanode;
    }

    /**
     *
     * @param dfsNamenodeAvoidReadStaleDatanode
     * The dfs.namenode.avoid.read.stale.datanode
     */
    public void setDfsNamenodeAvoidReadStaleDatanode(String dfsNamenodeAvoidReadStaleDatanode) {
        this.dfsNamenodeAvoidReadStaleDatanode = dfsNamenodeAvoidReadStaleDatanode;
    }

    /**
     *
     * @return
     * The dfsNamenodeAvoidWriteStaleDatanode
     */
    public String getDfsNamenodeAvoidWriteStaleDatanode() {
        return dfsNamenodeAvoidWriteStaleDatanode;
    }

    /**
     *
     * @param dfsNamenodeAvoidWriteStaleDatanode
     * The dfs.namenode.avoid.write.stale.datanode
     */
    public void setDfsNamenodeAvoidWriteStaleDatanode(String dfsNamenodeAvoidWriteStaleDatanode) {
        this.dfsNamenodeAvoidWriteStaleDatanode = dfsNamenodeAvoidWriteStaleDatanode;
    }

    /**
     *
     * @return
     * The dfsNamenodeCheckpointDir
     */
    public String getDfsNamenodeCheckpointDir() {
        return dfsNamenodeCheckpointDir;
    }

    /**
     *
     * @param dfsNamenodeCheckpointDir
     * The dfs.namenode.checkpoint.dir
     */
    public void setDfsNamenodeCheckpointDir(String dfsNamenodeCheckpointDir) {
        this.dfsNamenodeCheckpointDir = dfsNamenodeCheckpointDir;
    }

    /**
     *
     * @return
     * The dfsNamenodeCheckpointEditsDir
     */
    public String getDfsNamenodeCheckpointEditsDir() {
        return dfsNamenodeCheckpointEditsDir;
    }

    /**
     *
     * @param dfsNamenodeCheckpointEditsDir
     * The dfs.namenode.checkpoint.edits.dir
     */
    public void setDfsNamenodeCheckpointEditsDir(String dfsNamenodeCheckpointEditsDir) {
        this.dfsNamenodeCheckpointEditsDir = dfsNamenodeCheckpointEditsDir;
    }

    /**
     *
     * @return
     * The dfsNamenodeCheckpointPeriod
     */
    public String getDfsNamenodeCheckpointPeriod() {
        return dfsNamenodeCheckpointPeriod;
    }

    /**
     *
     * @param dfsNamenodeCheckpointPeriod
     * The dfs.namenode.checkpoint.period
     */
    public void setDfsNamenodeCheckpointPeriod(String dfsNamenodeCheckpointPeriod) {
        this.dfsNamenodeCheckpointPeriod = dfsNamenodeCheckpointPeriod;
    }

    /**
     *
     * @return
     * The dfsNamenodeCheckpointTxns
     */
    public String getDfsNamenodeCheckpointTxns() {
        return dfsNamenodeCheckpointTxns;
    }

    /**
     *
     * @param dfsNamenodeCheckpointTxns
     * The dfs.namenode.checkpoint.txns
     */
    public void setDfsNamenodeCheckpointTxns(String dfsNamenodeCheckpointTxns) {
        this.dfsNamenodeCheckpointTxns = dfsNamenodeCheckpointTxns;
    }

    /**
     *
     * @return
     * The dfsNamenodeFslockFair
     */
    public String getDfsNamenodeFslockFair() {
        return dfsNamenodeFslockFair;
    }

    /**
     *
     * @param dfsNamenodeFslockFair
     * The dfs.namenode.fslock.fair
     */
    public void setDfsNamenodeFslockFair(String dfsNamenodeFslockFair) {
        this.dfsNamenodeFslockFair = dfsNamenodeFslockFair;
    }

    /**
     *
     * @return
     * The dfsNamenodeHandlerCount
     */
    public String getDfsNamenodeHandlerCount() {
        return dfsNamenodeHandlerCount;
    }

    /**
     *
     * @param dfsNamenodeHandlerCount
     * The dfs.namenode.handler.count
     */
    public void setDfsNamenodeHandlerCount(String dfsNamenodeHandlerCount) {
        this.dfsNamenodeHandlerCount = dfsNamenodeHandlerCount;
    }

    /**
     *
     * @return
     * The dfsNamenodeHttpAddress
     */
    public String getDfsNamenodeHttpAddress() {
        return dfsNamenodeHttpAddress;
    }

    /**
     *
     * @param dfsNamenodeHttpAddress
     * The dfs.namenode.http-address
     */
    public void setDfsNamenodeHttpAddress(String dfsNamenodeHttpAddress) {
        this.dfsNamenodeHttpAddress = dfsNamenodeHttpAddress;
    }

    /**
     *
     * @return
     * The dfsNamenodeHttpsAddress
     */
    public String getDfsNamenodeHttpsAddress() {
        return dfsNamenodeHttpsAddress;
    }

    /**
     *
     * @param dfsNamenodeHttpsAddress
     * The dfs.namenode.https-address
     */
    public void setDfsNamenodeHttpsAddress(String dfsNamenodeHttpsAddress) {
        this.dfsNamenodeHttpsAddress = dfsNamenodeHttpsAddress;
    }

    /**
     *
     * @return
     * The dfsNamenodeNameDir
     */
    public String getDfsNamenodeNameDir() {
        return dfsNamenodeNameDir;
    }

    /**
     *
     * @param dfsNamenodeNameDir
     * The dfs.namenode.name.dir
     */
    public void setDfsNamenodeNameDir(String dfsNamenodeNameDir) {
        this.dfsNamenodeNameDir = dfsNamenodeNameDir;
    }

    /**
     *
     * @return
     * The dfsNamenodeNameDirRestore
     */
    public String getDfsNamenodeNameDirRestore() {
        return dfsNamenodeNameDirRestore;
    }

    /**
     *
     * @param dfsNamenodeNameDirRestore
     * The dfs.namenode.name.dir.restore
     */
    public void setDfsNamenodeNameDirRestore(String dfsNamenodeNameDirRestore) {
        this.dfsNamenodeNameDirRestore = dfsNamenodeNameDirRestore;
    }

    /**
     *
     * @return
     * The dfsNamenodeRpcAddress
     */
    public String getDfsNamenodeRpcAddress() {
        return dfsNamenodeRpcAddress;
    }

    /**
     *
     * @param dfsNamenodeRpcAddress
     * The dfs.namenode.rpc-address
     */
    public void setDfsNamenodeRpcAddress(String dfsNamenodeRpcAddress) {
        this.dfsNamenodeRpcAddress = dfsNamenodeRpcAddress;
    }

    /**
     *
     * @return
     * The dfsNamenodeSafemodeThresholdPct
     */
    public String getDfsNamenodeSafemodeThresholdPct() {
        return dfsNamenodeSafemodeThresholdPct;
    }

    /**
     *
     * @param dfsNamenodeSafemodeThresholdPct
     * The dfs.namenode.safemode.threshold-pct
     */
    public void setDfsNamenodeSafemodeThresholdPct(String dfsNamenodeSafemodeThresholdPct) {
        this.dfsNamenodeSafemodeThresholdPct = dfsNamenodeSafemodeThresholdPct;
    }

    /**
     *
     * @return
     * The dfsNamenodeSecondaryHttpAddress
     */
    public String getDfsNamenodeSecondaryHttpAddress() {
        return dfsNamenodeSecondaryHttpAddress;
    }

    /**
     *
     * @param dfsNamenodeSecondaryHttpAddress
     * The dfs.namenode.secondary.http-address
     */
    public void setDfsNamenodeSecondaryHttpAddress(String dfsNamenodeSecondaryHttpAddress) {
        this.dfsNamenodeSecondaryHttpAddress = dfsNamenodeSecondaryHttpAddress;
    }

    /**
     *
     * @return
     * The dfsNamenodeStaleDatanodeInterval
     */
    public String getDfsNamenodeStaleDatanodeInterval() {
        return dfsNamenodeStaleDatanodeInterval;
    }

    /**
     *
     * @param dfsNamenodeStaleDatanodeInterval
     * The dfs.namenode.stale.datanode.interval
     */
    public void setDfsNamenodeStaleDatanodeInterval(String dfsNamenodeStaleDatanodeInterval) {
        this.dfsNamenodeStaleDatanodeInterval = dfsNamenodeStaleDatanodeInterval;
    }

    /**
     *
     * @return
     * The dfsNamenodeStartupDelayBlockDeletionSec
     */
    public String getDfsNamenodeStartupDelayBlockDeletionSec() {
        return dfsNamenodeStartupDelayBlockDeletionSec;
    }

    /**
     *
     * @param dfsNamenodeStartupDelayBlockDeletionSec
     * The dfs.namenode.startup.delay.block.deletion.sec
     */
    public void setDfsNamenodeStartupDelayBlockDeletionSec(String dfsNamenodeStartupDelayBlockDeletionSec) {
        this.dfsNamenodeStartupDelayBlockDeletionSec = dfsNamenodeStartupDelayBlockDeletionSec;
    }

    /**
     *
     * @return
     * The dfsNamenodeWriteStaleDatanodeRatio
     */
    public String getDfsNamenodeWriteStaleDatanodeRatio() {
        return dfsNamenodeWriteStaleDatanodeRatio;
    }

    /**
     *
     * @param dfsNamenodeWriteStaleDatanodeRatio
     * The dfs.namenode.write.stale.datanode.ratio
     */
    public void setDfsNamenodeWriteStaleDatanodeRatio(String dfsNamenodeWriteStaleDatanodeRatio) {
        this.dfsNamenodeWriteStaleDatanodeRatio = dfsNamenodeWriteStaleDatanodeRatio;
    }

    /**
     *
     * @return
     * The dfsPermissionsEnabled
     */
    public String getDfsPermissionsEnabled() {
        return dfsPermissionsEnabled;
    }

    /**
     *
     * @param dfsPermissionsEnabled
     * The dfs.permissions.enabled
     */
    public void setDfsPermissionsEnabled(String dfsPermissionsEnabled) {
        this.dfsPermissionsEnabled = dfsPermissionsEnabled;
    }

    /**
     *
     * @return
     * The dfsPermissionsSuperusergroup
     */
    public String getDfsPermissionsSuperusergroup() {
        return dfsPermissionsSuperusergroup;
    }

    /**
     *
     * @param dfsPermissionsSuperusergroup
     * The dfs.permissions.superusergroup
     */
    public void setDfsPermissionsSuperusergroup(String dfsPermissionsSuperusergroup) {
        this.dfsPermissionsSuperusergroup = dfsPermissionsSuperusergroup;
    }

    /**
     *
     * @return
     * The dfsReplication
     */
    public String getDfsReplication() {
        return dfsReplication;
    }

    /**
     *
     * @param dfsReplication
     * The dfs.replication
     */
    public void setDfsReplication(String dfsReplication) {
        this.dfsReplication = dfsReplication;
    }

    /**
     *
     * @return
     * The dfsReplicationMax
     */
    public String getDfsReplicationMax() {
        return dfsReplicationMax;
    }

    /**
     *
     * @param dfsReplicationMax
     * The dfs.replication.max
     */
    public void setDfsReplicationMax(String dfsReplicationMax) {
        this.dfsReplicationMax = dfsReplicationMax;
    }

    /**
     *
     * @return
     * The dfsSupportAppend
     */
    public String getDfsSupportAppend() {
        return dfsSupportAppend;
    }

    /**
     *
     * @param dfsSupportAppend
     * The dfs.support.append
     */
    public void setDfsSupportAppend(String dfsSupportAppend) {
        this.dfsSupportAppend = dfsSupportAppend;
    }

    /**
     *
     * @return
     * The dfsWebhdfsEnabled
     */
    public String getDfsWebhdfsEnabled() {
        return dfsWebhdfsEnabled;
    }

    /**
     *
     * @param dfsWebhdfsEnabled
     * The dfs.webhdfs.enabled
     */
    public void setDfsWebhdfsEnabled(String dfsWebhdfsEnabled) {
        this.dfsWebhdfsEnabled = dfsWebhdfsEnabled;
    }

    /**
     *
     * @return
     * The fsPermissionsUmaskMode
     */
    public String getFsPermissionsUmaskMode() {
        return fsPermissionsUmaskMode;
    }

    /**
     *
     * @param fsPermissionsUmaskMode
     * The fs.permissions.umask-mode
     */
    public void setFsPermissionsUmaskMode(String fsPermissionsUmaskMode) {
        this.fsPermissionsUmaskMode = fsPermissionsUmaskMode;
    }

    /**
     *
     * @return
     * The nfsExportsAllowedHosts
     */
    public String getNfsExportsAllowedHosts() {
        return nfsExportsAllowedHosts;
    }

    /**
     *
     * @param nfsExportsAllowedHosts
     * The nfs.exports.allowed.hosts
     */
    public void setNfsExportsAllowedHosts(String nfsExportsAllowedHosts) {
        this.nfsExportsAllowedHosts = nfsExportsAllowedHosts;
    }

    /**
     *
     * @return
     * The nfsFileDumpDir
     */
    public String getNfsFileDumpDir() {
        return nfsFileDumpDir;
    }

    /**
     *
     * @param nfsFileDumpDir
     * The nfs.file.dump.dir
     */
    public void setNfsFileDumpDir(String nfsFileDumpDir) {
        this.nfsFileDumpDir = nfsFileDumpDir;
    }

}