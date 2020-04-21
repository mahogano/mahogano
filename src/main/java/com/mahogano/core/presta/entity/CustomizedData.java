package com.mahogano.core.presta.entity;

import java.math.BigDecimal;

public class CustomizedData {

    private Integer idCustomization;

    private Integer type;

    private Integer index;

    private String value;

    private Integer idModule;

    private BigDecimal price;

    private BigDecimal weight;

    public Integer getIdCustomization() {
        return idCustomization;
    }

    public void setIdCustomization(Integer idCustomization) {
        this.idCustomization = idCustomization;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getIdModule() {
        return idModule;
    }

    public void setIdModule(Integer idModule) {
        this.idModule = idModule;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

}

