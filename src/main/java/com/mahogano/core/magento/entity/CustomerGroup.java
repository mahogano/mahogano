package com.mahogano.core.magento.entity;

public class CustomerGroup {

    private Integer customerGroupId;

    private String customerGroupCode;

    private Integer taxClassId;

    public Integer getCustomerGroupId() {
        return customerGroupId;
    }

    public void setCustomerGroupId(Integer customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    public String getCustomerGroupCode() {
        return customerGroupCode;
    }

    public void setCustomerGroupCode(String customerGroupCode) {
        this.customerGroupCode = customerGroupCode;
    }

    public Integer getTaxClassId() {
        return taxClassId;
    }

    public void setTaxClassId(Integer taxClassId) {
        this.taxClassId = taxClassId;
    }

}

