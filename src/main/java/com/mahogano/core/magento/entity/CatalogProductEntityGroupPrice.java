package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

public class CatalogProductEntityGroupPrice {

    private Integer valueId;

    private Integer entityId;

    private Integer allGroups;

    private Integer customerGroupId;

    private BigDecimal value;

    private Integer websiteId;

    private Integer isPercent;

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

    public Integer getIsPercent() {
        return isPercent;
    }

    public void setIsPercent(Integer isPercent) {
        this.isPercent = isPercent;
    }

}

