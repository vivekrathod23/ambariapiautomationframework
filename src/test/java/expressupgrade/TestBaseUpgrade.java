package expressupgrade;

import com.hwx.ambariapilib.common.IDConstants;
import com.hwx.ambariapilib.host.HostComponent;
import com.hwx.ambariapilib.service.Service;
import com.hwx.ambariapilib.upgrade.StackUpgrade;
import com.hwx.ambariapilib.upgrade.UpgradeParams;
import com.hwx.utils.WaitUtil;
import com.hwx.utils.validation.ValidationUtils;
import common.TestBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsharma on 11/18/15.
 */
public class TestBaseUpgrade extends TestBase {

    protected StackUpgrade stackUpgrade;
    protected UpgradeParams upgradeParams = new UpgradeParams();

    protected void postUpgradeValidations() throws Exception {
        String SERVICE_CHECK = "Service Checks";
        String HOST_COMPONENT_CHECK = "Host Component Checks";
        String DB_CHECK = "Database Checks";
        String HDP_SELECT_CHECK = "HDP Command Checks";
        String SYM_LINK_CHECK = "Symlink Checks";
        String ALERTS_CHECK = "Alerts Checks";

        Map<String,Boolean> validations= new HashMap<String, Boolean>();

        validations.put(SERVICE_CHECK, false);
        validations.put(HOST_COMPONENT_CHECK, false);

        if(ValidationUtils.isAllServiceStarted())
            validations.put(SERVICE_CHECK, true);
        else {
            logger.logInfo("List of failed service(s)");
            ArrayList<Service> failedServices = ValidationUtils.getFailedServices();
            for (Service service : failedServices)
                logger.logInfo(service.getName());

        }

        if(ValidationUtils.isAllHostComponentStarted())
            validations.put(HOST_COMPONENT_CHECK,true);
        else {
            logger.logInfo("List of failed component(s)");
            ArrayList<HostComponent> failedComponentns = ValidationUtils.getFailedComponents();
            for (HostComponent component : failedComponentns)
                logger.logInfo(component.getName());
        }

        boolean isValidationFailed = false;
        for(String validation : validations.keySet()) {
            boolean status = validations.get(validation);
            logger.logInfo(validation + " : " + status);

            if(!status)
                isValidationFailed = true;
        }

        if(isValidationFailed) {
            logger.logError("Observed one or more errors as part of post upgrade validations - see output above");
            throw new Exception("Observed one or more errors as part of post upgrade validations");
        }

    }

    protected void registerVersionAndInstallPackages() throws Exception {
        stackUpgrade.registerNewVersion(upgradeParams.getStackName() + "-" + upgradeParams.getStackVersion() + "." + upgradeParams.getBuildNumber(),
                upgradeParams.getStackVersion(), upgradeParams.getBuildNumber(), upgradeParams.getOperatingSystem(), upgradeParams.getHdpBaseUrl(), upgradeParams.getHdpUtilsBaseUrl());

        for (int i=1; i<= IDConstants.INSTALL_PACKAGE_RETRY_COUNT ; i++) {
            boolean installSuccess = false;
            try {
                stackUpgrade.submitInstallPackageRequest(upgradeParams.getStackName(), upgradeParams.getStackVersion(), upgradeParams.getBuildNumber());
                WaitUtil.waitForFixedInterval(10);
                installSuccess = true;
            } catch (Exception e) {
                logger.logInfo("Retrying Install package " + i + " time");
            }
            if (installSuccess)
                break;
        }
    }

    /**
     * Prints output of Upgrade/Downgrade operation
     */
    protected void printUpgradeOutput() throws Exception {
        stackUpgrade.printEntireUpgradeOutput();
    }

    protected void setEUOperationParams(String skipServiceCheckFailure, String skipSlaveFailures, String skipPrerequisiteChecks, String failOnCheckWarnings, String skipManualVerification) {
        upgradeParams.setSkipServiceCheckFailure(skipServiceCheckFailure);
        upgradeParams.setSkipSlaveFailures(skipSlaveFailures);
        upgradeParams.setSkipPrerequisiteChecks(skipPrerequisiteChecks);
        upgradeParams.setFailOnCheckWarnings(failOnCheckWarnings);
        upgradeParams.setSkipManualVerification(skipManualVerification);
    }

    protected void setEUBuildParams(String stackName, String stackVersion, String buildNumber, String os, String hdpurl, String hdpUtilsurl) {
        upgradeParams.setStackName(stackName);
        upgradeParams.setStackVersion(stackVersion);
        upgradeParams.setBuildNumber(buildNumber);
        upgradeParams.setOperatingSystem(os);
        upgradeParams.setHdpBaseUrl(hdpurl);
        upgradeParams.setHdpUtilsBaseUrl(hdpUtilsurl);
    }
}
