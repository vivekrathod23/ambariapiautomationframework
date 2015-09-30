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
	AMBARI_ADMIN_PASSWORD("ambari.admin.password");
	
	private final String key;

	ConfigProperties(String key) {
		this.key = key;
	}

	public String getKey() {
		return this.key;
	}

}
