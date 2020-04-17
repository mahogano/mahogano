package com.mahogano.core.magento.entity;

public class EavAttributeGroup {

    private Integer attributeGroupId;

    private Integer attributeSetId;

    private String attributeGroupName;

    private Integer sortOrder;

    private Integer defaultId;

    public Integer getAttributeGroupId() {
        return attributeGroupId;
    }

    public void setAttributeGroupId(Integer attributeGroupId) {
        this.attributeGroupId = attributeGroupId;
    }

    public Integer getAttributeSetId() {
        return attributeSetId;
    }

    public void setAttributeSetId(Integer attributeSetId) {
        this.attributeSetId = attributeSetId;
    }

    public String getAttributeGroupName() {
        return attributeGroupName;
    }

    public void setAttributeGroupName(String attributeGroupName) {
        this.attributeGroupName = attributeGroupName;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Integer getDefaultId() {
        return defaultId;
    }

    public void setDefaultId(Integer defaultId) {
        this.defaultId = defaultId;
    }

}

