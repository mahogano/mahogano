package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class CoreEmailTemplate {

    private Integer templateId;

    private String templateCode;

    private String templateText;

    private String templateStyles;

    private Integer templateType;

    private String templateSubject;

    private String templateSenderName;

    private String templateSenderEmail;

    private LocalDateTime addedAt;

    private LocalDateTime modifiedAt;

    private String origTemplateCode;

    private String origTemplateVariables;

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getTemplateText() {
        return templateText;
    }

    public void setTemplateText(String templateText) {
        this.templateText = templateText;
    }

    public String getTemplateStyles() {
        return templateStyles;
    }

    public void setTemplateStyles(String templateStyles) {
        this.templateStyles = templateStyles;
    }

    public Integer getTemplateType() {
        return templateType;
    }

    public void setTemplateType(Integer templateType) {
        this.templateType = templateType;
    }

    public String getTemplateSubject() {
        return templateSubject;
    }

    public void setTemplateSubject(String templateSubject) {
        this.templateSubject = templateSubject;
    }

    public String getTemplateSenderName() {
        return templateSenderName;
    }

    public void setTemplateSenderName(String templateSenderName) {
        this.templateSenderName = templateSenderName;
    }

    public String getTemplateSenderEmail() {
        return templateSenderEmail;
    }

    public void setTemplateSenderEmail(String templateSenderEmail) {
        this.templateSenderEmail = templateSenderEmail;
    }

    public LocalDateTime getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(LocalDateTime addedAt) {
        this.addedAt = addedAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getOrigTemplateCode() {
        return origTemplateCode;
    }

    public void setOrigTemplateCode(String origTemplateCode) {
        this.origTemplateCode = origTemplateCode;
    }

    public String getOrigTemplateVariables() {
        return origTemplateVariables;
    }

    public void setOrigTemplateVariables(String origTemplateVariables) {
        this.origTemplateVariables = origTemplateVariables;
    }

}

