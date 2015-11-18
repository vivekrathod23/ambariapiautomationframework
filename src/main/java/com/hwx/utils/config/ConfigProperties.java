package com.hwx.utils.config;

/**
 * Created by nkashyap on 26/09/15.
 */
public enum ConfigProperties {

	CLUSTERNAME("cluster.name"), 
	SERVICENAME("service.name"), 
	HOST("host"), 
	PORT("port"),
	JDBC_DRIVERS("jdbc.drivers"),
	JDBC_URL_AMBARI("jdbc.url.ambari"),
	JDBC_USERNAME_AMBARI("jdbc.username.ambari"),
	JDBC_PASSOWRD_AMBARI("jdbc.password.ambari"),
	CONSOLE_LOGGING_ENABLED("console.logging.enabled"),
	LOGGING_LEVEL_MODE("logging.level.mode"),
	AMBARI_ADMIN_USER("ambari.admin.user"),
	AMBARI_ADMIN_PASSWORD("ambari.admin.password"),
	POLLING_COUNTER("polling.counter"),
	TIMEOUT("time.timeout"),
	OPENSTACK_KEY_PATH("openStack.keypair.path"),
	SECURITY("SECURITY"),
	WIREENCRYPTION("WIREENCRYPTION"),
	STACKNAME("STACKNAME"),
	STACKVERSION_TO_UPGRADE("STACKVERSION_TO_UPGRADE"),
	BUILDNUMBER_TO_UPGRADE("BUILDNUMBER_TO_UPGRADE"),
	OPERATING_SYSTEM("OPERATING_SYSTEM"),
	HDP_BASEURL("HDP_BASEURL"),
	HDPUTILS_BASEURL("HDPUTILS_BASEURL"),
	STACKVERSION_FOR_SECOND_LEVEL_UPGRADE("STACKVERSION_FOR_SECOND_LEVEL_UPGRADE"),
	BUILDNUMBER_FOR_SECOND_LEVEL_UPGRADE("BUILDNUMBER_FOR_SECOND_LEVEL_UPGRADE"),
	HDP_BASEURL_FOR_SECOND_LEVEL_UPGRADE("HDP_BASEURL_FOR_SECOND_LEVEL_UPGRADE"),
	HDPUTILS_BASEURL_FOR_SECOND_LEVEL_UPGRADE("HDPUTILS_BASEURL_FOR_SECOND_LEVEL_UPGRADE");

	private final String key;

	ConfigProperties(String key) {
		this.key = key;
	}

	public String getKey() {
		return this.key;
	}

}
