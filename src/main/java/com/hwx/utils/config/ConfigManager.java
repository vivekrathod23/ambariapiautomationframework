package com.hwx.utils.config;

import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * Created by nkashyap on 24/09/15.
 */
public class ConfigManager {

	private static ConfigManager configManager ;
	PropertiesConfiguration defaultConfig = null;
	PropertiesConfiguration overrideConfig = null;
	CompositeConfiguration config = new CompositeConfiguration();
	String fileSeparator = System.getProperty("file.separator");
	String baseFilePath = System.getProperty("user.dir") + fileSeparator + "src/resources" + fileSeparator;

	private ConfigManager() {

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
			
			e.printStackTrace();
		}

	}
	
	/**
	 * 
	 * @return
	 */
	public static ConfigManager getInstance() {
		
		 if (configManager == null) {
			 
		      synchronized (ConfigManager.class) {
		    	  
		    	  if (configManager == null) {
		    		  configManager = new ConfigManager();
		    	  }
		      }
		      
		 }
		    return configManager;
	}
	
	
	/**
	 * Get String property value
	 * @param key
	 * @return
	 * @throws Exception 
	 */
	public String getString(String key) throws Exception {
		return config.getString(key);
	}

	
	/**
	 * Get Int property value
	 * @param key
	 * @return
	 * @throws Exception 
	 */
	public int getInt(String key) throws Exception {
		return config.getInt(key);
	}
	
	
	/**
	 * Sets property value of default configuration fields
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
	 * Sets value of user defined config fields
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
