package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class ApiUser {

    private Integer userId;

    private String firstname;

    private String lastname;

    private String email;

    private String username;

    private String apiKey;

    private LocalDateTime created;

    private LocalDateTime modified;

    private Integer lognum;

    private Integer reloadAclFlag;

    private Integer isActive;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public Integer getLognum() {
        return lognum;
    }

    public void setLognum(Integer lognum) {
        this.lognum = lognum;
    }

    public Integer getReloadAclFlag() {
        return reloadAclFlag;
    }

    public void setReloadAclFlag(Integer reloadAclFlag) {
        this.reloadAclFlag = reloadAclFlag;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

}

