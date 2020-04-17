package com.mahogano.core.magento.entity;

public class CoreLayoutUpdate {

    private Integer layoutUpdateId;

    private String handle;

    private String xml;

    private Integer sortOrder;

    public Integer getLayoutUpdateId() {
        return layoutUpdateId;
    }

    public void setLayoutUpdateId(Integer layoutUpdateId) {
        this.layoutUpdateId = layoutUpdateId;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

}

