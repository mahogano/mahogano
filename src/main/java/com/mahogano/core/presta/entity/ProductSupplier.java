package com.mahogano.core.presta.entity;

import java.math.BigDecimal;

public class ProductSupplier {

    private Integer idProductSupplier;

    private Integer idProduct;

    private Integer idProductAttribute;

    private Integer idSupplier;

    private String productSupplierReference;

    private BigDecimal productSupplierPriceTe;

    private Integer idCurrency;

    public Integer getIdProductSupplier() {
        return idProductSupplier;
    }

    public void setIdProductSupplier(Integer idProductSupplier) {
        this.idProductSupplier = idProductSupplier;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getIdProductAttribute() {
        return idProductAttribute;
    }

    public void setIdProductAttribute(Integer idProductAttribute) {
        this.idProductAttribute = idProductAttribute;
    }

    public Integer getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Integer idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getProductSupplierReference() {
        return productSupplierReference;
    }

    public void setProductSupplierReference(String productSupplierReference) {
        this.productSupplierReference = productSupplierReference;
    }

    public BigDecimal getProductSupplierPriceTe() {
        return productSupplierPriceTe;
    }

    public void setProductSupplierPriceTe(BigDecimal productSupplierPriceTe) {
        this.productSupplierPriceTe = productSupplierPriceTe;
    }

    public Integer getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(Integer idCurrency) {
        this.idCurrency = idCurrency;
    }

}

