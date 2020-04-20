package com.mahogano.core.presta.entity;


public class SupplyOrderState {

    private Integer idSupplyOrderState;

    private Integer deliveryNote;

    private Integer editable;

    private Integer receiptState;

    private Integer pendingReceipt;

    private Integer enclosed;

    private String color;

    public Integer getIdSupplyOrderState() {
        return idSupplyOrderState;
    }

    public void setIdSupplyOrderState(Integer idSupplyOrderState) {
        this.idSupplyOrderState = idSupplyOrderState;
    }

    public Integer getDeliveryNote() {
        return deliveryNote;
    }

    public void setDeliveryNote(Integer deliveryNote) {
        this.deliveryNote = deliveryNote;
    }

    public Integer getEditable() {
        return editable;
    }

    public void setEditable(Integer editable) {
        this.editable = editable;
    }

    public Integer getReceiptState() {
        return receiptState;
    }

    public void setReceiptState(Integer receiptState) {
        this.receiptState = receiptState;
    }

    public Integer getPendingReceipt() {
        return pendingReceipt;
    }

    public void setPendingReceipt(Integer pendingReceipt) {
        this.pendingReceipt = pendingReceipt;
    }

    public Integer getEnclosed() {
        return enclosed;
    }

    public void setEnclosed(Integer enclosed) {
        this.enclosed = enclosed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

