package com.mahogano.core.presta.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SpecificPrice {

    private Integer idSpecificPrice;

    private Integer idSpecificPriceRule;

    private Integer idCart;

    private Integer idProduct;

    private Integer idShop;

    private Integer idShopGroup;

    private Integer idCurrency;

    private Integer idCountry;

    private Integer idGroup;

    private Integer idCustomer;

    private Integer idProductAttribute;

    private BigDecimal price;

    private Integer fromQuantity;

    private BigDecimal reduction;

    private Integer reductionTax;

    private String reductionType;

    private LocalDateTime from;

    private LocalDateTime to;

    public Integer getIdSpecificPrice() {
        return idSpecificPrice;
    }

    public void setIdSpecificPrice(Integer idSpecificPrice) {
        this.idSpecificPrice = idSpecificPrice;
    }

    public Integer getIdSpecificPriceRule() {
        return idSpecificPriceRule;
    }

    public void setIdSpecificPriceRule(Integer idSpecificPriceRule) {
        this.idSpecificPriceRule = idSpecificPriceRule;
    }

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

    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
    }

    public Integer getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(Integer idShopGroup) {
        this.idShopGroup = idShopGroup;
    }

    public Integer getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(Integer idCurrency) {
        this.idCurrency = idCurrency;
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Integer getIdProductAttribute() {
        return idProductAttribute;
    }

    public void setIdProductAttribute(Integer idProductAttribute) {
        this.idProductAttribute = idProductAttribute;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getFromQuantity() {
        return fromQuantity;
    }

    public void setFromQuantity(Integer fromQuantity) {
        this.fromQuantity = fromQuantity;
    }

    public BigDecimal getReduction() {
        return reduction;
    }

    public void setReduction(BigDecimal reduction) {
        this.reduction = reduction;
    }

    public Integer getReductionTax() {
        return reductionTax;
    }

    public void setReductionTax(Integer reductionTax) {
        this.reductionTax = reductionTax;
    }

    public String getReductionType() {
        return reductionType;
    }

    public void setReductionType(String reductionType) {
        this.reductionType = reductionType;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public void setFrom(LocalDateTime from) {
        this.from = from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public void setTo(LocalDateTime to) {
        this.to = to;
    }

}

