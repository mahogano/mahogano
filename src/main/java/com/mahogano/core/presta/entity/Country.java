package com.mahogano.core.presta.entity;


public class Country {

    private Integer idCountry;

    private Integer idZone;

    private Integer idCurrency;

    private String isoCode;

    private Integer callPrefix;

    private Integer active;

    private Integer containsStates;

    private Integer needIdentificationNumber;

    private Integer needZipCode;

    private String zipCodeFormat;

    private Integer displayTaxLabel;

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public Integer getIdZone() {
        return idZone;
    }

    public void setIdZone(Integer idZone) {
        this.idZone = idZone;
    }

    public Integer getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(Integer idCurrency) {
        this.idCurrency = idCurrency;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public Integer getCallPrefix() {
        return callPrefix;
    }

    public void setCallPrefix(Integer callPrefix) {
        this.callPrefix = callPrefix;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getContainsStates() {
        return containsStates;
    }

    public void setContainsStates(Integer containsStates) {
        this.containsStates = containsStates;
    }

    public Integer getNeedIdentificationNumber() {
        return needIdentificationNumber;
    }

    public void setNeedIdentificationNumber(Integer needIdentificationNumber) {
        this.needIdentificationNumber = needIdentificationNumber;
    }

    public Integer getNeedZipCode() {
        return needZipCode;
    }

    public void setNeedZipCode(Integer needZipCode) {
        this.needZipCode = needZipCode;
    }

    public String getZipCodeFormat() {
        return zipCodeFormat;
    }

    public void setZipCodeFormat(String zipCodeFormat) {
        this.zipCodeFormat = zipCodeFormat;
    }

    public Integer getDisplayTaxLabel() {
        return displayTaxLabel;
    }

    public void setDisplayTaxLabel(Integer displayTaxLabel) {
        this.displayTaxLabel = displayTaxLabel;
    }

}

