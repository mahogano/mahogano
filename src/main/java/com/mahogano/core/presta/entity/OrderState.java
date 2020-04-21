package com.mahogano.core.presta.entity;


public class OrderState {

    private Integer idOrderState;

    private Integer invoice;

    private Integer sendEmail;

    private String moduleName;

    private String color;

    private Integer unremovable;

    private Integer hidden;

    private Integer logable;

    private Integer delivery;

    private Integer shipped;

    private Integer paid;

    private Integer pdfInvoice;

    private Integer pdfDelivery;

    private Integer deleted;

    public Integer getIdOrderState() {
        return idOrderState;
    }

    public void setIdOrderState(Integer idOrderState) {
        this.idOrderState = idOrderState;
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    public Integer getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(Integer sendEmail) {
        this.sendEmail = sendEmail;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getUnremovable() {
        return unremovable;
    }

    public void setUnremovable(Integer unremovable) {
        this.unremovable = unremovable;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public Integer getLogable() {
        return logable;
    }

    public void setLogable(Integer logable) {
        this.logable = logable;
    }

    public Integer getDelivery() {
        return delivery;
    }

    public void setDelivery(Integer delivery) {
        this.delivery = delivery;
    }

    public Integer getShipped() {
        return shipped;
    }

    public void setShipped(Integer shipped) {
        this.shipped = shipped;
    }

    public Integer getPaid() {
        return paid;
    }

    public void setPaid(Integer paid) {
        this.paid = paid;
    }

    public Integer getPdfInvoice() {
        return pdfInvoice;
    }

    public void setPdfInvoice(Integer pdfInvoice) {
        this.pdfInvoice = pdfInvoice;
    }

    public Integer getPdfDelivery() {
        return pdfDelivery;
    }

    public void setPdfDelivery(Integer pdfDelivery) {
        this.pdfDelivery = pdfDelivery;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

}

