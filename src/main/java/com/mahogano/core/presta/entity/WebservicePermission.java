package com.mahogano.core.presta.entity;


public class WebservicePermission {

    private Integer idWebservicePermission;

    private String resource;

    private String method;

    private Integer idWebserviceAccount;

    public Integer getIdWebservicePermission() {
        return idWebservicePermission;
    }

    public void setIdWebservicePermission(Integer idWebservicePermission) {
        this.idWebservicePermission = idWebservicePermission;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getIdWebserviceAccount() {
        return idWebserviceAccount;
    }

    public void setIdWebserviceAccount(Integer idWebserviceAccount) {
        this.idWebserviceAccount = idWebserviceAccount;
    }

}

