package com.mahogano.core.magento.entity;

public class TaxCalculationRule {

    private Integer taxCalculationRuleId;

    private String code;

    private Integer priority;

    private Integer position;

    private Integer calculateSubtotal;

    public Integer getTaxCalculationRuleId() {
        return taxCalculationRuleId;
    }

    public void setTaxCalculationRuleId(Integer taxCalculationRuleId) {
        this.taxCalculationRuleId = taxCalculationRuleId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getCalculateSubtotal() {
        return calculateSubtotal;
    }

    public void setCalculateSubtotal(Integer calculateSubtotal) {
        this.calculateSubtotal = calculateSubtotal;
    }

}

