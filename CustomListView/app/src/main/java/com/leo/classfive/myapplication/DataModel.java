package com.leo.classfive.myapplication;

public class DataModel {
    private String name;
    private String versionName;
    private String apiName;
    private String relaseDate;

    public DataModel(String name, String versionName, String apiName, String relaseDate) {
        this.name = name;
        this.versionName = versionName;
        this.apiName = apiName;
        this.relaseDate = relaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }
}




