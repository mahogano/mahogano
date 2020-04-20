package com.mahogano.core.presta.entity;


public class ShopGroup {

    private Integer idShopGroup;

    private String name;

    private Integer shareCustomer;

    private Integer shareOrder;

    private Integer shareStock;

    private Integer active;

    private Integer deleted;

    public Integer getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(Integer idShopGroup) {
        this.idShopGroup = idShopGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getShareCustomer() {
        return shareCustomer;
    }

    public void setShareCustomer(Integer shareCustomer) {
        this.shareCustomer = shareCustomer;
    }

    public Integer getShareOrder() {
        return shareOrder;
    }

    public void setShareOrder(Integer shareOrder) {
        this.shareOrder = shareOrder;
    }

    public Integer getShareStock() {
        return shareStock;
    }

    public void setShareStock(Integer shareStock) {
        this.shareStock = shareStock;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

}

