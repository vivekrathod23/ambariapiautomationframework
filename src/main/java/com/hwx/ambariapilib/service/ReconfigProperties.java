package com.hwx.ambariapilib.service;

/**
 * Created by vrathod on 11/25/15.
 */

import com.hwx.ambariapilib.AmbariItems;
import com.hwx.ambariapilib.AmbariManager;
import com.hwx.ambariapilib.cluster.Cluster;
import com.hwx.ambariapilib.host.Host;
import com.hwx.ambariapilib.json.ConfigProperties.*;
import com.hwx.ambariapilib.json.service.Configs.Desired;
import com.hwx.ambariapilib.json.service.DesiredConfigs;
import com.hwx.clientlib.AuthType;
import com.hwx.clientlib.RestAPIClient;
import com.hwx.clientlib.RestAPIClientFactory;
import com.hwx.clientlib.RestAPIClientType;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;
import com.hwx.utils.config.ConfigProperties;

import java.util.ArrayList;
import java.util.HashMap;

public class ReconfigProperties extends AmbariItems {
    AmbariManager ambariManager = new AmbariManager();
    ArrayList<Host> hosts = ((Cluster)this.ambariManager.getClusters().get(0)).getHosts();
    ArrayList<Service> services = ((Cluster)this.ambariManager.getClusters().get(0)).getServices();
    // protected Gson gson = new Gson();
   // protected static RestAPIClient rc = RestAPIClientFactory.getAPIClient(RestAPIClientType.RESTASSURED);
    //public static Map<String, HashSet<ServiceProperty>> serviceProperties = new HashMap<String, HashSet<ServiceProperty>>();
    public ArrayList<ServiceProperties> serviceProperties = new ArrayList<ServiceProperties>();
    public DesiredConfigs desiredConfigs = new DesiredConfigs();
    public String clusterName = ambariManager.getClusters().get(0).getClusterJson().getClusters().getCluster_name();
    public ArrayList<ServiceProperties> newServicePropertiesValues = new ArrayList<ServiceProperties>();
    public void setServicePropertiesToBeModified()
    {
        ServiceProperties SP = new ServiceProperties();
//properties for core-site
        HashMap<String,Property> properties= new HashMap<String,Property>();
        HashMap<String,Property> properties2= new HashMap<String,Property>();
        Property p2 = new Property();
        p2.setPropertyName("ipc.client.connect.max.retries");
        p2.setPropertyValue("X");
        ServiceProperties SPnew = new ServiceProperties();
        properties2.put("ipc.client.connect.max.retries",p2);
        SPnew.setFileName("core-site");
        SPnew.setProperties(properties2);
        newServicePropertiesValues.add(SPnew);
        Property p = new Property();
        p.setPropertyName("ipc.client.connect.max.retries");
        p.setPropertyValue("X");

        properties.put("ipc.client.connect.max.retries",p);

        SP.setFileName("core-site");
        SP.setProperties(properties);
        serviceProperties.add(SP);


//properties for hdfs-site . 1 custom property remaining
        ServiceProperties SP2 = new ServiceProperties();
        properties.clear();
        properties2.clear();
        p2.setPropertyName("dfs.replication.max");
        p2.setPropertyValue("45");
        ServiceProperties SPnew2 = new ServiceProperties();
        properties2.put("dfs.replication.max",p2);
        SPnew2.setFileName("hdfs-site");
        SPnew2.setProperties(properties2);
        newServicePropertiesValues.add(SPnew2);
        p.setPropertyName("dfs.replication.max");
        p.setPropertyValue("X");
        properties.put("dfs.replication.max",p);
        SP2.setFileName("hdfs-site");
        SP2.setProperties(properties);
        serviceProperties.add(SP2);

//properties for ssl-server
        ServiceProperties SP3 = new ServiceProperties();
        properties.clear();
        properties2.clear();
        p2.setPropertyName("ssl.server.truststore.reload.interval");
        p2.setPropertyValue("11000");
        ServiceProperties SPnew3 = new ServiceProperties();
        properties2.put("ssl.server.truststore.reload.interval",p2);
        SPnew3.setFileName("ssl-server");
        SPnew3.setProperties(properties2);
        newServicePropertiesValues.add(SPnew3);
        p.setPropertyName("ssl.server.truststore.reload.interval");
        p.setPropertyValue("X");
        properties.put("ssl.server.truststore.reload.interval",p);
        SP3.setFileName("ssl-server");
        SP3.setProperties(properties);
        serviceProperties.add(SP3);

//properties for mapred-site.xml. One custom property remaining
        ServiceProperties SP4 = new ServiceProperties();
        properties.clear();
        properties2.clear();
        p2.setPropertyName("mapreduce.am.max-attempts");
        p2.setPropertyValue("3");
        ServiceProperties SPnew4 = new ServiceProperties();
        properties2.put("mapreduce.am.max-attempts",p2);
        SPnew4.setFileName("mapred-site");
        SPnew4.setProperties(properties2);
        newServicePropertiesValues.add(SPnew4);
        p.setPropertyName("mapreduce.am.max-attempts");
        p.setPropertyValue("X");
        properties.put("mapreduce.am.max-attempts",p);
        SP4.setFileName("mapred-site");
        SP4.setProperties(properties);
        serviceProperties.add(SP4);

//properties for yarn-site.xml. One custom property remaining
        ServiceProperties SP5 = new ServiceProperties();
        properties.clear();
        properties2.clear();
        p2.setPropertyName("yarn.nodemanager.disk-health-checker.max-disk-utilization-per-disk-percentage");
        p2.setPropertyValue("95");
        ServiceProperties SPnew5 = new ServiceProperties();
        properties2.put("yarn.nodemanager.disk-health-checker.max-disk-utilization-per-disk-percentage",p2);
        SPnew5.setFileName("yarn-site");
        SPnew5.setProperties(properties2);
        newServicePropertiesValues.add(SPnew5);
        p.setPropertyName("yarn.nodemanager.disk-health-checker.max-disk-utilization-per-disk-percentage");
        p.setPropertyValue("X");
        properties.put("yarn.nodemanager.disk-health-checker.max-disk-utilization-per-disk-percentage",p);
        SP5.setFileName("yarn-site");
        SP5.setProperties(properties);
        serviceProperties.add(SP5);

//properties for zoo.cfg. Two custom property remaining
        properties.clear();
        properties2.clear();
        p2.setPropertyName("autopurge.purgeInterval");
        p2.setPropertyValue("25");
        ServiceProperties SPnew6 = new ServiceProperties();
        properties2.put("autopurge.purgeInterval",p2);
        SPnew6.setFileName("zoo.cfg");
        SPnew6.setProperties(properties2);
        newServicePropertiesValues.add(SPnew6);
        ServiceProperties SP6 = new ServiceProperties();
        p.setPropertyName("autopurge.purgeInterval");
        p.setPropertyValue("X");
        properties.put("autopurge.purgeInterval",p);
        SP6.setFileName("zoo.cfg");
        SP6.setProperties(properties);
        serviceProperties.add(SP6);

    }



    public void readPropertiesAndStoreValues() throws Exception {


    for(ServiceProperties sp : serviceProperties)
    {
        String file = sp.getFileName();

        String tag = getTags(file).trim();
  //    cl1/configurations?type=core-site&tag=version1448408000030
        String url = ambariManager.getClusters().get(0).getClusterJson().getHref();
        //String url2 ="/"+clusterName;
        String url2="/configurations?type=";
        url2+=file;
        url2+="&tag=";
        //url2+="version1448408000030";
        url2+=tag;
      //  String url="curl -u admin:admin -X GET http://192.168.64.101:8080/api/v1/clusters/";
        //url+=clusterName;
        //url+="/configurations?type=";
        //url+=file;
        //url+="&tag=";
       // url+=tag+"'";
        System.out.println("*"+url+url2);
        String apiurl = url+url2;

        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, apiurl);

        //HTTPRequest req = new HTTPRequest(HTTPMethods.GET, url);
        RestAPIClient rc1 = RestAPIClientFactory.getAPIClient(RestAPIClientType.RESTASSURED);
        rc1.setHost(conf.getString(ConfigProperties.HOST.getKey()));
        rc1.setPort(conf.getInt(ConfigProperties.PORT.getKey()));
        rc1.setAuth(AuthType.BASIC);
        HTTPResponse resp = rc1.sendHTTPRequest(req);
        if(file.equals("core-site"))
        {
            CoreSiteConfigHead requestJson = gson.fromJson(resp.getBody().getBodyText(), CoreSiteConfigHead.class);
            HashMap<String,Property> properties = sp.getProperties();
            String value = requestJson.getItems()[0].getProperties().getIpcClientConnectMaxRetries().toString();
           Property p= new Property();
            p.setPropertyName("ipc.client.connect.max.retries");
            p.setPropertyValue(value);
            properties.clear();
            properties.put("ipc.client.connect.max.retries",p);
            sp.setProperties(properties);
            System.out.println(sp.getProperties().get("ipc.client.connect.max.retries").getPropertyValue().toString());
            //properties.
        }
        else if(file.equals("hdfs-site"))
        {
            HdfsSiteConfigHead requestJson = gson.fromJson(resp.getBody().getBodyText(), HdfsSiteConfigHead.class);
            HashMap<String,Property> properties = sp.getProperties();
            String value = requestJson.getItems()[0].getProperties().getDfsReplicationMax().toString();
            Property p= new Property();
            p.setPropertyName("dfs.replication.max");
            p.setPropertyValue(value);
            properties.clear();
            properties.put("dfs.replication.max",p);
            sp.setProperties(properties);
            System.out.println("**"+sp.getProperties().get("dfs.replication.max").getPropertyValue().toString());

        }
        else if(file.equals("ssl-server"))
        {
            SslServerConfigHead requestJson = gson.fromJson(resp.getBody().getBodyText(), SslServerConfigHead.class);
            HashMap<String,Property> properties = sp.getProperties();
            String value = requestJson.getItems()[0].getProperties().getSslServerTruststoreReloadInterval().toString();
            Property p= new Property();
            p.setPropertyName("ssl.server.truststore.reload.interval");
            p.setPropertyValue(value);
            properties.clear();
            properties.put("ssl.server.truststore.reload.interval",p);
            sp.setProperties(properties);
            System.out.println("***"+sp.getProperties().get("ssl.server.truststore.reload.interval").getPropertyValue().toString());

        }
        else if(file.equals("mapred-site"))
        {
            MapredSiteConfigHead requestJson = gson.fromJson(resp.getBody().getBodyText(), MapredSiteConfigHead.class);
            HashMap<String,Property> properties = sp.getProperties();
            String value = requestJson.getItems()[0].getProperties().getMapreduceAmMaxAttempts().toString();
            Property p= new Property();
            p.setPropertyName("mapreduce.am.max-attempts");
            p.setPropertyValue(value);
            properties.clear();
            properties.put("mapreduce.am.max-attempts",p);
            sp.setProperties(properties);
            System.out.println("****"+sp.getProperties().get("mapreduce.am.max-attempts").getPropertyValue().toString());

        }
        else if(file.equals("zoo.cfg"))
        {
            ZooCfgConfigHead requestJson = gson.fromJson(resp.getBody().getBodyText(), ZooCfgConfigHead.class);
            HashMap<String,Property> properties = sp.getProperties();
            String value = requestJson.getItems()[0].getProperties().getAutopurgePurgeInterval().toString();
            Property p= new Property();
            p.setPropertyName("autopurge.purgeInterval");
            p.setPropertyValue(value);
            properties.clear();
            properties.put("autopurge.purgeInterval",p);
            sp.setProperties(properties);
            System.out.println("*****"+sp.getProperties().get("autopurge.purgeInterval").getPropertyValue().toString());

        }
        else if(file.equals("yarn-site"))
        {
            YarnSiteConfigHead requestJson = gson.fromJson(resp.getBody().getBodyText(), YarnSiteConfigHead.class);
            HashMap<String,Property> properties = sp.getProperties();
            String value = requestJson.getItems()[0].getProperties().getYarnNodemanagerDiskHealthCheckerMaxDiskUtilizationPerDiskPercentage().toString();
            Property p= new Property();
            p.setPropertyName("yarn.nodemanager.disk-health-checker.max-disk-utilization-per-disk-percentage");
            p.setPropertyValue(value);
            properties.clear();
            properties.put("yarn.nodemanager.disk-health-checker.max-disk-utilization-per-disk-percentage",p);
            sp.setProperties(properties);
            System.out.println("*****"+sp.getProperties().get("yarn.nodemanager.disk-health-checker.max-disk-utilization-per-disk-percentage").getPropertyValue().toString());

        }


    }








    }

public String getTags(String file)
{
    String tag="";
    //[Note: have to get the host address from config.properties]
   // String url = "curl -u admin:admin -X GET http://192.168.64.101:8080/api/v1/clusters/";//cl1?fields=Clusters/desired_configs";
    String url;
    url = ambariManager.getClusters().get(0).getClusterJson().getHref();
   // String url2 ="/"+clusterName;
    String url2="?fields=Clusters/desired_configs";
    System.out.println("**"+url+url2);
    HTTPRequest req = new HTTPRequest(HTTPMethods.GET, url+url2);

    //url+=clusterName;
    //url+="?fields=Clusters/desired_configs";

   // HTTPRequest req = new HTTPRequest(HTTPMethods.GET, url);
    HTTPResponse resp = rc.sendHTTPRequest(req);
    //desiredConfigs = gson.fromJson(resp.getBody().getBodyText(), DesiredConfigs.class);
    Desired requestJson = gson.fromJson(resp.getBody().getBodyText(), Desired.class);

    if(file.equals("core-site"))
    {
        return requestJson.getClusters().getDesiredConfigs().getCoreSite().getTag().toString();
    }
    else if(file.equals("hdfs-site"))
    {
        return requestJson.getClusters().getDesiredConfigs().getHdfsSite().getTag().toString();
    }
    else if(file.equals("ssl-server"))
    {
        return requestJson.getClusters().getDesiredConfigs().getSslServer().getTag().toString();
    }
    else if(file.equals("mapred-site"))
    {
         return requestJson.getClusters().getDesiredConfigs().getMapredSite().getTag().toString();
    }
    else if(file.equals("yarn-site"))
    {
        return requestJson.getClusters().getDesiredConfigs().getYarnSite().getTag().toString();
    }
    else if(file.equals("zoo.cfg"))
    {
        return requestJson.getClusters().getDesiredConfigs().getZooCfg().getTag().toString();
    }

    return tag;
}


public void CheckIfModifiedPropertiesExistAfterUpgrade() throws Exception {
    //read the required configuraiton properties and store them in serviceProperties
    readPropertiesAndStoreValues();


    for(ServiceProperties sp : serviceProperties)
    {
            HashMap<String,Property> properties = new HashMap<String,Property>();
            HashMap<String,Property> newproperties = new HashMap<String,Property>();

            properties= sp.getProperties();
            for(ServiceProperties newSP : newServicePropertiesValues)
            {
                if(newSP.getFileName().equals(sp.getFileName()))
                {
                    newproperties = newSP.getProperties();
                    CompareProperties(properties,newproperties);
                }
                else
                {
                  System.out.println("No properties found for: "+sp.getFileName());
                }
            }



    }


}

    private void CompareProperties(HashMap<String, Property> properties, HashMap<String, Property> newproperties)
    {
        for(String key: properties.keySet())
        {
            if(!properties.get(key).getPropertyValue().equals(newproperties.get(key).getPropertyValue().toString()))
            {
                System.out.println("Could not find the modified value for: "+properties.get(key).getPropertyName());
                System.out.println("Expected value: "+ newproperties.get(key).getPropertyValue()+", Actual Value: "+properties.get(key).getPropertyValue() );
            }
        }

    }


    public void ModifyConfigs() {
        //HTTPRequest req = new HTTPRequest(HTTPMethods.PUT, "/clusters/" + clusterName + "/services/" + serviceName);
        //req.setBody(new HTTPBody(requestBody));
        //String requestBody = FileUtils.getJsonAsString("Service.json", map);
        //HTTPResponse resp = rc.sendHTTPRequest(req);
    }

    private void reconfigureZookeeper(Service service) {
    }

    private void reconfigureYarn() {
    }

    private void reconfigureMapreduce2() {
    }
/*
    private void reconfigureHDFS(HashSet<ServiceProperty> properties) {

        for(ServiceProperty property:properties)
        {
            reconfig(property);
        }
    }

    HashSet<ServiceProperty> getHDFSPropertiesToBeReconfigured() {
        HashSet<ServiceProperty> properties = new HashSet<ServiceProperty>();
        ServiceProperty property = new ServiceProperty();
        property.setPropertyName("ipc.client.connect.max.retries");
        property.setPropertyFileName("core-site.xml");
        property.setPropertyFileLocation("/etc/hadoop/conf");
        property.setPropertyValue("45");
        property.setOldPropertyValue("50");
        properties.add(property);
        ServiceProperty property2 = new ServiceProperty();
        property2.setPropertyName("dfs.replication.max");
        property2.setPropertyFileName("hdfs-site.xml");
        property2.setPropertyFileLocation("/etc/hadoop/conf");
        property2.setPropertyValue("45");
        property2.setOldPropertyValue("50");
        properties.add(property2);
        ServiceProperty property3 = new ServiceProperty();
        property3.setPropertyName("ssl.server.truststore.reload.interval");
        property3.setPropertyFileName("ssl-server.xml");
        property3.setPropertyFileLocation("/etc/hadoop/conf");
        property3.setPropertyValue("11000");
        property3.setOldPropertyValue("10000");
        properties.add(property3);
        ServiceProperty property4 = new ServiceProperty();
        property4.setPropertyName("test-property");
        property4.setPropertyFileName("hdfs-site.xml");
        property4.setPropertyFileLocation("/etc/hadoop/conf");
        property4.setPropertyValue("12");
        property4.setOldPropertyValue("custom");
        properties.add(property4);
        return properties;
    }

    HashSet<ServiceProperty> getYARNPropertiesToBeReconfigured() {
        HashSet<ServiceProperty> properties = new HashSet<ServiceProperty>();
        ServiceProperty property = new ServiceProperty();
        property.setPropertyName("yarn.nodemanager.disk-health-checker.max-disk-utilization-per-disk-percentage");
        property.setPropertyFileName("yarn-site.xml");
        property.setPropertyFileLocation("/etc/hadoop/conf");
        property.setPropertyValue("95");
        property.setOldPropertyValue("90");
        properties.add(property);
        ServiceProperty property2 = new ServiceProperty();
        property2.setPropertyName("test-yarn");
        property2.setPropertyFileName("yarn-site.xml");
        property2.setPropertyFileLocation("/etc/hadoop/conf");
        property2.setPropertyValue("yarn");
        property2.setOldPropertyValue("custom");
        properties.add(property2);
        return properties;
    }

    HashSet<ServiceProperty> getMapReduce2PropertiesToBeReconfigured() {
        HashSet<ServiceProperty> properties = new HashSet<ServiceProperty>();
        ServiceProperty property = new ServiceProperty();
        property.setPropertyName("mapreduce.am.max-attempts");
        property.setPropertyFileName("mapred-site.xml");
        property.setPropertyFileLocation("/etc/hadoop/conf");
        property.setPropertyValue("3");
        property.setOldPropertyValue("2");
        properties.add(property);
        ServiceProperty property2 = new ServiceProperty();
        property2.setPropertyName("test-property");
        property2.setPropertyFileName("mapred-site.xml");
        property2.setPropertyFileLocation("/etc/hadoop/conf");
        property2.setPropertyValue("21");
        property2.setOldPropertyValue("custom");
        properties.add(property2);
        ServiceProperty property3 = new ServiceProperty();
        property3.setPropertyName("TEST_VAL");
        property3.setPropertyFileName("mapred-env.sh");
        property3.setPropertyFileLocation("/etc/hadoop/conf");
        property3.setPropertyValue("VAL");
        property3.setOldPropertyValue("custom");
        properties.add(property3);
        return properties;
    }

    HashSet<ServiceProperty> getZookeeperPropertiesToBeReconfigured() {
        HashSet<ServiceProperty> properties = new HashSet<ServiceProperty>();
        ServiceProperty property = new ServiceProperty();
        property.setPropertyFileName("zoo.cfg");
        property.setPropertyFileLocation("/etc/zookeeper/conf");
        property.setPropertyValue("25");
        property.setOldPropertyValue("24");
        properties.add(property);
        ServiceProperty property2 = new ServiceProperty();
        property2.setPropertyName("test-zoo");
        property2.setPropertyFileName("zoo.cfg");
        property2.setPropertyFileLocation("/etc/zookeeper/conf");
        property2.setPropertyValue("zookeeper");
        property2.setOldPropertyValue("custom");
        properties.add(property2);
        ServiceProperty property3 = new ServiceProperty();
        property3.setPropertyName("TEST_ZK");
        property3.setPropertyFileName("zookeeper-env.sh");
        property3.setPropertyFileLocation("/etc/zookeeper/conf");
        property3.setPropertyValue("ZK");
        property3.setOldPropertyValue("custom");
        properties.add(property3);
        return properties;
    }


    public Boolean reconfig(ServiceProperty property)

    {
        String service = property.getPropertyName();
        String file = property.getPropertyFileName();
        String newValue = property.getPropertyValue();

        

        return false;
    }

*/




/*
* find all the mappings from filename to the property filename
* make the api call
* retreive the properties
* 
*
*
* */

}