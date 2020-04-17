package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class SalesFlatInvoice {

    private Integer entityId;

    private Integer storeId;

    private BigDecimal baseGrandTotal;

    private BigDecimal shippingTaxAmount;

    private BigDecimal taxAmount;

    private BigDecimal baseTaxAmount;

    private BigDecimal storeToOrderRate;

    private BigDecimal baseShippingTaxAmount;

    private BigDecimal baseDiscountAmount;

    private BigDecimal baseToOrderRate;

    private BigDecimal grandTotal;

    private BigDecimal shippingAmount;

    private BigDecimal subtotalInclTax;

    private BigDecimal baseSubtotalInclTax;

    private BigDecimal storeToBaseRate;

    private BigDecimal baseShippingAmount;

    private BigDecimal totalQty;

    private BigDecimal baseToGlobalRate;

    private BigDecimal subtotal;

    private BigDecimal baseSubtotal;

    private BigDecimal discountAmount;

    private Integer billingAddressId;

    private Integer isUsedForRefund;

    private Integer orderId;

    private Integer emailSent;

    private Integer canVoidFlag;

    private Integer state;

    private Integer shippingAddressId;

    private String storeCurrencyCode;

    private String transactionId;

    private String orderCurrencyCode;

    private String baseCurrencyCode;

    private String globalCurrencyCode;

    private String incrementId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private BigDecimal hiddenTaxAmount;

    private BigDecimal baseHiddenTaxAmount;

    private BigDecimal shippingHiddenTaxAmount;

    private BigDecimal baseShippingHiddenTaxAmnt;

    private BigDecimal shippingInclTax;

    private BigDecimal baseShippingInclTax;

    private BigDecimal baseTotalRefunded;

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

    public BigDecimal getBaseGrandTotal() {
        return baseGrandTotal;
    }

    public void setBaseGrandTotal(BigDecimal baseGrandTotal) {
        this.baseGrandTotal = baseGrandTotal;
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

    public BigDecimal getBaseTaxAmount() {
        return baseTaxAmount;
    }

    public void setBaseTaxAmount(BigDecimal baseTaxAmount) {
        this.baseTaxAmount = baseTaxAmount;
    }

    public BigDecimal getStoreToOrderRate() {
        return storeToOrderRate;
    }

    public void setStoreToOrderRate(BigDecimal storeToOrderRate) {
        this.storeToOrderRate = storeToOrderRate;
    }

    public BigDecimal getBaseShippingTaxAmount() {
        return baseShippingTaxAmount;
    }

    public void setBaseShippingTaxAmount(BigDecimal baseShippingTaxAmount) {
        this.baseShippingTaxAmount = baseShippingTaxAmount;
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

    public BigDecimal getBaseSubtotalInclTax() {
        return baseSubtotalInclTax;
    }

    public void setBaseSubtotalInclTax(BigDecimal baseSubtotalInclTax) {
        this.baseSubtotalInclTax = baseSubtotalInclTax;
    }

    public BigDecimal getStoreToBaseRate() {
        return storeToBaseRate;
    }

    public void setStoreToBaseRate(BigDecimal storeToBaseRate) {
        this.storeToBaseRate = storeToBaseRate;
    }

    public BigDecimal getBaseShippingAmount() {
        return baseShippingAmount;
    }

    public void setBaseShippingAmount(BigDecimal baseShippingAmount) {
        this.baseShippingAmount = baseShippingAmount;
    }

    public BigDecimal getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(BigDecimal totalQty) {
        this.totalQty = totalQty;
    }

    public BigDecimal getBaseToGlobalRate() {
        return baseToGlobalRate;
    }

    public void setBaseToGlobalRate(BigDecimal baseToGlobalRate) {
        this.baseToGlobalRate = baseToGlobalRate;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
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

    public Integer getBillingAddressId() {
        return billingAddressId;
    }

    public void setBillingAddressId(Integer billingAddressId) {
        this.billingAddressId = billingAddressId;
    }

    public Integer getIsUsedForRefund() {
        return isUsedForRefund;
    }

    public void setIsUsedForRefund(Integer isUsedForRefund) {
        this.isUsedForRefund = isUsedForRefund;
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

    public Integer getCanVoidFlag() {
        return canVoidFlag;
    }

    public void setCanVoidFlag(Integer canVoidFlag) {
        this.canVoidFlag = canVoidFlag;
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

    public String getStoreCurrencyCode() {
        return storeCurrencyCode;
    }

    public void setStoreCurrencyCode(String storeCurrencyCode) {
        this.storeCurrencyCode = storeCurrencyCode;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
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

    public BigDecimal getBaseTotalRefunded() {
        return baseTotalRefunded;
    }

    public void setBaseTotalRefunded(BigDecimal baseTotalRefunded) {
        this.baseTotalRefunded = baseTotalRefunded;
    }

    public String getDiscountDescription() {
        return discountDescription;
    }

    public void setDiscountDescription(String discountDescription) {
        this.discountDescription = discountDescription;
    }

}

