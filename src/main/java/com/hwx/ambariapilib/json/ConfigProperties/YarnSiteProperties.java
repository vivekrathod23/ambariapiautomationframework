package com.hwx.ambariapilib.json.ConfigProperties;

/**
 * Created by vrathod on 12/5/15.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class YarnSiteProperties {

    @SerializedName("hadoop.registry.rm.enabled")
    @Expose
    private String hadoopRegistryRmEnabled;
    @SerializedName("hadoop.registry.zk.quorum")
    @Expose
    private String hadoopRegistryZkQuorum;
    @SerializedName("yarn.acl.enable")
    @Expose
    private String yarnAclEnable;
    @SerializedName("yarn.admin.acl")
    @Expose
    private String yarnAdminAcl;
    @SerializedName("yarn.application.classpath")
    @Expose
    private String yarnApplicationClasspath;
    @SerializedName("yarn.client.nodemanager-connect.max-wait-ms")
    @Expose
    private String yarnClientNodemanagerConnectMaxWaitMs;
    @SerializedName("yarn.client.nodemanager-connect.retry-interval-ms")
    @Expose
    private String yarnClientNodemanagerConnectRetryIntervalMs;
    @SerializedName("yarn.http.policy")
    @Expose
    private String yarnHttpPolicy;
    @SerializedName("yarn.log-aggregation-enable")
    @Expose
    private String yarnLogAggregationEnable;
    @SerializedName("yarn.log-aggregation.retain-seconds")
    @Expose
    private String yarnLogAggregationRetainSeconds;
    @SerializedName("yarn.log.server.url")
    @Expose
    private String yarnLogServerUrl;
    @SerializedName("yarn.node-labels.enabled")
    @Expose
    private String yarnNodeLabelsEnabled;
    @SerializedName("yarn.node-labels.fs-store.retry-policy-spec")
    @Expose
    private String yarnNodeLabelsFsStoreRetryPolicySpec;
    @SerializedName("yarn.node-labels.fs-store.root-dir")
    @Expose
    private String yarnNodeLabelsFsStoreRootDir;
    @SerializedName("yarn.nodemanager.address")
    @Expose
    private String yarnNodemanagerAddress;
    @SerializedName("yarn.nodemanager.admin-env")
    @Expose
    private String yarnNodemanagerAdminEnv;
    @SerializedName("yarn.nodemanager.aux-services")
    @Expose
    private String yarnNodemanagerAuxServices;
    @SerializedName("yarn.nodemanager.aux-services.mapreduce_shuffle.class")
    @Expose
    private String yarnNodemanagerAuxServicesMapreduceShuffleClass;
    @SerializedName("yarn.nodemanager.bind-host")
    @Expose
    private String yarnNodemanagerBindHost;
    @SerializedName("yarn.nodemanager.container-executor.class")
    @Expose
    private String yarnNodemanagerContainerExecutorClass;
    @SerializedName("yarn.nodemanager.container-monitor.interval-ms")
    @Expose
    private String yarnNodemanagerContainerMonitorIntervalMs;
    @SerializedName("yarn.nodemanager.delete.debug-delay-sec")
    @Expose
    private String yarnNodemanagerDeleteDebugDelaySec;
    @SerializedName("yarn.nodemanager.disk-health-checker.max-disk-utilization-per-disk-percentage")
    @Expose
    private String yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage;
    @SerializedName("yarn.nodemanager.disk-health-checker.min-free-space-per-disk-mb")
    @Expose
    private String yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb;
    @SerializedName("yarn.nodemanager.disk-health-checker.min-healthy-disks")
    @Expose
    private String yarnNodemanagerDiskHealthCheckerMinHealthyDisks;
    @SerializedName("yarn.nodemanager.health-checker.interval-ms")
    @Expose
    private String yarnNodemanagerHealthCheckerIntervalMs;
    @SerializedName("yarn.nodemanager.health-checker.script.timeout-ms")
    @Expose
    private String yarnNodemanagerHealthCheckerScriptTimeoutMs;
    @SerializedName("yarn.nodemanager.linux-container-executor.cgroups.hierarchy")
    @Expose
    private String yarnNodemanagerLinuxContainerExecutorCgroupsHierarchy;
    @SerializedName("yarn.nodemanager.linux-container-executor.cgroups.mount")
    @Expose
    private String yarnNodemanagerLinuxContainerExecutorCgroupsMount;
    @SerializedName("yarn.nodemanager.linux-container-executor.cgroups.strict-resource-usage")
    @Expose
    private String yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage;
    @SerializedName("yarn.nodemanager.linux-container-executor.group")
    @Expose
    private String yarnNodemanagerLinuxContainerExecutorGroup;
    @SerializedName("yarn.nodemanager.linux-container-executor.resources-handler.class")
    @Expose
    private String yarnNodemanagerLinuxContainerExecutorResourcesHandlerClass;
    @SerializedName("yarn.nodemanager.local-dirs")
    @Expose
    private String yarnNodemanagerLocalDirs;
    @SerializedName("yarn.nodemanager.log-aggregation.compression-type")
    @Expose
    private String yarnNodemanagerLogAggregationCompressionType;
    @SerializedName("yarn.nodemanager.log-aggregation.debug-enabled")
    @Expose
    private String yarnNodemanagerLogAggregationDebugEnabled;
    @SerializedName("yarn.nodemanager.log-aggregation.num-log-files-per-app")
    @Expose
    private String yarnNodemanagerLogAggregationNumLogFilesPerApp;
    @SerializedName("yarn.nodemanager.log-aggregation.roll-monitoring-interval-seconds")
    @Expose
    private String yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds;
    @SerializedName("yarn.nodemanager.log-dirs")
    @Expose
    private String yarnNodemanagerLogDirs;
    @SerializedName("yarn.nodemanager.log.retain-second")
    @Expose
    private String yarnNodemanagerLogRetainSecond;
    @SerializedName("yarn.nodemanager.recovery.dir")
    @Expose
    private String yarnNodemanagerRecoveryDir;
    @SerializedName("yarn.nodemanager.recovery.enabled")
    @Expose
    private String yarnNodemanagerRecoveryEnabled;
    @SerializedName("yarn.nodemanager.remote-app-log-dir")
    @Expose
    private String yarnNodemanagerRemoteAppLogDir;
    @SerializedName("yarn.nodemanager.remote-app-log-dir-suffix")
    @Expose
    private String yarnNodemanagerRemoteAppLogDirSuffix;
    @SerializedName("yarn.nodemanager.resource.cpu-vcores")
    @Expose
    private String yarnNodemanagerResourceCpuVcores;
    @SerializedName("yarn.nodemanager.resource.memory-mb")
    @Expose
    private String yarnNodemanagerResourceMemoryMb;
    @SerializedName("yarn.nodemanager.resource.percentage-physical-cpu-limit")
    @Expose
    private String yarnNodemanagerResourcePercentagePhysicalCpuLimit;
    @SerializedName("yarn.nodemanager.vmem-check-enabled")
    @Expose
    private String yarnNodemanagerVmemCheckEnabled;
    @SerializedName("yarn.nodemanager.vmem-pmem-ratio")
    @Expose
    private String yarnNodemanagerVmemPmemRatio;
    @SerializedName("yarn.resourcemanager.address")
    @Expose
    private String yarnResourcemanagerAddress;
    @SerializedName("yarn.resourcemanager.admin.address")
    @Expose
    private String yarnResourcemanagerAdminAddress;
    @SerializedName("yarn.resourcemanager.am.max-attempts")
    @Expose
    private String yarnResourcemanagerAmMaxAttempts;
    @SerializedName("yarn.resourcemanager.bind-host")
    @Expose
    private String yarnResourcemanagerBindHost;
    @SerializedName("yarn.resourcemanager.connect.max-wait.ms")
    @Expose
    private String yarnResourcemanagerConnectMaxWaitMs;
    @SerializedName("yarn.resourcemanager.connect.retry-interval.ms")
    @Expose
    private String yarnResourcemanagerConnectRetryIntervalMs;
    @SerializedName("yarn.resourcemanager.fs.state-store.retry-policy-spec")
    @Expose
    private String yarnResourcemanagerFsStateStoreRetryPolicySpec;
    @SerializedName("yarn.resourcemanager.fs.state-store.uri")
    @Expose
    private String yarnResourcemanagerFsStateStoreUri;
    @SerializedName("yarn.resourcemanager.ha.enabled")
    @Expose
    private String yarnResourcemanagerHaEnabled;
    @SerializedName("yarn.resourcemanager.hostname")
    @Expose
    private String yarnResourcemanagerHostname;
    @SerializedName("yarn.resourcemanager.nodes.exclude-path")
    @Expose
    private String yarnResourcemanagerNodesExcludePath;
    @SerializedName("yarn.resourcemanager.recovery.enabled")
    @Expose
    private String yarnResourcemanagerRecoveryEnabled;
    @SerializedName("yarn.resourcemanager.resource-tracker.address")
    @Expose
    private String yarnResourcemanagerResourceTrackerAddress;
    @SerializedName("yarn.resourcemanager.scheduler.address")
    @Expose
    private String yarnResourcemanagerSchedulerAddress;
    @SerializedName("yarn.resourcemanager.scheduler.class")
    @Expose
    private String yarnResourcemanagerSchedulerClass;
    @SerializedName("yarn.resourcemanager.scheduler.monitor.enable")
    @Expose
    private String yarnResourcemanagerSchedulerMonitorEnable;
    @SerializedName("yarn.resourcemanager.state-store.max-completed-applications")
    @Expose
    private String yarnResourcemanagerStateStoreMaxCompletedApplications;
    @SerializedName("yarn.resourcemanager.store.class")
    @Expose
    private String yarnResourcemanagerStoreClass;
    @SerializedName("yarn.resourcemanager.system-metrics-publisher.dispatcher.pool-size")
    @Expose
    private String yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize;
    @SerializedName("yarn.resourcemanager.system-metrics-publisher.enabled")
    @Expose
    private String yarnResourcemanagerSystemMetricsPublisherEnabled;
    @SerializedName("yarn.resourcemanager.webapp.address")
    @Expose
    private String yarnResourcemanagerWebappAddress;
    @SerializedName("yarn.resourcemanager.webapp.delegation-token-auth-filter.enabled")
    @Expose
    private String yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled;
    @SerializedName("yarn.resourcemanager.webapp.https.address")
    @Expose
    private String yarnResourcemanagerWebappHttpsAddress;
    @SerializedName("yarn.resourcemanager.work-preserving-recovery.enabled")
    @Expose
    private String yarnResourcemanagerWorkPreservingRecoveryEnabled;
    @SerializedName("yarn.resourcemanager.work-preserving-recovery.scheduling-wait-ms")
    @Expose
    private String yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs;
    @SerializedName("yarn.resourcemanager.zk-acl")
    @Expose
    private String yarnResourcemanagerZkAcl;
    @SerializedName("yarn.resourcemanager.zk-address")
    @Expose
    private String yarnResourcemanagerZkAddress;
    @SerializedName("yarn.resourcemanager.zk-num-retries")
    @Expose
    private String yarnResourcemanagerZkNumRetries;
    @SerializedName("yarn.resourcemanager.zk-retry-interval-ms")
    @Expose
    private String yarnResourcemanagerZkRetryIntervalMs;
    @SerializedName("yarn.resourcemanager.zk-state-store.parent-path")
    @Expose
    private String yarnResourcemanagerZkStateStoreParentPath;
    @SerializedName("yarn.resourcemanager.zk-timeout-ms")
    @Expose
    private String yarnResourcemanagerZkTimeoutMs;
    @SerializedName("yarn.scheduler.maximum-allocation-mb")
    @Expose
    private String yarnSchedulerMaximumAllocationMb;
    @SerializedName("yarn.scheduler.maximum-allocation-vcores")
    @Expose
    private String yarnSchedulerMaximumAllocationVcores;
    @SerializedName("yarn.scheduler.minimum-allocation-mb")
    @Expose
    private String yarnSchedulerMinimumAllocationMb;
    @SerializedName("yarn.scheduler.minimum-allocation-vcores")
    @Expose
    private String yarnSchedulerMinimumAllocationVcores;
    @SerializedName("yarn.timeline-service.address")
    @Expose
    private String yarnTimelineServiceAddress;
    @SerializedName("yarn.timeline-service.bind-host")
    @Expose
    private String yarnTimelineServiceBindHost;
    @SerializedName("yarn.timeline-service.client.max-retries")
    @Expose
    private String yarnTimelineServiceClientMaxRetries;
    @SerializedName("yarn.timeline-service.client.retry-interval-ms")
    @Expose
    private String yarnTimelineServiceClientRetryIntervalMs;
    @SerializedName("yarn.timeline-service.enabled")
    @Expose
    private String yarnTimelineServiceEnabled;
    @SerializedName("yarn.timeline-service.entity-group-fs-store.active-dir")
    @Expose
    private String yarnTimelineServiceEntityGroupFsStoreActiveDir;
    @SerializedName("yarn.timeline-service.entity-group-fs-store.cleaner-interval-seconds")
    @Expose
    private String yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds;
    @SerializedName("yarn.timeline-service.entity-group-fs-store.done-dir")
    @Expose
    private String yarnTimelineServiceEntityGroupFsStoreDoneDir;
    @SerializedName("yarn.timeline-service.entity-group-fs-store.group-id-plugin-classes")
    @Expose
    private String yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses;
    @SerializedName("yarn.timeline-service.entity-group-fs-store.retain-seconds")
    @Expose
    private String yarnTimelineServiceEntityGroupFsStoreRetainSeconds;
    @SerializedName("yarn.timeline-service.entity-group-fs-store.scan-interval-seconds")
    @Expose
    private String yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds;
    @SerializedName("yarn.timeline-service.entity-group-fs-store.summary-store")
    @Expose
    private String yarnTimelineServiceEntityGroupFsStoreSummaryStore;
    @SerializedName("yarn.timeline-service.generic-application-history.store-class")
    @Expose
    private String yarnTimelineServiceGenericApplicationHistoryStoreClass;
    @SerializedName("yarn.timeline-service.http-authentication.simple.anonymous.allowed")
    @Expose
    private String yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed;
    @SerializedName("yarn.timeline-service.http-authentication.type")
    @Expose
    private String yarnTimelineServiceHttpAuthenticationType;
    @SerializedName("yarn.timeline-service.leveldb-state-store.path")
    @Expose
    private String yarnTimelineServiceLeveldbStateStorePath;
    @SerializedName("yarn.timeline-service.leveldb-timeline-store.path")
    @Expose
    private String yarnTimelineServiceLeveldbTimelineStorePath;
    @SerializedName("yarn.timeline-service.leveldb-timeline-store.read-cache-size")
    @Expose
    private String yarnTimelineServiceLeveldbTimelineStoreReadCacheSize;
    @SerializedName("yarn.timeline-service.leveldb-timeline-store.start-time-read-cache-size")
    @Expose
    private String yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize;
    @SerializedName("yarn.timeline-service.leveldb-timeline-store.start-time-write-cache-size")
    @Expose
    private String yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize;
    @SerializedName("yarn.timeline-service.leveldb-timeline-store.ttl-interval-ms")
    @Expose
    private String yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs;
    @SerializedName("yarn.timeline-service.recovery.enabled")
    @Expose
    private String yarnTimelineServiceRecoveryEnabled;
    @SerializedName("yarn.timeline-service.state-store-class")
    @Expose
    private String yarnTimelineServiceStateStoreClass;
    @SerializedName("yarn.timeline-service.store-class")
    @Expose
    private String yarnTimelineServiceStoreClass;
    @SerializedName("yarn.timeline-service.ttl-enable")
    @Expose
    private String yarnTimelineServiceTtlEnable;
    @SerializedName("yarn.timeline-service.ttl-ms")
    @Expose
    private String yarnTimelineServiceTtlMs;
    @SerializedName("yarn.timeline-service.version")
    @Expose
    private String yarnTimelineServiceVersion;
    @SerializedName("yarn.timeline-service.webapp.address")
    @Expose
    private String yarnTimelineServiceWebappAddress;
    @SerializedName("yarn.timeline-service.webapp.https.address")
    @Expose
    private String yarnTimelineServiceWebappHttpsAddress;

    /**
     *
     * @return
     * The hadoopRegistryRmEnabled
     */
    public String getHadoopRegistryRmEnabled() {
        return hadoopRegistryRmEnabled;
    }

    /**
     *
     * @param hadoopRegistryRmEnabled
     * The hadoop.registry.rm.enabled
     */
    public void setHadoopRegistryRmEnabled(String hadoopRegistryRmEnabled) {
        this.hadoopRegistryRmEnabled = hadoopRegistryRmEnabled;
    }

    /**
     *
     * @return
     * The hadoopRegistryZkQuorum
     */
    public String getHadoopRegistryZkQuorum() {
        return hadoopRegistryZkQuorum;
    }

    /**
     *
     * @param hadoopRegistryZkQuorum
     * The hadoop.registry.zk.quorum
     */
    public void setHadoopRegistryZkQuorum(String hadoopRegistryZkQuorum) {
        this.hadoopRegistryZkQuorum = hadoopRegistryZkQuorum;
    }

    /**
     *
     * @return
     * The yarnAclEnable
     */
    public String getYarnAclEnable() {
        return yarnAclEnable;
    }

    /**
     *
     * @param yarnAclEnable
     * The yarn.acl.enable
     */
    public void setYarnAclEnable(String yarnAclEnable) {
        this.yarnAclEnable = yarnAclEnable;
    }

    /**
     *
     * @return
     * The yarnAdminAcl
     */
    public String getYarnAdminAcl() {
        return yarnAdminAcl;
    }

    /**
     *
     * @param yarnAdminAcl
     * The yarn.admin.acl
     */
    public void setYarnAdminAcl(String yarnAdminAcl) {
        this.yarnAdminAcl = yarnAdminAcl;
    }

    /**
     *
     * @return
     * The yarnApplicationClasspath
     */
    public String getYarnApplicationClasspath() {
        return yarnApplicationClasspath;
    }

    /**
     *
     * @param yarnApplicationClasspath
     * The yarn.application.classpath
     */
    public void setYarnApplicationClasspath(String yarnApplicationClasspath) {
        this.yarnApplicationClasspath = yarnApplicationClasspath;
    }

    /**
     *
     * @return
     * The yarnClientNodemanagerConnectMaxWaitMs
     */
    public String getYarnClientNodemanagerConnectMaxWaitMs() {
        return yarnClientNodemanagerConnectMaxWaitMs;
    }

    /**
     *
     * @param yarnClientNodemanagerConnectMaxWaitMs
     * The yarn.client.nodemanager-connect.max-wait-ms
     */
    public void setYarnClientNodemanagerConnectMaxWaitMs(String yarnClientNodemanagerConnectMaxWaitMs) {
        this.yarnClientNodemanagerConnectMaxWaitMs = yarnClientNodemanagerConnectMaxWaitMs;
    }

    /**
     *
     * @return
     * The yarnClientNodemanagerConnectRetryIntervalMs
     */
    public String getYarnClientNodemanagerConnectRetryIntervalMs() {
        return yarnClientNodemanagerConnectRetryIntervalMs;
    }

    /**
     *
     * @param yarnClientNodemanagerConnectRetryIntervalMs
     * The yarn.client.nodemanager-connect.retry-interval-ms
     */
    public void setYarnClientNodemanagerConnectRetryIntervalMs(String yarnClientNodemanagerConnectRetryIntervalMs) {
        this.yarnClientNodemanagerConnectRetryIntervalMs = yarnClientNodemanagerConnectRetryIntervalMs;
    }

    /**
     *
     * @return
     * The yarnHttpPolicy
     */
    public String getYarnHttpPolicy() {
        return yarnHttpPolicy;
    }

    /**
     *
     * @param yarnHttpPolicy
     * The yarn.http.policy
     */
    public void setYarnHttpPolicy(String yarnHttpPolicy) {
        this.yarnHttpPolicy = yarnHttpPolicy;
    }

    /**
     *
     * @return
     * The yarnLogAggregationEnable
     */
    public String getYarnLogAggregationEnable() {
        return yarnLogAggregationEnable;
    }

    /**
     *
     * @param yarnLogAggregationEnable
     * The yarn.log-aggregation-enable
     */
    public void setYarnLogAggregationEnable(String yarnLogAggregationEnable) {
        this.yarnLogAggregationEnable = yarnLogAggregationEnable;
    }

    /**
     *
     * @return
     * The yarnLogAggregationRetainSeconds
     */
    public String getYarnLogAggregationRetainSeconds() {
        return yarnLogAggregationRetainSeconds;
    }

    /**
     *
     * @param yarnLogAggregationRetainSeconds
     * The yarn.log-aggregation.retain-seconds
     */
    public void setYarnLogAggregationRetainSeconds(String yarnLogAggregationRetainSeconds) {
        this.yarnLogAggregationRetainSeconds = yarnLogAggregationRetainSeconds;
    }

    /**
     *
     * @return
     * The yarnLogServerUrl
     */
    public String getYarnLogServerUrl() {
        return yarnLogServerUrl;
    }

    /**
     *
     * @param yarnLogServerUrl
     * The yarn.log.server.url
     */
    public void setYarnLogServerUrl(String yarnLogServerUrl) {
        this.yarnLogServerUrl = yarnLogServerUrl;
    }

    /**
     *
     * @return
     * The yarnNodeLabelsEnabled
     */
    public String getYarnNodeLabelsEnabled() {
        return yarnNodeLabelsEnabled;
    }

    /**
     *
     * @param yarnNodeLabelsEnabled
     * The yarn.node-labels.enabled
     */
    public void setYarnNodeLabelsEnabled(String yarnNodeLabelsEnabled) {
        this.yarnNodeLabelsEnabled = yarnNodeLabelsEnabled;
    }

    /**
     *
     * @return
     * The yarnNodeLabelsFsStoreRetryPolicySpec
     */
    public String getYarnNodeLabelsFsStoreRetryPolicySpec() {
        return yarnNodeLabelsFsStoreRetryPolicySpec;
    }

    /**
     *
     * @param yarnNodeLabelsFsStoreRetryPolicySpec
     * The yarn.node-labels.fs-store.retry-policy-spec
     */
    public void setYarnNodeLabelsFsStoreRetryPolicySpec(String yarnNodeLabelsFsStoreRetryPolicySpec) {
        this.yarnNodeLabelsFsStoreRetryPolicySpec = yarnNodeLabelsFsStoreRetryPolicySpec;
    }

    /**
     *
     * @return
     * The yarnNodeLabelsFsStoreRootDir
     */
    public String getYarnNodeLabelsFsStoreRootDir() {
        return yarnNodeLabelsFsStoreRootDir;
    }

    /**
     *
     * @param yarnNodeLabelsFsStoreRootDir
     * The yarn.node-labels.fs-store.root-dir
     */
    public void setYarnNodeLabelsFsStoreRootDir(String yarnNodeLabelsFsStoreRootDir) {
        this.yarnNodeLabelsFsStoreRootDir = yarnNodeLabelsFsStoreRootDir;
    }

    /**
     *
     * @return
     * The yarnNodemanagerAddress
     */
    public String getYarnNodemanagerAddress() {
        return yarnNodemanagerAddress;
    }

    /**
     *
     * @param yarnNodemanagerAddress
     * The yarn.nodemanager.address
     */
    public void setYarnNodemanagerAddress(String yarnNodemanagerAddress) {
        this.yarnNodemanagerAddress = yarnNodemanagerAddress;
    }

    /**
     *
     * @return
     * The yarnNodemanagerAdminEnv
     */
    public String getYarnNodemanagerAdminEnv() {
        return yarnNodemanagerAdminEnv;
    }

    /**
     *
     * @param yarnNodemanagerAdminEnv
     * The yarn.nodemanager.admin-env
     */
    public void setYarnNodemanagerAdminEnv(String yarnNodemanagerAdminEnv) {
        this.yarnNodemanagerAdminEnv = yarnNodemanagerAdminEnv;
    }

    /**
     *
     * @return
     * The yarnNodemanagerAuxServices
     */
    public String getYarnNodemanagerAuxServices() {
        return yarnNodemanagerAuxServices;
    }

    /**
     *
     * @param yarnNodemanagerAuxServices
     * The yarn.nodemanager.aux-services
     */
    public void setYarnNodemanagerAuxServices(String yarnNodemanagerAuxServices) {
        this.yarnNodemanagerAuxServices = yarnNodemanagerAuxServices;
    }

    /**
     *
     * @return
     * The yarnNodemanagerAuxServicesMapreduceShuffleClass
     */
    public String getYarnNodemanagerAuxServicesMapreduceShuffleClass() {
        return yarnNodemanagerAuxServicesMapreduceShuffleClass;
    }

    /**
     *
     * @param yarnNodemanagerAuxServicesMapreduceShuffleClass
     * The yarn.nodemanager.aux-services.mapreduce_shuffle.class
     */
    public void setYarnNodemanagerAuxServicesMapreduceShuffleClass(String yarnNodemanagerAuxServicesMapreduceShuffleClass) {
        this.yarnNodemanagerAuxServicesMapreduceShuffleClass = yarnNodemanagerAuxServicesMapreduceShuffleClass;
    }

    /**
     *
     * @return
     * The yarnNodemanagerBindHost
     */
    public String getYarnNodemanagerBindHost() {
        return yarnNodemanagerBindHost;
    }

    /**
     *
     * @param yarnNodemanagerBindHost
     * The yarn.nodemanager.bind-host
     */
    public void setYarnNodemanagerBindHost(String yarnNodemanagerBindHost) {
        this.yarnNodemanagerBindHost = yarnNodemanagerBindHost;
    }

    /**
     *
     * @return
     * The yarnNodemanagerContainerExecutorClass
     */
    public String getYarnNodemanagerContainerExecutorClass() {
        return yarnNodemanagerContainerExecutorClass;
    }

    /**
     *
     * @param yarnNodemanagerContainerExecutorClass
     * The yarn.nodemanager.container-executor.class
     */
    public void setYarnNodemanagerContainerExecutorClass(String yarnNodemanagerContainerExecutorClass) {
        this.yarnNodemanagerContainerExecutorClass = yarnNodemanagerContainerExecutorClass;
    }

    /**
     *
     * @return
     * The yarnNodemanagerContainerMonitorIntervalMs
     */
    public String getYarnNodemanagerContainerMonitorIntervalMs() {
        return yarnNodemanagerContainerMonitorIntervalMs;
    }

    /**
     *
     * @param yarnNodemanagerContainerMonitorIntervalMs
     * The yarn.nodemanager.container-monitor.interval-ms
     */
    public void setYarnNodemanagerContainerMonitorIntervalMs(String yarnNodemanagerContainerMonitorIntervalMs) {
        this.yarnNodemanagerContainerMonitorIntervalMs = yarnNodemanagerContainerMonitorIntervalMs;
    }

    /**
     *
     * @return
     * The yarnNodemanagerDeleteDebugDelaySec
     */
    public String getYarnNodemanagerDeleteDebugDelaySec() {
        return yarnNodemanagerDeleteDebugDelaySec;
    }

    /**
     *
     * @param yarnNodemanagerDeleteDebugDelaySec
     * The yarn.nodemanager.delete.debug-delay-sec
     */
    public void setYarnNodemanagerDeleteDebugDelaySec(String yarnNodemanagerDeleteDebugDelaySec) {
        this.yarnNodemanagerDeleteDebugDelaySec = yarnNodemanagerDeleteDebugDelaySec;
    }

    /**
     *
     * @return
     * The yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage
     */
    public String getYarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage() {
        return yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage;
    }

    /**
     *
     * @param yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage
     * The yarn.nodemanager.disk-health-checker.max-disk-utilization-per-disk-percentage
     */
    public void setYarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage(String yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage) {
        this.yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage = yarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage;
    }

    /**
     *
     * @return
     * The yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb
     */
    public String getYarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb() {
        return yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb;
    }

    /**
     *
     * @param yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb
     * The yarn.nodemanager.disk-health-checker.min-free-space-per-disk-mb
     */
    public void setYarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb(String yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb) {
        this.yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb = yarnNodemanagerDiskHealthCheckerMinFreeSpacePerDiskMb;
    }

    /**
     *
     * @return
     * The yarnNodemanagerDiskHealthCheckerMinHealthyDisks
     */
    public String getYarnNodemanagerDiskHealthCheckerMinHealthyDisks() {
        return yarnNodemanagerDiskHealthCheckerMinHealthyDisks;
    }

    /**
     *
     * @param yarnNodemanagerDiskHealthCheckerMinHealthyDisks
     * The yarn.nodemanager.disk-health-checker.min-healthy-disks
     */
    public void setYarnNodemanagerDiskHealthCheckerMinHealthyDisks(String yarnNodemanagerDiskHealthCheckerMinHealthyDisks) {
        this.yarnNodemanagerDiskHealthCheckerMinHealthyDisks = yarnNodemanagerDiskHealthCheckerMinHealthyDisks;
    }

    /**
     *
     * @return
     * The yarnNodemanagerHealthCheckerIntervalMs
     */
    public String getYarnNodemanagerHealthCheckerIntervalMs() {
        return yarnNodemanagerHealthCheckerIntervalMs;
    }

    /**
     *
     * @param yarnNodemanagerHealthCheckerIntervalMs
     * The yarn.nodemanager.health-checker.interval-ms
     */
    public void setYarnNodemanagerHealthCheckerIntervalMs(String yarnNodemanagerHealthCheckerIntervalMs) {
        this.yarnNodemanagerHealthCheckerIntervalMs = yarnNodemanagerHealthCheckerIntervalMs;
    }

    /**
     *
     * @return
     * The yarnNodemanagerHealthCheckerScriptTimeoutMs
     */
    public String getYarnNodemanagerHealthCheckerScriptTimeoutMs() {
        return yarnNodemanagerHealthCheckerScriptTimeoutMs;
    }

    /**
     *
     * @param yarnNodemanagerHealthCheckerScriptTimeoutMs
     * The yarn.nodemanager.health-checker.script.timeout-ms
     */
    public void setYarnNodemanagerHealthCheckerScriptTimeoutMs(String yarnNodemanagerHealthCheckerScriptTimeoutMs) {
        this.yarnNodemanagerHealthCheckerScriptTimeoutMs = yarnNodemanagerHealthCheckerScriptTimeoutMs;
    }

    /**
     *
     * @return
     * The yarnNodemanagerLinuxContainerExecutorCgroupsHierarchy
     */
    public String getYarnNodemanagerLinuxContainerExecutorCgroupsHierarchy() {
        return yarnNodemanagerLinuxContainerExecutorCgroupsHierarchy;
    }

    /**
     *
     * @param yarnNodemanagerLinuxContainerExecutorCgroupsHierarchy
     * The yarn.nodemanager.linux-container-executor.cgroups.hierarchy
     */
    public void setYarnNodemanagerLinuxContainerExecutorCgroupsHierarchy(String yarnNodemanagerLinuxContainerExecutorCgroupsHierarchy) {
        this.yarnNodemanagerLinuxContainerExecutorCgroupsHierarchy = yarnNodemanagerLinuxContainerExecutorCgroupsHierarchy;
    }

    /**
     *
     * @return
     * The yarnNodemanagerLinuxContainerExecutorCgroupsMount
     */
    public String getYarnNodemanagerLinuxContainerExecutorCgroupsMount() {
        return yarnNodemanagerLinuxContainerExecutorCgroupsMount;
    }

    /**
     *
     * @param yarnNodemanagerLinuxContainerExecutorCgroupsMount
     * The yarn.nodemanager.linux-container-executor.cgroups.mount
     */
    public void setYarnNodemanagerLinuxContainerExecutorCgroupsMount(String yarnNodemanagerLinuxContainerExecutorCgroupsMount) {
        this.yarnNodemanagerLinuxContainerExecutorCgroupsMount = yarnNodemanagerLinuxContainerExecutorCgroupsMount;
    }

    /**
     *
     * @return
     * The yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage
     */
    public String getYarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage() {
        return yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage;
    }

    /**
     *
     * @param yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage
     * The yarn.nodemanager.linux-container-executor.cgroups.strict-resource-usage
     */
    public void setYarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage(String yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage) {
        this.yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage = yarnNodemanagerLinuxContainerExecutorCgroupsStrictResourceUsage;
    }

    /**
     *
     * @return
     * The yarnNodemanagerLinuxContainerExecutorGroup
     */
    public String getYarnNodemanagerLinuxContainerExecutorGroup() {
        return yarnNodemanagerLinuxContainerExecutorGroup;
    }

    /**
     *
     * @param yarnNodemanagerLinuxContainerExecutorGroup
     * The yarn.nodemanager.linux-container-executor.group
     */
    public void setYarnNodemanagerLinuxContainerExecutorGroup(String yarnNodemanagerLinuxContainerExecutorGroup) {
        this.yarnNodemanagerLinuxContainerExecutorGroup = yarnNodemanagerLinuxContainerExecutorGroup;
    }

    /**
     *
     * @return
     * The yarnNodemanagerLinuxContainerExecutorResourcesHandlerClass
     */
    public String getYarnNodemanagerLinuxContainerExecutorResourcesHandlerClass() {
        return yarnNodemanagerLinuxContainerExecutorResourcesHandlerClass;
    }

    /**
     *
     * @param yarnNodemanagerLinuxContainerExecutorResourcesHandlerClass
     * The yarn.nodemanager.linux-container-executor.resources-handler.class
     */
    public void setYarnNodemanagerLinuxContainerExecutorResourcesHandlerClass(String yarnNodemanagerLinuxContainerExecutorResourcesHandlerClass) {
        this.yarnNodemanagerLinuxContainerExecutorResourcesHandlerClass = yarnNodemanagerLinuxContainerExecutorResourcesHandlerClass;
    }

    /**
     *
     * @return
     * The yarnNodemanagerLocalDirs
     */
    public String getYarnNodemanagerLocalDirs() {
        return yarnNodemanagerLocalDirs;
    }

    /**
     *
     * @param yarnNodemanagerLocalDirs
     * The yarn.nodemanager.local-dirs
     */
    public void setYarnNodemanagerLocalDirs(String yarnNodemanagerLocalDirs) {
        this.yarnNodemanagerLocalDirs = yarnNodemanagerLocalDirs;
    }

    /**
     *
     * @return
     * The yarnNodemanagerLogAggregationCompressionType
     */
    public String getYarnNodemanagerLogAggregationCompressionType() {
        return yarnNodemanagerLogAggregationCompressionType;
    }

    /**
     *
     * @param yarnNodemanagerLogAggregationCompressionType
     * The yarn.nodemanager.log-aggregation.compression-type
     */
    public void setYarnNodemanagerLogAggregationCompressionType(String yarnNodemanagerLogAggregationCompressionType) {
        this.yarnNodemanagerLogAggregationCompressionType = yarnNodemanagerLogAggregationCompressionType;
    }

    /**
     *
     * @return
     * The yarnNodemanagerLogAggregationDebugEnabled
     */
    public String getYarnNodemanagerLogAggregationDebugEnabled() {
        return yarnNodemanagerLogAggregationDebugEnabled;
    }

    /**
     *
     * @param yarnNodemanagerLogAggregationDebugEnabled
     * The yarn.nodemanager.log-aggregation.debug-enabled
     */
    public void setYarnNodemanagerLogAggregationDebugEnabled(String yarnNodemanagerLogAggregationDebugEnabled) {
        this.yarnNodemanagerLogAggregationDebugEnabled = yarnNodemanagerLogAggregationDebugEnabled;
    }

    /**
     *
     * @return
     * The yarnNodemanagerLogAggregationNumLogFilesPerApp
     */
    public String getYarnNodemanagerLogAggregationNumLogFilesPerApp() {
        return yarnNodemanagerLogAggregationNumLogFilesPerApp;
    }

    /**
     *
     * @param yarnNodemanagerLogAggregationNumLogFilesPerApp
     * The yarn.nodemanager.log-aggregation.num-log-files-per-app
     */
    public void setYarnNodemanagerLogAggregationNumLogFilesPerApp(String yarnNodemanagerLogAggregationNumLogFilesPerApp) {
        this.yarnNodemanagerLogAggregationNumLogFilesPerApp = yarnNodemanagerLogAggregationNumLogFilesPerApp;
    }

    /**
     *
     * @return
     * The yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds
     */
    public String getYarnNodemanagerLogAggregationRollMonitoringIntervalSeconds() {
        return yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds;
    }

    /**
     *
     * @param yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds
     * The yarn.nodemanager.log-aggregation.roll-monitoring-interval-seconds
     */
    public void setYarnNodemanagerLogAggregationRollMonitoringIntervalSeconds(String yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds) {
        this.yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds = yarnNodemanagerLogAggregationRollMonitoringIntervalSeconds;
    }

    /**
     *
     * @return
     * The yarnNodemanagerLogDirs
     */
    public String getYarnNodemanagerLogDirs() {
        return yarnNodemanagerLogDirs;
    }

    /**
     *
     * @param yarnNodemanagerLogDirs
     * The yarn.nodemanager.log-dirs
     */
    public void setYarnNodemanagerLogDirs(String yarnNodemanagerLogDirs) {
        this.yarnNodemanagerLogDirs = yarnNodemanagerLogDirs;
    }

    /**
     *
     * @return
     * The yarnNodemanagerLogRetainSecond
     */
    public String getYarnNodemanagerLogRetainSecond() {
        return yarnNodemanagerLogRetainSecond;
    }

    /**
     *
     * @param yarnNodemanagerLogRetainSecond
     * The yarn.nodemanager.log.retain-second
     */
    public void setYarnNodemanagerLogRetainSecond(String yarnNodemanagerLogRetainSecond) {
        this.yarnNodemanagerLogRetainSecond = yarnNodemanagerLogRetainSecond;
    }

    /**
     *
     * @return
     * The yarnNodemanagerRecoveryDir
     */
    public String getYarnNodemanagerRecoveryDir() {
        return yarnNodemanagerRecoveryDir;
    }

    /**
     *
     * @param yarnNodemanagerRecoveryDir
     * The yarn.nodemanager.recovery.dir
     */
    public void setYarnNodemanagerRecoveryDir(String yarnNodemanagerRecoveryDir) {
        this.yarnNodemanagerRecoveryDir = yarnNodemanagerRecoveryDir;
    }

    /**
     *
     * @return
     * The yarnNodemanagerRecoveryEnabled
     */
    public String getYarnNodemanagerRecoveryEnabled() {
        return yarnNodemanagerRecoveryEnabled;
    }

    /**
     *
     * @param yarnNodemanagerRecoveryEnabled
     * The yarn.nodemanager.recovery.enabled
     */
    public void setYarnNodemanagerRecoveryEnabled(String yarnNodemanagerRecoveryEnabled) {
        this.yarnNodemanagerRecoveryEnabled = yarnNodemanagerRecoveryEnabled;
    }

    /**
     *
     * @return
     * The yarnNodemanagerRemoteAppLogDir
     */
    public String getYarnNodemanagerRemoteAppLogDir() {
        return yarnNodemanagerRemoteAppLogDir;
    }

    /**
     *
     * @param yarnNodemanagerRemoteAppLogDir
     * The yarn.nodemanager.remote-app-log-dir
     */
    public void setYarnNodemanagerRemoteAppLogDir(String yarnNodemanagerRemoteAppLogDir) {
        this.yarnNodemanagerRemoteAppLogDir = yarnNodemanagerRemoteAppLogDir;
    }

    /**
     *
     * @return
     * The yarnNodemanagerRemoteAppLogDirSuffix
     */
    public String getYarnNodemanagerRemoteAppLogDirSuffix() {
        return yarnNodemanagerRemoteAppLogDirSuffix;
    }

    /**
     *
     * @param yarnNodemanagerRemoteAppLogDirSuffix
     * The yarn.nodemanager.remote-app-log-dir-suffix
     */
    public void setYarnNodemanagerRemoteAppLogDirSuffix(String yarnNodemanagerRemoteAppLogDirSuffix) {
        this.yarnNodemanagerRemoteAppLogDirSuffix = yarnNodemanagerRemoteAppLogDirSuffix;
    }

    /**
     *
     * @return
     * The yarnNodemanagerResourceCpuVcores
     */
    public String getYarnNodemanagerResourceCpuVcores() {
        return yarnNodemanagerResourceCpuVcores;
    }

    /**
     *
     * @param yarnNodemanagerResourceCpuVcores
     * The yarn.nodemanager.resource.cpu-vcores
     */
    public void setYarnNodemanagerResourceCpuVcores(String yarnNodemanagerResourceCpuVcores) {
        this.yarnNodemanagerResourceCpuVcores = yarnNodemanagerResourceCpuVcores;
    }

    /**
     *
     * @return
     * The yarnNodemanagerResourceMemoryMb
     */
    public String getYarnNodemanagerResourceMemoryMb() {
        return yarnNodemanagerResourceMemoryMb;
    }

    /**
     *
     * @param yarnNodemanagerResourceMemoryMb
     * The yarn.nodemanager.resource.memory-mb
     */
    public void setYarnNodemanagerResourceMemoryMb(String yarnNodemanagerResourceMemoryMb) {
        this.yarnNodemanagerResourceMemoryMb = yarnNodemanagerResourceMemoryMb;
    }

    /**
     *
     * @return
     * The yarnNodemanagerResourcePercentagePhysicalCpuLimit
     */
    public String getYarnNodemanagerResourcePercentagePhysicalCpuLimit() {
        return yarnNodemanagerResourcePercentagePhysicalCpuLimit;
    }

    /**
     *
     * @param yarnNodemanagerResourcePercentagePhysicalCpuLimit
     * The yarn.nodemanager.resource.percentage-physical-cpu-limit
     */
    public void setYarnNodemanagerResourcePercentagePhysicalCpuLimit(String yarnNodemanagerResourcePercentagePhysicalCpuLimit) {
        this.yarnNodemanagerResourcePercentagePhysicalCpuLimit = yarnNodemanagerResourcePercentagePhysicalCpuLimit;
    }

    /**
     *
     * @return
     * The yarnNodemanagerVmemCheckEnabled
     */
    public String getYarnNodemanagerVmemCheckEnabled() {
        return yarnNodemanagerVmemCheckEnabled;
    }

    /**
     *
     * @param yarnNodemanagerVmemCheckEnabled
     * The yarn.nodemanager.vmem-check-enabled
     */
    public void setYarnNodemanagerVmemCheckEnabled(String yarnNodemanagerVmemCheckEnabled) {
        this.yarnNodemanagerVmemCheckEnabled = yarnNodemanagerVmemCheckEnabled;
    }

    /**
     *
     * @return
     * The yarnNodemanagerVmemPmemRatio
     */
    public String getYarnNodemanagerVmemPmemRatio() {
        return yarnNodemanagerVmemPmemRatio;
    }

    /**
     *
     * @param yarnNodemanagerVmemPmemRatio
     * The yarn.nodemanager.vmem-pmem-ratio
     */
    public void setYarnNodemanagerVmemPmemRatio(String yarnNodemanagerVmemPmemRatio) {
        this.yarnNodemanagerVmemPmemRatio = yarnNodemanagerVmemPmemRatio;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerAddress
     */
    public String getYarnResourcemanagerAddress() {
        return yarnResourcemanagerAddress;
    }

    /**
     *
     * @param yarnResourcemanagerAddress
     * The yarn.resourcemanager.address
     */
    public void setYarnResourcemanagerAddress(String yarnResourcemanagerAddress) {
        this.yarnResourcemanagerAddress = yarnResourcemanagerAddress;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerAdminAddress
     */
    public String getYarnResourcemanagerAdminAddress() {
        return yarnResourcemanagerAdminAddress;
    }

    /**
     *
     * @param yarnResourcemanagerAdminAddress
     * The yarn.resourcemanager.admin.address
     */
    public void setYarnResourcemanagerAdminAddress(String yarnResourcemanagerAdminAddress) {
        this.yarnResourcemanagerAdminAddress = yarnResourcemanagerAdminAddress;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerAmMaxAttempts
     */
    public String getYarnResourcemanagerAmMaxAttempts() {
        return yarnResourcemanagerAmMaxAttempts;
    }

    /**
     *
     * @param yarnResourcemanagerAmMaxAttempts
     * The yarn.resourcemanager.am.max-attempts
     */
    public void setYarnResourcemanagerAmMaxAttempts(String yarnResourcemanagerAmMaxAttempts) {
        this.yarnResourcemanagerAmMaxAttempts = yarnResourcemanagerAmMaxAttempts;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerBindHost
     */
    public String getYarnResourcemanagerBindHost() {
        return yarnResourcemanagerBindHost;
    }

    /**
     *
     * @param yarnResourcemanagerBindHost
     * The yarn.resourcemanager.bind-host
     */
    public void setYarnResourcemanagerBindHost(String yarnResourcemanagerBindHost) {
        this.yarnResourcemanagerBindHost = yarnResourcemanagerBindHost;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerConnectMaxWaitMs
     */
    public String getYarnResourcemanagerConnectMaxWaitMs() {
        return yarnResourcemanagerConnectMaxWaitMs;
    }

    /**
     *
     * @param yarnResourcemanagerConnectMaxWaitMs
     * The yarn.resourcemanager.connect.max-wait.ms
     */
    public void setYarnResourcemanagerConnectMaxWaitMs(String yarnResourcemanagerConnectMaxWaitMs) {
        this.yarnResourcemanagerConnectMaxWaitMs = yarnResourcemanagerConnectMaxWaitMs;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerConnectRetryIntervalMs
     */
    public String getYarnResourcemanagerConnectRetryIntervalMs() {
        return yarnResourcemanagerConnectRetryIntervalMs;
    }

    /**
     *
     * @param yarnResourcemanagerConnectRetryIntervalMs
     * The yarn.resourcemanager.connect.retry-interval.ms
     */
    public void setYarnResourcemanagerConnectRetryIntervalMs(String yarnResourcemanagerConnectRetryIntervalMs) {
        this.yarnResourcemanagerConnectRetryIntervalMs = yarnResourcemanagerConnectRetryIntervalMs;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerFsStateStoreRetryPolicySpec
     */
    public String getYarnResourcemanagerFsStateStoreRetryPolicySpec() {
        return yarnResourcemanagerFsStateStoreRetryPolicySpec;
    }

    /**
     *
     * @param yarnResourcemanagerFsStateStoreRetryPolicySpec
     * The yarn.resourcemanager.fs.state-store.retry-policy-spec
     */
    public void setYarnResourcemanagerFsStateStoreRetryPolicySpec(String yarnResourcemanagerFsStateStoreRetryPolicySpec) {
        this.yarnResourcemanagerFsStateStoreRetryPolicySpec = yarnResourcemanagerFsStateStoreRetryPolicySpec;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerFsStateStoreUri
     */
    public String getYarnResourcemanagerFsStateStoreUri() {
        return yarnResourcemanagerFsStateStoreUri;
    }

    /**
     *
     * @param yarnResourcemanagerFsStateStoreUri
     * The yarn.resourcemanager.fs.state-store.uri
     */
    public void setYarnResourcemanagerFsStateStoreUri(String yarnResourcemanagerFsStateStoreUri) {
        this.yarnResourcemanagerFsStateStoreUri = yarnResourcemanagerFsStateStoreUri;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerHaEnabled
     */
    public String getYarnResourcemanagerHaEnabled() {
        return yarnResourcemanagerHaEnabled;
    }

    /**
     *
     * @param yarnResourcemanagerHaEnabled
     * The yarn.resourcemanager.ha.enabled
     */
    public void setYarnResourcemanagerHaEnabled(String yarnResourcemanagerHaEnabled) {
        this.yarnResourcemanagerHaEnabled = yarnResourcemanagerHaEnabled;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerHostname
     */
    public String getYarnResourcemanagerHostname() {
        return yarnResourcemanagerHostname;
    }

    /**
     *
     * @param yarnResourcemanagerHostname
     * The yarn.resourcemanager.hostname
     */
    public void setYarnResourcemanagerHostname(String yarnResourcemanagerHostname) {
        this.yarnResourcemanagerHostname = yarnResourcemanagerHostname;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerNodesExcludePath
     */
    public String getYarnResourcemanagerNodesExcludePath() {
        return yarnResourcemanagerNodesExcludePath;
    }

    /**
     *
     * @param yarnResourcemanagerNodesExcludePath
     * The yarn.resourcemanager.nodes.exclude-path
     */
    public void setYarnResourcemanagerNodesExcludePath(String yarnResourcemanagerNodesExcludePath) {
        this.yarnResourcemanagerNodesExcludePath = yarnResourcemanagerNodesExcludePath;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerRecoveryEnabled
     */
    public String getYarnResourcemanagerRecoveryEnabled() {
        return yarnResourcemanagerRecoveryEnabled;
    }

    /**
     *
     * @param yarnResourcemanagerRecoveryEnabled
     * The yarn.resourcemanager.recovery.enabled
     */
    public void setYarnResourcemanagerRecoveryEnabled(String yarnResourcemanagerRecoveryEnabled) {
        this.yarnResourcemanagerRecoveryEnabled = yarnResourcemanagerRecoveryEnabled;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerResourceTrackerAddress
     */
    public String getYarnResourcemanagerResourceTrackerAddress() {
        return yarnResourcemanagerResourceTrackerAddress;
    }

    /**
     *
     * @param yarnResourcemanagerResourceTrackerAddress
     * The yarn.resourcemanager.resource-tracker.address
     */
    public void setYarnResourcemanagerResourceTrackerAddress(String yarnResourcemanagerResourceTrackerAddress) {
        this.yarnResourcemanagerResourceTrackerAddress = yarnResourcemanagerResourceTrackerAddress;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerSchedulerAddress
     */
    public String getYarnResourcemanagerSchedulerAddress() {
        return yarnResourcemanagerSchedulerAddress;
    }

    /**
     *
     * @param yarnResourcemanagerSchedulerAddress
     * The yarn.resourcemanager.scheduler.address
     */
    public void setYarnResourcemanagerSchedulerAddress(String yarnResourcemanagerSchedulerAddress) {
        this.yarnResourcemanagerSchedulerAddress = yarnResourcemanagerSchedulerAddress;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerSchedulerClass
     */
    public String getYarnResourcemanagerSchedulerClass() {
        return yarnResourcemanagerSchedulerClass;
    }

    /**
     *
     * @param yarnResourcemanagerSchedulerClass
     * The yarn.resourcemanager.scheduler.class
     */
    public void setYarnResourcemanagerSchedulerClass(String yarnResourcemanagerSchedulerClass) {
        this.yarnResourcemanagerSchedulerClass = yarnResourcemanagerSchedulerClass;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerSchedulerMonitorEnable
     */
    public String getYarnResourcemanagerSchedulerMonitorEnable() {
        return yarnResourcemanagerSchedulerMonitorEnable;
    }

    /**
     *
     * @param yarnResourcemanagerSchedulerMonitorEnable
     * The yarn.resourcemanager.scheduler.monitor.enable
     */
    public void setYarnResourcemanagerSchedulerMonitorEnable(String yarnResourcemanagerSchedulerMonitorEnable) {
        this.yarnResourcemanagerSchedulerMonitorEnable = yarnResourcemanagerSchedulerMonitorEnable;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerStateStoreMaxCompletedApplications
     */
    public String getYarnResourcemanagerStateStoreMaxCompletedApplications() {
        return yarnResourcemanagerStateStoreMaxCompletedApplications;
    }

    /**
     *
     * @param yarnResourcemanagerStateStoreMaxCompletedApplications
     * The yarn.resourcemanager.state-store.max-completed-applications
     */
    public void setYarnResourcemanagerStateStoreMaxCompletedApplications(String yarnResourcemanagerStateStoreMaxCompletedApplications) {
        this.yarnResourcemanagerStateStoreMaxCompletedApplications = yarnResourcemanagerStateStoreMaxCompletedApplications;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerStoreClass
     */
    public String getYarnResourcemanagerStoreClass() {
        return yarnResourcemanagerStoreClass;
    }

    /**
     *
     * @param yarnResourcemanagerStoreClass
     * The yarn.resourcemanager.store.class
     */
    public void setYarnResourcemanagerStoreClass(String yarnResourcemanagerStoreClass) {
        this.yarnResourcemanagerStoreClass = yarnResourcemanagerStoreClass;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize
     */
    public String getYarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize() {
        return yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize;
    }

    /**
     *
     * @param yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize
     * The yarn.resourcemanager.system-metrics-publisher.dispatcher.pool-size
     */
    public void setYarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize(String yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize) {
        this.yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize = yarnResourcemanagerSystemMetricsPublisherDispatcherPoolSize;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerSystemMetricsPublisherEnabled
     */
    public String getYarnResourcemanagerSystemMetricsPublisherEnabled() {
        return yarnResourcemanagerSystemMetricsPublisherEnabled;
    }

    /**
     *
     * @param yarnResourcemanagerSystemMetricsPublisherEnabled
     * The yarn.resourcemanager.system-metrics-publisher.enabled
     */
    public void setYarnResourcemanagerSystemMetricsPublisherEnabled(String yarnResourcemanagerSystemMetricsPublisherEnabled) {
        this.yarnResourcemanagerSystemMetricsPublisherEnabled = yarnResourcemanagerSystemMetricsPublisherEnabled;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerWebappAddress
     */
    public String getYarnResourcemanagerWebappAddress() {
        return yarnResourcemanagerWebappAddress;
    }

    /**
     *
     * @param yarnResourcemanagerWebappAddress
     * The yarn.resourcemanager.webapp.address
     */
    public void setYarnResourcemanagerWebappAddress(String yarnResourcemanagerWebappAddress) {
        this.yarnResourcemanagerWebappAddress = yarnResourcemanagerWebappAddress;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled
     */
    public String getYarnResourcemanagerWebappDelegationTokenAuthFilterEnabled() {
        return yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled;
    }

    /**
     *
     * @param yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled
     * The yarn.resourcemanager.webapp.delegation-token-auth-filter.enabled
     */
    public void setYarnResourcemanagerWebappDelegationTokenAuthFilterEnabled(String yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled) {
        this.yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled = yarnResourcemanagerWebappDelegationTokenAuthFilterEnabled;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerWebappHttpsAddress
     */
    public String getYarnResourcemanagerWebappHttpsAddress() {
        return yarnResourcemanagerWebappHttpsAddress;
    }

    /**
     *
     * @param yarnResourcemanagerWebappHttpsAddress
     * The yarn.resourcemanager.webapp.https.address
     */
    public void setYarnResourcemanagerWebappHttpsAddress(String yarnResourcemanagerWebappHttpsAddress) {
        this.yarnResourcemanagerWebappHttpsAddress = yarnResourcemanagerWebappHttpsAddress;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerWorkPreservingRecoveryEnabled
     */
    public String getYarnResourcemanagerWorkPreservingRecoveryEnabled() {
        return yarnResourcemanagerWorkPreservingRecoveryEnabled;
    }

    /**
     *
     * @param yarnResourcemanagerWorkPreservingRecoveryEnabled
     * The yarn.resourcemanager.work-preserving-recovery.enabled
     */
    public void setYarnResourcemanagerWorkPreservingRecoveryEnabled(String yarnResourcemanagerWorkPreservingRecoveryEnabled) {
        this.yarnResourcemanagerWorkPreservingRecoveryEnabled = yarnResourcemanagerWorkPreservingRecoveryEnabled;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs
     */
    public String getYarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs() {
        return yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs;
    }

    /**
     *
     * @param yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs
     * The yarn.resourcemanager.work-preserving-recovery.scheduling-wait-ms
     */
    public void setYarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs(String yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs) {
        this.yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs = yarnResourcemanagerWorkPreservingRecoverySchedulingWaitMs;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerZkAcl
     */
    public String getYarnResourcemanagerZkAcl() {
        return yarnResourcemanagerZkAcl;
    }

    /**
     *
     * @param yarnResourcemanagerZkAcl
     * The yarn.resourcemanager.zk-acl
     */
    public void setYarnResourcemanagerZkAcl(String yarnResourcemanagerZkAcl) {
        this.yarnResourcemanagerZkAcl = yarnResourcemanagerZkAcl;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerZkAddress
     */
    public String getYarnResourcemanagerZkAddress() {
        return yarnResourcemanagerZkAddress;
    }

    /**
     *
     * @param yarnResourcemanagerZkAddress
     * The yarn.resourcemanager.zk-address
     */
    public void setYarnResourcemanagerZkAddress(String yarnResourcemanagerZkAddress) {
        this.yarnResourcemanagerZkAddress = yarnResourcemanagerZkAddress;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerZkNumRetries
     */
    public String getYarnResourcemanagerZkNumRetries() {
        return yarnResourcemanagerZkNumRetries;
    }

    /**
     *
     * @param yarnResourcemanagerZkNumRetries
     * The yarn.resourcemanager.zk-num-retries
     */
    public void setYarnResourcemanagerZkNumRetries(String yarnResourcemanagerZkNumRetries) {
        this.yarnResourcemanagerZkNumRetries = yarnResourcemanagerZkNumRetries;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerZkRetryIntervalMs
     */
    public String getYarnResourcemanagerZkRetryIntervalMs() {
        return yarnResourcemanagerZkRetryIntervalMs;
    }

    /**
     *
     * @param yarnResourcemanagerZkRetryIntervalMs
     * The yarn.resourcemanager.zk-retry-interval-ms
     */
    public void setYarnResourcemanagerZkRetryIntervalMs(String yarnResourcemanagerZkRetryIntervalMs) {
        this.yarnResourcemanagerZkRetryIntervalMs = yarnResourcemanagerZkRetryIntervalMs;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerZkStateStoreParentPath
     */
    public String getYarnResourcemanagerZkStateStoreParentPath() {
        return yarnResourcemanagerZkStateStoreParentPath;
    }

    /**
     *
     * @param yarnResourcemanagerZkStateStoreParentPath
     * The yarn.resourcemanager.zk-state-store.parent-path
     */
    public void setYarnResourcemanagerZkStateStoreParentPath(String yarnResourcemanagerZkStateStoreParentPath) {
        this.yarnResourcemanagerZkStateStoreParentPath = yarnResourcemanagerZkStateStoreParentPath;
    }

    /**
     *
     * @return
     * The yarnResourcemanagerZkTimeoutMs
     */
    public String getYarnResourcemanagerZkTimeoutMs() {
        return yarnResourcemanagerZkTimeoutMs;
    }

    /**
     *
     * @param yarnResourcemanagerZkTimeoutMs
     * The yarn.resourcemanager.zk-timeout-ms
     */
    public void setYarnResourcemanagerZkTimeoutMs(String yarnResourcemanagerZkTimeoutMs) {
        this.yarnResourcemanagerZkTimeoutMs = yarnResourcemanagerZkTimeoutMs;
    }

    /**
     *
     * @return
     * The yarnSchedulerMaximumAllocationMb
     */
    public String getYarnSchedulerMaximumAllocationMb() {
        return yarnSchedulerMaximumAllocationMb;
    }

    /**
     *
     * @param yarnSchedulerMaximumAllocationMb
     * The yarn.scheduler.maximum-allocation-mb
     */
    public void setYarnSchedulerMaximumAllocationMb(String yarnSchedulerMaximumAllocationMb) {
        this.yarnSchedulerMaximumAllocationMb = yarnSchedulerMaximumAllocationMb;
    }

    /**
     *
     * @return
     * The yarnSchedulerMaximumAllocationVcores
     */
    public String getYarnSchedulerMaximumAllocationVcores() {
        return yarnSchedulerMaximumAllocationVcores;
    }

    /**
     *
     * @param yarnSchedulerMaximumAllocationVcores
     * The yarn.scheduler.maximum-allocation-vcores
     */
    public void setYarnSchedulerMaximumAllocationVcores(String yarnSchedulerMaximumAllocationVcores) {
        this.yarnSchedulerMaximumAllocationVcores = yarnSchedulerMaximumAllocationVcores;
    }

    /**
     *
     * @return
     * The yarnSchedulerMinimumAllocationMb
     */
    public String getYarnSchedulerMinimumAllocationMb() {
        return yarnSchedulerMinimumAllocationMb;
    }

    /**
     *
     * @param yarnSchedulerMinimumAllocationMb
     * The yarn.scheduler.minimum-allocation-mb
     */
    public void setYarnSchedulerMinimumAllocationMb(String yarnSchedulerMinimumAllocationMb) {
        this.yarnSchedulerMinimumAllocationMb = yarnSchedulerMinimumAllocationMb;
    }

    /**
     *
     * @return
     * The yarnSchedulerMinimumAllocationVcores
     */
    public String getYarnSchedulerMinimumAllocationVcores() {
        return yarnSchedulerMinimumAllocationVcores;
    }

    /**
     *
     * @param yarnSchedulerMinimumAllocationVcores
     * The yarn.scheduler.minimum-allocation-vcores
     */
    public void setYarnSchedulerMinimumAllocationVcores(String yarnSchedulerMinimumAllocationVcores) {
        this.yarnSchedulerMinimumAllocationVcores = yarnSchedulerMinimumAllocationVcores;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceAddress
     */
    public String getYarnTimelineServiceAddress() {
        return yarnTimelineServiceAddress;
    }

    /**
     *
     * @param yarnTimelineServiceAddress
     * The yarn.timeline-service.address
     */
    public void setYarnTimelineServiceAddress(String yarnTimelineServiceAddress) {
        this.yarnTimelineServiceAddress = yarnTimelineServiceAddress;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceBindHost
     */
    public String getYarnTimelineServiceBindHost() {
        return yarnTimelineServiceBindHost;
    }

    /**
     *
     * @param yarnTimelineServiceBindHost
     * The yarn.timeline-service.bind-host
     */
    public void setYarnTimelineServiceBindHost(String yarnTimelineServiceBindHost) {
        this.yarnTimelineServiceBindHost = yarnTimelineServiceBindHost;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceClientMaxRetries
     */
    public String getYarnTimelineServiceClientMaxRetries() {
        return yarnTimelineServiceClientMaxRetries;
    }

    /**
     *
     * @param yarnTimelineServiceClientMaxRetries
     * The yarn.timeline-service.client.max-retries
     */
    public void setYarnTimelineServiceClientMaxRetries(String yarnTimelineServiceClientMaxRetries) {
        this.yarnTimelineServiceClientMaxRetries = yarnTimelineServiceClientMaxRetries;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceClientRetryIntervalMs
     */
    public String getYarnTimelineServiceClientRetryIntervalMs() {
        return yarnTimelineServiceClientRetryIntervalMs;
    }

    /**
     *
     * @param yarnTimelineServiceClientRetryIntervalMs
     * The yarn.timeline-service.client.retry-interval-ms
     */
    public void setYarnTimelineServiceClientRetryIntervalMs(String yarnTimelineServiceClientRetryIntervalMs) {
        this.yarnTimelineServiceClientRetryIntervalMs = yarnTimelineServiceClientRetryIntervalMs;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceEnabled
     */
    public String getYarnTimelineServiceEnabled() {
        return yarnTimelineServiceEnabled;
    }

    /**
     *
     * @param yarnTimelineServiceEnabled
     * The yarn.timeline-service.enabled
     */
    public void setYarnTimelineServiceEnabled(String yarnTimelineServiceEnabled) {
        this.yarnTimelineServiceEnabled = yarnTimelineServiceEnabled;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceEntityGroupFsStoreActiveDir
     */
    public String getYarnTimelineServiceEntityGroupFsStoreActiveDir() {
        return yarnTimelineServiceEntityGroupFsStoreActiveDir;
    }

    /**
     *
     * @param yarnTimelineServiceEntityGroupFsStoreActiveDir
     * The yarn.timeline-service.entity-group-fs-store.active-dir
     */
    public void setYarnTimelineServiceEntityGroupFsStoreActiveDir(String yarnTimelineServiceEntityGroupFsStoreActiveDir) {
        this.yarnTimelineServiceEntityGroupFsStoreActiveDir = yarnTimelineServiceEntityGroupFsStoreActiveDir;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds
     */
    public String getYarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds() {
        return yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds;
    }

    /**
     *
     * @param yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds
     * The yarn.timeline-service.entity-group-fs-store.cleaner-interval-seconds
     */
    public void setYarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds(String yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds) {
        this.yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds = yarnTimelineServiceEntityGroupFsStoreCleanerIntervalSeconds;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceEntityGroupFsStoreDoneDir
     */
    public String getYarnTimelineServiceEntityGroupFsStoreDoneDir() {
        return yarnTimelineServiceEntityGroupFsStoreDoneDir;
    }

    /**
     *
     * @param yarnTimelineServiceEntityGroupFsStoreDoneDir
     * The yarn.timeline-service.entity-group-fs-store.done-dir
     */
    public void setYarnTimelineServiceEntityGroupFsStoreDoneDir(String yarnTimelineServiceEntityGroupFsStoreDoneDir) {
        this.yarnTimelineServiceEntityGroupFsStoreDoneDir = yarnTimelineServiceEntityGroupFsStoreDoneDir;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses
     */
    public String getYarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses() {
        return yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses;
    }

    /**
     *
     * @param yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses
     * The yarn.timeline-service.entity-group-fs-store.group-id-plugin-classes
     */
    public void setYarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses(String yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses) {
        this.yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses = yarnTimelineServiceEntityGroupFsStoreGroupIdPluginClasses;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceEntityGroupFsStoreRetainSeconds
     */
    public String getYarnTimelineServiceEntityGroupFsStoreRetainSeconds() {
        return yarnTimelineServiceEntityGroupFsStoreRetainSeconds;
    }

    /**
     *
     * @param yarnTimelineServiceEntityGroupFsStoreRetainSeconds
     * The yarn.timeline-service.entity-group-fs-store.retain-seconds
     */
    public void setYarnTimelineServiceEntityGroupFsStoreRetainSeconds(String yarnTimelineServiceEntityGroupFsStoreRetainSeconds) {
        this.yarnTimelineServiceEntityGroupFsStoreRetainSeconds = yarnTimelineServiceEntityGroupFsStoreRetainSeconds;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds
     */
    public String getYarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds() {
        return yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds;
    }

    /**
     *
     * @param yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds
     * The yarn.timeline-service.entity-group-fs-store.scan-interval-seconds
     */
    public void setYarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds(String yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds) {
        this.yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds = yarnTimelineServiceEntityGroupFsStoreScanIntervalSeconds;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceEntityGroupFsStoreSummaryStore
     */
    public String getYarnTimelineServiceEntityGroupFsStoreSummaryStore() {
        return yarnTimelineServiceEntityGroupFsStoreSummaryStore;
    }

    /**
     *
     * @param yarnTimelineServiceEntityGroupFsStoreSummaryStore
     * The yarn.timeline-service.entity-group-fs-store.summary-store
     */
    public void setYarnTimelineServiceEntityGroupFsStoreSummaryStore(String yarnTimelineServiceEntityGroupFsStoreSummaryStore) {
        this.yarnTimelineServiceEntityGroupFsStoreSummaryStore = yarnTimelineServiceEntityGroupFsStoreSummaryStore;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceGenericApplicationHistoryStoreClass
     */
    public String getYarnTimelineServiceGenericApplicationHistoryStoreClass() {
        return yarnTimelineServiceGenericApplicationHistoryStoreClass;
    }

    /**
     *
     * @param yarnTimelineServiceGenericApplicationHistoryStoreClass
     * The yarn.timeline-service.generic-application-history.store-class
     */
    public void setYarnTimelineServiceGenericApplicationHistoryStoreClass(String yarnTimelineServiceGenericApplicationHistoryStoreClass) {
        this.yarnTimelineServiceGenericApplicationHistoryStoreClass = yarnTimelineServiceGenericApplicationHistoryStoreClass;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed
     */
    public String getYarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed() {
        return yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed;
    }

    /**
     *
     * @param yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed
     * The yarn.timeline-service.http-authentication.simple.anonymous.allowed
     */
    public void setYarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed(String yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed) {
        this.yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed = yarnTimelineServiceHttpAuthenticationSimpleAnonymousAllowed;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceHttpAuthenticationType
     */
    public String getYarnTimelineServiceHttpAuthenticationType() {
        return yarnTimelineServiceHttpAuthenticationType;
    }

    /**
     *
     * @param yarnTimelineServiceHttpAuthenticationType
     * The yarn.timeline-service.http-authentication.type
     */
    public void setYarnTimelineServiceHttpAuthenticationType(String yarnTimelineServiceHttpAuthenticationType) {
        this.yarnTimelineServiceHttpAuthenticationType = yarnTimelineServiceHttpAuthenticationType;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceLeveldbStateStorePath
     */
    public String getYarnTimelineServiceLeveldbStateStorePath() {
        return yarnTimelineServiceLeveldbStateStorePath;
    }

    /**
     *
     * @param yarnTimelineServiceLeveldbStateStorePath
     * The yarn.timeline-service.leveldb-state-store.path
     */
    public void setYarnTimelineServiceLeveldbStateStorePath(String yarnTimelineServiceLeveldbStateStorePath) {
        this.yarnTimelineServiceLeveldbStateStorePath = yarnTimelineServiceLeveldbStateStorePath;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceLeveldbTimelineStorePath
     */
    public String getYarnTimelineServiceLeveldbTimelineStorePath() {
        return yarnTimelineServiceLeveldbTimelineStorePath;
    }

    /**
     *
     * @param yarnTimelineServiceLeveldbTimelineStorePath
     * The yarn.timeline-service.leveldb-timeline-store.path
     */
    public void setYarnTimelineServiceLeveldbTimelineStorePath(String yarnTimelineServiceLeveldbTimelineStorePath) {
        this.yarnTimelineServiceLeveldbTimelineStorePath = yarnTimelineServiceLeveldbTimelineStorePath;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceLeveldbTimelineStoreReadCacheSize
     */
    public String getYarnTimelineServiceLeveldbTimelineStoreReadCacheSize() {
        return yarnTimelineServiceLeveldbTimelineStoreReadCacheSize;
    }

    /**
     *
     * @param yarnTimelineServiceLeveldbTimelineStoreReadCacheSize
     * The yarn.timeline-service.leveldb-timeline-store.read-cache-size
     */
    public void setYarnTimelineServiceLeveldbTimelineStoreReadCacheSize(String yarnTimelineServiceLeveldbTimelineStoreReadCacheSize) {
        this.yarnTimelineServiceLeveldbTimelineStoreReadCacheSize = yarnTimelineServiceLeveldbTimelineStoreReadCacheSize;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize
     */
    public String getYarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize() {
        return yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize;
    }

    /**
     *
     * @param yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize
     * The yarn.timeline-service.leveldb-timeline-store.start-time-read-cache-size
     */
    public void setYarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize(String yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize) {
        this.yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize = yarnTimelineServiceLeveldbTimelineStoreStartTimeReadCacheSize;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize
     */
    public String getYarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize() {
        return yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize;
    }

    /**
     *
     * @param yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize
     * The yarn.timeline-service.leveldb-timeline-store.start-time-write-cache-size
     */
    public void setYarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize(String yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize) {
        this.yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize = yarnTimelineServiceLeveldbTimelineStoreStartTimeWriteCacheSize;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs
     */
    public String getYarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs() {
        return yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs;
    }

    /**
     *
     * @param yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs
     * The yarn.timeline-service.leveldb-timeline-store.ttl-interval-ms
     */
    public void setYarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs(String yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs) {
        this.yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs = yarnTimelineServiceLeveldbTimelineStoreTtlIntervalMs;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceRecoveryEnabled
     */
    public String getYarnTimelineServiceRecoveryEnabled() {
        return yarnTimelineServiceRecoveryEnabled;
    }

    /**
     *
     * @param yarnTimelineServiceRecoveryEnabled
     * The yarn.timeline-service.recovery.enabled
     */
    public void setYarnTimelineServiceRecoveryEnabled(String yarnTimelineServiceRecoveryEnabled) {
        this.yarnTimelineServiceRecoveryEnabled = yarnTimelineServiceRecoveryEnabled;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceStateStoreClass
     */
    public String getYarnTimelineServiceStateStoreClass() {
        return yarnTimelineServiceStateStoreClass;
    }

    /**
     *
     * @param yarnTimelineServiceStateStoreClass
     * The yarn.timeline-service.state-store-class
     */
    public void setYarnTimelineServiceStateStoreClass(String yarnTimelineServiceStateStoreClass) {
        this.yarnTimelineServiceStateStoreClass = yarnTimelineServiceStateStoreClass;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceStoreClass
     */
    public String getYarnTimelineServiceStoreClass() {
        return yarnTimelineServiceStoreClass;
    }

    /**
     *
     * @param yarnTimelineServiceStoreClass
     * The yarn.timeline-service.store-class
     */
    public void setYarnTimelineServiceStoreClass(String yarnTimelineServiceStoreClass) {
        this.yarnTimelineServiceStoreClass = yarnTimelineServiceStoreClass;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceTtlEnable
     */
    public String getYarnTimelineServiceTtlEnable() {
        return yarnTimelineServiceTtlEnable;
    }

    /**
     *
     * @param yarnTimelineServiceTtlEnable
     * The yarn.timeline-service.ttl-enable
     */
    public void setYarnTimelineServiceTtlEnable(String yarnTimelineServiceTtlEnable) {
        this.yarnTimelineServiceTtlEnable = yarnTimelineServiceTtlEnable;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceTtlMs
     */
    public String getYarnTimelineServiceTtlMs() {
        return yarnTimelineServiceTtlMs;
    }

    /**
     *
     * @param yarnTimelineServiceTtlMs
     * The yarn.timeline-service.ttl-ms
     */
    public void setYarnTimelineServiceTtlMs(String yarnTimelineServiceTtlMs) {
        this.yarnTimelineServiceTtlMs = yarnTimelineServiceTtlMs;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceVersion
     */
    public String getYarnTimelineServiceVersion() {
        return yarnTimelineServiceVersion;
    }

    /**
     *
     * @param yarnTimelineServiceVersion
     * The yarn.timeline-service.version
     */
    public void setYarnTimelineServiceVersion(String yarnTimelineServiceVersion) {
        this.yarnTimelineServiceVersion = yarnTimelineServiceVersion;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceWebappAddress
     */
    public String getYarnTimelineServiceWebappAddress() {
        return yarnTimelineServiceWebappAddress;
    }

    /**
     *
     * @param yarnTimelineServiceWebappAddress
     * The yarn.timeline-service.webapp.address
     */
    public void setYarnTimelineServiceWebappAddress(String yarnTimelineServiceWebappAddress) {
        this.yarnTimelineServiceWebappAddress = yarnTimelineServiceWebappAddress;
    }

    /**
     *
     * @return
     * The yarnTimelineServiceWebappHttpsAddress
     */
    public String getYarnTimelineServiceWebappHttpsAddress() {
        return yarnTimelineServiceWebappHttpsAddress;
    }

    /**
     *
     * @param yarnTimelineServiceWebappHttpsAddress
     * The yarn.timeline-service.webapp.https.address
     */
    public void setYarnTimelineServiceWebappHttpsAddress(String yarnTimelineServiceWebappHttpsAddress) {
        this.yarnTimelineServiceWebappHttpsAddress = yarnTimelineServiceWebappHttpsAddress;
    }

}
