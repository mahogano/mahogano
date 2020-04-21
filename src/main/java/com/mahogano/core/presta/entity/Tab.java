package com.mahogano.core.presta.entity;


public class Tab {

    private Integer idTab;

    private Integer idParent;

    private Integer position;

    private String module;

    private String className;

    private Integer active;

    private Integer hideHostMode;

    private String icon;

    public Integer getIdTab() {
        return idTab;
    }

    public void setIdTab(Integer idTab) {
        this.idTab = idTab;
    }

    public Integer getIdParent() {
        return idParent;
    }

    public void setIdParent(Integer idParent) {
        this.idParent = idParent;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getHideHostMode() {
        return hideHostMode;
    }

    public void setHideHostMode(Integer hideHostMode) {
        this.hideHostMode = hideHostMode;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

}

