package com.mahogano.core.magento.entity;

public class CustomerFlowpassword {

    private Integer flowpasswordId;

    private String ip;

    private String email;

    private String requestedDate;

    public Integer getFlowpasswordId() {
        return flowpasswordId;
    }

    public void setFlowpasswordId(Integer flowpasswordId) {
        this.flowpasswordId = flowpasswordId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
    }

}

