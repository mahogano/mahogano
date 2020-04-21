package com.mahogano.core.presta.entity;

import java.math.BigDecimal;

public class OrderCartRule {

    private Integer idOrderCartRule;

    private Integer idOrder;

    private Integer idCartRule;

    private Integer idOrderInvoice;

    private String name;

    private BigDecimal value;

    private BigDecimal valueTaxExcl;

    private Integer freeShipping;

    public Integer getIdOrderCartRule() {
        return idOrderCartRule;
    }

    public void setIdOrderCartRule(Integer idOrderCartRule) {
        this.idOrderCartRule = idOrderCartRule;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getIdCartRule() {
        return idCartRule;
    }

    public void setIdCartRule(Integer idCartRule) {
        this.idCartRule = idCartRule;
    }

    public Integer getIdOrderInvoice() {
        return idOrderInvoice;
    }

    public void setIdOrderInvoice(Integer idOrderInvoice) {
        this.idOrderInvoice = idOrderInvoice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValueTaxExcl() {
        return valueTaxExcl;
    }

    public void setValueTaxExcl(BigDecimal valueTaxExcl) {
        this.valueTaxExcl = valueTaxExcl;
    }

    public Integer getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(Integer freeShipping) {
        this.freeShipping = freeShipping;
    }

}

