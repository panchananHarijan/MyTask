package com.practic.java8;

public class Project {
    private String projectCode;
    private String name;
    private String client;
    private String blueLeadName;

    public Project() {
    }

    public Project(String projectCode, String name, String client, String blueLeadName) {
        this.projectCode = projectCode;
        this.name = name;
        this.client = client;
        this.blueLeadName = blueLeadName;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getBlueLeadName() {
        return blueLeadName;
    }

    public void setBlueLeadName(String blueLeadName) {
        this.blueLeadName = blueLeadName;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectCode='" + projectCode + '\'' +
                ", name='" + name + '\'' +
                ", client='" + client + '\'' +
                ", blueLeadName='" + blueLeadName + '\'' +
                '}';
    }
}
