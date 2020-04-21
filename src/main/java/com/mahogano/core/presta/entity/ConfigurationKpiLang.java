package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class ConfigurationKpiLang {

    private Integer idConfigurationKpi;

    private Integer idLang;

    private String value;

    private LocalDateTime dateUpd;

    public Integer getIdConfigurationKpi() {
        return idConfigurationKpi;
    }

    public void setIdConfigurationKpi(Integer idConfigurationKpi) {
        this.idConfigurationKpi = idConfigurationKpi;
    }

    public Integer getIdLang() {
        return idLang;
    }

    public void setIdLang(Integer idLang) {
        this.idLang = idLang;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LocalDateTime getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(LocalDateTime dateUpd) {
        this.dateUpd = dateUpd;
    }

}

