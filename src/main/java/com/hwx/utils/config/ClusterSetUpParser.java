package com.hwx.utils.config;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ClusterSetUpParser {
	
	 private static ClusterSetUpParser instance = null;
	 private HashMap<String, String[]> serviceComponents = new HashMap<String,String[]>() ;
	 private HashMap<String, String[]> clusterServices = new HashMap<String,String[]>() ;
	 private HashMap<String, String[]> clusterHosts = new HashMap<String,String[]>() ;
	 String fileSeparator = System.getProperty("file.separator");
	 String baseFilePath = System.getProperty("user.dir") + fileSeparator + "resources" + fileSeparator;
	 
	   private ClusterSetUpParser() {
	      //to avoid instantiations
	   }
	   
	   public static ClusterSetUpParser getInstance() {
		   
	      if(instance == null) {
	         instance = new ClusterSetUpParser();
	         instance.readSetUp();
	      }
	      return instance;
	   }
	
	
	public void readSetUp() {
		
		String xmlString = baseFilePath + "clusterSetup.xml";
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		factory.setValidating(false);
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			try {
				Document xmlDoc = builder.parse(xmlString);
				Element ele = xmlDoc.getDocumentElement();
				
				
				//For each cluster get services and hosts
				NodeList rootEle = ele.getElementsByTagName("cluster");
				HashMap<String, String[]> clusterSer = new HashMap<String,String[]>() ;
				HashMap<String, String[]> clustHosts = new HashMap<String,String[]>() ;

				String clusterName ;
				
				int totalClusters = rootEle.getLength();
				for(int i=0; i<totalClusters  ; i++){
					clusterName = rootEle.item(i).getAttributes().item(0).getTextContent();
					Element clusterElement = (Element) rootEle.item(i);
					
					NodeList sevicesList = clusterElement.getElementsByTagName("service");
					int numServices = sevicesList.getLength();
					String[] services = new String[numServices];
					for(int s = 0; s <  numServices; s++){
						services[s]=sevicesList.item(s).getTextContent();

					}
					clusterSer.put(clusterName, services);
					
					
					NodeList hostsList = clusterElement.getElementsByTagName("host");
					int numHosts = hostsList.getLength();
					String[] hosts = new String[numHosts];
					for(int h = 0; h <  numHosts; h++){
						hosts[h]=hostsList.item(h).getTextContent();

					}
					clustHosts.put(clusterName, hosts);
					
						

				}

				setClusterServices(clusterSer);
				setClusterHosts(clustHosts);
				
				
				
				
				//For each service get the components
				HashMap<String, String[]> serviceComps = new HashMap<String,String[]>() ;
				String serviceName ;
				
				NodeList serviceCompEle = ele.getElementsByTagName("ServiceComponents");

					Element rootElement = (Element) serviceCompEle.item(0);
					NodeList sevicesList = rootElement.getElementsByTagName("service");
					
					for(int i=0; i< sevicesList.getLength() ; i++){
						serviceName = sevicesList.item(i).getAttributes().item(0).getTextContent();

						Element componentsElement = (Element) sevicesList.item(i);
						NodeList componentsList = componentsElement.getElementsByTagName("component");
						
						int numComponents = componentsList.getLength();
						String[] components = new String[numComponents];
						
					for(int c = 0; c < numComponents ; c++){
						components[c] = componentsList.item(c).getTextContent();
					}
					serviceComps.put(serviceName, components);

				}
					setServiceComponents(serviceComps);
				
				
				
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
    public void setServiceComponents(HashMap<String, String[]> serviceComp){
    	this.serviceComponents = serviceComp;
    	
    }
    
    public HashMap<String, String[]> getServiceComponents(){
    	return this.serviceComponents;
    }
	
    public void setClusterServices(HashMap<String, String[]> clustServices){
    	this.clusterServices = clustServices;
    }
    
    public HashMap<String, String[]> getClusterServices(){
    	return this.clusterServices;
    }
    
    public HashMap<String, String[]> getClusterHosts(){
    	return this.clusterHosts ; 
    }
    
    public void setClusterHosts(HashMap<String, String[]> clustHosts){
    	this.clusterHosts = clustHosts;
    }
 

}
