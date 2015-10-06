package com.hwx.utils;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.Map;

import java.util.Scanner;



public class FileUtils {

	

	static String fileSeparator = System.getProperty("file.separator");

	static String baseFilePath = System.getProperty("user.dir") + fileSeparator + "resources" + fileSeparator;

	

    public static String getFileContent(String fileName) {

        String content = null;

        if (new File(fileName).length()==0)

            return "";

        try {

            content = new Scanner(new File(fileName)).useDelimiter("\\Z").next();

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        }

        return content;

    }


    public static String getJsonAsString(String fileName, Map<String,String> m ) {

    	String content = getFileContent(baseFilePath + fileName);

    	

    	for(Map.Entry<String, String> entry : m.entrySet()){

    		String key = entry.getKey();

    		if(content.contains(key)){

    			content = content.replace(key, entry.getValue());

    		}

    	}

    			return content;    	

    }

}
