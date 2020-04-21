package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class ConnectionsPage {

    private Integer idConnections;

    private Integer idPage;

    private LocalDateTime timeStart;

    private LocalDateTime timeEnd;

    public Integer getIdConnections() {
        return idConnections;
    }

    public void setIdConnections(Integer idConnections) {
        this.idConnections = idConnections;
    }

    public Integer getIdPage() {
        return idPage;
    }

    public void setIdPage(Integer idPage) {
        this.idPage = idPage;
    }

    public LocalDateTime getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(LocalDateTime timeStart) {
        this.timeStart = timeStart;
    }

    public LocalDateTime getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(LocalDateTime timeEnd) {
        this.timeEnd = timeEnd;
    }

}

