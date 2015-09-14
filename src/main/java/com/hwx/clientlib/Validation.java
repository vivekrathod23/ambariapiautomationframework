package com.hwx.clientlib;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ajain on 9/14/15.
 */
public class Validation {
    Map<String,String[]> validationMap = new HashMap<String, String[]>();

    public Validation(String key,String value){
        addEntry(key,value);
    }

    public Validation(String key, String[] values){
        addEntries(key,values);
    }

    public Validation(HashMap<String,String[]> map){
        addEntries(map);
    }

    public Validation(String[] keys, String[][] values){
        addEntries(keys,values);
    }

    public Map<String, String[]> getValidationMap() {
        return validationMap;
    }

    public void setValidationMap(Map<String, String[]> validationMap) {
        this.validationMap = validationMap;
    }

    public Map<String, String[]> addEntry(String key,String value){
        //Create a single entry in array
        String[] valueArray = new String[1];
        valueArray[0] = value;

        if(validationMap.containsKey(key)) {
            String[] existingValueArray = validationMap.get(key);
            int existingValueCount = existingValueArray.length;
            valueArray = new String[existingValueCount + 1];
            for (int i = 0; i < existingValueCount; i++)
                valueArray[i] = existingValueArray[i];

            valueArray[existingValueCount] = value;
        }

        //Update the key value pair
        validationMap.put(key,valueArray);

        return validationMap;
    }

    public Map<String, String[]> addEntries(String key, String[] values){
        for(int i=0;i<values.length;i++)
            addEntry(key, values[i]);

        return validationMap;
    }

    public Map<String, String[]> addEntries(String[] keys, String[][] values){
        //Put all the keys in validation map
        for(int i=0;i<keys.length;i++)
            addEntries(keys[i], values[i]);

        return validationMap;
    }

    public Map<String, String[]> addEntries(Map<String, String[]> validationMap){
        for (String key : validationMap.keySet()){
            addEntries(key, validationMap.get(key));
        }

        return validationMap;
    }
}
