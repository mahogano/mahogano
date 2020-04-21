package com.mahogano.core.presta.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductAttribute {

    private Integer idProductAttribute;

    private Integer idProduct;

    private String reference;

    private String supplierReference;

    private String location;

    private String ean13;

    private String isbn;

    private String upc;

    private BigDecimal wholesalePrice;

    private BigDecimal price;

    private BigDecimal ecotax;

    private Integer quantity;

    private BigDecimal weight;

    private BigDecimal unitPriceImpact;

    private Integer defaultOn;

    private Integer minimalQuantity;

    private Integer lowStockThreshold;

    private Integer lowStockAlert;

    private LocalDateTime availableDate;

    public Integer getIdProductAttribute() {
        return idProductAttribute;
    }

    public void setIdProductAttribute(Integer idProductAttribute) {
        this.idProductAttribute = idProductAttribute;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getSupplierReference() {
        return supplierReference;
    }

    public void setSupplierReference(String supplierReference) {
        this.supplierReference = supplierReference;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public BigDecimal getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(BigDecimal wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getEcotax() {
        return ecotax;
    }

    public void setEcotax(BigDecimal ecotax) {
        this.ecotax = ecotax;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getUnitPriceImpact() {
        return unitPriceImpact;
    }

    public void setUnitPriceImpact(BigDecimal unitPriceImpact) {
        this.unitPriceImpact = unitPriceImpact;
    }

    public Integer getDefaultOn() {
        return defaultOn;
    }

    public void setDefaultOn(Integer defaultOn) {
        this.defaultOn = defaultOn;
    }

    public Integer getMinimalQuantity() {
        return minimalQuantity;
    }

    public void setMinimalQuantity(Integer minimalQuantity) {
        this.minimalQuantity = minimalQuantity;
    }

    public Integer getLowStockThreshold() {
        return lowStockThreshold;
    }

    public void setLowStockThreshold(Integer lowStockThreshold) {
        this.lowStockThreshold = lowStockThreshold;
    }

    public Integer getLowStockAlert() {
        return lowStockAlert;
    }

    public void setLowStockAlert(Integer lowStockAlert) {
        this.lowStockAlert = lowStockAlert;
    }

    public LocalDateTime getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(LocalDateTime availableDate) {
        this.availableDate = availableDate;
    }

}

