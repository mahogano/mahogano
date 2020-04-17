package com.mahogano.core.magento.entity;

public class CoreStoreGroup {

    private Integer groupId;

    private Integer websiteId;

    private String name;

    private Integer rootCategoryId;

    private Integer defaultStoreId;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(Integer websiteId) {
        this.websiteId = websiteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRootCategoryId() {
        return rootCategoryId;
    }

    public void setRootCategoryId(Integer rootCategoryId) {
        this.rootCategoryId = rootCategoryId;
    }

    public Integer getDefaultStoreId() {
        return defaultStoreId;
    }

    public void setDefaultStoreId(Integer defaultStoreId) {
        this.defaultStoreId = defaultStoreId;
    }

}

