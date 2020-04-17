package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

public class CatalogProductLinkAttributeDecimal {

    private Integer valueId;

    private Integer productLinkAttributeId;

    private Integer linkId;

    private BigDecimal value;

    public Integer getValueId() {
        return valueId;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    public Integer getProductLinkAttributeId() {
        return productLinkAttributeId;
    }

    public void setProductLinkAttributeId(Integer productLinkAttributeId) {
        this.productLinkAttributeId = productLinkAttributeId;
    }

    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

}

