package com.hwx.utils;

import com.hwx.ambariapilib.common.Request;

/**
 * Created by ajain on 11/5/15.
 */
public class WaitUtil {


    public static final int timeOutInSec = 20000; //Integer.parseInt(ConfigProperties.TIMEOUT.getKey());


    //Wait for request to be completed
    public static void waitForRequestToBeCompleted(String clusterAPIUrl, int requestId){
        Request req = new Request(clusterAPIUrl+"/requests/"+requestId);

        int iteration = 1;
        int waitTime = 0;

        while((waitTime < timeOutInSec) && (! req.getRequestDetailJson().getRequests().getRequest_status().equals("COMPLETED"))){
            //Increase wait time linearly
            waitForIncreasingInterval(WaitTime.LONGWAIT,iteration);
            waitTime += WaitTime.LONGWAIT.getTime() * iteration;


            System.out.println("Wait for "+(WaitTime.LONGWAIT.getTime() * iteration)+"   Total Wait Time : "+waitTime);

            //Send the request again
            req = new Request(clusterAPIUrl+"/requests/"+requestId);
//            iteration *= 2;
        }

        if(waitTime >= timeOutInSec ){
            //Throw Timeout Exception
            //ToDo Define timeout exception
        }
    }

    //Wait for defined period
    public static void waitForFixedInterval(WaitTime waitTime){
        waitForFixedInterval(waitTime.getTime());
    }


    //Wait for fixed interval
    public static void waitForFixedInterval(int intervalInSec){
        try{
            //ToDo how to log this??
//            LogManager.getLoggerInstance().logInfo("Waiting for "+intervalInSec+" Seconds");
            Thread.sleep(intervalInSec*1000);
        }
        catch (Exception e){
//            LogManager.getLoggerInstance().logWarning("Issue while waiting : "+e.getMessage());
        }
    }


    //This function can be used where wait time need to be increased with iteration
    public static void waitForIncreasingInterval(WaitTime intervalInSec, int increase){
        waitForIncreasingInterval(intervalInSec.getTime(), increase);
    }

    //This function can be used where wait time need to be increased with iteration
    public static void waitForIncreasingInterval(int intervalInSec, int increase){
        waitForFixedInterval(intervalInSec*increase);
    }


}
