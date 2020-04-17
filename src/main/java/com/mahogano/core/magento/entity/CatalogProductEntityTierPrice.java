package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

public class CatalogProductEntityTierPrice {

    private Integer valueId;

    private Integer entityId;

    private Integer allGroups;

    private Integer customerGroupId;

    private BigDecimal qty;

    private BigDecimal value;

    private Integer websiteId;

    public Integer getValueId() {
        return valueId;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public Integer getAllGroups() {
        return allGroups;
    }

    public void setAllGroups(Integer allGroups) {
        this.allGroups = allGroups;
    }

    public Integer getCustomerGroupId() {
        return customerGroupId;
    }

    public void setCustomerGroupId(Integer customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Integer getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(Integer websiteId) {
        this.websiteId = websiteId;
    }

}

