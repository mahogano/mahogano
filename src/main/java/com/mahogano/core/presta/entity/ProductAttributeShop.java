package com.mahogano.core.presta.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductAttributeShop {

    private Integer idProduct;

    private Integer idProductAttribute;

    private Integer idShop;

    private BigDecimal wholesalePrice;

    private BigDecimal price;

    private BigDecimal ecotax;

    private BigDecimal weight;

    private BigDecimal unitPriceImpact;

    private Integer defaultOn;

    private Integer minimalQuantity;

    private Integer lowStockThreshold;

    private Integer lowStockAlert;

    private LocalDateTime availableDate;

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

    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
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

