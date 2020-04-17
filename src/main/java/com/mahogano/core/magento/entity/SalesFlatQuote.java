package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class SalesFlatQuote {

    private Integer entityId;

    private Integer storeId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime convertedAt;

    private Integer isActive;

    private Integer isVirtual;

    private Integer isMultiShipping;

    private Integer itemsCount;

    private BigDecimal itemsQty;

    private Integer origOrderId;

    private BigDecimal storeToBaseRate;

    private BigDecimal storeToQuoteRate;

    private String baseCurrencyCode;

    private String storeCurrencyCode;

    private String quoteCurrencyCode;

    private BigDecimal grandTotal;

    private BigDecimal baseGrandTotal;

    private String checkoutMethod;

    private Integer customerId;

    private Integer customerTaxClassId;

    private Integer customerGroupId;

    private String customerEmail;

    private String customerPrefix;

    private String customerFirstname;

    private String customerMiddlename;

    private String customerLastname;

    private String customerSuffix;

    private LocalDateTime customerDob;

    private String customerNote;

    private Integer customerNoteNotify;

    private Integer customerIsGuest;

    private String remoteIp;

    private String appliedRuleIds;

    private String reservedOrderId;

    private String passwordHash;

    private String couponCode;

    private String globalCurrencyCode;

    private BigDecimal baseToGlobalRate;

    private BigDecimal baseToQuoteRate;

    private String customerTaxvat;

    private String customerGender;

    private BigDecimal subtotal;

    private BigDecimal baseSubtotal;

    private BigDecimal subtotalWithDiscount;

    private BigDecimal baseSubtotalWithDiscount;

    private Integer isChanged;

    private Integer triggerRecollect;

    private String extShippingInfo;

    private Integer giftMessageId;

    private Integer isPersistent;

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

    public LocalDateTime getConvertedAt() {
        return convertedAt;
    }

    public void setConvertedAt(LocalDateTime convertedAt) {
        this.convertedAt = convertedAt;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Integer getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(Integer isVirtual) {
        this.isVirtual = isVirtual;
    }

    public Integer getIsMultiShipping() {
        return isMultiShipping;
    }

    public void setIsMultiShipping(Integer isMultiShipping) {
        this.isMultiShipping = isMultiShipping;
    }

    public Integer getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(Integer itemsCount) {
        this.itemsCount = itemsCount;
    }

    public BigDecimal getItemsQty() {
        return itemsQty;
    }

    public void setItemsQty(BigDecimal itemsQty) {
        this.itemsQty = itemsQty;
    }

    public Integer getOrigOrderId() {
        return origOrderId;
    }

    public void setOrigOrderId(Integer origOrderId) {
        this.origOrderId = origOrderId;
    }

    public BigDecimal getStoreToBaseRate() {
        return storeToBaseRate;
    }

    public void setStoreToBaseRate(BigDecimal storeToBaseRate) {
        this.storeToBaseRate = storeToBaseRate;
    }

    public BigDecimal getStoreToQuoteRate() {
        return storeToQuoteRate;
    }

    public void setStoreToQuoteRate(BigDecimal storeToQuoteRate) {
        this.storeToQuoteRate = storeToQuoteRate;
    }

    public String getBaseCurrencyCode() {
        return baseCurrencyCode;
    }

    public void setBaseCurrencyCode(String baseCurrencyCode) {
        this.baseCurrencyCode = baseCurrencyCode;
    }

    public String getStoreCurrencyCode() {
        return storeCurrencyCode;
    }

    public void setStoreCurrencyCode(String storeCurrencyCode) {
        this.storeCurrencyCode = storeCurrencyCode;
    }

    public String getQuoteCurrencyCode() {
        return quoteCurrencyCode;
    }

    public void setQuoteCurrencyCode(String quoteCurrencyCode) {
        this.quoteCurrencyCode = quoteCurrencyCode;
    }

    public BigDecimal getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }

    public BigDecimal getBaseGrandTotal() {
        return baseGrandTotal;
    }

    public void setBaseGrandTotal(BigDecimal baseGrandTotal) {
        this.baseGrandTotal = baseGrandTotal;
    }

    public String getCheckoutMethod() {
        return checkoutMethod;
    }

    public void setCheckoutMethod(String checkoutMethod) {
        this.checkoutMethod = checkoutMethod;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCustomerTaxClassId() {
        return customerTaxClassId;
    }

    public void setCustomerTaxClassId(Integer customerTaxClassId) {
        this.customerTaxClassId = customerTaxClassId;
    }

    public Integer getCustomerGroupId() {
        return customerGroupId;
    }

    public void setCustomerGroupId(Integer customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPrefix() {
        return customerPrefix;
    }

    public void setCustomerPrefix(String customerPrefix) {
        this.customerPrefix = customerPrefix;
    }

    public String getCustomerFirstname() {
        return customerFirstname;
    }

    public void setCustomerFirstname(String customerFirstname) {
        this.customerFirstname = customerFirstname;
    }

    public String getCustomerMiddlename() {
        return customerMiddlename;
    }

    public void setCustomerMiddlename(String customerMiddlename) {
        this.customerMiddlename = customerMiddlename;
    }

    public String getCustomerLastname() {
        return customerLastname;
    }

    public void setCustomerLastname(String customerLastname) {
        this.customerLastname = customerLastname;
    }

    public String getCustomerSuffix() {
        return customerSuffix;
    }

    public void setCustomerSuffix(String customerSuffix) {
        this.customerSuffix = customerSuffix;
    }

    public LocalDateTime getCustomerDob() {
        return customerDob;
    }

    public void setCustomerDob(LocalDateTime customerDob) {
        this.customerDob = customerDob;
    }

    public String getCustomerNote() {
        return customerNote;
    }

    public void setCustomerNote(String customerNote) {
        this.customerNote = customerNote;
    }

    public Integer getCustomerNoteNotify() {
        return customerNoteNotify;
    }

    public void setCustomerNoteNotify(Integer customerNoteNotify) {
        this.customerNoteNotify = customerNoteNotify;
    }

    public Integer getCustomerIsGuest() {
        return customerIsGuest;
    }

    public void setCustomerIsGuest(Integer customerIsGuest) {
        this.customerIsGuest = customerIsGuest;
    }

    public String getRemoteIp() {
        return remoteIp;
    }

    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }

    public String getAppliedRuleIds() {
        return appliedRuleIds;
    }

    public void setAppliedRuleIds(String appliedRuleIds) {
        this.appliedRuleIds = appliedRuleIds;
    }

    public String getReservedOrderId() {
        return reservedOrderId;
    }

    public void setReservedOrderId(String reservedOrderId) {
        this.reservedOrderId = reservedOrderId;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getGlobalCurrencyCode() {
        return globalCurrencyCode;
    }

    public void setGlobalCurrencyCode(String globalCurrencyCode) {
        this.globalCurrencyCode = globalCurrencyCode;
    }

    public BigDecimal getBaseToGlobalRate() {
        return baseToGlobalRate;
    }

    public void setBaseToGlobalRate(BigDecimal baseToGlobalRate) {
        this.baseToGlobalRate = baseToGlobalRate;
    }

    public BigDecimal getBaseToQuoteRate() {
        return baseToQuoteRate;
    }

    public void setBaseToQuoteRate(BigDecimal baseToQuoteRate) {
        this.baseToQuoteRate = baseToQuoteRate;
    }

    public String getCustomerTaxvat() {
        return customerTaxvat;
    }

    public void setCustomerTaxvat(String customerTaxvat) {
        this.customerTaxvat = customerTaxvat;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
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

    public BigDecimal getSubtotalWithDiscount() {
        return subtotalWithDiscount;
    }

    public void setSubtotalWithDiscount(BigDecimal subtotalWithDiscount) {
        this.subtotalWithDiscount = subtotalWithDiscount;
    }

    public BigDecimal getBaseSubtotalWithDiscount() {
        return baseSubtotalWithDiscount;
    }

    public void setBaseSubtotalWithDiscount(BigDecimal baseSubtotalWithDiscount) {
        this.baseSubtotalWithDiscount = baseSubtotalWithDiscount;
    }

    public Integer getIsChanged() {
        return isChanged;
    }

    public void setIsChanged(Integer isChanged) {
        this.isChanged = isChanged;
    }

    public Integer getTriggerRecollect() {
        return triggerRecollect;
    }

    public void setTriggerRecollect(Integer triggerRecollect) {
        this.triggerRecollect = triggerRecollect;
    }

    public String getExtShippingInfo() {
        return extShippingInfo;
    }

    public void setExtShippingInfo(String extShippingInfo) {
        this.extShippingInfo = extShippingInfo;
    }

    public Integer getGiftMessageId() {
        return giftMessageId;
    }

    public void setGiftMessageId(Integer giftMessageId) {
        this.giftMessageId = giftMessageId;
    }

    public Integer getIsPersistent() {
        return isPersistent;
    }

    public void setIsPersistent(Integer isPersistent) {
        this.isPersistent = isPersistent;
    }

}

