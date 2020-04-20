package com.mahogano.core.presta.entity;


public class OrderReturnDetail {

    private Integer idOrderReturn;

    private Integer idOrderDetail;

    private Integer idCustomization;

    private Integer productQuantity;

    public Integer getIdOrderReturn() {
        return idOrderReturn;
    }

    public void setIdOrderReturn(Integer idOrderReturn) {
        this.idOrderReturn = idOrderReturn;
    }

    public Integer getIdOrderDetail() {
        return idOrderDetail;
    }

    public void setIdOrderDetail(Integer idOrderDetail) {
        this.idOrderDetail = idOrderDetail;
    }

    public Integer getIdCustomization() {
        return idCustomization;
    }

    public void setIdCustomization(Integer idCustomization) {
        this.idCustomization = idCustomization;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

}

