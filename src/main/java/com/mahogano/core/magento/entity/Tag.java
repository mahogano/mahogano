package com.mahogano.core.magento.entity;

public class Tag {

    private Integer tagId;

    private String name;

    private Integer status;

    private Integer firstCustomerId;

    private Integer firstStoreId;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFirstCustomerId() {
        return firstCustomerId;
    }

    public void setFirstCustomerId(Integer firstCustomerId) {
        this.firstCustomerId = firstCustomerId;
    }

    public Integer getFirstStoreId() {
        return firstStoreId;
    }

    public void setFirstStoreId(Integer firstStoreId) {
        this.firstStoreId = firstStoreId;
    }

}

