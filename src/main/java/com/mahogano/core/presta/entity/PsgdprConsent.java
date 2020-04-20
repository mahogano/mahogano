package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class PsgdprConsent {

    private Integer idGdprConsent;

    private Integer idModule;

    private Integer active;

    private Integer error;

    private String errorMessage;

    private LocalDateTime dateAdd;

    private LocalDateTime dateUpd;

    public Integer getIdGdprConsent() {
        return idGdprConsent;
    }

    public void setIdGdprConsent(Integer idGdprConsent) {
        this.idGdprConsent = idGdprConsent;
    }

    public Integer getIdModule() {
        return idModule;
    }

    public void setIdModule(Integer idModule) {
        this.idModule = idModule;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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

