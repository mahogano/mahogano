package com.mahogano.core.presta.entity;


public class WebserviceAccount {

    private Integer idWebserviceAccount;

    private String key;

    private String description;

    private String className;

    private Integer isModule;

    private String moduleName;

    private Integer active;

    public Integer getIdWebserviceAccount() {
        return idWebserviceAccount;
    }

    public void setIdWebserviceAccount(Integer idWebserviceAccount) {
        this.idWebserviceAccount = idWebserviceAccount;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getIsModule() {
        return isModule;
    }

    public void setIsModule(Integer isModule) {
        this.isModule = isModule;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

}

