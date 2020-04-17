package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

public class CatalogProductBundleSelection {

    private Integer selectionId;

    private Integer optionId;

    private Integer parentProductId;

    private Integer productId;

    private Integer position;

    private Integer isDefault;

    private Integer selectionPriceType;

    private BigDecimal selectionPriceValue;

    private BigDecimal selectionQty;

    private Integer selectionCanChangeQty;

    public Integer getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(Integer selectionId) {
        this.selectionId = selectionId;
    }

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public Integer getParentProductId() {
        return parentProductId;
    }

    public void setParentProductId(Integer parentProductId) {
        this.parentProductId = parentProductId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
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

    public BigDecimal getSelectionQty() {
        return selectionQty;
    }

    public void setSelectionQty(BigDecimal selectionQty) {
        this.selectionQty = selectionQty;
    }

    public Integer getSelectionCanChangeQty() {
        return selectionCanChangeQty;
    }

    public void setSelectionCanChangeQty(Integer selectionCanChangeQty) {
        this.selectionCanChangeQty = selectionCanChangeQty;
    }

}

