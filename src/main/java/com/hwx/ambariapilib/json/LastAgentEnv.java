package com.hwx.ambariapilib.json;

/**
 * Created by ajain on 9/28/15.
 */
public class LastAgentEnv {
    private StackFoldersAndFiles[] stackFoldersAndFiles;
    private Alternatives[] alternatives;
    private ExistingUsers[] existingUsers;
    private ExistingRepos[] existingRepos;
    private InstalledPackages[] installedPackages;
    private HostHealth hostHealth;
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

    public Alternatives[] getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(Alternatives[] alternatives) {
        this.alternatives = alternatives;
    }

    public ExistingUsers[] getExistingUsers() {
        return existingUsers;
    }

    public void setExistingUsers(ExistingUsers[] existingUsers) {
        this.existingUsers = existingUsers;
    }

    public ExistingRepos[] getExistingRepos() {
        return existingRepos;
    }

    public void setExistingRepos(ExistingRepos[] existingRepos) {
        this.existingRepos = existingRepos;
    }

    public InstalledPackages[] getInstalledPackages() {
        return installedPackages;
    }

    public void setInstalledPackages(InstalledPackages[] installedPackages) {
        this.installedPackages = installedPackages;
    }

    public HostHealth getHostHealth() {
        return hostHealth;
    }

    public void setHostHealth(HostHealth hostHealth) {
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
