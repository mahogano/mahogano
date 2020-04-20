package com.mahogano.core.presta.entity;


public class WarehouseProductLocation {

    private Integer idWarehouseProductLocation;

    private Integer idProduct;

    private Integer idProductAttribute;

    private Integer idWarehouse;

    private String location;

    public Integer getIdWarehouseProductLocation() {
        return idWarehouseProductLocation;
    }

    public void setIdWarehouseProductLocation(Integer idWarehouseProductLocation) {
        this.idWarehouseProductLocation = idWarehouseProductLocation;
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

    public Integer getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(Integer idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}

