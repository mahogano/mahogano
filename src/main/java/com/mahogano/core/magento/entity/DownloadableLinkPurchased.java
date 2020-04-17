package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class DownloadableLinkPurchased {

    private Integer purchasedId;

    private Integer orderId;

    private String orderIncrementId;

    private Integer orderItemId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Integer customerId;

    private String productName;

    private String productSku;

    private String linkSectionTitle;

    public Integer getPurchasedId() {
        return purchasedId;
    }

    public void setPurchasedId(Integer purchasedId) {
        this.purchasedId = purchasedId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderIncrementId() {
        return orderIncrementId;
    }

    public void setOrderIncrementId(String orderIncrementId) {
        this.orderIncrementId = orderIncrementId;
    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSku() {
        return productSku;
    }

    public void setProductSku(String productSku) {
        this.productSku = productSku;
    }

    public String getLinkSectionTitle() {
        return linkSectionTitle;
    }

    public void setLinkSectionTitle(String linkSectionTitle) {
        this.linkSectionTitle = linkSectionTitle;
    }

}

