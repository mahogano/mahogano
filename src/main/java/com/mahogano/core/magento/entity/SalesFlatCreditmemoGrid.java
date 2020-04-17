package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class SalesFlatCreditmemoGrid {

    private Integer entityId;

    private Integer storeId;

    private BigDecimal storeToOrderRate;

    private BigDecimal baseToOrderRate;

    private BigDecimal grandTotal;

    private BigDecimal storeToBaseRate;

    private BigDecimal baseToGlobalRate;

    private BigDecimal baseGrandTotal;

    private Integer orderId;

    private Integer creditmemoStatus;

    private Integer state;

    private Integer invoiceId;

    private String storeCurrencyCode;

    private String orderCurrencyCode;

    private String baseCurrencyCode;

    private String globalCurrencyCode;

    private String incrementId;

    private String orderIncrementId;

    private LocalDateTime createdAt;

    private LocalDateTime orderCreatedAt;

    private String billingName;

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public BigDecimal getStoreToOrderRate() {
        return storeToOrderRate;
    }

    public void setStoreToOrderRate(BigDecimal storeToOrderRate) {
        this.storeToOrderRate = storeToOrderRate;
    }

    public BigDecimal getBaseToOrderRate() {
        return baseToOrderRate;
    }

    public void setBaseToOrderRate(BigDecimal baseToOrderRate) {
        this.baseToOrderRate = baseToOrderRate;
    }

    public BigDecimal getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }

    public BigDecimal getStoreToBaseRate() {
        return storeToBaseRate;
    }

    public void setStoreToBaseRate(BigDecimal storeToBaseRate) {
        this.storeToBaseRate = storeToBaseRate;
    }

    public BigDecimal getBaseToGlobalRate() {
        return baseToGlobalRate;
    }

    public void setBaseToGlobalRate(BigDecimal baseToGlobalRate) {
        this.baseToGlobalRate = baseToGlobalRate;
    }

    public BigDecimal getBaseGrandTotal() {
        return baseGrandTotal;
    }

    public void setBaseGrandTotal(BigDecimal baseGrandTotal) {
        this.baseGrandTotal = baseGrandTotal;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCreditmemoStatus() {
        return creditmemoStatus;
    }

    public void setCreditmemoStatus(Integer creditmemoStatus) {
        this.creditmemoStatus = creditmemoStatus;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getStoreCurrencyCode() {
        return storeCurrencyCode;
    }

    public void setStoreCurrencyCode(String storeCurrencyCode) {
        this.storeCurrencyCode = storeCurrencyCode;
    }

    public String getOrderCurrencyCode() {
        return orderCurrencyCode;
    }

    public void setOrderCurrencyCode(String orderCurrencyCode) {
        this.orderCurrencyCode = orderCurrencyCode;
    }

    public String getBaseCurrencyCode() {
        return baseCurrencyCode;
    }

    public void setBaseCurrencyCode(String baseCurrencyCode) {
        this.baseCurrencyCode = baseCurrencyCode;
    }

    public String getGlobalCurrencyCode() {
        return globalCurrencyCode;
    }

    public void setGlobalCurrencyCode(String globalCurrencyCode) {
        this.globalCurrencyCode = globalCurrencyCode;
    }

    public String getIncrementId() {
        return incrementId;
    }

    public void setIncrementId(String incrementId) {
        this.incrementId = incrementId;
    }

    public String getOrderIncrementId() {
        return orderIncrementId;
    }

    public void setOrderIncrementId(String orderIncrementId) {
        this.orderIncrementId = orderIncrementId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getOrderCreatedAt() {
        return orderCreatedAt;
    }

    public void setOrderCreatedAt(LocalDateTime orderCreatedAt) {
        this.orderCreatedAt = orderCreatedAt;
    }

    public String getBillingName() {
        return billingName;
    }

    public void setBillingName(String billingName) {
        this.billingName = billingName;
    }

}

