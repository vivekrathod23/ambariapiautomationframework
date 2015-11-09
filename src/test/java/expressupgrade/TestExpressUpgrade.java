

package expressupgrade;

import com.hwx.ambariapilib.upgrade.StackUpgrade;
import common.TestBase;
import org.testng.annotations.Test;

/**
 * Created by vsharma on 11/8/15.
 */
public class TestExpressUpgrade extends TestBase{

    /**
     * Tests Express Upgrade from main to maint; major to major; main to major release depending on input passed
     * Validations:
     * Services are up, upgrade API status - COMPLETED, Database entries - show latest version
     * Components are up
     */
    @Test
    public void testBasicUpgrade() throws Exception {
        StackUpgrade stackUpgrade = ambariManager.getClusters().get(0).initializeStackUpgrade("express");

        //stackUpgrade.registerNewVersion("HDP-2.3.2.0", "2.3", "2.0", "redhat6", "http://public-repo-1.hortonworks.com/HDP/centos6/2.x/updates/2.3.2.0", "http://public-repo-1.hortonworks.com/HDP-UTILS-1.1.0.20/repos/centos6");
        stackUpgrade.registerNewVersion("HDP-2.2.9.0", "2.2", "9.0-3359", "suse11", "http://s3.amazonaws.com/dev.hortonworks.com/HDP/suse11sp3/2.x/BUILDS/2.2.9.0-3359/", "http://public-repo-1.hortonworks.com/HDP-UTILS-1.1.0.20/repos/suse11sp3/");

        try {
            //stackUpgrade.submitInstallPackageRequest("HDP", "2.3", "2.0");
            stackUpgrade.submitInstallPackageRequest("HDP", "2.2", "9.0-3359");
            Thread.sleep(1000 * 10);
        } catch (Exception e) {
            logger.logInfo("Retrying Install package operation once");
            try {
//                stackUpgrade.submitInstallPackageRequest("HDP", "2.3", "2.0");
                stackUpgrade.submitInstallPackageRequest("HDP", "2.2", "9.0-3359");
                Thread.sleep(1000 * 10);
            } catch (Exception e1) {
                try {
                    logger.logInfo("Retrying Install package operation one more time");
                    // stackUpgrade.submitInstallPackageRequest("HDP", "2.3", "2.0");
                    stackUpgrade.submitInstallPackageRequest("HDP", "2.2", "9.0-3359");
                    Thread.sleep(1000 * 10);
                } catch (Exception e2) {
                    e.printStackTrace();
                    throw e2;
                }
            }
        }

        //stackUpgrade.registerNewVersion("HDP-2.3.3.0", "2.3", "3.0", "redhat6", "http://public-repo-1.hortonworks.com/HDP/centos6/2.x/updates/2.3.3.0", "http://public-repo-1.hortonworks.com/HDP-UTILS-1.1.0.20/repos/centos6");
        //stackUpgrade.submitInstallPackageRequest("HDP", "2.3", "3.0");
        stackUpgrade.submitUpgrade();

        while(!stackUpgrade.isUpgradeComplete()) {
            logger.logInfo("Waiting for EU to complete");
            Thread.sleep(60 * 1000);
        }

        System.out.println("EU complete");
        logger.logInfo("EU complete");

        // valdiations
//        for (getHosts) {
//            command.lix()
//        }
        // verifyDbEntries()
    }




    /**
     * Tests Downgrade from main to maint; major to major; main to major release depending on input passed
     * This would trigger downgrade just before finalize operation
     */
    @Test(dependsOnMethods = { "testBasicUpgrade" })
    public void testBasicDowngrade() throws Exception {
        StackUpgrade stackUpgrade = ambariManager.getClusters().get(0).initializeStackUpgrade("express");

        //stackUpgrade.registerNewVersion("HDP-2.3.2.0", "2.3", "2.0", "redhat6", "http://public-repo-1.hortonworks.com/HDP/centos6/2.x/updates/2.3.2.0", "http://public-repo-1.hortonworks.com/HDP-UTILS-1.1.0.20/repos/centos6");
        // stackUpgrade.submitInstallPackageRequest("HDP", "2.3", "2.0");
        stackUpgrade.submitDowngrade();

        while(!stackUpgrade.isUpgradeComplete()) {
            logger.logInfo("Waiting for Downgrade to complete");
            Thread.sleep(60 * 1000);
        }

        System.out.println("Downgrade complete");
        logger.logInfo("Downgrade complete");

    }

    /**
     * Tests Express Upgrade from maint to maint to major like 2.2.8 to 2.2.9 to 2.3.0
     */
    @Test
    public void testMultilevelUpgrade() {

    }

    /**
     * Tests Express Upgrade after Ambari is upgraded. Specifically required for HDP 2.1 to 2.3 path
     */
    @Test
    public void testUpgradeAfterAmbariUpgrade() {

    }







}

