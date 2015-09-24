package com.hwx.utils.config;

import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class ConfigManager {

	PropertiesConfiguration defaultConfig = null;
	PropertiesConfiguration overrideConfig = null;
	CompositeConfiguration config = new CompositeConfiguration();
	String fileSeparator = System.getProperty("file.separator");
	String baseFilePath = System.getProperty("user.dir") + fileSeparator + "resources" + fileSeparator;

	public ConfigManager() {

		try {
			// read default
			String defaultConfigFilePath = baseFilePath + "default.properties";
			System.out.println("Default config : " + defaultConfigFilePath);

			// read user defined settings
			String overrideConfigFilePath = baseFilePath + "config.properties";
			System.out.println("overrideConfigFilePath config : " + overrideConfigFilePath);

			overrideConfig = new PropertiesConfiguration(overrideConfigFilePath);
			defaultConfig = new PropertiesConfiguration(defaultConfigFilePath);

			overrideConfig.setAutoSave(true);
			defaultConfig.setAutoSave(true);

			config.addConfiguration(overrideConfig);
			config.addConfiguration(defaultConfig);

		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getStringProperty(String key) {
		return config.getString(key);
	}

	public int getIntProperty(String key) {
		return config.getInt(key);
	}

	/**
	 * Sets property value of default configuration properties file
	 * @param key
	 * @param value
	 */
	public void setPropertyDefault(String key, Object value) {

		try {

			if (defaultConfig.containsKey(key)) {

				defaultConfig.setProperty(key, value);
				defaultConfig.save();
			}

		} catch (ConfigurationException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Sets property value of user defined config files
	 * @param key
	 * @param value
	 */
	public void setPropertyUserConfig(String key, Object value) {

		try {

			if (overrideConfig.containsKey(key)) {

				overrideConfig.setProperty(key, value);
				overrideConfig.save();
			}

		} catch (ConfigurationException e) {
			e.printStackTrace();
		}

	}

}
