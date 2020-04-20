package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class Configuration {

    private Integer idConfiguration;

    private Integer idShopGroup;

    private Integer idShop;

    private String name;

    private String value;

    private LocalDateTime dateAdd;

    private LocalDateTime dateUpd;

    public Integer getIdConfiguration() {
        return idConfiguration;
    }

    public void setIdConfiguration(Integer idConfiguration) {
        this.idConfiguration = idConfiguration;
    }

    public Integer getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(Integer idShopGroup) {
        this.idShopGroup = idShopGroup;
    }

    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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

