package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class PsgdprLog {

    private Integer idGdprLog;

    private Integer idCustomer;

    private Integer idGuest;

    private String clientName;

    private Integer idModule;

    private Integer requestType;

    private LocalDateTime dateAdd;

    private LocalDateTime dateUpd;

    public Integer getIdGdprLog() {
        return idGdprLog;
    }

    public void setIdGdprLog(Integer idGdprLog) {
        this.idGdprLog = idGdprLog;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Integer getIdGuest() {
        return idGuest;
    }

    public void setIdGuest(Integer idGuest) {
        this.idGuest = idGuest;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getIdModule() {
        return idModule;
    }

    public void setIdModule(Integer idModule) {
        this.idModule = idModule;
    }

    public Integer getRequestType() {
        return requestType;
    }

    public void setRequestType(Integer requestType) {
        this.requestType = requestType;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

    public LocalDateTime getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(LocalDateTime dateUpd) {
        this.dateUpd = dateUpd;
    }

}

