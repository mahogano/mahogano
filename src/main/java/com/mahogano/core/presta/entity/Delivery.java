package com.mahogano.core.presta.entity;

import java.math.BigDecimal;

public class Delivery {

    private Integer idDelivery;

    private Integer idShop;

    private Integer idShopGroup;

    private Integer idCarrier;

    private Integer idRangePrice;

    private Integer idRangeWeight;

    private Integer idZone;

    private BigDecimal price;

    public Integer getIdDelivery() {
        return idDelivery;
    }

    public void setIdDelivery(Integer idDelivery) {
        this.idDelivery = idDelivery;
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

    public Integer getIdCarrier() {
        return idCarrier;
    }

    public void setIdCarrier(Integer idCarrier) {
        this.idCarrier = idCarrier;
    }

    public Integer getIdRangePrice() {
        return idRangePrice;
    }

    public void setIdRangePrice(Integer idRangePrice) {
        this.idRangePrice = idRangePrice;
    }

    public Integer getIdRangeWeight() {
        return idRangeWeight;
    }

    public void setIdRangeWeight(Integer idRangeWeight) {
        this.idRangeWeight = idRangeWeight;
    }

    public Integer getIdZone() {
        return idZone;
    }

    public void setIdZone(Integer idZone) {
        this.idZone = idZone;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}

