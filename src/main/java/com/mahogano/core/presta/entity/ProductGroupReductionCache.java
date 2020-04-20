package com.mahogano.core.presta.entity;

import java.math.BigDecimal;

public class ProductGroupReductionCache {

    private Integer idProduct;

    private Integer idGroup;

    private BigDecimal reduction;

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public BigDecimal getReduction() {
        return reduction;
    }

    public void setReduction(BigDecimal reduction) {
        this.reduction = reduction;
    }

}

