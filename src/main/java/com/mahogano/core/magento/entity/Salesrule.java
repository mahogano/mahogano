package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class Salesrule {

    private Integer ruleId;

    private String name;

    private String description;

    private LocalDateTime fromDate;

    private LocalDateTime toDate;

    private Integer usesPerCustomer;

    private Integer isActive;

    private String conditionsSerialized;

    private String actionsSerialized;

    private Integer stopRulesProcessing;

    private Integer isAdvanced;

    private String productIds;

    private Integer sortOrder;

    private String simpleAction;

    private BigDecimal discountAmount;

    private BigDecimal discountQty;

    private Integer discountStep;

    private Integer simpleFreeShipping;

    private Integer applyToShipping;

    private Integer timesUsed;

    private Integer isRss;

    private Integer couponType;

    private Integer useAutoGeneration;

    private Integer usesPerCoupon;

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
    }

    public Integer getUsesPerCustomer() {
        return usesPerCustomer;
    }

    public void setUsesPerCustomer(Integer usesPerCustomer) {
        this.usesPerCustomer = usesPerCustomer;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getConditionsSerialized() {
        return conditionsSerialized;
    }

    public void setConditionsSerialized(String conditionsSerialized) {
        this.conditionsSerialized = conditionsSerialized;
    }

    public String getActionsSerialized() {
        return actionsSerialized;
    }

    public void setActionsSerialized(String actionsSerialized) {
        this.actionsSerialized = actionsSerialized;
    }

    public Integer getStopRulesProcessing() {
        return stopRulesProcessing;
    }

    public void setStopRulesProcessing(Integer stopRulesProcessing) {
        this.stopRulesProcessing = stopRulesProcessing;
    }

    public Integer getIsAdvanced() {
        return isAdvanced;
    }

    public void setIsAdvanced(Integer isAdvanced) {
        this.isAdvanced = isAdvanced;
    }

    public String getProductIds() {
        return productIds;
    }

    public void setProductIds(String productIds) {
        this.productIds = productIds;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getSimpleAction() {
        return simpleAction;
    }

    public void setSimpleAction(String simpleAction) {
        this.simpleAction = simpleAction;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getDiscountQty() {
        return discountQty;
    }

    public void setDiscountQty(BigDecimal discountQty) {
        this.discountQty = discountQty;
    }

    public Integer getDiscountStep() {
        return discountStep;
    }

    public void setDiscountStep(Integer discountStep) {
        this.discountStep = discountStep;
    }

    public Integer getSimpleFreeShipping() {
        return simpleFreeShipping;
    }

    public void setSimpleFreeShipping(Integer simpleFreeShipping) {
        this.simpleFreeShipping = simpleFreeShipping;
    }

    public Integer getApplyToShipping() {
        return applyToShipping;
    }

    public void setApplyToShipping(Integer applyToShipping) {
        this.applyToShipping = applyToShipping;
    }

    public Integer getTimesUsed() {
        return timesUsed;
    }

    public void setTimesUsed(Integer timesUsed) {
        this.timesUsed = timesUsed;
    }

    public Integer getIsRss() {
        return isRss;
    }

    public void setIsRss(Integer isRss) {
        this.isRss = isRss;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public Integer getUseAutoGeneration() {
        return useAutoGeneration;
    }

    public void setUseAutoGeneration(Integer useAutoGeneration) {
        this.useAutoGeneration = useAutoGeneration;
    }

    public Integer getUsesPerCoupon() {
        return usesPerCoupon;
    }

    public void setUsesPerCoupon(Integer usesPerCoupon) {
        this.usesPerCoupon = usesPerCoupon;
    }

}

