package com.mahogano.core.magento.entity;

public class EavEntityStore {

    private Integer entityStoreId;

    private Integer entityTypeId;

    private Integer storeId;

    private String incrementPrefix;

    private String incrementLastId;

    public Integer getEntityStoreId() {
        return entityStoreId;
    }

    public void setEntityStoreId(Integer entityStoreId) {
        this.entityStoreId = entityStoreId;
    }

    public Integer getEntityTypeId() {
        return entityTypeId;
    }

    public void setEntityTypeId(Integer entityTypeId) {
        this.entityTypeId = entityTypeId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getIncrementPrefix() {
        return incrementPrefix;
    }

    public void setIncrementPrefix(String incrementPrefix) {
        this.incrementPrefix = incrementPrefix;
    }

    public String getIncrementLastId() {
        return incrementLastId;
    }

    public void setIncrementLastId(String incrementLastId) {
        this.incrementLastId = incrementLastId;
    }

}

