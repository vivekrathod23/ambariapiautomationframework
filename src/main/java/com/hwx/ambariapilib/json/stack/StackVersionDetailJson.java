package com.hwx.ambariapilib.json.stack;

/**
 * Created by ajain on 10/20/15.
 */
public class StackVersionDetailJson {

    private String href;
    private ClusterStackVersionDetailJson ClusterStackVersions;
    private RepositoryVersionJson[] repository_versions;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ClusterStackVersionDetailJson getClusterStackVersions() {
        return ClusterStackVersions;
    }

    public void setClusterStackVersions(ClusterStackVersionDetailJson clusterStackVersions) {
        ClusterStackVersions = clusterStackVersions;
    }

    public RepositoryVersionJson[] getRepository_versions() {
        return repository_versions;
    }

    public void setRepository_versions(RepositoryVersionJson[] repository_versions) {
        this.repository_versions = repository_versions;
    }
}
