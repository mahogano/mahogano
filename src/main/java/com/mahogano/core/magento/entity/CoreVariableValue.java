package com.mahogano.core.magento.entity;

public class CoreVariableValue {

    private Integer valueId;

    private Integer variableId;

    private Integer storeId;

    private String plainValue;

    private String htmlValue;

    public Integer getValueId() {
        return valueId;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    public Integer getVariableId() {
        return variableId;
    }

    public void setVariableId(Integer variableId) {
        this.variableId = variableId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getPlainValue() {
        return plainValue;
    }

    public void setPlainValue(String plainValue) {
        this.plainValue = plainValue;
    }

    public String getHtmlValue() {
        return htmlValue;
    }

    public void setHtmlValue(String htmlValue) {
        this.htmlValue = htmlValue;
    }

}

