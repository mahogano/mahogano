package com.mahogano.core.magento.entity;

public class CustomerEavAttributeWebsite {

    private Integer attributeId;

    private Integer websiteId;

    private Integer isVisible;

    private Integer isRequired;

    private String defaultValue;

    private Integer multilineCount;

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public Integer getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(Integer websiteId) {
        this.websiteId = websiteId;
    }

    public Integer getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Integer isVisible) {
        this.isVisible = isVisible;
    }

    public Integer getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Integer isRequired) {
        this.isRequired = isRequired;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Integer getMultilineCount() {
        return multilineCount;
    }

    public void setMultilineCount(Integer multilineCount) {
        this.multilineCount = multilineCount;
    }

}

