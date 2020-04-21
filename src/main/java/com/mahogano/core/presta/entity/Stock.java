package com.mahogano.core.presta.entity;

import java.math.BigDecimal;

public class Stock {

    private Integer idStock;

    private Integer idWarehouse;

    private Integer idProduct;

    private Integer idProductAttribute;

    private String reference;

    private String ean13;

    private String isbn;

    private String upc;

    private Integer physicalQuantity;

    private Integer usableQuantity;

    private BigDecimal priceTe;

    public Integer getIdStock() {
        return idStock;
    }

    public void setIdStock(Integer idStock) {
        this.idStock = idStock;
    }

    public Integer getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(Integer idWarehouse) {
        this.idWarehouse = idWarehouse;
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

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getEan13() {
        return ean13;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public Integer getPhysicalQuantity() {
        return physicalQuantity;
    }

    public void setPhysicalQuantity(Integer physicalQuantity) {
        this.physicalQuantity = physicalQuantity;
    }

    public Integer getUsableQuantity() {
        return usableQuantity;
    }

    public void setUsableQuantity(Integer usableQuantity) {
        this.usableQuantity = usableQuantity;
    }

    public BigDecimal getPriceTe() {
        return priceTe;
    }

    public void setPriceTe(BigDecimal priceTe) {
        this.priceTe = priceTe;
    }

}

