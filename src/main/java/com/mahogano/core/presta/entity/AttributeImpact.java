package com.mahogano.core.presta.entity;

import java.math.BigDecimal;

public class AttributeImpact {

    private Integer idAttributeImpact;

    private Integer idProduct;

    private Integer idAttribute;

    private BigDecimal weight;

    private BigDecimal price;

    public Integer getIdAttributeImpact() {
        return idAttributeImpact;
    }

    public void setIdAttributeImpact(Integer idAttributeImpact) {
        this.idAttributeImpact = idAttributeImpact;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getIdAttribute() {
        return idAttribute;
    }

    public void setIdAttribute(Integer idAttribute) {
        this.idAttribute = idAttribute;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}

