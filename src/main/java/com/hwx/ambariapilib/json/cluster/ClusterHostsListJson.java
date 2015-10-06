package com.hwx.ambariapilib.json.cluster;

import com.hwx.ambariapilib.json.host.ClusterHostsJson;

/**
 * Created by nkashyap on 10/6/15.
 */

public class ClusterHostsListJson {
	
	private String href;
    private ClusterHostsJson[] items;
    
    public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public ClusterHostsJson[] getItems() {
		return items;
	}
	public void setItems(ClusterHostsJson[] items) {
		this.items = items;
	}
	

}
