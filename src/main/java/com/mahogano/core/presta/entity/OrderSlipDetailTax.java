package com.mahogano.core.presta.entity;

import java.math.BigDecimal;

public class OrderSlipDetailTax {

    private Integer idOrderSlipDetail;

    private Integer idTax;

    private BigDecimal unitAmount;

    private BigDecimal totalAmount;

    public Integer getIdOrderSlipDetail() {
        return idOrderSlipDetail;
    }

    public void setIdOrderSlipDetail(Integer idOrderSlipDetail) {
        this.idOrderSlipDetail = idOrderSlipDetail;
    }

    public Integer getIdTax() {
        return idTax;
    }

    public void setIdTax(Integer idTax) {
        this.idTax = idTax;
    }

    public BigDecimal getUnitAmount() {
        return unitAmount;
    }

    public void setUnitAmount(BigDecimal unitAmount) {
        this.unitAmount = unitAmount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

}

