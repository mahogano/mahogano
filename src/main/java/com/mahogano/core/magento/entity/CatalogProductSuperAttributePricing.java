package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

public class CatalogProductSuperAttributePricing {

    private Integer valueId;

    private Integer productSuperAttributeId;

    private String valueIndex;

    private Integer isPercent;

    private BigDecimal pricingValue;

    private Integer websiteId;

    public Integer getValueId() {
        return valueId;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    public Integer getProductSuperAttributeId() {
        return productSuperAttributeId;
    }

    public void setProductSuperAttributeId(Integer productSuperAttributeId) {
        this.productSuperAttributeId = productSuperAttributeId;
    }

    public String getValueIndex() {
        return valueIndex;
    }

    public void setValueIndex(String valueIndex) {
        this.valueIndex = valueIndex;
    }

    public Integer getIsPercent() {
        return isPercent;
    }

    public void setIsPercent(Integer isPercent) {
        this.isPercent = isPercent;
    }

    public BigDecimal getPricingValue() {
        return pricingValue;
    }

    public void setPricingValue(BigDecimal pricingValue) {
        this.pricingValue = pricingValue;
    }

    public Integer getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(Integer websiteId) {
        this.websiteId = websiteId;
    }

}

