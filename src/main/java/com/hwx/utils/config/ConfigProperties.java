package com.hwx.utils.config;

public enum ConfigProperties {

	CLUSTERNAME("cluster.name"), 
	SERVICENAME("service.name"), 
	HOST("host"), 
	PORT("port");

	private final String key;

	ConfigProperties(String key) {
		this.key = key;
	}

	public String getKey() {
		return this.key;
	}

}
