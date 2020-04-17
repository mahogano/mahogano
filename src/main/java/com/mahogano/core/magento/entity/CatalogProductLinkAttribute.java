package com.mahogano.core.magento.entity;

public class CatalogProductLinkAttribute {

    private Integer productLinkAttributeId;

    private Integer linkTypeId;

    private String productLinkAttributeCode;

    private String dataType;

    public Integer getProductLinkAttributeId() {
        return productLinkAttributeId;
    }

    public void setProductLinkAttributeId(Integer productLinkAttributeId) {
        this.productLinkAttributeId = productLinkAttributeId;
    }

    public Integer getLinkTypeId() {
        return linkTypeId;
    }

    public void setLinkTypeId(Integer linkTypeId) {
        this.linkTypeId = linkTypeId;
    }

    public String getProductLinkAttributeCode() {
        return productLinkAttributeCode;
    }

    public void setProductLinkAttributeCode(String productLinkAttributeCode) {
        this.productLinkAttributeCode = productLinkAttributeCode;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

}

