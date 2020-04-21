package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class SmartyLastFlush {

    private String type;

    private LocalDateTime lastFlush;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getLastFlush() {
        return lastFlush;
    }

    public void setLastFlush(LocalDateTime lastFlush) {
        this.lastFlush = lastFlush;
    }

}

