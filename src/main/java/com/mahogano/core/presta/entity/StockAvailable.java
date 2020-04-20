package com.mahogano.core.presta.entity;


public class StockAvailable {

    private Integer idStockAvailable;

    private Integer idProduct;

    private Integer idProductAttribute;

    private Integer idShop;

    private Integer idShopGroup;

    private Integer quantity;

    private Integer physicalQuantity;

    private Integer reservedQuantity;

    private Integer dependsOnStock;

    private Integer outOfStock;

    private String location;

    public Integer getIdStockAvailable() {
        return idStockAvailable;
    }

    public void setIdStockAvailable(Integer idStockAvailable) {
        this.idStockAvailable = idStockAvailable;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getIdProductAttribute() {
        return idProductAttribute;
    }

    public void setIdProductAttribute(Integer idProductAttribute) {
        this.idProductAttribute = idProductAttribute;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPhysicalQuantity() {
        return physicalQuantity;
    }

    public void setPhysicalQuantity(Integer physicalQuantity) {
        this.physicalQuantity = physicalQuantity;
    }

    public Integer getReservedQuantity() {
        return reservedQuantity;
    }

    public void setReservedQuantity(Integer reservedQuantity) {
        this.reservedQuantity = reservedQuantity;
    }

    public Integer getDependsOnStock() {
        return dependsOnStock;
    }

    public void setDependsOnStock(Integer dependsOnStock) {
        this.dependsOnStock = dependsOnStock;
    }

    public Integer getOutOfStock() {
        return outOfStock;
    }

    public void setOutOfStock(Integer outOfStock) {
        this.outOfStock = outOfStock;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}

