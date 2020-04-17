package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class ProductAlertStock {

    private Integer alertStockId;

    private Integer customerId;

    private Integer productId;

    private Integer websiteId;

    private LocalDateTime addDate;

    private LocalDateTime sendDate;

    private Integer sendCount;

    private Integer status;

    public Integer getAlertStockId() {
        return alertStockId;
    }

    public void setAlertStockId(Integer alertStockId) {
        this.alertStockId = alertStockId;
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

    public LocalDateTime getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDateTime sendDate) {
        this.sendDate = sendDate;
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

