package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class DownloadableLinkPurchasedItem {

    private Integer itemId;

    private Integer purchasedId;

    private Integer orderItemId;

    private Integer productId;

    private String linkHash;

    private Integer numberOfDownloadsBought;

    private Integer numberOfDownloadsUsed;

    private Integer linkId;

    private String linkTitle;

    private Integer isShareable;

    private String linkUrl;

    private String linkFile;

    private String linkType;

    private String status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getPurchasedId() {
        return purchasedId;
    }

    public void setPurchasedId(Integer purchasedId) {
        this.purchasedId = purchasedId;
    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getLinkHash() {
        return linkHash;
    }

    public void setLinkHash(String linkHash) {
        this.linkHash = linkHash;
    }

    public Integer getNumberOfDownloadsBought() {
        return numberOfDownloadsBought;
    }

    public void setNumberOfDownloadsBought(Integer numberOfDownloadsBought) {
        this.numberOfDownloadsBought = numberOfDownloadsBought;
    }

    public Integer getNumberOfDownloadsUsed() {
        return numberOfDownloadsUsed;
    }

    public void setNumberOfDownloadsUsed(Integer numberOfDownloadsUsed) {
        this.numberOfDownloadsUsed = numberOfDownloadsUsed;
    }

    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    public String getLinkTitle() {
        return linkTitle;
    }

    public void setLinkTitle(String linkTitle) {
        this.linkTitle = linkTitle;
    }

    public Integer getIsShareable() {
        return isShareable;
    }

    public void setIsShareable(Integer isShareable) {
        this.isShareable = isShareable;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getLinkFile() {
        return linkFile;
    }

    public void setLinkFile(String linkFile) {
        this.linkFile = linkFile;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

}

