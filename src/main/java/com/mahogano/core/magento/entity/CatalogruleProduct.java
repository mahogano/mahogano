package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

public class CatalogruleProduct {

    private Integer ruleProductId;

    private Integer ruleId;

    private Integer fromTime;

    private Integer toTime;

    private Integer customerGroupId;

    private Integer productId;

    private String actionOperator;

    private BigDecimal actionAmount;

    private Integer actionStop;

    private Integer sortOrder;

    private Integer websiteId;

    private String subSimpleAction;

    private BigDecimal subDiscountAmount;

    public Integer getRuleProductId() {
        return ruleProductId;
    }

    public void setRuleProductId(Integer ruleProductId) {
        this.ruleProductId = ruleProductId;
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public Integer getFromTime() {
        return fromTime;
    }

    public void setFromTime(Integer fromTime) {
        this.fromTime = fromTime;
    }

    public Integer getToTime() {
        return toTime;
    }

    public void setToTime(Integer toTime) {
        this.toTime = toTime;
    }

    public Integer getCustomerGroupId() {
        return customerGroupId;
    }

    public void setCustomerGroupId(Integer customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getActionOperator() {
        return actionOperator;
    }

    public void setActionOperator(String actionOperator) {
        this.actionOperator = actionOperator;
    }

    public BigDecimal getActionAmount() {
        return actionAmount;
    }

    public void setActionAmount(BigDecimal actionAmount) {
        this.actionAmount = actionAmount;
    }

    public Integer getActionStop() {
        return actionStop;
    }

    public void setActionStop(Integer actionStop) {
        this.actionStop = actionStop;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Integer getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(Integer websiteId) {
        this.websiteId = websiteId;
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

