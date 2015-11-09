package com.hwx.utils;

import com.hwx.utils.config.ConfigManager;
import com.hwx.utils.config.ConfigProperties;

import java.sql.*;

/**
 * Created by nkashyap on 25/09/15.
 */

public class DatabaseManager {
	static Connection connection = null;
	protected static ConfigManager conf = ConfigManager.getInstance();


	public static boolean openConnection(String url, String username, String password) throws ClassNotFoundException, Exception {

		try {

			Class.forName(conf.getString(ConfigProperties.JDBC_DRIVERS.getKey()));
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection != null;
	}

	public void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * An instance of class that implements ResultSet must be closed.
	 *
	 */
	public static ResultSet executeQuery(String query) {
		if (connection == null) return null;
		ResultSet result = null;
		Statement stat;
		try {
			stat = connection.createStatement();
			result = stat.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}


}
