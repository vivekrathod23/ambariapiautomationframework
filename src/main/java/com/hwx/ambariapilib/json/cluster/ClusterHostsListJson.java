package com.hwx.ambariapilib.json.cluster;

/**
 * Created by nkashyap on 10/6/15.
 */

public class ClusterHostsListJson {
	
	private String href;
    private ClusterHostShortInfoJson Hosts;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public ClusterHostShortInfoJson getHosts() {
		return Hosts;
	}

	public void setHosts(ClusterHostShortInfoJson hosts) {
		Hosts = hosts;
	}
}
