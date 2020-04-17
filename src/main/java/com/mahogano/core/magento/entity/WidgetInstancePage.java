package com.mahogano.core.magento.entity;

public class WidgetInstancePage {

    private Integer pageId;

    private Integer instanceId;

    private String pageGroup;

    private String layoutHandle;

    private String blockReference;

    private String pageFor;

    private String entities;

    private String pageTemplate;

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public Integer getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
    }

    public String getPageGroup() {
        return pageGroup;
    }

    public void setPageGroup(String pageGroup) {
        this.pageGroup = pageGroup;
    }

    public String getLayoutHandle() {
        return layoutHandle;
    }

    public void setLayoutHandle(String layoutHandle) {
        this.layoutHandle = layoutHandle;
    }

    public String getBlockReference() {
        return blockReference;
    }

    public void setBlockReference(String blockReference) {
        this.blockReference = blockReference;
    }

    public String getPageFor() {
        return pageFor;
    }

    public void setPageFor(String pageFor) {
        this.pageFor = pageFor;
    }

    public String getEntities() {
        return entities;
    }

    public void setEntities(String entities) {
        this.entities = entities;
    }

    public String getPageTemplate() {
        return pageTemplate;
    }

    public void setPageTemplate(String pageTemplate) {
        this.pageTemplate = pageTemplate;
    }

}

