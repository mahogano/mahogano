package com.mahogano.core.magento.entity;

public class WidgetInstance {

    private Integer instanceId;

    private String instanceType;

    private String packageTheme;

    private String title;

    private String storeIds;

    private String widgetParameters;

    private Integer sortOrder;

    public Integer getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getPackageTheme() {
        return packageTheme;
    }

    public void setPackageTheme(String packageTheme) {
        this.packageTheme = packageTheme;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStoreIds() {
        return storeIds;
    }

    public void setStoreIds(String storeIds) {
        this.storeIds = storeIds;
    }

    public String getWidgetParameters() {
        return widgetParameters;
    }

    public void setWidgetParameters(String widgetParameters) {
        this.widgetParameters = widgetParameters;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

}

