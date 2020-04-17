package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class PollVote {

    private Integer voteId;

    private Integer pollId;

    private Integer pollAnswerId;

    private byte[] ipAddress;

    private Integer customerId;

    private LocalDateTime voteTime;

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public Integer getPollId() {
        return pollId;
    }

    public void setPollId(Integer pollId) {
        this.pollId = pollId;
    }

    public Integer getPollAnswerId() {
        return pollAnswerId;
    }

    public void setPollAnswerId(Integer pollAnswerId) {
        this.pollAnswerId = pollAnswerId;
    }

    public byte[] getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(byte[] ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getVoteTime() {
        return voteTime;
    }

    public void setVoteTime(LocalDateTime voteTime) {
        this.voteTime = voteTime;
    }

}

