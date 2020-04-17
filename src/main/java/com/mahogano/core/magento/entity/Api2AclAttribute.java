package com.mahogano.core.magento.entity;

public class Api2AclAttribute {

    private Integer entityId;

    private String userType;

    private String resourceId;

    private String operation;

    private String allowedAttributes;

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getAllowedAttributes() {
        return allowedAttributes;
    }

    public void setAllowedAttributes(String allowedAttributes) {
        this.allowedAttributes = allowedAttributes;
    }

}

