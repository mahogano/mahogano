package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class CoreFlag {

    private Integer flagId;

    private String flagCode;

    private Integer state;

    private String flagData;

    private LocalDateTime lastUpdate;

    public Integer getFlagId() {
        return flagId;
    }

    public void setFlagId(Integer flagId) {
        this.flagId = flagId;
    }

    public String getFlagCode() {
        return flagCode;
    }

    public void setFlagCode(String flagCode) {
        this.flagCode = flagCode;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getFlagData() {
        return flagData;
    }

    public void setFlagData(String flagData) {
        this.flagData = flagData;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}

