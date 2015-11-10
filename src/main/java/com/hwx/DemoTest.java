package com.hwx;

import com.hwx.ambariapilib.AmbariManager;
import com.hwx.ambariapilib.host.Host;
import com.hwx.ambariapilib.host.HostComponent;
import com.hwx.ambariapilib.json.upgrade.UpgradeStatusJson;
import com.hwx.ambariapilib.service.Service;
import com.hwx.ambariapilib.upgrade.StackUpgrade;
import com.hwx.utils.LinuxCommandExecutor;
import com.hwx.utils.LinuxCommandExecutor.IGNORE_ERRORS;
import com.hwx.utils.ProcessData.Types_Of_Data;
import com.hwx.utils.logging.LogManager;
import com.hwx.utils.validation.ValidationUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Date;

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
        ArrayList<Host> hosts = ambariManager.getClusters().get(0).getHosts();

        for(int i=0;i<hosts.size();i++){
            logger.logInfo("Host : "+hosts.get(i)+" State : "+hosts.get(i).getHealthState());
            Assert.assertEquals(hosts.get(i).getHealthState(), "HEALTHY");
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
    	ambariManager.getClusters().get(0).createHost("c6404.ambari.apache.org");
    }

    @Test
    public void testService(){
        logger.logInfo(ambariManager.getClusters().get(0).getServices().get(1).getClusterServiceDetailsJson().getServiceInfo().getService_name());
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

    
    @Test
    public void testHosts(){
    	logger.logInfo(ambariManager.getClusters().get(0).getHosts().get(0).getHostJson().getHosts().getHost_name());
    }



    @Test
    public void testViews(){

        for(int i=0;i<ambariManager.getClusters().get(0).getViews().size();i++)
        System.out.println(ambariManager.getClusters().get(0).getViews().get(i).getViewJson().getViewInfo().getView_name());
    }
    @Test
    public void testViewsVersions(){

        for(int i=0;i<ambariManager.getClusters().get(0).getViews().get(0).getViewVersions().size();i++)
            System.out.println(ambariManager.getClusters().get(0).getViews().get(0).getViewVersions().get(i).getViewVersionJson().getViewVersionInfo().getVersion());
    }

    @Test
    public void testViewInstances(){

        for(int i=0;i<ambariManager.getClusters().get(0).getViews().get(0).getViewVersions().get(0).getViewInstances().size();i++)
            System.out.println(ambariManager.getClusters().get(0).getViews().get(0).getViewVersions().get(0).getViewInstances().get(i).getViewLongInstanceJson().getViewInstanceInfo().getInstance_name());
    }

    @Test
    public void testCreateViewInstances(){
        ambariManager.getClusters().get(0).getViews().get(0).getViewVersions().get(0).createInstance("NewInstance");
    }

    @Test
    public void testCreateCluster(){
        ambariManager.createCluster("test");
    }

    @Test
    public void testServiceComponents(){
        ambariManager.getClusters().get(0).getServices().get(0).getServiceComponents();
    }

    @Test
    public void testCreateComponent(){
        ambariManager.getClusters().get(0).getServices().get(0).createComponent("TestComponent");
    }

    @Test
    public void testStackVersion(){
        System.out.println(ambariManager.getClusters().get(0).getStackVersions().get(0).getStackVersionDetailJson().getHref());
    }

    @Test
    public void testRegisteredVersion(){
        ambariManager.getClusters().get(0).registerNewVersion("HDP", "2.3", "3.0-3020", "redhat6", "http://s3.amazonaws.com/dev.hortonworks.com/HDP/centos6/2.x/BUILDS/2.3.3.0-3020", "http://public-repo-1.hortonworks.com/HDP-UTILS-1.1.0.20/repos/centos6");
    }

    @Test
    public void testInstallPackageRequest() throws Exception {
        ambariManager.getClusters().get(0).submitInstallPackageRequest("HDP", "2.3", "3.0-3020");
    }


    @Test
    public void testSubmitExpressUpgrade()
    {
        ambariManager.getClusters().get(0).submitRollingUpgrade();
    }

    @Test
    public void testUpgrade() throws Exception {
        ambariManager.getClusters().get(0).registerNewVersion("HDP","2.3","3.0-3020","redhat6","http://s3.amazonaws.com/dev.hortonworks.com/HDP/centos6/2.x/BUILDS/2.3.3.0-3020","http://public-repo-1.hortonworks.com/HDP-UTILS-1.1.0.20/repos/centos6");
        ambariManager.getClusters().get(0).submitInstallPackageRequest("HDP", "2.3", "3.0-3020");
        ambariManager.getClusters().get(0).submitRollingUpgrade();
    }

    @Test
    public void testGetEUStatus() throws Exception {

        StackUpgrade stackUpgrade = ambariManager.getClusters().get(0).initializeStackUpgrade("express");
        UpgradeStatusJson upgradeStatus = stackUpgrade.getLastUpgradeStatus();
        System.out.println(upgradeStatus.getUpgrade().getRequest_status());
        logger.logInfo(upgradeStatus.getUpgrade().getRequest_status());
        System.out.println("Hi");

    }

    @Test
    public void testGetLastPendingTask() throws Exception {
        StackUpgrade stackUpgrade = ambariManager.getClusters().get(0).initializeStackUpgrade("express");
        stackUpgrade.getLastPendingUpgradeItem();
    }

    @Test
    public void testGetVariousItems() throws Exception {
        StackUpgrade stackUpgrade = ambariManager.getClusters().get(0).initializeStackUpgrade("express");
        stackUpgrade.getCompletedUpgradeItem();
    }


    @Test
    public void testEndtoEndUpgrade() throws Exception {
        StackUpgrade stackUpgrade = ambariManager.getClusters().get(0).initializeStackUpgrade("express");

        //stackUpgrade.registerNewVersion("HDP-2.3.2.0", "2.3", "2.0", "redhat6", "http://public-repo-1.hortonworks.com/HDP/centos6/2.x/updates/2.3.2.0", "http://public-repo-1.hortonworks.com/HDP-UTILS-1.1.0.20/repos/centos6");
        //stackUpgrade.submitInstallPackageRequest("HDP", "2.3", "2.0");
        stackUpgrade.submitUpgrade();

        while(true) {
            String status = stackUpgrade.getLastUpgradeStatus().getUpgrade().getRequest_status();
            System.out.println("EU status:: " + status);
            logger.logInfo("EU status:: " + status);
            if(status.equalsIgnoreCase("COMPLETED"))
                break;
            Thread.sleep(60 * 1000);
        }

        System.out.println("EU complete");
        logger.logInfo("EU complete");
    }



    @Test
    public void testProceedAfterManualStep() throws Exception {
        StackUpgrade stackUpgrade = ambariManager.getClusters().get(0).initializeStackUpgrade("express");
        stackUpgrade.proceedUpgradeAfterManualVerification();
    }


    @Test
    public void testCommandLocalHost(){
    	LinuxCommandExecutor lex = new LinuxCommandExecutor("", "","" ,new String[] {"ls -l ~/Documents/ | grep ambari; cd ~/Downloads ;pwd; ls"});
    	String value = lex.executeCommandLocalHost(Types_Of_Data.OUTPUT, IGNORE_ERRORS.FALSE);
    	int exitCode = lex.getExitCode();
    	logger.logInfo(value);
    	logger.logInfo("Exit code: " + exitCode);
    }

    @Test
    public void testCommandRemotely(){
    LinuxCommandExecutor lex = new LinuxCommandExecutor("172.22.91.194", "root",new String[] {"ls -l | grep ambari"});
    String value = lex.executeCommandSequenceRemotely(Types_Of_Data.OUTPUT, IGNORE_ERRORS.FALSE);
    int exitCode = lex.getExitCode();
    logger.logInfo(value);
    logger.logInfo("Exit code: " +exitCode);
    }

    @Test
    public void testServiceState(){
        ArrayList<Service> serviceList = ambariManager.getClusters().get(0).getServices();

        for(int i = 0;i<serviceList.size();i++){
            System.out.println(serviceList.get(i).getName()+"\t"+serviceList.get(i).getState());
        }


    }

    @Test
    public void testHostComponentState(){
        ArrayList<Host> hostList = ambariManager.getClusters().get(0).getHosts();

        for(int i = 0;i<hostList.size();i++){
            ArrayList<HostComponent> hostComponentsList = hostList.get(i).getHostComponents();

            for(int j = 0;j<hostComponentsList.size();j++){
                System.out.println(hostList.get(i).getName()+"\t"+hostComponentsList.get(j).getName()+"\t"+hostComponentsList.get(j).getState());
            }
        }


    }

    @Test
    public void testAllServicesStarted(){
        if(ValidationUtils.isAllServiceStarted())
            System.out.println("All Servcies Started Successfully");
        else
            System.out.println("NOT All Services Started");
    }

    @Test
    public void testAllHostComponentsStarted(){
        if(ValidationUtils.isAllHostComponentStarted())
            System.out.println("All Host Components Started Successfully");
        else{
            System.out.println("NOT All Host Components Started");
            System.out.println(ValidationUtils.getFailedComponents());
        }

    }
}

