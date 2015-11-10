package com.hwx.utils.validation;

import com.hwx.ambariapilib.AmbariManager;
import com.hwx.ambariapilib.cluster.Cluster;
import com.hwx.ambariapilib.host.Host;
import com.hwx.ambariapilib.host.HostComponent;
import com.hwx.ambariapilib.service.Service;
import com.hwx.clientlib.http.HTTPResponse;

import java.util.ArrayList;

/**
 * Created by ajain on 11/5/15.
 */
public class ValidationUtils {

    private static AmbariManager ambariManager;
    private static Cluster cluster;

    static {
        ambariManager = new AmbariManager();
        cluster = ambariManager.getClusters().get(0);
    }

  public static boolean validateResponseCode(HTTPResponse response, int... responseCodeList){
    for(int responseCode : responseCodeList)
      if(response.getStatusCode() == responseCode)
        return true;

    return false;
  }

  //Check for all the services
  public static boolean isAllServiceStarted(){
     ArrayList<Service> serviceList = cluster.getServices();

      for(int i=0;i<serviceList.size();i++){
          //Check status for each service
          Service service = serviceList.get(i);
          if(! service.isStarted())
              return false;
      }

      return true;
  }

    //Get the failed serv ice list
    public static  ArrayList<Service> getFailedServices(){
        ArrayList<Service> serviceList = cluster.getServices();
        ArrayList<Service> failedServiceList = new ArrayList<Service>();

        for(int i=0;i<serviceList.size();i++){
            //Check status for each service
            Service service = serviceList.get(i);
            if(! service.isStarted())
                failedServiceList.add(service);
        }

        return failedServiceList;
    }

    //Check for all host component status
    public static boolean isAllHostComponentStarted(){
        ArrayList<Host> hostList = cluster.getHosts();

        for(int i=0;i<hostList.size();i++){
            Host host = hostList.get(i);
            ArrayList<HostComponent> hostComponentList = host.getHostComponents();

            for(int j=0;j<hostComponentList.size();j++){
                HostComponent hostComponent = hostComponentList.get(j);

                if(! hostComponent.isStarted())
                    return false;
            }
        }
        return true;
    }

    //Get all failed host components
    public static ArrayList<HostComponent>  getFailedComponents(){
        ArrayList<HostComponent> failedHostComponentList = new ArrayList<HostComponent>();
        ArrayList<Host> hostList = cluster.getHosts();

        for(int i=0;i<hostList.size();i++){
            Host host = hostList.get(i);
            ArrayList<HostComponent> hostComponentList = host.getHostComponents();

            for(int j=0;j<hostComponentList.size();j++){
                HostComponent hostComponent = hostComponentList.get(j);

                if(! hostComponent.isStarted())
                    failedHostComponentList.add(hostComponent);
            }
        }

        return failedHostComponentList;
    }

}
