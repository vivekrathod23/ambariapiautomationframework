package com.hwx.ambariapilib;

import com.google.gson.Gson;
import com.hwx.clientlib.AuthType;
import com.hwx.clientlib.RestAPIClient;
import com.hwx.clientlib.RestAPIClientFactory;
import com.hwx.clientlib.RestAPIClientType;
import com.hwx.utils.config.ConfigManager;
import com.hwx.utils.config.ConfigProperties;
import com.hwx.utils.logging.LogManager;

/**
 * Created by ajain on 9/28/15.
 */
public abstract class AmbariItems {

	protected static RestAPIClient rc = RestAPIClientFactory.getAPIClient(RestAPIClientType.RESTASSURED);
	protected LogManager logger = LogManager.getLoggerInstance(AmbariItems.class.getSimpleName());
	protected ConfigManager conf = ConfigManager.getInstance();
	protected Gson gson = new Gson();

	public AmbariItems() {
		try {
			rc.setHost(conf.getString(ConfigProperties.HOST.getKey()));
			rc.setPort(conf.getInt(ConfigProperties.PORT.getKey()));
			rc.setAuth(AuthType.BASIC);
		} catch (Exception e) {
			logger.logError(e.getStackTrace().toString());
		}
	}
}
