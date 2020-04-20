package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class ProductSale {

    private Integer idProduct;

    private Integer quantity;

    private Integer saleNbr;

    private LocalDateTime dateUpd;

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getSaleNbr() {
        return saleNbr;
    }

    public void setSaleNbr(Integer saleNbr) {
        this.saleNbr = saleNbr;
    }

    public LocalDateTime getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(LocalDateTime dateUpd) {
        this.dateUpd = dateUpd;
    }

}

