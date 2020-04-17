package com.mahogano.core.magento.entity;

public class CatalogProductOption {

    private Integer optionId;

    private Integer productId;

    private String type;

    private Integer isRequire;

    private String sku;

    private Integer maxCharacters;

    private String fileExtension;

    private Integer imageSizeX;

    private Integer imageSizeY;

    private Integer sortOrder;

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getIsRequire() {
        return isRequire;
    }

    public void setIsRequire(Integer isRequire) {
        this.isRequire = isRequire;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Integer getMaxCharacters() {
        return maxCharacters;
    }

    public void setMaxCharacters(Integer maxCharacters) {
        this.maxCharacters = maxCharacters;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public Integer getImageSizeX() {
        return imageSizeX;
    }

    public void setImageSizeX(Integer imageSizeX) {
        this.imageSizeX = imageSizeX;
    }

    public Integer getImageSizeY() {
        return imageSizeY;
    }

    public void setImageSizeY(Integer imageSizeY) {
        this.imageSizeY = imageSizeY;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

}

