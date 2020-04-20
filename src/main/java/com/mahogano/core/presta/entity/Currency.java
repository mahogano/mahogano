package com.mahogano.core.presta.entity;

import java.math.BigDecimal;

public class Currency {

    private Integer idCurrency;

    private String name;

    private String isoCode;

    private String numericIsoCode;

    private Integer precision;

    private BigDecimal conversionRate;

    private Integer deleted;

    private Integer active;

    public Integer getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(Integer idCurrency) {
        this.idCurrency = idCurrency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getNumericIsoCode() {
        return numericIsoCode;
    }

    public void setNumericIsoCode(String numericIsoCode) {
        this.numericIsoCode = numericIsoCode;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

}

