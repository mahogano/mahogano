package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class SalesBestsellersAggregatedDaily {

    private Integer id;

    private LocalDateTime period;

    private Integer storeId;

    private Integer productId;

    private String productTypeId;

    private String productName;

    private BigDecimal productPrice;

    private BigDecimal qtyOrdered;

    private Integer ratingPos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getPeriod() {
        return period;
    }

    public void setPeriod(LocalDateTime period) {
        this.period = period;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(BigDecimal qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public Integer getRatingPos() {
        return ratingPos;
    }

    public void setRatingPos(Integer ratingPos) {
        this.ratingPos = ratingPos;
    }

}

