package com.hwx.ambariapilib.json;

import com.hwx.ambariapilib.json.DesiredConfigs;
import com.hwx.ambariapilib.json.DiskInfo;
import com.hwx.ambariapilib.json.LastAgentEnv;
import com.hwx.ambariapilib.json.RecoveryReport;

/**
 * Created by ajain on 9/28/15.
 */
public class Hosts {
    private String cluster_name;
    private int cpu_count;
    private DiskInfo[] disk_info;
    private String host_health_report;
    private String host_name;
    private String host_state;
    private String host_status;
    private String ip;
    private LastAgentEnv last_agent_env;
    private long last_heartbeat_time;
    private long last_registration_time;
    private String maintenance_state;
    private String os_arch;
    private String os_family;
    private String os_type;
    private int ph_cpu_count;
    private String public_host_name;
    private String rack_info;
    private RecoveryReport recovery_report;
    private String recovery_summary;
    private long total_mem;
    private DesiredConfigs desired_configs;

    public String getCluster_name() {
        return cluster_name;
    }

    public void setCluster_name(String cluster_name) {
        this.cluster_name = cluster_name;
    }

    public int getCpu_count() {
        return cpu_count;
    }

    public void setCpu_count(int cpu_count) {
        this.cpu_count = cpu_count;
    }

    public DiskInfo[] getDisk_info() {
        return disk_info;
    }

    public void setDisk_info(DiskInfo[] disk_info) {
        this.disk_info = disk_info;
    }

    public String getHost_health_report() {
        return host_health_report;
    }

    public void setHost_health_report(String host_health_report) {
        this.host_health_report = host_health_report;
    }

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }

    public String getHost_state() {
        return host_state;
    }

    public void setHost_state(String host_state) {
        this.host_state = host_state;
    }

    public String getHost_status() {
        return host_status;
    }

    public void setHost_status(String host_status) {
        this.host_status = host_status;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public LastAgentEnv getLast_agent_env() {
        return last_agent_env;
    }

    public void setLast_agent_env(LastAgentEnv last_agent_env) {
        this.last_agent_env = last_agent_env;
    }

    public long getLast_heartbeat_time() {
        return last_heartbeat_time;
    }

    public void setLast_heartbeat_time(long last_heartbeat_time) {
        this.last_heartbeat_time = last_heartbeat_time;
    }

    public long getLast_registration_time() {
        return last_registration_time;
    }

    public void setLast_registration_time(long last_registration_time) {
        this.last_registration_time = last_registration_time;
    }

    public String getMaintenance_state() {
        return maintenance_state;
    }

    public void setMaintenance_state(String maintenance_state) {
        this.maintenance_state = maintenance_state;
    }

    public String getOs_arch() {
        return os_arch;
    }

    public void setOs_arch(String os_arch) {
        this.os_arch = os_arch;
    }

    public String getOs_family() {
        return os_family;
    }

    public void setOs_family(String os_family) {
        this.os_family = os_family;
    }

    public String getOs_type() {
        return os_type;
    }

    public void setOs_type(String os_type) {
        this.os_type = os_type;
    }

    public int getPh_cpu_count() {
        return ph_cpu_count;
    }

    public void setPh_cpu_count(int ph_cpu_count) {
        this.ph_cpu_count = ph_cpu_count;
    }

    public String getPublic_host_name() {
        return public_host_name;
    }

    public void setPublic_host_name(String public_host_name) {
        this.public_host_name = public_host_name;
    }

    public String getRack_info() {
        return rack_info;
    }

    public void setRack_info(String rack_info) {
        this.rack_info = rack_info;
    }

    public RecoveryReport getRecovery_report() {
        return recovery_report;
    }

    public void setRecovery_report(RecoveryReport recovery_report) {
        this.recovery_report = recovery_report;
    }

    public String getRecovery_summary() {
        return recovery_summary;
    }

    public void setRecovery_summary(String recovery_summary) {
        this.recovery_summary = recovery_summary;
    }

    public long getTotal_mem() {
        return total_mem;
    }

    public void setTotal_mem(long total_mem) {
        this.total_mem = total_mem;
    }

    public DesiredConfigs getDesired_configs() {
        return desired_configs;
    }

    public void setDesired_configs(DesiredConfigs desired_configs) {
        this.desired_configs = desired_configs;
    }
}
