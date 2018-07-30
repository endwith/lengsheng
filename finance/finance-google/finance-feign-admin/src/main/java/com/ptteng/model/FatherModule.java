package com.ptteng.model;

import java.io.Serializable;
import java.util.List;

public class FatherModule implements Serializable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FatherModule{" +
                "name='" + name + '\'' +
                ", sonModules=" + sonModules +
                '}';
    }

    private String name;

    public List<SonModule> getSonModules() {
        return sonModules;
    }

    public void setSonModules(List<SonModule> sonModules) {
        this.sonModules = sonModules;
    }

    private List<SonModule> sonModules;
}
