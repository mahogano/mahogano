package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class CartProduct {

    private Integer idCart;

    private Integer idProduct;

    private Integer idAddressDelivery;

    private Integer idShop;

    private Integer idProductAttribute;

    private Integer idCustomization;

    private Integer quantity;

    private LocalDateTime dateAdd;

    public Integer getIdCart() {
        return idCart;
    }

    public void setIdCart(Integer idCart) {
        this.idCart = idCart;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getIdAddressDelivery() {
        return idAddressDelivery;
    }

    public void setIdAddressDelivery(Integer idAddressDelivery) {
        this.idAddressDelivery = idAddressDelivery;
    }

    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
    }

    public Integer getIdProductAttribute() {
        return idProductAttribute;
    }

    public void setIdProductAttribute(Integer idProductAttribute) {
        this.idProductAttribute = idProductAttribute;
    }

    public Integer getIdCustomization() {
        return idCustomization;
    }

    public void setIdCustomization(Integer idCustomization) {
        this.idCustomization = idCustomization;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

}

