package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class IndexProcess {

    private Integer processId;

    private String indexerCode;

    private String status;

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;

    private String mode;

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    public String getIndexerCode() {
        return indexerCode;
    }

    public void setIndexerCode(String indexerCode) {
        this.indexerCode = indexerCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(LocalDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public LocalDateTime getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(LocalDateTime endedAt) {
        this.endedAt = endedAt;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

}

