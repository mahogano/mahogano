package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class SalesRecurringProfile {

    private Integer profileId;

    private String state;

    private Integer customerId;

    private Integer storeId;

    private String methodCode;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String referenceId;

    private String subscriberName;

    private LocalDateTime startDatetime;

    private String internalReferenceId;

    private String scheduleDescription;

    private Integer suspensionThreshold;

    private Integer billFailedLater;

    private String periodUnit;

    private Integer periodFrequency;

    private Integer periodMaxCycles;

    private BigDecimal billingAmount;

    private String trialPeriodUnit;

    private Integer trialPeriodFrequency;

    private Integer trialPeriodMaxCycles;

    private String trialBillingAmount;

    private String currencyCode;

    private BigDecimal shippingAmount;

    private BigDecimal taxAmount;

    private BigDecimal initAmount;

    private Integer initMayFail;

    private String orderInfo;

    private String orderItemInfo;

    private String billingAddressInfo;

    private String shippingAddressInfo;

    private String profileVendorInfo;

    private String additionalInfo;

    public Integer getProfileId() {
        return profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getMethodCode() {
        return methodCode;
    }

    public void setMethodCode(String methodCode) {
        this.methodCode = methodCode;
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

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public LocalDateTime getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(LocalDateTime startDatetime) {
        this.startDatetime = startDatetime;
    }

    public String getInternalReferenceId() {
        return internalReferenceId;
    }

    public void setInternalReferenceId(String internalReferenceId) {
        this.internalReferenceId = internalReferenceId;
    }

    public String getScheduleDescription() {
        return scheduleDescription;
    }

    public void setScheduleDescription(String scheduleDescription) {
        this.scheduleDescription = scheduleDescription;
    }

    public Integer getSuspensionThreshold() {
        return suspensionThreshold;
    }

    public void setSuspensionThreshold(Integer suspensionThreshold) {
        this.suspensionThreshold = suspensionThreshold;
    }

    public Integer getBillFailedLater() {
        return billFailedLater;
    }

    public void setBillFailedLater(Integer billFailedLater) {
        this.billFailedLater = billFailedLater;
    }

    public String getPeriodUnit() {
        return periodUnit;
    }

    public void setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
    }

    public Integer getPeriodFrequency() {
        return periodFrequency;
    }

    public void setPeriodFrequency(Integer periodFrequency) {
        this.periodFrequency = periodFrequency;
    }

    public Integer getPeriodMaxCycles() {
        return periodMaxCycles;
    }

    public void setPeriodMaxCycles(Integer periodMaxCycles) {
        this.periodMaxCycles = periodMaxCycles;
    }

    public BigDecimal getBillingAmount() {
        return billingAmount;
    }

    public void setBillingAmount(BigDecimal billingAmount) {
        this.billingAmount = billingAmount;
    }

    public String getTrialPeriodUnit() {
        return trialPeriodUnit;
    }

    public void setTrialPeriodUnit(String trialPeriodUnit) {
        this.trialPeriodUnit = trialPeriodUnit;
    }

    public Integer getTrialPeriodFrequency() {
        return trialPeriodFrequency;
    }

    public void setTrialPeriodFrequency(Integer trialPeriodFrequency) {
        this.trialPeriodFrequency = trialPeriodFrequency;
    }

    public Integer getTrialPeriodMaxCycles() {
        return trialPeriodMaxCycles;
    }

    public void setTrialPeriodMaxCycles(Integer trialPeriodMaxCycles) {
        this.trialPeriodMaxCycles = trialPeriodMaxCycles;
    }

    public String getTrialBillingAmount() {
        return trialBillingAmount;
    }

    public void setTrialBillingAmount(String trialBillingAmount) {
        this.trialBillingAmount = trialBillingAmount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getShippingAmount() {
        return shippingAmount;
    }

    public void setShippingAmount(BigDecimal shippingAmount) {
        this.shippingAmount = shippingAmount;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getInitAmount() {
        return initAmount;
    }

    public void setInitAmount(BigDecimal initAmount) {
        this.initAmount = initAmount;
    }

    public Integer getInitMayFail() {
        return initMayFail;
    }

    public void setInitMayFail(Integer initMayFail) {
        this.initMayFail = initMayFail;
    }

    public String getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String getOrderItemInfo() {
        return orderItemInfo;
    }

    public void setOrderItemInfo(String orderItemInfo) {
        this.orderItemInfo = orderItemInfo;
    }

    public String getBillingAddressInfo() {
        return billingAddressInfo;
    }

    public void setBillingAddressInfo(String billingAddressInfo) {
        this.billingAddressInfo = billingAddressInfo;
    }

    public String getShippingAddressInfo() {
        return shippingAddressInfo;
    }

    public void setShippingAddressInfo(String shippingAddressInfo) {
        this.shippingAddressInfo = shippingAddressInfo;
    }

    public String getProfileVendorInfo() {
        return profileVendorInfo;
    }

    public void setProfileVendorInfo(String profileVendorInfo) {
        this.profileVendorInfo = profileVendorInfo;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

}

