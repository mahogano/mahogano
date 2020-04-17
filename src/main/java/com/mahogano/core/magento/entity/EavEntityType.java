package com.mahogano.core.magento.entity;

public class EavEntityType {

    private Integer entityTypeId;

    private String entityTypeCode;

    private String entityModel;

    private String attributeModel;

    private String entityTable;

    private String valueTablePrefix;

    private String entityIdField;

    private Integer isDataSharing;

    private String dataSharingKey;

    private Integer defaultAttributeSetId;

    private String incrementModel;

    private Integer incrementPerStore;

    private Integer incrementPadLength;

    private String incrementPadChar;

    private String additionalAttributeTable;

    private String entityAttributeCollection;

    public Integer getEntityTypeId() {
        return entityTypeId;
    }

    public void setEntityTypeId(Integer entityTypeId) {
        this.entityTypeId = entityTypeId;
    }

    public String getEntityTypeCode() {
        return entityTypeCode;
    }

    public void setEntityTypeCode(String entityTypeCode) {
        this.entityTypeCode = entityTypeCode;
    }

    public String getEntityModel() {
        return entityModel;
    }

    public void setEntityModel(String entityModel) {
        this.entityModel = entityModel;
    }

    public String getAttributeModel() {
        return attributeModel;
    }

    public void setAttributeModel(String attributeModel) {
        this.attributeModel = attributeModel;
    }

    public String getEntityTable() {
        return entityTable;
    }

    public void setEntityTable(String entityTable) {
        this.entityTable = entityTable;
    }

    public String getValueTablePrefix() {
        return valueTablePrefix;
    }

    public void setValueTablePrefix(String valueTablePrefix) {
        this.valueTablePrefix = valueTablePrefix;
    }

    public String getEntityIdField() {
        return entityIdField;
    }

    public void setEntityIdField(String entityIdField) {
        this.entityIdField = entityIdField;
    }

    public Integer getIsDataSharing() {
        return isDataSharing;
    }

    public void setIsDataSharing(Integer isDataSharing) {
        this.isDataSharing = isDataSharing;
    }

    public String getDataSharingKey() {
        return dataSharingKey;
    }

    public void setDataSharingKey(String dataSharingKey) {
        this.dataSharingKey = dataSharingKey;
    }

    public Integer getDefaultAttributeSetId() {
        return defaultAttributeSetId;
    }

    public void setDefaultAttributeSetId(Integer defaultAttributeSetId) {
        this.defaultAttributeSetId = defaultAttributeSetId;
    }

    public String getIncrementModel() {
        return incrementModel;
    }

    public void setIncrementModel(String incrementModel) {
        this.incrementModel = incrementModel;
    }

    public Integer getIncrementPerStore() {
        return incrementPerStore;
    }

    public void setIncrementPerStore(Integer incrementPerStore) {
        this.incrementPerStore = incrementPerStore;
    }

    public Integer getIncrementPadLength() {
        return incrementPadLength;
    }

    public void setIncrementPadLength(Integer incrementPadLength) {
        this.incrementPadLength = incrementPadLength;
    }

    public String getIncrementPadChar() {
        return incrementPadChar;
    }

    public void setIncrementPadChar(String incrementPadChar) {
        this.incrementPadChar = incrementPadChar;
    }

    public String getAdditionalAttributeTable() {
        return additionalAttributeTable;
    }

    public void setAdditionalAttributeTable(String additionalAttributeTable) {
        this.additionalAttributeTable = additionalAttributeTable;
    }

    public String getEntityAttributeCollection() {
        return entityAttributeCollection;
    }

    public void setEntityAttributeCollection(String entityAttributeCollection) {
        this.entityAttributeCollection = entityAttributeCollection;
    }

}

