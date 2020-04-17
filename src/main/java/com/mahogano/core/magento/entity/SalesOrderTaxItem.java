package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

public class SalesOrderTaxItem {

    private Integer taxItemId;

    private Integer taxId;

    private Integer itemId;

    private BigDecimal taxPercent;

    public Integer getTaxItemId() {
        return taxItemId;
    }

    public void setTaxItemId(Integer taxItemId) {
        this.taxItemId = taxItemId;
    }

    public Integer getTaxId() {
        return taxId;
    }

    public void setTaxId(Integer taxId) {
        this.taxId = taxId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(BigDecimal taxPercent) {
        this.taxPercent = taxPercent;
    }

}

