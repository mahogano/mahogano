package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class NewsletterQueue {

    private Integer queueId;

    private Integer templateId;

    private Integer newsletterType;

    private String newsletterText;

    private String newsletterStyles;

    private String newsletterSubject;

    private String newsletterSenderName;

    private String newsletterSenderEmail;

    private Integer queueStatus;

    private LocalDateTime queueStartAt;

    private LocalDateTime queueFinishAt;

    public Integer getQueueId() {
        return queueId;
    }

    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getNewsletterType() {
        return newsletterType;
    }

    public void setNewsletterType(Integer newsletterType) {
        this.newsletterType = newsletterType;
    }

    public String getNewsletterText() {
        return newsletterText;
    }

    public void setNewsletterText(String newsletterText) {
        this.newsletterText = newsletterText;
    }

    public String getNewsletterStyles() {
        return newsletterStyles;
    }

    public void setNewsletterStyles(String newsletterStyles) {
        this.newsletterStyles = newsletterStyles;
    }

    public String getNewsletterSubject() {
        return newsletterSubject;
    }

    public void setNewsletterSubject(String newsletterSubject) {
        this.newsletterSubject = newsletterSubject;
    }

    public String getNewsletterSenderName() {
        return newsletterSenderName;
    }

    public void setNewsletterSenderName(String newsletterSenderName) {
        this.newsletterSenderName = newsletterSenderName;
    }

    public String getNewsletterSenderEmail() {
        return newsletterSenderEmail;
    }

    public void setNewsletterSenderEmail(String newsletterSenderEmail) {
        this.newsletterSenderEmail = newsletterSenderEmail;
    }

    public Integer getQueueStatus() {
        return queueStatus;
    }

    public void setQueueStatus(Integer queueStatus) {
        this.queueStatus = queueStatus;
    }

    public LocalDateTime getQueueStartAt() {
        return queueStartAt;
    }

    public void setQueueStartAt(LocalDateTime queueStartAt) {
        this.queueStartAt = queueStartAt;
    }

    public LocalDateTime getQueueFinishAt() {
        return queueFinishAt;
    }

    public void setQueueFinishAt(LocalDateTime queueFinishAt) {
        this.queueFinishAt = queueFinishAt;
    }

}

