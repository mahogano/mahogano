package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class DateRange {

    private Integer idDateRange;

    private LocalDateTime timeStart;

    private LocalDateTime timeEnd;

    public Integer getIdDateRange() {
        return idDateRange;
    }

    public void setIdDateRange(Integer idDateRange) {
        this.idDateRange = idDateRange;
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

