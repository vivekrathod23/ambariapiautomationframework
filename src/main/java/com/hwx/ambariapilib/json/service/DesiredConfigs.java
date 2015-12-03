package com.hwx.ambariapilib.json.service;

/**
 * Created by vrathod on 11/25/15.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hwx.ambariapilib.json.service.Configs.*;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class DesiredConfigs {

    @SerializedName("capacity-scheduler")
    @Expose
    private CapacityScheduler capacityScheduler;
    @SerializedName("cluster-env")
    @Expose
    private ClusterEnv clusterEnv;
    @SerializedName("core-site")
    @Expose
    private CoreSite coreSite;
    @SerializedName("hadoop-env")
    @Expose
    private HadoopEnv hadoopEnv;
    @SerializedName("hadoop-policy")
    @Expose
    private HadoopPolicy hadoopPolicy;
    @SerializedName("hdfs-log4j")
    @Expose
    private HdfsLog4j hdfsLog4j;
    @SerializedName("hdfs-site")
    @Expose
    private HdfsSite hdfsSite;
    @SerializedName("mapred-env")
    @Expose
    private MapredEnv mapredEnv;
    @SerializedName("mapred-site")
    @Expose
    private MapredSite mapredSite;
    @SerializedName("ranger-hdfs-audit")
    @Expose
    private RangerHdfsAudit rangerHdfsAudit;
    @SerializedName("ranger-hdfs-plugin-properties")
    @Expose
    private RangerHdfsPluginProperties rangerHdfsPluginProperties;
    @SerializedName("ranger-hdfs-policymgr-ssl")
    @Expose
    private RangerHdfsPolicymgrSsl rangerHdfsPolicymgrSsl;
    @SerializedName("ranger-hdfs-security")
    @Expose
    private RangerHdfsSecurity rangerHdfsSecurity;
    @SerializedName("ranger-yarn-audit")
    @Expose
    private RangerYarnAudit rangerYarnAudit;
    @SerializedName("ranger-yarn-plugin-properties")
    @Expose
    private RangerYarnPluginProperties rangerYarnPluginProperties;
    @SerializedName("ranger-yarn-policymgr-ssl")
    @Expose
    private RangerYarnPolicymgrSsl rangerYarnPolicymgrSsl;
    @SerializedName("ranger-yarn-security")
    @Expose
    private RangerYarnSecurity rangerYarnSecurity;
    @SerializedName("ssl-client")
    @Expose
    private SslClient sslClient;
    @SerializedName("ssl-server")
    @Expose
    private SslServer sslServer;
    @SerializedName("yarn-env")
    @Expose
    private YarnEnv yarnEnv;
    @SerializedName("yarn-log4j")
    @Expose
    private YarnLog4j yarnLog4j;
    @SerializedName("yarn-site")
    @Expose
    private YarnSite yarnSite;
    @SerializedName("zoo.cfg")
    @Expose
    private ZooCfg zooCfg;
    @SerializedName("zookeeper-env")
    @Expose
    private ZookeeperEnv zookeeperEnv;
    @SerializedName("zookeeper-log4j")
    @Expose
    private ZookeeperLog4j zookeeperLog4j;

    /**
     *
     * @return
     * The capacityScheduler
     */
    public CapacityScheduler getCapacityScheduler() {
        return capacityScheduler;
    }

    /**
     *
     * @param capacityScheduler
     * The capacity-scheduler
     */
    public void setCapacityScheduler(CapacityScheduler capacityScheduler) {
        this.capacityScheduler = capacityScheduler;
    }

    /**
     *
     * @return
     * The clusterEnv
     */
    public ClusterEnv getClusterEnv() {
        return clusterEnv;
    }

    /**
     *
     * @param clusterEnv
     * The cluster-env
     */
    public void setClusterEnv(ClusterEnv clusterEnv) {
        this.clusterEnv = clusterEnv;
    }

    /**
     *
     * @return
     * The coreSite
     */
    public CoreSite getCoreSite() {
        return coreSite;
    }

    /**
     *
     * @param coreSite
     * The core-site
     */
    public void setCoreSite(CoreSite coreSite) {
        this.coreSite = coreSite;
    }

    /**
     *
     * @return
     * The hadoopEnv
     */
    public HadoopEnv getHadoopEnv() {
        return hadoopEnv;
    }

    /**
     *
     * @param hadoopEnv
     * The hadoop-env
     */
    public void setHadoopEnv(HadoopEnv hadoopEnv) {
        this.hadoopEnv = hadoopEnv;
    }

    /**
     *
     * @return
     * The hadoopPolicy
     */
    public HadoopPolicy getHadoopPolicy() {
        return hadoopPolicy;
    }

    /**
     *
     * @param hadoopPolicy
     * The hadoop-policy
     */
    public void setHadoopPolicy(HadoopPolicy hadoopPolicy) {
        this.hadoopPolicy = hadoopPolicy;
    }

    /**
     *
     * @return
     * The hdfsLog4j
     */
    public HdfsLog4j getHdfsLog4j() {
        return hdfsLog4j;
    }

    /**
     *
     * @param hdfsLog4j
     * The hdfs-log4j
     */
    public void setHdfsLog4j(HdfsLog4j hdfsLog4j) {
        this.hdfsLog4j = hdfsLog4j;
    }

    /**
     *
     * @return
     * The hdfsSite
     */
    public HdfsSite getHdfsSite() {
        return hdfsSite;
    }

    /**
     *
     * @param hdfsSite
     * The hdfs-site
     */
    public void setHdfsSite(HdfsSite hdfsSite) {
        this.hdfsSite = hdfsSite;
    }

    /**
     *
     * @return
     * The mapredEnv
     */
    public MapredEnv getMapredEnv() {
        return mapredEnv;
    }

    /**
     *
     * @param mapredEnv
     * The mapred-env
     */
    public void setMapredEnv(MapredEnv mapredEnv) {
        this.mapredEnv = mapredEnv;
    }

    /**
     *
     * @return
     * The mapredSite
     */
    public MapredSite getMapredSite() {
        return mapredSite;
    }

    /**
     *
     * @param mapredSite
     * The mapred-site
     */
    public void setMapredSite(MapredSite mapredSite) {
        this.mapredSite = mapredSite;
    }

    /**
     *
     * @return
     * The rangerHdfsAudit
     */
    public RangerHdfsAudit getRangerHdfsAudit() {
        return rangerHdfsAudit;
    }

    /**
     *
     * @param rangerHdfsAudit
     * The ranger-hdfs-audit
     */
    public void setRangerHdfsAudit(RangerHdfsAudit rangerHdfsAudit) {
        this.rangerHdfsAudit = rangerHdfsAudit;
    }

    /**
     *
     * @return
     * The rangerHdfsPluginProperties
     */
    public RangerHdfsPluginProperties getRangerHdfsPluginProperties() {
        return rangerHdfsPluginProperties;
    }

    /**
     *
     * @param rangerHdfsPluginProperties
     * The ranger-hdfs-plugin-properties
     */
    public void setRangerHdfsPluginProperties(RangerHdfsPluginProperties rangerHdfsPluginProperties) {
        this.rangerHdfsPluginProperties = rangerHdfsPluginProperties;
    }

    /**
     *
     * @return
     * The rangerHdfsPolicymgrSsl
     */
    public RangerHdfsPolicymgrSsl getRangerHdfsPolicymgrSsl() {
        return rangerHdfsPolicymgrSsl;
    }

    /**
     *
     * @param rangerHdfsPolicymgrSsl
     * The ranger-hdfs-policymgr-ssl
     */
    public void setRangerHdfsPolicymgrSsl(RangerHdfsPolicymgrSsl rangerHdfsPolicymgrSsl) {
        this.rangerHdfsPolicymgrSsl = rangerHdfsPolicymgrSsl;
    }

    /**
     *
     * @return
     * The rangerHdfsSecurity
     */
    public RangerHdfsSecurity getRangerHdfsSecurity() {
        return rangerHdfsSecurity;
    }

    /**
     *
     * @param rangerHdfsSecurity
     * The ranger-hdfs-security
     */
    public void setRangerHdfsSecurity(RangerHdfsSecurity rangerHdfsSecurity) {
        this.rangerHdfsSecurity = rangerHdfsSecurity;
    }

    /**
     *
     * @return
     * The rangerYarnAudit
     */
    public RangerYarnAudit getRangerYarnAudit() {
        return rangerYarnAudit;
    }

    /**
     *
     * @param rangerYarnAudit
     * The ranger-yarn-audit
     */
    public void setRangerYarnAudit(RangerYarnAudit rangerYarnAudit) {
        this.rangerYarnAudit = rangerYarnAudit;
    }

    /**
     *
     * @return
     * The rangerYarnPluginProperties
     */
    public RangerYarnPluginProperties getRangerYarnPluginProperties() {
        return rangerYarnPluginProperties;
    }

    /**
     *
     * @param rangerYarnPluginProperties
     * The ranger-yarn-plugin-properties
     */
    public void setRangerYarnPluginProperties(RangerYarnPluginProperties rangerYarnPluginProperties) {
        this.rangerYarnPluginProperties = rangerYarnPluginProperties;
    }

    /**
     *
     * @return
     * The rangerYarnPolicymgrSsl
     */
    public RangerYarnPolicymgrSsl getRangerYarnPolicymgrSsl() {
        return rangerYarnPolicymgrSsl;
    }

    /**
     *
     * @param rangerYarnPolicymgrSsl
     * The ranger-yarn-policymgr-ssl
     */
    public void setRangerYarnPolicymgrSsl(RangerYarnPolicymgrSsl rangerYarnPolicymgrSsl) {
        this.rangerYarnPolicymgrSsl = rangerYarnPolicymgrSsl;
    }

    /**
     *
     * @return
     * The rangerYarnSecurity
     */
    public RangerYarnSecurity getRangerYarnSecurity() {
        return rangerYarnSecurity;
    }

    /**
     *
     * @param rangerYarnSecurity
     * The ranger-yarn-security
     */
    public void setRangerYarnSecurity(RangerYarnSecurity rangerYarnSecurity) {
        this.rangerYarnSecurity = rangerYarnSecurity;
    }

    /**
     *
     * @return
     * The sslClient
     */
    public SslClient getSslClient() {
        return sslClient;
    }

    /**
     *
     * @param sslClient
     * The ssl-client
     */
    public void setSslClient(SslClient sslClient) {
        this.sslClient = sslClient;
    }

    /**
     *
     * @return
     * The sslServer
     */
    public SslServer getSslServer() {
        return sslServer;
    }

    /**
     *
     * @param sslServer
     * The ssl-server
     */
    public void setSslServer(SslServer sslServer) {
        this.sslServer = sslServer;
    }

    /**
     *
     * @return
     * The yarnEnv
     */
    public YarnEnv getYarnEnv() {
        return yarnEnv;
    }

    /**
     *
     * @param yarnEnv
     * The yarn-env
     */
    public void setYarnEnv(YarnEnv yarnEnv) {
        this.yarnEnv = yarnEnv;
    }

    /**
     *
     * @return
     * The yarnLog4j
     */
    public YarnLog4j getYarnLog4j() {
        return yarnLog4j;
    }

    /**
     *
     * @param yarnLog4j
     * The yarn-log4j
     */
    public void setYarnLog4j(YarnLog4j yarnLog4j) {
        this.yarnLog4j = yarnLog4j;
    }

    /**
     *
     * @return
     * The yarnSite
     */
    public YarnSite getYarnSite() {
        return yarnSite;
    }

    /**
     *
     * @param yarnSite
     * The yarn-site
     */
    public void setYarnSite(YarnSite yarnSite) {
        this.yarnSite = yarnSite;
    }

    /**
     *
     * @return
     * The zooCfg
     */
    public ZooCfg getZooCfg() {
        return zooCfg;
    }

    /**
     *
     * @param zooCfg
     * The zoo.cfg
     */
    public void setZooCfg(ZooCfg zooCfg) {
        this.zooCfg = zooCfg;
    }

    /**
     *
     * @return
     * The zookeeperEnv
     */
    public ZookeeperEnv getZookeeperEnv() {
        return zookeeperEnv;
    }

    /**
     *
     * @param zookeeperEnv
     * The zookeeper-env
     */
    public void setZookeeperEnv(ZookeeperEnv zookeeperEnv) {
        this.zookeeperEnv = zookeeperEnv;
    }

    /**
     *
     * @return
     * The zookeeperLog4j
     */
    public ZookeeperLog4j getZookeeperLog4j() {
        return zookeeperLog4j;
    }

    /**
     *
     * @param zookeeperLog4j
     * The zookeeper-log4j
     */
    public void setZookeeperLog4j(ZookeeperLog4j zookeeperLog4j) {
        this.zookeeperLog4j = zookeeperLog4j;
    }

}