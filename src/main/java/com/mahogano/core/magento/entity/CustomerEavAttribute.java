package com.mahogano.core.magento.entity;

public class CustomerEavAttribute {

    private Integer attributeId;

    private Integer isVisible;

    private String inputFilter;

    private Integer multilineCount;

    private String validateRules;

    private Integer isSystem;

    private Integer sortOrder;

    private String dataModel;

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public Integer getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Integer isVisible) {
        this.isVisible = isVisible;
    }

    public String getInputFilter() {
        return inputFilter;
    }

    public void setInputFilter(String inputFilter) {
        this.inputFilter = inputFilter;
    }

    public Integer getMultilineCount() {
        return multilineCount;
    }

    public void setMultilineCount(Integer multilineCount) {
        this.multilineCount = multilineCount;
    }

    public String getValidateRules() {
        return validateRules;
    }

    public void setValidateRules(String validateRules) {
        this.validateRules = validateRules;
    }

    public Integer getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Integer isSystem) {
        this.isSystem = isSystem;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getDataModel() {
        return dataModel;
    }

    public void setDataModel(String dataModel) {
        this.dataModel = dataModel;
    }

}

