package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class Catalogrule {

    private Integer ruleId;

    private String name;

    private String description;

    private LocalDateTime fromDate;

    private LocalDateTime toDate;

    private Integer isActive;

    private String conditionsSerialized;

    private String actionsSerialized;

    private Integer stopRulesProcessing;

    private Integer sortOrder;

    private String simpleAction;

    private BigDecimal discountAmount;

    private Integer subIsEnable;

    private String subSimpleAction;

    private BigDecimal subDiscountAmount;

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

    public Integer getSubIsEnable() {
        return subIsEnable;
    }

    public void setSubIsEnable(Integer subIsEnable) {
        this.subIsEnable = subIsEnable;
    }

    public String getSubSimpleAction() {
        return subSimpleAction;
    }

    public void setSubSimpleAction(String subSimpleAction) {
        this.subSimpleAction = subSimpleAction;
    }

    public BigDecimal getSubDiscountAmount() {
        return subDiscountAmount;
    }

    public void setSubDiscountAmount(BigDecimal subDiscountAmount) {
        this.subDiscountAmount = subDiscountAmount;
    }

}

