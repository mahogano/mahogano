package com.mahogano.core.presta.entity;

import java.math.BigDecimal;

public class OrderInvoiceTax {

    private Integer idOrderInvoice;

    private String type;

    private Integer idTax;

    private BigDecimal amount;

    public Integer getIdOrderInvoice() {
        return idOrderInvoice;
    }

    public void setIdOrderInvoice(Integer idOrderInvoice) {
        this.idOrderInvoice = idOrderInvoice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getIdTax() {
        return idTax;
    }

    public void setIdTax(Integer idTax) {
        this.idTax = idTax;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}

