package com.hwx.ambariapilib.service;

/**
 * Created by vrathod on 11/25/15.
 */
import com.google.gson.Gson;
import com.hwx.ambariapilib.AmbariManager;
import com.hwx.ambariapilib.cluster.Cluster;
import com.hwx.ambariapilib.host.Host;
import com.hwx.ambariapilib.json.ConfigProperties.CoreSiteConfigHead;
import com.hwx.ambariapilib.json.service.DesiredConfigs;
import com.hwx.clientlib.RestAPIClient;
import com.hwx.clientlib.RestAPIClientFactory;
import com.hwx.clientlib.RestAPIClientType;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;

import java.util.ArrayList;
import java.util.HashSet;

public class ReconfigProperties {
    AmbariManager ambariManager = new AmbariManager();
    ArrayList<Host> hosts = ((Cluster)this.ambariManager.getClusters().get(0)).getHosts();
    ArrayList<Service> services = ((Cluster)this.ambariManager.getClusters().get(0)).getServices();
    protected Gson gson = new Gson();
    protected static RestAPIClient rc = RestAPIClientFactory.getAPIClient(RestAPIClientType.RESTASSURED);
    //public static Map<String, HashSet<ServiceProperty>> serviceProperties = new HashMap<String, HashSet<ServiceProperty>>();
    public HashSet<ServiceProperties> serviceProperties;
    public DesiredConfigs desiredConfigs = new DesiredConfigs();
    public String clusterName = ambariManager.getClusters().get(0).getClusterJson().getClusters().getCluster_name();

    public void setServicePropertiesToBeModified()
    {
        ServiceProperties SP = new ServiceProperties();
//properties for core-site
        HashSet<Property> properties= new HashSet<Property>();
        Property p = new Property();
        p.setPropertyName("ipc.client.connect.max.retries");
        p.setPropertyValue("");
        properties.add(p);
        SP.setFileName("core-site");
        SP.setProperties(properties);
        serviceProperties.add(SP);


//properties for hdfs-site . 1 custom property remaining
        properties.clear();
        p.setPropertyName("dfs.replication.max");
        p.setPropertyValue("");
        properties.add(p);
        SP.setFileName("hdfs-site");
        SP.setProperties(properties);
        serviceProperties.add(SP);

//properties for ssl-server
        properties.clear();
        p.setPropertyName("ssl.server.truststore.reload.interval");
        p.setPropertyValue("");
        properties.add(p);
        SP.setFileName("ssl-server");
        SP.setProperties(properties);
        serviceProperties.add(SP);

//properties for mapred-site.xml. One custom property remaining
        properties.clear();
        p.setPropertyName("mapreduce.am.max-attempts");
        p.setPropertyValue("");
        properties.add(p);
        SP.setFileName("mapred-site");
        SP.setProperties(properties);
        serviceProperties.add(SP);

//properties for yarn-site.xml. One custom property remaining
        properties.clear();
        p.setPropertyName("yarn.nodemanager.disk-health-checker.max-disk-utilization-per-disk-percentage");
        p.setPropertyValue("");
        properties.add(p);
        SP.setFileName("yarn-site");
        SP.setProperties(properties);
        serviceProperties.add(SP);

//properties for zoo.cfg. Two custom property remaining
        properties.clear();
        p.setPropertyName("autopurge.purgeInterval");
        p.setPropertyValue("");
        properties.add(p);
        SP.setFileName("zoo.cfg");
        SP.setProperties(properties);
        serviceProperties.add(SP);

    }



    void readPropertiesAndStoreValues()
    {


    for(ServiceProperties sp : serviceProperties)
    {
        String file = sp.getFileName();
        HashSet<Property> properties = sp.getProperties();
        String tag = getTag(file);
  //      cl1/configurations?type=core-site&tag=version1448408000030

        String url="curl -u admin:admin -X GET http://192.168.64.101:8080/api/v1/clusters/";
        url+=clusterName;
        url+="/configurations?type=";
        url+=file;
        url+="&tag=";
       // url+=tag+"'";
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, url);
        HTTPResponse resp = rc.sendHTTPRequest(req);
        CoreSiteConfigHead requestJson = gson.fromJson(resp.getBody().getBodyText(), CoreSiteConfigHead.class);

    }








    }

public String getTag(String file)
{
    String tag="";
    //[Note: have to get the host address from config.properties]
    String url = "curl -u admin:admin -X GET http://192.168.64.101:8080/api/v1/clusters/";//cl1?fields=Clusters/desired_configs";

    url+=clusterName;
    url+="?fields=Clusters/desired_configs";
    System.out.println(url);
    HTTPRequest req = new HTTPRequest(HTTPMethods.GET, url);
    HTTPResponse resp = rc.sendHTTPRequest(req);
    //desiredConfigs = gson.fromJson(resp.getBody().getBodyText(), DesiredConfigs.class);
    DesiredConfigs requestJson = gson.fromJson(resp.getBody().getBodyText(), DesiredConfigs.class);

    if(file.equals("core-site"))
    {
        return desiredConfigs.getCoreSite().getTag().toString();
    }
    else if(file.equals("hdfs-site"))
    {
        return desiredConfigs.getHdfsSite().getTag().toString();
    }
    else if(file.equals("ssl-server"))
    {
        return desiredConfigs.getSslServer().getTag().toString();
    }
    else if(file.equals("mapred-site"))
    {
        return desiredConfigs.getMapredSite().getTag().toString();
    }
    else if(file.equals("yarn-site"))
    {
        return desiredConfigs.getYarnSite().getTag().toString();
    }
    else if(file.equals("zoo.cfg"))
    {
        return desiredConfigs.getZooCfg().getTag().toString();
    }

    return tag;
}













    public void ModifyConfigs() {
        if (this.services.isEmpty()) {
            System.out.println("No Services installed in the Cluster");
        } else {
            for (Service service : this.services) {
                System.out.println(service.getName());
                HashSet<ServiceProperty> property = new HashSet<ServiceProperty>();
                if (service.getName().equalsIgnoreCase("HDFS")) {
                    property = this.getHDFSPropertiesToBeReconfigured();
                    this.reconfigureHDFS(property);
                    continue;
                }
                if (service.getName().equalsIgnoreCase("MAPREDUCE2")) {
                    this.reconfigureMapreduce2();
                    property = this.getMapReduce2PropertiesToBeReconfigured();
                    continue;
                }
                if (service.getName().equalsIgnoreCase("YARN")) {
                    this.reconfigureYarn();
                    property = this.getYARNPropertiesToBeReconfigured();
                    continue;
                }
                if (service.getName().equalsIgnoreCase("ZOOKEEPER")) {
                    this.reconfigureZookeeper(service);
                    property = this.getZookeeperPropertiesToBeReconfigured();
                    continue;
                }
                System.out.println("No support to modify/add properties for " + service.getName());
            }
        }
    }

    private void reconfigureZookeeper(Service service) {
    }

    private void reconfigureYarn() {
    }

    private void reconfigureMapreduce2() {
    }

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
        property.setPropertyName("autopurge.purgeInterval");
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






/*
* find all the mappings from filename to the property filename
* make the api call
* retreive the properties
* 
*
*
* */

}