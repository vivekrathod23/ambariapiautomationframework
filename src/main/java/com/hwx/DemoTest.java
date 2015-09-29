package com.hwx;

import com.hwx.ambariapilib.AmbariManager;
import com.hwx.ambariapilib.host.Host;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Date;

/**
 * Created by ajain on 9/11/15.
 */
public class DemoTest {

    AmbariManager ambariManager;

    @BeforeTest
    public void init(){
        ambariManager = new AmbariManager();
    }

    @Test
    public void testHostState(){
        Host[] hosts = ambariManager.getClusters()[0].getHosts();

        for(int i=0;i<hosts.length;i++){
            System.out.println("Host : "+hosts[i]+" State : "+hosts[i].getHealthState());
            Assert.assertEquals(hosts[i].getHealthState(), "HEALTHY");
        }
    }

    @Test
    public void testStartHDFSService(){
        long startTime = (new Date()).getTime();
        ambariManager.getClusters()[0].startService("HDFS");
        long endTime = (new Date()).getTime();

        System.out.println("Time to start the service : "+(endTime-startTime));

    }
}
