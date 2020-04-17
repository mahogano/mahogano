package com.mahogano.core.magento.entity;

public class CheckoutAgreement {

    private Integer agreementId;

    private String name;

    private String content;

    private String contentHeight;

    private String checkboxText;

    private Integer isActive;

    private Integer isHtml;

    public Integer getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(Integer agreementId) {
        this.agreementId = agreementId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentHeight() {
        return contentHeight;
    }

    public void setContentHeight(String contentHeight) {
        this.contentHeight = contentHeight;
    }

    public String getCheckboxText() {
        return checkboxText;
    }

    public void setCheckboxText(String checkboxText) {
        this.checkboxText = checkboxText;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Integer getIsHtml() {
        return isHtml;
    }

    public void setIsHtml(Integer isHtml) {
        this.isHtml = isHtml;
    }

}

