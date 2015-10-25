package com.hwx.ambariapilib.json.stack;

/**
 * Created by ajain on 10/20/15.
 */
public class RepositoryVersionJson {

    private String href;
    private RepositoryVersionDetailJson RepositoryVersions;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public RepositoryVersionDetailJson getRepositoryVersions() {
        return RepositoryVersions;
    }

    public void setRepositoryVersions(RepositoryVersionDetailJson repositoryVersions) {
        RepositoryVersions = repositoryVersions;
    }
}
