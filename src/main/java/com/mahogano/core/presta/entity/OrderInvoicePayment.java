package com.mahogano.core.presta.entity;


public class OrderInvoicePayment {

    private Integer idOrderInvoice;

    private Integer idOrderPayment;

    private Integer idOrder;

    public Integer getIdOrderInvoice() {
        return idOrderInvoice;
    }

    public void setIdOrderInvoice(Integer idOrderInvoice) {
        this.idOrderInvoice = idOrderInvoice;
    }

    public Integer getIdOrderPayment() {
        return idOrderPayment;
    }

    public void setIdOrderPayment(Integer idOrderPayment) {
        this.idOrderPayment = idOrderPayment;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

}

