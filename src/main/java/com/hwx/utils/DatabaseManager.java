package com.hwx.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hwx.utils.config.ConfigProperties;

/**
 * Created by nkashyap on 25/09/15.
 */

public class DatabaseManager {
	
	 Connection connection = null;

	    public DatabaseManager(String drivers) {
	        if (drivers != null) System.setProperty(ConfigProperties.JDBC_DRIVERS.getKey(), drivers);

	    }

	    public boolean openConnection(String url, String username, String password) {
	        try {
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
	    public ResultSet executeQuery(String query) {
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
