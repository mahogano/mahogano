package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

public class CustomerAddressEntityDecimal {

    private Integer valueId;

    private Integer entityTypeId;

    private Integer attributeId;

    private Integer entityId;

    private BigDecimal value;

    public Integer getValueId() {
        return valueId;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    public Integer getEntityTypeId() {
        return entityTypeId;
    }

    public void setEntityTypeId(Integer entityTypeId) {
        this.entityTypeId = entityTypeId;
    }

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

}

