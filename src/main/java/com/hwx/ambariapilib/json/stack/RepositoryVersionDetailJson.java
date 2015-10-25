package com.hwx.ambariapilib.json.stack;

/**
 * Created by ajain on 10/21/15.
 */
public class RepositoryVersionDetailJson {
    private int id;
    private String stack_name;
    private String stack_version;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStack_name() {
        return stack_name;
    }

    public void setStack_name(String stack_name) {
        this.stack_name = stack_name;
    }

    public String getStack_version() {
        return stack_version;
    }

    public void setStack_version(String stack_version) {
        this.stack_version = stack_version;
    }
}
