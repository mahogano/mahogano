package com.mahogano.core.magento.entity;

public class LogVisitorInfo {

    private Long visitorId;

    private String httpReferer;

    private String httpUserAgent;

    private String httpAcceptCharset;

    private String httpAcceptLanguage;

    private byte[] serverAddr;

    private byte[] remoteAddr;

    public Long getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Long visitorId) {
        this.visitorId = visitorId;
    }

    public String getHttpReferer() {
        return httpReferer;
    }

    public void setHttpReferer(String httpReferer) {
        this.httpReferer = httpReferer;
    }

    public String getHttpUserAgent() {
        return httpUserAgent;
    }

    public void setHttpUserAgent(String httpUserAgent) {
        this.httpUserAgent = httpUserAgent;
    }

    public String getHttpAcceptCharset() {
        return httpAcceptCharset;
    }

    public void setHttpAcceptCharset(String httpAcceptCharset) {
        this.httpAcceptCharset = httpAcceptCharset;
    }

    public String getHttpAcceptLanguage() {
        return httpAcceptLanguage;
    }

    public void setHttpAcceptLanguage(String httpAcceptLanguage) {
        this.httpAcceptLanguage = httpAcceptLanguage;
    }

    public byte[] getServerAddr() {
        return serverAddr;
    }

    public void setServerAddr(byte[] serverAddr) {
        this.serverAddr = serverAddr;
    }

    public byte[] getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(byte[] remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

}

