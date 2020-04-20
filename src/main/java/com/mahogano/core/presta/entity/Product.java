package com.mahogano.core.presta.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product {

    private Integer idProduct;

    private Integer idSupplier;

    private Integer idManufacturer;

    private Integer idCategoryDefault;

    private Integer idShopDefault;

    private Integer idTaxRulesGroup;

    private Integer onSale;

    private Integer onlineOnly;

    private String ean13;

    private String isbn;

    private String upc;

    private BigDecimal ecotax;

    private Integer quantity;

    private Integer minimalQuantity;

    private Integer lowStockThreshold;

    private Integer lowStockAlert;

    private BigDecimal price;

    private BigDecimal wholesalePrice;

    private String unity;

    private BigDecimal unitPriceRatio;

    private BigDecimal additionalShippingCost;

    private String reference;

    private String supplierReference;

    private String location;

    private BigDecimal width;

    private BigDecimal height;

    private BigDecimal depth;

    private BigDecimal weight;

    private Integer outOfStock;

    private Integer additionalDeliveryTimes;

    private Integer quantityDiscount;

    private Integer customizable;

    private Integer uploadableFiles;

    private Integer textFields;

    private Integer active;

    private String redirectType;

    private Integer idTypeRedirected;

    private Integer availableForOrder;

    private LocalDateTime availableDate;

    private Integer showCondition;

    private String condition;

    private Integer showPrice;

    private Integer indexed;

    private String visibility;

    private Integer cacheIsPack;

    private Integer cacheHasAttachments;

    private Integer isVirtual;

    private Integer cacheDefaultAttribute;

    private LocalDateTime dateAdd;

    private LocalDateTime dateUpd;

    private Integer advancedStockManagement;

    private Integer packStockType;

    private Integer state;

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Integer idSupplier) {
        this.idSupplier = idSupplier;
    }

    public Integer getIdManufacturer() {
        return idManufacturer;
    }

    public void setIdManufacturer(Integer idManufacturer) {
        this.idManufacturer = idManufacturer;
    }

    public Integer getIdCategoryDefault() {
        return idCategoryDefault;
    }

    public void setIdCategoryDefault(Integer idCategoryDefault) {
        this.idCategoryDefault = idCategoryDefault;
    }

    public Integer getIdShopDefault() {
        return idShopDefault;
    }

    public void setIdShopDefault(Integer idShopDefault) {
        this.idShopDefault = idShopDefault;
    }

    public Integer getIdTaxRulesGroup() {
        return idTaxRulesGroup;
    }

    public void setIdTaxRulesGroup(Integer idTaxRulesGroup) {
        this.idTaxRulesGroup = idTaxRulesGroup;
    }

    public Integer getOnSale() {
        return onSale;
    }

    public void setOnSale(Integer onSale) {
        this.onSale = onSale;
    }

    public Integer getOnlineOnly() {
        return onlineOnly;
    }

    public void setOnlineOnly(Integer onlineOnly) {
        this.onlineOnly = onlineOnly;
    }

    public String getEan13() {
        return ean13;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public BigDecimal getEcotax() {
        return ecotax;
    }

    public void setEcotax(BigDecimal ecotax) {
        this.ecotax = ecotax;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getMinimalQuantity() {
        return minimalQuantity;
    }

    public void setMinimalQuantity(Integer minimalQuantity) {
        this.minimalQuantity = minimalQuantity;
    }

    public Integer getLowStockThreshold() {
        return lowStockThreshold;
    }

    public void setLowStockThreshold(Integer lowStockThreshold) {
        this.lowStockThreshold = lowStockThreshold;
    }

    public Integer getLowStockAlert() {
        return lowStockAlert;
    }

    public void setLowStockAlert(Integer lowStockAlert) {
        this.lowStockAlert = lowStockAlert;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(BigDecimal wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public String getUnity() {
        return unity;
    }

    public void setUnity(String unity) {
        this.unity = unity;
    }

    public BigDecimal getUnitPriceRatio() {
        return unitPriceRatio;
    }

    public void setUnitPriceRatio(BigDecimal unitPriceRatio) {
        this.unitPriceRatio = unitPriceRatio;
    }

    public BigDecimal getAdditionalShippingCost() {
        return additionalShippingCost;
    }

    public void setAdditionalShippingCost(BigDecimal additionalShippingCost) {
        this.additionalShippingCost = additionalShippingCost;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getSupplierReference() {
        return supplierReference;
    }

    public void setSupplierReference(String supplierReference) {
        this.supplierReference = supplierReference;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getDepth() {
        return depth;
    }

    public void setDepth(BigDecimal depth) {
        this.depth = depth;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getOutOfStock() {
        return outOfStock;
    }

    public void setOutOfStock(Integer outOfStock) {
        this.outOfStock = outOfStock;
    }

    public Integer getAdditionalDeliveryTimes() {
        return additionalDeliveryTimes;
    }

    public void setAdditionalDeliveryTimes(Integer additionalDeliveryTimes) {
        this.additionalDeliveryTimes = additionalDeliveryTimes;
    }

    public Integer getQuantityDiscount() {
        return quantityDiscount;
    }

    public void setQuantityDiscount(Integer quantityDiscount) {
        this.quantityDiscount = quantityDiscount;
    }

    public Integer getCustomizable() {
        return customizable;
    }

    public void setCustomizable(Integer customizable) {
        this.customizable = customizable;
    }

    public Integer getUploadableFiles() {
        return uploadableFiles;
    }

    public void setUploadableFiles(Integer uploadableFiles) {
        this.uploadableFiles = uploadableFiles;
    }

    public Integer getTextFields() {
        return textFields;
    }

    public void setTextFields(Integer textFields) {
        this.textFields = textFields;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getRedirectType() {
        return redirectType;
    }

    public void setRedirectType(String redirectType) {
        this.redirectType = redirectType;
    }

    public Integer getIdTypeRedirected() {
        return idTypeRedirected;
    }

    public void setIdTypeRedirected(Integer idTypeRedirected) {
        this.idTypeRedirected = idTypeRedirected;
    }

    public Integer getAvailableForOrder() {
        return availableForOrder;
    }

    public void setAvailableForOrder(Integer availableForOrder) {
        this.availableForOrder = availableForOrder;
    }

    public LocalDateTime getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(LocalDateTime availableDate) {
        this.availableDate = availableDate;
    }

    public Integer getShowCondition() {
        return showCondition;
    }

    public void setShowCondition(Integer showCondition) {
        this.showCondition = showCondition;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Integer getShowPrice() {
        return showPrice;
    }

    public void setShowPrice(Integer showPrice) {
        this.showPrice = showPrice;
    }

    public Integer getIndexed() {
        return indexed;
    }

    public void setIndexed(Integer indexed) {
        this.indexed = indexed;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Integer getCacheIsPack() {
        return cacheIsPack;
    }

    public void setCacheIsPack(Integer cacheIsPack) {
        this.cacheIsPack = cacheIsPack;
    }

    public Integer getCacheHasAttachments() {
        return cacheHasAttachments;
    }

    public void setCacheHasAttachments(Integer cacheHasAttachments) {
        this.cacheHasAttachments = cacheHasAttachments;
    }

    public Integer getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(Integer isVirtual) {
        this.isVirtual = isVirtual;
    }

    public Integer getCacheDefaultAttribute() {
        return cacheDefaultAttribute;
    }

    public void setCacheDefaultAttribute(Integer cacheDefaultAttribute) {
        this.cacheDefaultAttribute = cacheDefaultAttribute;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

    public LocalDateTime getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(LocalDateTime dateUpd) {
        this.dateUpd = dateUpd;
    }

    public Integer getAdvancedStockManagement() {
        return advancedStockManagement;
    }

    public void setAdvancedStockManagement(Integer advancedStockManagement) {
        this.advancedStockManagement = advancedStockManagement;
    }

    public Integer getPackStockType() {
        return packStockType;
    }

    public void setPackStockType(Integer packStockType) {
        this.packStockType = packStockType;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}

