package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class CustomerMessage {

    private Integer idCustomerMessage;

    private Integer idCustomerThread;

    private Integer idEmployee;

    private String message;

    private String fileName;

    private String ipAddress;

    private String userAgent;

    private LocalDateTime dateAdd;

    private LocalDateTime dateUpd;

    private Integer privateVariable;

    private Integer read;

    public Integer getIdCustomerMessage() {
        return idCustomerMessage;
    }

    public void setIdCustomerMessage(Integer idCustomerMessage) {
        this.idCustomerMessage = idCustomerMessage;
    }

    public Integer getIdCustomerThread() {
        return idCustomerThread;
    }

    public void setIdCustomerThread(Integer idCustomerThread) {
        this.idCustomerThread = idCustomerThread;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

    public LocalDateTime getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(LocalDateTime dateUpd) {
        this.dateUpd = dateUpd;
    }

    public Integer getPrivateVariable() {
        return privateVariable;
    }

    public void setPrivateVariable(Integer privateVariable) {
        this.privateVariable = privateVariable;
    }

    public Integer getRead() {
        return read;
    }

    public void setRead(Integer read) {
        this.read = read;
    }

}

