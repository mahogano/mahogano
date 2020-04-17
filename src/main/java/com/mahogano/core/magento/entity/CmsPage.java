package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class CmsPage {

    private Integer pageId;

    private String title;

    private String rootTemplate;

    private String metaKeywords;

    private String metaDescription;

    private String identifier;

    private String contentHeading;

    private String content;

    private LocalDateTime creationTime;

    private LocalDateTime updateTime;

    private Integer isActive;

    private Integer sortOrder;

    private String layoutUpdateXml;

    private String customTheme;

    private String customRootTemplate;

    private String customLayoutUpdateXml;

    private LocalDateTime customThemeFrom;

    private LocalDateTime customThemeTo;

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRootTemplate() {
        return rootTemplate;
    }

    public void setRootTemplate(String rootTemplate) {
        this.rootTemplate = rootTemplate;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getContentHeading() {
        return contentHeading;
    }

    public void setContentHeading(String contentHeading) {
        this.contentHeading = contentHeading;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getLayoutUpdateXml() {
        return layoutUpdateXml;
    }

    public void setLayoutUpdateXml(String layoutUpdateXml) {
        this.layoutUpdateXml = layoutUpdateXml;
    }

    public String getCustomTheme() {
        return customTheme;
    }

    public void setCustomTheme(String customTheme) {
        this.customTheme = customTheme;
    }

    public String getCustomRootTemplate() {
        return customRootTemplate;
    }

    public void setCustomRootTemplate(String customRootTemplate) {
        this.customRootTemplate = customRootTemplate;
    }

    public String getCustomLayoutUpdateXml() {
        return customLayoutUpdateXml;
    }

    public void setCustomLayoutUpdateXml(String customLayoutUpdateXml) {
        this.customLayoutUpdateXml = customLayoutUpdateXml;
    }

    public LocalDateTime getCustomThemeFrom() {
        return customThemeFrom;
    }

    public void setCustomThemeFrom(LocalDateTime customThemeFrom) {
        this.customThemeFrom = customThemeFrom;
    }

    public LocalDateTime getCustomThemeTo() {
        return customThemeTo;
    }

    public void setCustomThemeTo(LocalDateTime customThemeTo) {
        this.customThemeTo = customThemeTo;
    }

}

