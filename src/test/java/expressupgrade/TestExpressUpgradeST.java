package expressupgrade;

import com.hwx.ambariapilib.common.IDConstants;
import com.hwx.ambariapilib.json.upgrade.TasksJson;
import com.hwx.ambariapilib.service.ServiceComponent;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by vsharma on 11/18/15.
 */
public class TestExpressUpgradeST extends TestBaseUpgrade {

    @Test
    public void testEUwithSkipSlaveFailures() throws Exception {
        try {
            setEUOperationParams("false", "false", "true", "false", "false");

            String slaveFailureService = "HDFS";
            String slaveFailureComponent = "DATANODE";
            String serviceCheckFailureService = "YARN";
            String failedTaskCommand = "RESTART HDFS/DATANODE";
            String skipFailureMessage = "Verifying Skipped Failures";


            registerVersionAndInstallPackages();

            stackUpgrade.injectSlaveFailure(slaveFailureService, slaveFailureComponent);
            //stackUpgrade.injectServiceCheckFailure(serviceCheckFailureService);

            // Get slave related information
            ServiceComponent slaveComponent = stackUpgrade.getServiceComponent(slaveFailureService, slaveFailureComponent);
            int totalSlaves = slaveComponent.getServiceComponentDetailJson().getServiceComponentInfo().getTotal_count();

            stackUpgrade.submitExpressUpgradeTillSpecificManualStep(upgradeParams, skipFailureMessage);

            // Let the EU pause after "Verify Skipped Failure" stage for slave component

            // Validations start when EU reaches skipped failures phase for slave component
            List<TasksJson> failedTasks = stackUpgrade.getAllFailedTasks();

            Assert.assertEquals(failedTasks.size(), totalSlaves, "Error while checking the number of failed slave count");

            for (TasksJson task : failedTasks) {
                Assert.assertTrue(task.getTask().getCommand_detail().equalsIgnoreCase(failedTaskCommand), "Error while checking the failed slave information");
                Assert.assertTrue(task.getTask().getStderr().contains(IDConstants.TEST_SERVICE_COMPONENT_INJECTED_FAILURE), "Error while checking the failed slave information");
            }
            // Validations end when EU reaches skipped failures phase for slaves
            // Continue the EU

            stackUpgrade.proceedUpgradeAfterManualVerification();

            // Verification complete for slave failure, now fix the errors
            stackUpgrade.fixSlaveFailure(slaveFailureService, slaveFailureComponent);

            // Wait for EU to successfully complete
            try {
                stackUpgrade.waitforOperationCompletion(true);
            } catch (Exception e) {
                logger.logInfo("Upgrade failed as expected");
                stackUpgrade.pauseUpgrade();
                stackUpgrade.getServiceComponent(slaveFailureService, slaveFailureComponent).restart();
                stackUpgrade.resumeUpgrade();
            }
            stackUpgrade.waitforOperationCompletion(true);
            // pause upgrade

            // resume upgrade

            postUpgradeValidations();
        }
        finally {
            printUpgradeOutput();
        }
    }

    @Test
    public void testEUwithSkipServiceCheckFailures() throws Exception {
        try {
            setEUOperationParams("false", "false", "true", "false", "false");

            String slaveFailureService = "HDFS";
            String slaveFailureComponent = "DATANODE";
            String serviceCheckFailureService = "YARN";
            String failedTaskCommand = "SERVICE_CHECK YARN";
            String skipFailureMessage = "Verifying Skipped Failures";

            registerVersionAndInstallPackages();

            //stackUpgrade.injectSlaveFailure(slaveFailureService, slaveFailureComponent);
            stackUpgrade.injectServiceCheckFailure(serviceCheckFailureService);

            // Get slave related information
            //ServiceComponent slaveComponent = stackUpgrade.getSlaveComponent(slaveFailureService, slaveFailureComponent);
            //int totalSlaves = slaveComponent.getServiceComponentDetailJson().getServiceComponentInfo().getTotal_count();

            stackUpgrade.submitExpressUpgradeTillSpecificManualStep(upgradeParams, skipFailureMessage);

            // Let the EU pause after "Verify Skipped Failure" stage for slave component

            // Validations start when EU reaches skipped failures phase for slave component
            List<TasksJson> failedTasks = stackUpgrade.getAllFailedTasks();

            Assert.assertEquals(failedTasks.size(), 1, "Error while checking the number of failed tasks due to service check failures");

            for (TasksJson task : failedTasks) {
                Assert.assertTrue(task.getTask().getCommand_detail().equalsIgnoreCase(failedTaskCommand), "Error while checking the failed service check information");
                Assert.assertTrue(task.getTask().getStderr().contains(IDConstants.TEST_SERVICE_CHECK_INJECTED_FAILURE), "Error while checking the failed service check information");
            }
            // Validations end when EU reaches skipped failures phase for slaves
            // Continue the EU
            stackUpgrade.proceedUpgradeAfterManualVerification();

            // Verification complete for slave failure, now fix the errors
            stackUpgrade.fixServiceCheckFailure(serviceCheckFailureService);

            // Wait for EU to successfully complete
            stackUpgrade.waitforOperationCompletion(true);

            postUpgradeValidations();
        }
        finally {
            printUpgradeOutput();
        }
    }

}
