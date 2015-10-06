package com.hwx.ambariapilib.json.host;

/**
 * Created by ajain on 9/28/15.
 */
public class LastAgentEnvJson {
    private StackFoldersAndFiles[] stackFoldersAndFiles;
    private AlternativesJson[] alternatives;
    private ExistingUsersJson[] existingUsers;
    private ExistingReposJson[] existingRepos;
    private InstalledPackagesJson[] installedPackages;
    private HostHealthJson hostHealth;
    private int umask;
    private String transparentHugePage;
    private boolean firewallRunning;
    private String firewallName;
    private boolean reverseLookup;

    public StackFoldersAndFiles[] getStackFoldersAndFiles() {
        return stackFoldersAndFiles;
    }

    public void setStackFoldersAndFiles(StackFoldersAndFiles[] stackFoldersAndFiles) {
        this.stackFoldersAndFiles = stackFoldersAndFiles;
    }

    public AlternativesJson[] getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(AlternativesJson[] alternatives) {
        this.alternatives = alternatives;
    }

    public ExistingUsersJson[] getExistingUsers() {
        return existingUsers;
    }

    public void setExistingUsers(ExistingUsersJson[] existingUsers) {
        this.existingUsers = existingUsers;
    }

    public ExistingReposJson[] getExistingRepos() {
        return existingRepos;
    }

    public void setExistingRepos(ExistingReposJson[] existingRepos) {
        this.existingRepos = existingRepos;
    }

    public InstalledPackagesJson[] getInstalledPackages() {
        return installedPackages;
    }

    public void setInstalledPackages(InstalledPackagesJson[] installedPackages) {
        this.installedPackages = installedPackages;
    }

    public HostHealthJson getHostHealth() {
        return hostHealth;
    }

    public void setHostHealth(HostHealthJson hostHealth) {
        this.hostHealth = hostHealth;
    }

    public int getUmask() {
        return umask;
    }

    public void setUmask(int umask) {
        this.umask = umask;
    }

    public String getTransparentHugePage() {
        return transparentHugePage;
    }

    public void setTransparentHugePage(String transparentHugePage) {
        this.transparentHugePage = transparentHugePage;
    }

    public boolean isFirewallRunning() {
        return firewallRunning;
    }

    public void setFirewallRunning(boolean firewallRunning) {
        this.firewallRunning = firewallRunning;
    }

    public String getFirewallName() {
        return firewallName;
    }

    public void setFirewallName(String firewallName) {
        this.firewallName = firewallName;
    }

    public boolean isReverseLookup() {
        return reverseLookup;
    }

    public void setReverseLookup(boolean reverseLookup) {
        this.reverseLookup = reverseLookup;
    }
}
