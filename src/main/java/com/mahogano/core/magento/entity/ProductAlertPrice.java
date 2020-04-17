package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class ProductAlertPrice {

    private Integer alertPriceId;

    private Integer customerId;

    private Integer productId;

    private BigDecimal price;

    private Integer websiteId;

    private LocalDateTime addDate;

    private LocalDateTime lastSendDate;

    private Integer sendCount;

    private Integer status;

    public Integer getAlertPriceId() {
        return alertPriceId;
    }

    public void setAlertPriceId(Integer alertPriceId) {
        this.alertPriceId = alertPriceId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(Integer websiteId) {
        this.websiteId = websiteId;
    }

    public LocalDateTime getAddDate() {
        return addDate;
    }

    public void setAddDate(LocalDateTime addDate) {
        this.addDate = addDate;
    }

    public LocalDateTime getLastSendDate() {
        return lastSendDate;
    }

    public void setLastSendDate(LocalDateTime lastSendDate) {
        this.lastSendDate = lastSendDate;
    }

    public Integer getSendCount() {
        return sendCount;
    }

    public void setSendCount(Integer sendCount) {
        this.sendCount = sendCount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}

