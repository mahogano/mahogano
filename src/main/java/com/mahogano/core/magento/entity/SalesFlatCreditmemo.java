package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class SalesFlatCreditmemo {

    private Integer entityId;

    private Integer storeId;

    private BigDecimal adjustmentPositive;

    private BigDecimal baseShippingTaxAmount;

    private BigDecimal storeToOrderRate;

    private BigDecimal baseDiscountAmount;

    private BigDecimal baseToOrderRate;

    private BigDecimal grandTotal;

    private BigDecimal baseAdjustmentNegative;

    private BigDecimal baseSubtotalInclTax;

    private BigDecimal shippingAmount;

    private BigDecimal subtotalInclTax;

    private BigDecimal adjustmentNegative;

    private BigDecimal baseShippingAmount;

    private BigDecimal storeToBaseRate;

    private BigDecimal baseToGlobalRate;

    private BigDecimal baseAdjustment;

    private BigDecimal baseSubtotal;

    private BigDecimal discountAmount;

    private BigDecimal subtotal;

    private BigDecimal adjustment;

    private BigDecimal baseGrandTotal;

    private BigDecimal baseAdjustmentPositive;

    private BigDecimal baseTaxAmount;

    private BigDecimal shippingTaxAmount;

    private BigDecimal taxAmount;

    private Integer orderId;

    private Integer emailSent;

    private Integer creditmemoStatus;

    private Integer state;

    private Integer shippingAddressId;

    private Integer billingAddressId;

    private Integer invoiceId;

    private String storeCurrencyCode;

    private String orderCurrencyCode;

    private String baseCurrencyCode;

    private String globalCurrencyCode;

    private String transactionId;

    private String incrementId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private BigDecimal hiddenTaxAmount;

    private BigDecimal baseHiddenTaxAmount;

    private BigDecimal shippingHiddenTaxAmount;

    private BigDecimal baseShippingHiddenTaxAmnt;

    private BigDecimal shippingInclTax;

    private BigDecimal baseShippingInclTax;

    private String discountDescription;

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

    public BigDecimal getAdjustmentPositive() {
        return adjustmentPositive;
    }

    public void setAdjustmentPositive(BigDecimal adjustmentPositive) {
        this.adjustmentPositive = adjustmentPositive;
    }

    public BigDecimal getBaseShippingTaxAmount() {
        return baseShippingTaxAmount;
    }

    public void setBaseShippingTaxAmount(BigDecimal baseShippingTaxAmount) {
        this.baseShippingTaxAmount = baseShippingTaxAmount;
    }

    public BigDecimal getStoreToOrderRate() {
        return storeToOrderRate;
    }

    public void setStoreToOrderRate(BigDecimal storeToOrderRate) {
        this.storeToOrderRate = storeToOrderRate;
    }

    public BigDecimal getBaseDiscountAmount() {
        return baseDiscountAmount;
    }

    public void setBaseDiscountAmount(BigDecimal baseDiscountAmount) {
        this.baseDiscountAmount = baseDiscountAmount;
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

    public BigDecimal getBaseAdjustmentNegative() {
        return baseAdjustmentNegative;
    }

    public void setBaseAdjustmentNegative(BigDecimal baseAdjustmentNegative) {
        this.baseAdjustmentNegative = baseAdjustmentNegative;
    }

    public BigDecimal getBaseSubtotalInclTax() {
        return baseSubtotalInclTax;
    }

    public void setBaseSubtotalInclTax(BigDecimal baseSubtotalInclTax) {
        this.baseSubtotalInclTax = baseSubtotalInclTax;
    }

    public BigDecimal getShippingAmount() {
        return shippingAmount;
    }

    public void setShippingAmount(BigDecimal shippingAmount) {
        this.shippingAmount = shippingAmount;
    }

    public BigDecimal getSubtotalInclTax() {
        return subtotalInclTax;
    }

    public void setSubtotalInclTax(BigDecimal subtotalInclTax) {
        this.subtotalInclTax = subtotalInclTax;
    }

    public BigDecimal getAdjustmentNegative() {
        return adjustmentNegative;
    }

    public void setAdjustmentNegative(BigDecimal adjustmentNegative) {
        this.adjustmentNegative = adjustmentNegative;
    }

    public BigDecimal getBaseShippingAmount() {
        return baseShippingAmount;
    }

    public void setBaseShippingAmount(BigDecimal baseShippingAmount) {
        this.baseShippingAmount = baseShippingAmount;
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

    public BigDecimal getBaseAdjustment() {
        return baseAdjustment;
    }

    public void setBaseAdjustment(BigDecimal baseAdjustment) {
        this.baseAdjustment = baseAdjustment;
    }

    public BigDecimal getBaseSubtotal() {
        return baseSubtotal;
    }

    public void setBaseSubtotal(BigDecimal baseSubtotal) {
        this.baseSubtotal = baseSubtotal;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getAdjustment() {
        return adjustment;
    }

    public void setAdjustment(BigDecimal adjustment) {
        this.adjustment = adjustment;
    }

    public BigDecimal getBaseGrandTotal() {
        return baseGrandTotal;
    }

    public void setBaseGrandTotal(BigDecimal baseGrandTotal) {
        this.baseGrandTotal = baseGrandTotal;
    }

    public BigDecimal getBaseAdjustmentPositive() {
        return baseAdjustmentPositive;
    }

    public void setBaseAdjustmentPositive(BigDecimal baseAdjustmentPositive) {
        this.baseAdjustmentPositive = baseAdjustmentPositive;
    }

    public BigDecimal getBaseTaxAmount() {
        return baseTaxAmount;
    }

    public void setBaseTaxAmount(BigDecimal baseTaxAmount) {
        this.baseTaxAmount = baseTaxAmount;
    }

    public BigDecimal getShippingTaxAmount() {
        return shippingTaxAmount;
    }

    public void setShippingTaxAmount(BigDecimal shippingTaxAmount) {
        this.shippingTaxAmount = shippingTaxAmount;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getEmailSent() {
        return emailSent;
    }

    public void setEmailSent(Integer emailSent) {
        this.emailSent = emailSent;
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

    public Integer getShippingAddressId() {
        return shippingAddressId;
    }

    public void setShippingAddressId(Integer shippingAddressId) {
        this.shippingAddressId = shippingAddressId;
    }

    public Integer getBillingAddressId() {
        return billingAddressId;
    }

    public void setBillingAddressId(Integer billingAddressId) {
        this.billingAddressId = billingAddressId;
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

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getIncrementId() {
        return incrementId;
    }

    public void setIncrementId(String incrementId) {
        this.incrementId = incrementId;
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

    public BigDecimal getHiddenTaxAmount() {
        return hiddenTaxAmount;
    }

    public void setHiddenTaxAmount(BigDecimal hiddenTaxAmount) {
        this.hiddenTaxAmount = hiddenTaxAmount;
    }

    public BigDecimal getBaseHiddenTaxAmount() {
        return baseHiddenTaxAmount;
    }

    public void setBaseHiddenTaxAmount(BigDecimal baseHiddenTaxAmount) {
        this.baseHiddenTaxAmount = baseHiddenTaxAmount;
    }

    public BigDecimal getShippingHiddenTaxAmount() {
        return shippingHiddenTaxAmount;
    }

    public void setShippingHiddenTaxAmount(BigDecimal shippingHiddenTaxAmount) {
        this.shippingHiddenTaxAmount = shippingHiddenTaxAmount;
    }

    public BigDecimal getBaseShippingHiddenTaxAmnt() {
        return baseShippingHiddenTaxAmnt;
    }

    public void setBaseShippingHiddenTaxAmnt(BigDecimal baseShippingHiddenTaxAmnt) {
        this.baseShippingHiddenTaxAmnt = baseShippingHiddenTaxAmnt;
    }

    public BigDecimal getShippingInclTax() {
        return shippingInclTax;
    }

    public void setShippingInclTax(BigDecimal shippingInclTax) {
        this.shippingInclTax = shippingInclTax;
    }

    public BigDecimal getBaseShippingInclTax() {
        return baseShippingInclTax;
    }

    public void setBaseShippingInclTax(BigDecimal baseShippingInclTax) {
        this.baseShippingInclTax = baseShippingInclTax;
    }

    public String getDiscountDescription() {
        return discountDescription;
    }

    public void setDiscountDescription(String discountDescription) {
        this.discountDescription = discountDescription;
    }

}

