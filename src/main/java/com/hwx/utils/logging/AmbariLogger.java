package com.hwx.utils.logging;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.hwx.utils.config.ConfigManager;
import com.hwx.utils.config.ConfigProperties;

/**
 * Created by nkashyap on 28/09/15.
 */
public class AmbariLogger {

	static String baseFilePath = System.getProperty("user.dir") + System.getProperty("file.separator") + "logs" + System.getProperty("file.separator");
    protected static final String LOCATION=baseFilePath;
    protected static String LOGGER_NAME = "";
    protected final static int MAX_LOG_SIZE = 200000;
    protected final static int MAX_LOG_COUNT = 10;
    protected static Logger logger;
    protected static final String DATE_FORMAT = "hh:mm:ss a MM-dd-yyyy";
    private static AmbariLogger ambariLogger = null;
    
        
    private AmbariLogger(String className){
    	
   	 	Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        String timeStamp = sdf.format(cal.getTime());
        timeStamp = timeStamp.replace(" ", "");
        timeStamp = timeStamp.replace(":", "");
        LOGGER_NAME = className;
        createLogFile(LOCATION + System.getProperty("file.separator") + LOGGER_NAME + "_" + timeStamp + ".log", className);      
   }
       
    
    public static AmbariLogger getAmbariLoggerInstance(String className){
    	
    	if(null == ambariLogger){  		
    		ambariLogger = new AmbariLogger(className);        
    	}   	
    	return ambariLogger;
    }
    
    
        
    private static void createLogFile(String pathAndFile, String className){
    	
        try{
        	      	
        	 pathAndFile = pathAndFile.replace(".log",  "%g.log");
        	 FileHandler fh = new FileHandler(pathAndFile,MAX_LOG_SIZE, MAX_LOG_COUNT, false);
        	 
             fh.setFormatter(new SimpleLogFormatter());
             
             logger = Logger.getLogger(className);
             logger.addHandler(fh);
             
             if(ConfigManager.getInstance().getString(ConfigProperties.CONSOLE_LOGGING_ENABLED.getKey()).equalsIgnoreCase("true")){
            	 Handler consoleHandler = new ConsoleHandler();
            	 logger.addHandler(consoleHandler);
             }             
             logger.setUseParentHandlers(false);
             
             if(ConfigManager.getInstance().getString(ConfigProperties.LOGGING_LEVEL_MODE.getKey()).equalsIgnoreCase("INFO")){
            	 logger.setLevel(Level.INFO);
             }else{
            	 logger.setLevel(Level.ALL);
             }
            
            
        }
        catch(Exception e){
        	e.printStackTrace();
        }
    }
    
   
    private void log(Level loggingLevel, String message) {
            logger.log(loggingLevel, message);
    }
        

    public void logFine(String message){
            log(Level.FINE, message);
    }
    
    public void logInfo(String message){
        log(Level.INFO, message);
    }
    
    public void logWarning(String message){
        log(Level.WARNING, message);
    }

  
    public void logError(String message){
        log(Level.SEVERE, message);
    }
  
    

    public static void close(){
        if (logger != null) {
            System.out.println("Closing the logger:  '"+logger.getName()+"'.");
            for (Handler handler : logger.getHandlers()) {
                    handler.close();
            }
        }
    }
}

