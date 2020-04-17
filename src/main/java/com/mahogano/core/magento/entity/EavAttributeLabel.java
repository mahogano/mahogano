package com.mahogano.core.magento.entity;

public class EavAttributeLabel {

    private Integer attributeLabelId;

    private Integer attributeId;

    private Integer storeId;

    private String value;

    public Integer getAttributeLabelId() {
        return attributeLabelId;
    }

    public void setAttributeLabelId(Integer attributeLabelId) {
        this.attributeLabelId = attributeLabelId;
    }

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}

