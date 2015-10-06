package com.hwx;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hwx.ambariapilib.AmbariManager;
import com.hwx.ambariapilib.host.Host;
import com.hwx.utils.logging.LogManager;

/**
 * Created by ajain on 9/11/15.
 */
public class DemoTest {

	LogManager logger = LogManager.getLoggerInstance(DemoTest.class.getSimpleName());

    AmbariManager ambariManager;

    @BeforeTest
    public void init(){
        ambariManager = new AmbariManager();
    }

    @Test
    public void testHostState(){
        Host[] hosts = ambariManager.getClusters().get(0).getHosts();

        for(int i=0;i<hosts.length;i++){
            logger.logInfo("Host : "+hosts[i]+" State : "+hosts[i].getHealthState());
            Assert.assertEquals(hosts[i].getHealthState(), "HEALTHY");
        }
    }

    @Test
    public void testStartHDFSService(){
        long startTime = (new Date()).getTime();
        logger.logInfo("Start time : " +startTime);
        ambariManager.getClusters().get(0).startService("HDFS");
        long endTime = (new Date()).getTime();
        logger.logInfo("End time : " +endTime);
        logger.logInfo("Time to start the service (in minutes): "+((endTime-startTime)/(1000*60)));

    }

    @Test
    public void testStopHDFSService(){
        long startTime = (new Date()).getTime();
        logger.logInfo("Start time : " +startTime);
        ambariManager.getClusters().get(0).stopService("HDFS");
        long endTime = (new Date()).getTime();
        logger.logInfo("End time : " +endTime);
        logger.logInfo("Time to stop the service (in minutes): "+((endTime-startTime)/(1000*60)));

    }

    @Test
    public void testAddHost(){
    	ambariManager.getClusters().get(0).addHost("c6403.ambari.apache.org");
    }

    @Test
    public void testService(){
        System.out.println(ambariManager.getClusters().get(0).getServices().get(1).getClusterServiceDetailsJson().getServiceInfo().getService_name());
    }

    @Test
    public void testCreateService(){
    	ambariManager.getClusters().get(0).createServices("HIVE");
    }

    @Test
    public void testStartService(){
    	ambariManager.getClusters().get(0).startService("HDFS");
    }

    @Test
    public void testStopService(){
    	ambariManager.getClusters().get(0).stopService("HDFS");
    }

    @Test
    public void testStartAllServices(){
    	ambariManager.getClusters().get(0).startAllServices();
    }

    @Test
    public void testStopAllServices(){
    	ambariManager.getClusters().get(0).stopAllServices();
    }
    
    
}
