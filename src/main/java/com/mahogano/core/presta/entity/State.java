package com.mahogano.core.presta.entity;


public class State {

    private Integer idState;

    private Integer idCountry;

    private Integer idZone;

    private String name;

    private String isoCode;

    private Integer taxBehavior;

    private Integer active;

    public Integer getIdState() {
        return idState;
    }

    public void setIdState(Integer idState) {
        this.idState = idState;
    }

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

    public Integer getTaxBehavior() {
        return taxBehavior;
    }

    public void setTaxBehavior(Integer taxBehavior) {
        this.taxBehavior = taxBehavior;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

}

