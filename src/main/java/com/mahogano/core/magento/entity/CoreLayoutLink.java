package com.mahogano.core.magento.entity;

public class CoreLayoutLink {

    private Integer layoutLinkId;

    private Integer storeId;

    private String area;

    private String packageVariable;

    private String theme;

    private Integer layoutUpdateId;

    public Integer getLayoutLinkId() {
        return layoutLinkId;
    }

    public void setLayoutLinkId(Integer layoutLinkId) {
        this.layoutLinkId = layoutLinkId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPackageVariable() {
        return packageVariable;
    }

    public void setPackageVariable(String packageVariable) {
        this.packageVariable = packageVariable;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Integer getLayoutUpdateId() {
        return layoutUpdateId;
    }

    public void setLayoutUpdateId(Integer layoutUpdateId) {
        this.layoutUpdateId = layoutUpdateId;
    }

}

