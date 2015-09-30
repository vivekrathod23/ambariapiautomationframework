package com.hwx.utils.logging;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class SimpleLogFormatter extends SimpleFormatter {
	
    private static final String DATE_FORMAT = "hh:mm:ss a MM-dd-yyyy";

    public String format(LogRecord record){
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
            return sdf.format(cal.getTime())+ " " + record.getLoggerName()+" "
            		+record.getLevel()+" - "+record.getMessage()+System.getProperty("line.separator");
    }
    

}
