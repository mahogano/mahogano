package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class AdminUser {

    private Integer userId;

    private String firstname;

    private String lastname;

    private String email;

    private String username;

    private String password;

    private LocalDateTime created;

    private LocalDateTime modified;

    private LocalDateTime logdate;

    private Integer lognum;

    private Integer reloadAclFlag;

    private Integer isActive;

    private String extra;

    private String rpToken;

    private LocalDateTime rpTokenCreatedAt;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public LocalDateTime getLogdate() {
        return logdate;
    }

    public void setLogdate(LocalDateTime logdate) {
        this.logdate = logdate;
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

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getRpToken() {
        return rpToken;
    }

    public void setRpToken(String rpToken) {
        this.rpToken = rpToken;
    }

    public LocalDateTime getRpTokenCreatedAt() {
        return rpTokenCreatedAt;
    }

    public void setRpTokenCreatedAt(LocalDateTime rpTokenCreatedAt) {
        this.rpTokenCreatedAt = rpTokenCreatedAt;
    }

}

