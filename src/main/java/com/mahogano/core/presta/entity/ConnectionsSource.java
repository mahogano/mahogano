package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class ConnectionsSource {

    private Integer idConnectionsSource;

    private Integer idConnections;

    private String httpReferer;

    private String requestUri;

    private String keywords;

    private LocalDateTime dateAdd;

    public Integer getIdConnectionsSource() {
        return idConnectionsSource;
    }

    public void setIdConnectionsSource(Integer idConnectionsSource) {
        this.idConnectionsSource = idConnectionsSource;
    }

    public Integer getIdConnections() {
        return idConnections;
    }

    public void setIdConnections(Integer idConnections) {
        this.idConnections = idConnections;
    }

    public String getHttpReferer() {
        return httpReferer;
    }

    public void setHttpReferer(String httpReferer) {
        this.httpReferer = httpReferer;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

}

