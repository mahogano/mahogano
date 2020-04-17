package com.mahogano.core.magento.entity;

public class ReportEventTypes {

    private Integer eventTypeId;

    private String eventName;

    private Integer customerLogin;

    public Integer getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Integer getCustomerLogin() {
        return customerLogin;
    }

    public void setCustomerLogin(Integer customerLogin) {
        this.customerLogin = customerLogin;
    }

}

