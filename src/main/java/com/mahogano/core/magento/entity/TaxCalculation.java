package com.mahogano.core.magento.entity;

public class TaxCalculation {

    private Integer taxCalculationId;

    private Integer taxCalculationRateId;

    private Integer taxCalculationRuleId;

    private Integer customerTaxClassId;

    private Integer productTaxClassId;

    public Integer getTaxCalculationId() {
        return taxCalculationId;
    }

    public void setTaxCalculationId(Integer taxCalculationId) {
        this.taxCalculationId = taxCalculationId;
    }

    public Integer getTaxCalculationRateId() {
        return taxCalculationRateId;
    }

    public void setTaxCalculationRateId(Integer taxCalculationRateId) {
        this.taxCalculationRateId = taxCalculationRateId;
    }

    public Integer getTaxCalculationRuleId() {
        return taxCalculationRuleId;
    }

    public void setTaxCalculationRuleId(Integer taxCalculationRuleId) {
        this.taxCalculationRuleId = taxCalculationRuleId;
    }

    public Integer getCustomerTaxClassId() {
        return customerTaxClassId;
    }

    public void setCustomerTaxClassId(Integer customerTaxClassId) {
        this.customerTaxClassId = customerTaxClassId;
    }

    public Integer getProductTaxClassId() {
        return productTaxClassId;
    }

    public void setProductTaxClassId(Integer productTaxClassId) {
        this.productTaxClassId = productTaxClassId;
    }

}

