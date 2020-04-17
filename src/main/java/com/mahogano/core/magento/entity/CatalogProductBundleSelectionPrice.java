package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

public class CatalogProductBundleSelectionPrice {

    private Integer selectionId;

    private Integer websiteId;

    private Integer selectionPriceType;

    private BigDecimal selectionPriceValue;

    public Integer getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(Integer selectionId) {
        this.selectionId = selectionId;
    }

    public Integer getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(Integer websiteId) {
        this.websiteId = websiteId;
    }

    public Integer getSelectionPriceType() {
        return selectionPriceType;
    }

    public void setSelectionPriceType(Integer selectionPriceType) {
        this.selectionPriceType = selectionPriceType;
    }

    public BigDecimal getSelectionPriceValue() {
        return selectionPriceValue;
    }

    public void setSelectionPriceValue(BigDecimal selectionPriceValue) {
        this.selectionPriceValue = selectionPriceValue;
    }

}

