package com.hwx.ambariapilib.json.ConfigProperties;

/**
 * Created by vrathod on 12/5/15.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class MapredSiteProperties {

    @SerializedName("mapreduce.admin.map.child.java.opts")
    @Expose
    private String mapreduceAdminMapChildJavaOpts;
    @SerializedName("mapreduce.admin.reduce.child.java.opts")
    @Expose
    private String mapreduceAdminReduceChildJavaOpts;
    @SerializedName("mapreduce.admin.user.env")
    @Expose
    private String mapreduceAdminUserEnv;
    @SerializedName("mapreduce.am.max-attempts")
    @Expose
    private String mapreduceAmMaxAttempts;
    @SerializedName("mapreduce.application.classpath")
    @Expose
    private String mapreduceApplicationClasspath;
    @SerializedName("mapreduce.application.framework.path")
    @Expose
    private String mapreduceApplicationFrameworkPath;
    @SerializedName("mapreduce.cluster.administrators")
    @Expose
    private String mapreduceClusterAdministrators;
    @SerializedName("mapreduce.fileoutputcommitter.algorithm.version")
    @Expose
    private String mapreduceFileoutputcommitterAlgorithmVersion;
    @SerializedName("mapreduce.framework.name")
    @Expose
    private String mapreduceFrameworkName;
    @SerializedName("mapreduce.job.counters.max")
    @Expose
    private String mapreduceJobCountersMax;
    @SerializedName("mapreduce.job.emit-timeline-data")
    @Expose
    private String mapreduceJobEmitTimelineData;
    @SerializedName("mapreduce.job.reduce.slowstart.completedmaps")
    @Expose
    private String mapreduceJobReduceSlowstartCompletedmaps;
    @SerializedName("mapreduce.job.speculative.speculative-cap-running-tasks")
    @Expose
    private String mapreduceJobSpeculativeSpeculativeCapRunningTasks;
    @SerializedName("mapreduce.jobhistory.address")
    @Expose
    private String mapreduceJobhistoryAddress;
    @SerializedName("mapreduce.jobhistory.bind-host")
    @Expose
    private String mapreduceJobhistoryBindHost;
    @SerializedName("mapreduce.jobhistory.done-dir")
    @Expose
    private String mapreduceJobhistoryDoneDir;
    @SerializedName("mapreduce.jobhistory.intermediate-done-dir")
    @Expose
    private String mapreduceJobhistoryIntermediateDoneDir;
    @SerializedName("mapreduce.jobhistory.recovery.enable")
    @Expose
    private String mapreduceJobhistoryRecoveryEnable;
    @SerializedName("mapreduce.jobhistory.recovery.store.class")
    @Expose
    private String mapreduceJobhistoryRecoveryStoreClass;
    @SerializedName("mapreduce.jobhistory.recovery.store.leveldb.path")
    @Expose
    private String mapreduceJobhistoryRecoveryStoreLeveldbPath;
    @SerializedName("mapreduce.jobhistory.webapp.address")
    @Expose
    private String mapreduceJobhistoryWebappAddress;
    @SerializedName("mapreduce.map.java.opts")
    @Expose
    private String mapreduceMapJavaOpts;
    @SerializedName("mapreduce.map.log.level")
    @Expose
    private String mapreduceMapLogLevel;
    @SerializedName("mapreduce.map.memory.mb")
    @Expose
    private String mapreduceMapMemoryMb;
    @SerializedName("mapreduce.map.output.compress")
    @Expose
    private String mapreduceMapOutputCompress;
    @SerializedName("mapreduce.map.sort.spill.percent")
    @Expose
    private String mapreduceMapSortSpillPercent;
    @SerializedName("mapreduce.map.speculative")
    @Expose
    private String mapreduceMapSpeculative;
    @SerializedName("mapreduce.output.fileoutputformat.compress")
    @Expose
    private String mapreduceOutputFileoutputformatCompress;
    @SerializedName("mapreduce.output.fileoutputformat.compress.type")
    @Expose
    private String mapreduceOutputFileoutputformatCompressType;
    @SerializedName("mapreduce.reduce.input.buffer.percent")
    @Expose
    private String mapreduceReduceInputBufferPercent;
    @SerializedName("mapreduce.reduce.java.opts")
    @Expose
    private String mapreduceReduceJavaOpts;
    @SerializedName("mapreduce.reduce.log.level")
    @Expose
    private String mapreduceReduceLogLevel;
    @SerializedName("mapreduce.reduce.memory.mb")
    @Expose
    private String mapreduceReduceMemoryMb;
    @SerializedName("mapreduce.reduce.shuffle.fetch.retry.enabled")
    @Expose
    private String mapreduceReduceShuffleFetchRetryEnabled;
    @SerializedName("mapreduce.reduce.shuffle.fetch.retry.interval-ms")
    @Expose
    private String mapreduceReduceShuffleFetchRetryIntervalMs;
    @SerializedName("mapreduce.reduce.shuffle.fetch.retry.timeout-ms")
    @Expose
    private String mapreduceReduceShuffleFetchRetryTimeoutMs;
    @SerializedName("mapreduce.reduce.shuffle.input.buffer.percent")
    @Expose
    private String mapreduceReduceShuffleInputBufferPercent;
    @SerializedName("mapreduce.reduce.shuffle.merge.percent")
    @Expose
    private String mapreduceReduceShuffleMergePercent;
    @SerializedName("mapreduce.reduce.shuffle.parallelcopies")
    @Expose
    private String mapreduceReduceShuffleParallelcopies;
    @SerializedName("mapreduce.reduce.speculative")
    @Expose
    private String mapreduceReduceSpeculative;
    @SerializedName("mapreduce.shuffle.port")
    @Expose
    private String mapreduceShufflePort;
    @SerializedName("mapreduce.task.io.sort.factor")
    @Expose
    private String mapreduceTaskIoSortFactor;
    @SerializedName("mapreduce.task.io.sort.mb")
    @Expose
    private String mapreduceTaskIoSortMb;
    @SerializedName("mapreduce.task.timeout")
    @Expose
    private String mapreduceTaskTimeout;
    @SerializedName("yarn.app.mapreduce.am.admin-command-opts")
    @Expose
    private String yarnAppMapreduceAmAdminCommandOpts;
    @SerializedName("yarn.app.mapreduce.am.command-opts")
    @Expose
    private String yarnAppMapreduceAmCommandOpts;
    @SerializedName("yarn.app.mapreduce.am.log.level")
    @Expose
    private String yarnAppMapreduceAmLogLevel;
    @SerializedName("yarn.app.mapreduce.am.resource.mb")
    @Expose
    private String yarnAppMapreduceAmResourceMb;
    @SerializedName("yarn.app.mapreduce.am.staging-dir")
    @Expose
    private String yarnAppMapreduceAmStagingDir;

    /**
     *
     * @return
     * The mapreduceAdminMapChildJavaOpts
     */
    public String getMapreduceAdminMapChildJavaOpts() {
        return mapreduceAdminMapChildJavaOpts;
    }

    /**
     *
     * @param mapreduceAdminMapChildJavaOpts
     * The mapreduce.admin.map.child.java.opts
     */
    public void setMapreduceAdminMapChildJavaOpts(String mapreduceAdminMapChildJavaOpts) {
        this.mapreduceAdminMapChildJavaOpts = mapreduceAdminMapChildJavaOpts;
    }

    /**
     *
     * @return
     * The mapreduceAdminReduceChildJavaOpts
     */
    public String getMapreduceAdminReduceChildJavaOpts() {
        return mapreduceAdminReduceChildJavaOpts;
    }

    /**
     *
     * @param mapreduceAdminReduceChildJavaOpts
     * The mapreduce.admin.reduce.child.java.opts
     */
    public void setMapreduceAdminReduceChildJavaOpts(String mapreduceAdminReduceChildJavaOpts) {
        this.mapreduceAdminReduceChildJavaOpts = mapreduceAdminReduceChildJavaOpts;
    }

    /**
     *
     * @return
     * The mapreduceAdminUserEnv
     */
    public String getMapreduceAdminUserEnv() {
        return mapreduceAdminUserEnv;
    }

    /**
     *
     * @param mapreduceAdminUserEnv
     * The mapreduce.admin.user.env
     */
    public void setMapreduceAdminUserEnv(String mapreduceAdminUserEnv) {
        this.mapreduceAdminUserEnv = mapreduceAdminUserEnv;
    }

    /**
     *
     * @return
     * The mapreduceAmMaxAttempts
     */
    public String getMapreduceAmMaxAttempts() {
        return mapreduceAmMaxAttempts;
    }

    /**
     *
     * @param mapreduceAmMaxAttempts
     * The mapreduce.am.max-attempts
     */
    public void setMapreduceAmMaxAttempts(String mapreduceAmMaxAttempts) {
        this.mapreduceAmMaxAttempts = mapreduceAmMaxAttempts;
    }

    /**
     *
     * @return
     * The mapreduceApplicationClasspath
     */
    public String getMapreduceApplicationClasspath() {
        return mapreduceApplicationClasspath;
    }

    /**
     *
     * @param mapreduceApplicationClasspath
     * The mapreduce.application.classpath
     */
    public void setMapreduceApplicationClasspath(String mapreduceApplicationClasspath) {
        this.mapreduceApplicationClasspath = mapreduceApplicationClasspath;
    }

    /**
     *
     * @return
     * The mapreduceApplicationFrameworkPath
     */
    public String getMapreduceApplicationFrameworkPath() {
        return mapreduceApplicationFrameworkPath;
    }

    /**
     *
     * @param mapreduceApplicationFrameworkPath
     * The mapreduce.application.framework.path
     */
    public void setMapreduceApplicationFrameworkPath(String mapreduceApplicationFrameworkPath) {
        this.mapreduceApplicationFrameworkPath = mapreduceApplicationFrameworkPath;
    }

    /**
     *
     * @return
     * The mapreduceClusterAdministrators
     */
    public String getMapreduceClusterAdministrators() {
        return mapreduceClusterAdministrators;
    }

    /**
     *
     * @param mapreduceClusterAdministrators
     * The mapreduce.cluster.administrators
     */
    public void setMapreduceClusterAdministrators(String mapreduceClusterAdministrators) {
        this.mapreduceClusterAdministrators = mapreduceClusterAdministrators;
    }

    /**
     *
     * @return
     * The mapreduceFileoutputcommitterAlgorithmVersion
     */
    public String getMapreduceFileoutputcommitterAlgorithmVersion() {
        return mapreduceFileoutputcommitterAlgorithmVersion;
    }

    /**
     *
     * @param mapreduceFileoutputcommitterAlgorithmVersion
     * The mapreduce.fileoutputcommitter.algorithm.version
     */
    public void setMapreduceFileoutputcommitterAlgorithmVersion(String mapreduceFileoutputcommitterAlgorithmVersion) {
        this.mapreduceFileoutputcommitterAlgorithmVersion = mapreduceFileoutputcommitterAlgorithmVersion;
    }

    /**
     *
     * @return
     * The mapreduceFrameworkName
     */
    public String getMapreduceFrameworkName() {
        return mapreduceFrameworkName;
    }

    /**
     *
     * @param mapreduceFrameworkName
     * The mapreduce.framework.name
     */
    public void setMapreduceFrameworkName(String mapreduceFrameworkName) {
        this.mapreduceFrameworkName = mapreduceFrameworkName;
    }

    /**
     *
     * @return
     * The mapreduceJobCountersMax
     */
    public String getMapreduceJobCountersMax() {
        return mapreduceJobCountersMax;
    }

    /**
     *
     * @param mapreduceJobCountersMax
     * The mapreduce.job.counters.max
     */
    public void setMapreduceJobCountersMax(String mapreduceJobCountersMax) {
        this.mapreduceJobCountersMax = mapreduceJobCountersMax;
    }

    /**
     *
     * @return
     * The mapreduceJobEmitTimelineData
     */
    public String getMapreduceJobEmitTimelineData() {
        return mapreduceJobEmitTimelineData;
    }

    /**
     *
     * @param mapreduceJobEmitTimelineData
     * The mapreduce.job.emit-timeline-data
     */
    public void setMapreduceJobEmitTimelineData(String mapreduceJobEmitTimelineData) {
        this.mapreduceJobEmitTimelineData = mapreduceJobEmitTimelineData;
    }

    /**
     *
     * @return
     * The mapreduceJobReduceSlowstartCompletedmaps
     */
    public String getMapreduceJobReduceSlowstartCompletedmaps() {
        return mapreduceJobReduceSlowstartCompletedmaps;
    }

    /**
     *
     * @param mapreduceJobReduceSlowstartCompletedmaps
     * The mapreduce.job.reduce.slowstart.completedmaps
     */
    public void setMapreduceJobReduceSlowstartCompletedmaps(String mapreduceJobReduceSlowstartCompletedmaps) {
        this.mapreduceJobReduceSlowstartCompletedmaps = mapreduceJobReduceSlowstartCompletedmaps;
    }

    /**
     *
     * @return
     * The mapreduceJobSpeculativeSpeculativeCapRunningTasks
     */
    public String getMapreduceJobSpeculativeSpeculativeCapRunningTasks() {
        return mapreduceJobSpeculativeSpeculativeCapRunningTasks;
    }

    /**
     *
     * @param mapreduceJobSpeculativeSpeculativeCapRunningTasks
     * The mapreduce.job.speculative.speculative-cap-running-tasks
     */
    public void setMapreduceJobSpeculativeSpeculativeCapRunningTasks(String mapreduceJobSpeculativeSpeculativeCapRunningTasks) {
        this.mapreduceJobSpeculativeSpeculativeCapRunningTasks = mapreduceJobSpeculativeSpeculativeCapRunningTasks;
    }

    /**
     *
     * @return
     * The mapreduceJobhistoryAddress
     */
    public String getMapreduceJobhistoryAddress() {
        return mapreduceJobhistoryAddress;
    }

    /**
     *
     * @param mapreduceJobhistoryAddress
     * The mapreduce.jobhistory.address
     */
    public void setMapreduceJobhistoryAddress(String mapreduceJobhistoryAddress) {
        this.mapreduceJobhistoryAddress = mapreduceJobhistoryAddress;
    }

    /**
     *
     * @return
     * The mapreduceJobhistoryBindHost
     */
    public String getMapreduceJobhistoryBindHost() {
        return mapreduceJobhistoryBindHost;
    }

    /**
     *
     * @param mapreduceJobhistoryBindHost
     * The mapreduce.jobhistory.bind-host
     */
    public void setMapreduceJobhistoryBindHost(String mapreduceJobhistoryBindHost) {
        this.mapreduceJobhistoryBindHost = mapreduceJobhistoryBindHost;
    }

    /**
     *
     * @return
     * The mapreduceJobhistoryDoneDir
     */
    public String getMapreduceJobhistoryDoneDir() {
        return mapreduceJobhistoryDoneDir;
    }

    /**
     *
     * @param mapreduceJobhistoryDoneDir
     * The mapreduce.jobhistory.done-dir
     */
    public void setMapreduceJobhistoryDoneDir(String mapreduceJobhistoryDoneDir) {
        this.mapreduceJobhistoryDoneDir = mapreduceJobhistoryDoneDir;
    }

    /**
     *
     * @return
     * The mapreduceJobhistoryIntermediateDoneDir
     */
    public String getMapreduceJobhistoryIntermediateDoneDir() {
        return mapreduceJobhistoryIntermediateDoneDir;
    }

    /**
     *
     * @param mapreduceJobhistoryIntermediateDoneDir
     * The mapreduce.jobhistory.intermediate-done-dir
     */
    public void setMapreduceJobhistoryIntermediateDoneDir(String mapreduceJobhistoryIntermediateDoneDir) {
        this.mapreduceJobhistoryIntermediateDoneDir = mapreduceJobhistoryIntermediateDoneDir;
    }

    /**
     *
     * @return
     * The mapreduceJobhistoryRecoveryEnable
     */
    public String getMapreduceJobhistoryRecoveryEnable() {
        return mapreduceJobhistoryRecoveryEnable;
    }

    /**
     *
     * @param mapreduceJobhistoryRecoveryEnable
     * The mapreduce.jobhistory.recovery.enable
     */
    public void setMapreduceJobhistoryRecoveryEnable(String mapreduceJobhistoryRecoveryEnable) {
        this.mapreduceJobhistoryRecoveryEnable = mapreduceJobhistoryRecoveryEnable;
    }

    /**
     *
     * @return
     * The mapreduceJobhistoryRecoveryStoreClass
     */
    public String getMapreduceJobhistoryRecoveryStoreClass() {
        return mapreduceJobhistoryRecoveryStoreClass;
    }

    /**
     *
     * @param mapreduceJobhistoryRecoveryStoreClass
     * The mapreduce.jobhistory.recovery.store.class
     */
    public void setMapreduceJobhistoryRecoveryStoreClass(String mapreduceJobhistoryRecoveryStoreClass) {
        this.mapreduceJobhistoryRecoveryStoreClass = mapreduceJobhistoryRecoveryStoreClass;
    }

    /**
     *
     * @return
     * The mapreduceJobhistoryRecoveryStoreLeveldbPath
     */
    public String getMapreduceJobhistoryRecoveryStoreLeveldbPath() {
        return mapreduceJobhistoryRecoveryStoreLeveldbPath;
    }

    /**
     *
     * @param mapreduceJobhistoryRecoveryStoreLeveldbPath
     * The mapreduce.jobhistory.recovery.store.leveldb.path
     */
    public void setMapreduceJobhistoryRecoveryStoreLeveldbPath(String mapreduceJobhistoryRecoveryStoreLeveldbPath) {
        this.mapreduceJobhistoryRecoveryStoreLeveldbPath = mapreduceJobhistoryRecoveryStoreLeveldbPath;
    }

    /**
     *
     * @return
     * The mapreduceJobhistoryWebappAddress
     */
    public String getMapreduceJobhistoryWebappAddress() {
        return mapreduceJobhistoryWebappAddress;
    }

    /**
     *
     * @param mapreduceJobhistoryWebappAddress
     * The mapreduce.jobhistory.webapp.address
     */
    public void setMapreduceJobhistoryWebappAddress(String mapreduceJobhistoryWebappAddress) {
        this.mapreduceJobhistoryWebappAddress = mapreduceJobhistoryWebappAddress;
    }

    /**
     *
     * @return
     * The mapreduceMapJavaOpts
     */
    public String getMapreduceMapJavaOpts() {
        return mapreduceMapJavaOpts;
    }

    /**
     *
     * @param mapreduceMapJavaOpts
     * The mapreduce.map.java.opts
     */
    public void setMapreduceMapJavaOpts(String mapreduceMapJavaOpts) {
        this.mapreduceMapJavaOpts = mapreduceMapJavaOpts;
    }

    /**
     *
     * @return
     * The mapreduceMapLogLevel
     */
    public String getMapreduceMapLogLevel() {
        return mapreduceMapLogLevel;
    }

    /**
     *
     * @param mapreduceMapLogLevel
     * The mapreduce.map.log.level
     */
    public void setMapreduceMapLogLevel(String mapreduceMapLogLevel) {
        this.mapreduceMapLogLevel = mapreduceMapLogLevel;
    }

    /**
     *
     * @return
     * The mapreduceMapMemoryMb
     */
    public String getMapreduceMapMemoryMb() {
        return mapreduceMapMemoryMb;
    }

    /**
     *
     * @param mapreduceMapMemoryMb
     * The mapreduce.map.memory.mb
     */
    public void setMapreduceMapMemoryMb(String mapreduceMapMemoryMb) {
        this.mapreduceMapMemoryMb = mapreduceMapMemoryMb;
    }

    /**
     *
     * @return
     * The mapreduceMapOutputCompress
     */
    public String getMapreduceMapOutputCompress() {
        return mapreduceMapOutputCompress;
    }

    /**
     *
     * @param mapreduceMapOutputCompress
     * The mapreduce.map.output.compress
     */
    public void setMapreduceMapOutputCompress(String mapreduceMapOutputCompress) {
        this.mapreduceMapOutputCompress = mapreduceMapOutputCompress;
    }

    /**
     *
     * @return
     * The mapreduceMapSortSpillPercent
     */
    public String getMapreduceMapSortSpillPercent() {
        return mapreduceMapSortSpillPercent;
    }

    /**
     *
     * @param mapreduceMapSortSpillPercent
     * The mapreduce.map.sort.spill.percent
     */
    public void setMapreduceMapSortSpillPercent(String mapreduceMapSortSpillPercent) {
        this.mapreduceMapSortSpillPercent = mapreduceMapSortSpillPercent;
    }

    /**
     *
     * @return
     * The mapreduceMapSpeculative
     */
    public String getMapreduceMapSpeculative() {
        return mapreduceMapSpeculative;
    }

    /**
     *
     * @param mapreduceMapSpeculative
     * The mapreduce.map.speculative
     */
    public void setMapreduceMapSpeculative(String mapreduceMapSpeculative) {
        this.mapreduceMapSpeculative = mapreduceMapSpeculative;
    }

    /**
     *
     * @return
     * The mapreduceOutputFileoutputformatCompress
     */
    public String getMapreduceOutputFileoutputformatCompress() {
        return mapreduceOutputFileoutputformatCompress;
    }

    /**
     *
     * @param mapreduceOutputFileoutputformatCompress
     * The mapreduce.output.fileoutputformat.compress
     */
    public void setMapreduceOutputFileoutputformatCompress(String mapreduceOutputFileoutputformatCompress) {
        this.mapreduceOutputFileoutputformatCompress = mapreduceOutputFileoutputformatCompress;
    }

    /**
     *
     * @return
     * The mapreduceOutputFileoutputformatCompressType
     */
    public String getMapreduceOutputFileoutputformatCompressType() {
        return mapreduceOutputFileoutputformatCompressType;
    }

    /**
     *
     * @param mapreduceOutputFileoutputformatCompressType
     * The mapreduce.output.fileoutputformat.compress.type
     */
    public void setMapreduceOutputFileoutputformatCompressType(String mapreduceOutputFileoutputformatCompressType) {
        this.mapreduceOutputFileoutputformatCompressType = mapreduceOutputFileoutputformatCompressType;
    }

    /**
     *
     * @return
     * The mapreduceReduceInputBufferPercent
     */
    public String getMapreduceReduceInputBufferPercent() {
        return mapreduceReduceInputBufferPercent;
    }

    /**
     *
     * @param mapreduceReduceInputBufferPercent
     * The mapreduce.reduce.input.buffer.percent
     */
    public void setMapreduceReduceInputBufferPercent(String mapreduceReduceInputBufferPercent) {
        this.mapreduceReduceInputBufferPercent = mapreduceReduceInputBufferPercent;
    }

    /**
     *
     * @return
     * The mapreduceReduceJavaOpts
     */
    public String getMapreduceReduceJavaOpts() {
        return mapreduceReduceJavaOpts;
    }

    /**
     *
     * @param mapreduceReduceJavaOpts
     * The mapreduce.reduce.java.opts
     */
    public void setMapreduceReduceJavaOpts(String mapreduceReduceJavaOpts) {
        this.mapreduceReduceJavaOpts = mapreduceReduceJavaOpts;
    }

    /**
     *
     * @return
     * The mapreduceReduceLogLevel
     */
    public String getMapreduceReduceLogLevel() {
        return mapreduceReduceLogLevel;
    }

    /**
     *
     * @param mapreduceReduceLogLevel
     * The mapreduce.reduce.log.level
     */
    public void setMapreduceReduceLogLevel(String mapreduceReduceLogLevel) {
        this.mapreduceReduceLogLevel = mapreduceReduceLogLevel;
    }

    /**
     *
     * @return
     * The mapreduceReduceMemoryMb
     */
    public String getMapreduceReduceMemoryMb() {
        return mapreduceReduceMemoryMb;
    }

    /**
     *
     * @param mapreduceReduceMemoryMb
     * The mapreduce.reduce.memory.mb
     */
    public void setMapreduceReduceMemoryMb(String mapreduceReduceMemoryMb) {
        this.mapreduceReduceMemoryMb = mapreduceReduceMemoryMb;
    }

    /**
     *
     * @return
     * The mapreduceReduceShuffleFetchRetryEnabled
     */
    public String getMapreduceReduceShuffleFetchRetryEnabled() {
        return mapreduceReduceShuffleFetchRetryEnabled;
    }

    /**
     *
     * @param mapreduceReduceShuffleFetchRetryEnabled
     * The mapreduce.reduce.shuffle.fetch.retry.enabled
     */
    public void setMapreduceReduceShuffleFetchRetryEnabled(String mapreduceReduceShuffleFetchRetryEnabled) {
        this.mapreduceReduceShuffleFetchRetryEnabled = mapreduceReduceShuffleFetchRetryEnabled;
    }

    /**
     *
     * @return
     * The mapreduceReduceShuffleFetchRetryIntervalMs
     */
    public String getMapreduceReduceShuffleFetchRetryIntervalMs() {
        return mapreduceReduceShuffleFetchRetryIntervalMs;
    }

    /**
     *
     * @param mapreduceReduceShuffleFetchRetryIntervalMs
     * The mapreduce.reduce.shuffle.fetch.retry.interval-ms
     */
    public void setMapreduceReduceShuffleFetchRetryIntervalMs(String mapreduceReduceShuffleFetchRetryIntervalMs) {
        this.mapreduceReduceShuffleFetchRetryIntervalMs = mapreduceReduceShuffleFetchRetryIntervalMs;
    }

    /**
     *
     * @return
     * The mapreduceReduceShuffleFetchRetryTimeoutMs
     */
    public String getMapreduceReduceShuffleFetchRetryTimeoutMs() {
        return mapreduceReduceShuffleFetchRetryTimeoutMs;
    }

    /**
     *
     * @param mapreduceReduceShuffleFetchRetryTimeoutMs
     * The mapreduce.reduce.shuffle.fetch.retry.timeout-ms
     */
    public void setMapreduceReduceShuffleFetchRetryTimeoutMs(String mapreduceReduceShuffleFetchRetryTimeoutMs) {
        this.mapreduceReduceShuffleFetchRetryTimeoutMs = mapreduceReduceShuffleFetchRetryTimeoutMs;
    }

    /**
     *
     * @return
     * The mapreduceReduceShuffleInputBufferPercent
     */
    public String getMapreduceReduceShuffleInputBufferPercent() {
        return mapreduceReduceShuffleInputBufferPercent;
    }

    /**
     *
     * @param mapreduceReduceShuffleInputBufferPercent
     * The mapreduce.reduce.shuffle.input.buffer.percent
     */
    public void setMapreduceReduceShuffleInputBufferPercent(String mapreduceReduceShuffleInputBufferPercent) {
        this.mapreduceReduceShuffleInputBufferPercent = mapreduceReduceShuffleInputBufferPercent;
    }

    /**
     *
     * @return
     * The mapreduceReduceShuffleMergePercent
     */
    public String getMapreduceReduceShuffleMergePercent() {
        return mapreduceReduceShuffleMergePercent;
    }

    /**
     *
     * @param mapreduceReduceShuffleMergePercent
     * The mapreduce.reduce.shuffle.merge.percent
     */
    public void setMapreduceReduceShuffleMergePercent(String mapreduceReduceShuffleMergePercent) {
        this.mapreduceReduceShuffleMergePercent = mapreduceReduceShuffleMergePercent;
    }

    /**
     *
     * @return
     * The mapreduceReduceShuffleParallelcopies
     */
    public String getMapreduceReduceShuffleParallelcopies() {
        return mapreduceReduceShuffleParallelcopies;
    }

    /**
     *
     * @param mapreduceReduceShuffleParallelcopies
     * The mapreduce.reduce.shuffle.parallelcopies
     */
    public void setMapreduceReduceShuffleParallelcopies(String mapreduceReduceShuffleParallelcopies) {
        this.mapreduceReduceShuffleParallelcopies = mapreduceReduceShuffleParallelcopies;
    }

    /**
     *
     * @return
     * The mapreduceReduceSpeculative
     */
    public String getMapreduceReduceSpeculative() {
        return mapreduceReduceSpeculative;
    }

    /**
     *
     * @param mapreduceReduceSpeculative
     * The mapreduce.reduce.speculative
     */
    public void setMapreduceReduceSpeculative(String mapreduceReduceSpeculative) {
        this.mapreduceReduceSpeculative = mapreduceReduceSpeculative;
    }

    /**
     *
     * @return
     * The mapreduceShufflePort
     */
    public String getMapreduceShufflePort() {
        return mapreduceShufflePort;
    }

    /**
     *
     * @param mapreduceShufflePort
     * The mapreduce.shuffle.port
     */
    public void setMapreduceShufflePort(String mapreduceShufflePort) {
        this.mapreduceShufflePort = mapreduceShufflePort;
    }

    /**
     *
     * @return
     * The mapreduceTaskIoSortFactor
     */
    public String getMapreduceTaskIoSortFactor() {
        return mapreduceTaskIoSortFactor;
    }

    /**
     *
     * @param mapreduceTaskIoSortFactor
     * The mapreduce.task.io.sort.factor
     */
    public void setMapreduceTaskIoSortFactor(String mapreduceTaskIoSortFactor) {
        this.mapreduceTaskIoSortFactor = mapreduceTaskIoSortFactor;
    }

    /**
     *
     * @return
     * The mapreduceTaskIoSortMb
     */
    public String getMapreduceTaskIoSortMb() {
        return mapreduceTaskIoSortMb;
    }

    /**
     *
     * @param mapreduceTaskIoSortMb
     * The mapreduce.task.io.sort.mb
     */
    public void setMapreduceTaskIoSortMb(String mapreduceTaskIoSortMb) {
        this.mapreduceTaskIoSortMb = mapreduceTaskIoSortMb;
    }

    /**
     *
     * @return
     * The mapreduceTaskTimeout
     */
    public String getMapreduceTaskTimeout() {
        return mapreduceTaskTimeout;
    }

    /**
     *
     * @param mapreduceTaskTimeout
     * The mapreduce.task.timeout
     */
    public void setMapreduceTaskTimeout(String mapreduceTaskTimeout) {
        this.mapreduceTaskTimeout = mapreduceTaskTimeout;
    }

    /**
     *
     * @return
     * The yarnAppMapreduceAmAdminCommandOpts
     */
    public String getYarnAppMapreduceAmAdminCommandOpts() {
        return yarnAppMapreduceAmAdminCommandOpts;
    }

    /**
     *
     * @param yarnAppMapreduceAmAdminCommandOpts
     * The yarn.app.mapreduce.am.admin-command-opts
     */
    public void setYarnAppMapreduceAmAdminCommandOpts(String yarnAppMapreduceAmAdminCommandOpts) {
        this.yarnAppMapreduceAmAdminCommandOpts = yarnAppMapreduceAmAdminCommandOpts;
    }

    /**
     *
     * @return
     * The yarnAppMapreduceAmCommandOpts
     */
    public String getYarnAppMapreduceAmCommandOpts() {
        return yarnAppMapreduceAmCommandOpts;
    }

    /**
     *
     * @param yarnAppMapreduceAmCommandOpts
     * The yarn.app.mapreduce.am.command-opts
     */
    public void setYarnAppMapreduceAmCommandOpts(String yarnAppMapreduceAmCommandOpts) {
        this.yarnAppMapreduceAmCommandOpts = yarnAppMapreduceAmCommandOpts;
    }

    /**
     *
     * @return
     * The yarnAppMapreduceAmLogLevel
     */
    public String getYarnAppMapreduceAmLogLevel() {
        return yarnAppMapreduceAmLogLevel;
    }

    /**
     *
     * @param yarnAppMapreduceAmLogLevel
     * The yarn.app.mapreduce.am.log.level
     */
    public void setYarnAppMapreduceAmLogLevel(String yarnAppMapreduceAmLogLevel) {
        this.yarnAppMapreduceAmLogLevel = yarnAppMapreduceAmLogLevel;
    }

    /**
     *
     * @return
     * The yarnAppMapreduceAmResourceMb
     */
    public String getYarnAppMapreduceAmResourceMb() {
        return yarnAppMapreduceAmResourceMb;
    }

    /**
     *
     * @param yarnAppMapreduceAmResourceMb
     * The yarn.app.mapreduce.am.resource.mb
     */
    public void setYarnAppMapreduceAmResourceMb(String yarnAppMapreduceAmResourceMb) {
        this.yarnAppMapreduceAmResourceMb = yarnAppMapreduceAmResourceMb;
    }

    /**
     *
     * @return
     * The yarnAppMapreduceAmStagingDir
     */
    public String getYarnAppMapreduceAmStagingDir() {
        return yarnAppMapreduceAmStagingDir;
    }

    /**
     *
     * @param yarnAppMapreduceAmStagingDir
     * The yarn.app.mapreduce.am.staging-dir
     */
    public void setYarnAppMapreduceAmStagingDir(String yarnAppMapreduceAmStagingDir) {
        this.yarnAppMapreduceAmStagingDir = yarnAppMapreduceAmStagingDir;
    }

}