package com.hwx.ambariapilib.json.host;

import com.hwx.ambariapilib.json.service.HbaseJson;
import com.hwx.ambariapilib.json.service.HdfsJson;
import com.hwx.ambariapilib.json.service.MapReduce2Json;
import com.hwx.ambariapilib.json.service.OozieJson;
import com.hwx.ambariapilib.json.service.PigJson;
import com.hwx.ambariapilib.json.service.Tez;
import com.hwx.ambariapilib.json.service.Yarn;
import com.hwx.ambariapilib.json.service.ZooKeeper;

/**
 * Created by ajain on 9/30/15.
 */
public class DesiredServiceConfigVersionsJson {
    private AmbariMetricsJson[] AMBARI_METRICS;
    private HbaseJson[] HBASE;
    private HdfsJson[] HDFS;
    private MapReduce2Json[] MAPREDUCE2;
    private OozieJson[] OOZIE;
    private PigJson[] PIG;
    private Tez[] TEZ;
    private Yarn[] YARN;
    private ZooKeeper[] ZOOKEEPER;

}
