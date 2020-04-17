package com.mahogano.core.magento.entity;

public class TaxCalculationRateTitle {

    private Integer taxCalculationRateTitleId;

    private Integer taxCalculationRateId;

    private Integer storeId;

    private String value;

    public Integer getTaxCalculationRateTitleId() {
        return taxCalculationRateTitleId;
    }

    public void setTaxCalculationRateTitleId(Integer taxCalculationRateTitleId) {
        this.taxCalculationRateTitleId = taxCalculationRateTitleId;
    }

    public Integer getTaxCalculationRateId() {
        return taxCalculationRateId;
    }

    public void setTaxCalculationRateId(Integer taxCalculationRateId) {
        this.taxCalculationRateId = taxCalculationRateId;
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

