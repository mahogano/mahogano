package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class Poll {

    private Integer pollId;

    private String pollTitle;

    private Integer votesCount;

    private Integer storeId;

    private LocalDateTime datePosted;

    private LocalDateTime dateClosed;

    private Integer active;

    private Integer closed;

    private Integer answersDisplay;

    public Integer getPollId() {
        return pollId;
    }

    public void setPollId(Integer pollId) {
        this.pollId = pollId;
    }

    public String getPollTitle() {
        return pollTitle;
    }

    public void setPollTitle(String pollTitle) {
        this.pollTitle = pollTitle;
    }

    public Integer getVotesCount() {
        return votesCount;
    }

    public void setVotesCount(Integer votesCount) {
        this.votesCount = votesCount;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public LocalDateTime getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(LocalDateTime datePosted) {
        this.datePosted = datePosted;
    }

    public LocalDateTime getDateClosed() {
        return dateClosed;
    }

    public void setDateClosed(LocalDateTime dateClosed) {
        this.dateClosed = dateClosed;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getClosed() {
        return closed;
    }

    public void setClosed(Integer closed) {
        this.closed = closed;
    }

    public Integer getAnswersDisplay() {
        return answersDisplay;
    }

    public void setAnswersDisplay(Integer answersDisplay) {
        this.answersDisplay = answersDisplay;
    }

}

