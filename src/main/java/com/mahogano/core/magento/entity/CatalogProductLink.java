package com.mahogano.core.magento.entity;

public class CatalogProductLink {

    private Integer linkId;

    private Integer productId;

    private Integer linkedProductId;

    private Integer linkTypeId;

    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getLinkedProductId() {
        return linkedProductId;
    }

    public void setLinkedProductId(Integer linkedProductId) {
        this.linkedProductId = linkedProductId;
    }

    public Integer getLinkTypeId() {
        return linkTypeId;
    }

    public void setLinkTypeId(Integer linkTypeId) {
        this.linkTypeId = linkTypeId;
    }

}

