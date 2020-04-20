package com.mahogano.core.presta.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderDetail {

    private Integer idOrderDetail;

    private Integer idOrder;

    private Integer idOrderInvoice;

    private Integer idWarehouse;

    private Integer idShop;

    private Integer productId;

    private Integer productAttributeId;

    private Integer idCustomization;

    private String productName;

    private Integer productQuantity;

    private Integer productQuantityInStock;

    private Integer productQuantityRefunded;

    private Integer productQuantityReturn;

    private Integer productQuantityReinjected;

    private BigDecimal productPrice;

    private BigDecimal reductionPercent;

    private BigDecimal reductionAmount;

    private BigDecimal reductionAmountTaxIncl;

    private BigDecimal reductionAmountTaxExcl;

    private BigDecimal groupReduction;

    private BigDecimal productQuantityDiscount;

    private String productEan13;

    private String productIsbn;

    private String productUpc;

    private String productReference;

    private String productSupplierReference;

    private BigDecimal productWeight;

    private Integer idTaxRulesGroup;

    private Integer taxComputationMethod;

    private String taxName;

    private BigDecimal taxRate;

    private BigDecimal ecotax;

    private BigDecimal ecotaxTaxRate;

    private Integer discountQuantityApplied;

    private String downloadHash;

    private Integer downloadNb;

    private LocalDateTime downloadDeadline;

    private BigDecimal totalPriceTaxIncl;

    private BigDecimal totalPriceTaxExcl;

    private BigDecimal unitPriceTaxIncl;

    private BigDecimal unitPriceTaxExcl;

    private BigDecimal totalShippingPriceTaxIncl;

    private BigDecimal totalShippingPriceTaxExcl;

    private BigDecimal purchaseSupplierPrice;

    private BigDecimal originalProductPrice;

    private BigDecimal originalWholesalePrice;

    public Integer getIdOrderDetail() {
        return idOrderDetail;
    }

    public void setIdOrderDetail(Integer idOrderDetail) {
        this.idOrderDetail = idOrderDetail;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getIdOrderInvoice() {
        return idOrderInvoice;
    }

    public void setIdOrderInvoice(Integer idOrderInvoice) {
        this.idOrderInvoice = idOrderInvoice;
    }

    public Integer getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(Integer idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductAttributeId() {
        return productAttributeId;
    }

    public void setProductAttributeId(Integer productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    public Integer getIdCustomization() {
        return idCustomization;
    }

    public void setIdCustomization(Integer idCustomization) {
        this.idCustomization = idCustomization;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Integer getProductQuantityInStock() {
        return productQuantityInStock;
    }

    public void setProductQuantityInStock(Integer productQuantityInStock) {
        this.productQuantityInStock = productQuantityInStock;
    }

    public Integer getProductQuantityRefunded() {
        return productQuantityRefunded;
    }

    public void setProductQuantityRefunded(Integer productQuantityRefunded) {
        this.productQuantityRefunded = productQuantityRefunded;
    }

    public Integer getProductQuantityReturn() {
        return productQuantityReturn;
    }

    public void setProductQuantityReturn(Integer productQuantityReturn) {
        this.productQuantityReturn = productQuantityReturn;
    }

    public Integer getProductQuantityReinjected() {
        return productQuantityReinjected;
    }

    public void setProductQuantityReinjected(Integer productQuantityReinjected) {
        this.productQuantityReinjected = productQuantityReinjected;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getReductionPercent() {
        return reductionPercent;
    }

    public void setReductionPercent(BigDecimal reductionPercent) {
        this.reductionPercent = reductionPercent;
    }

    public BigDecimal getReductionAmount() {
        return reductionAmount;
    }

    public void setReductionAmount(BigDecimal reductionAmount) {
        this.reductionAmount = reductionAmount;
    }

    public BigDecimal getReductionAmountTaxIncl() {
        return reductionAmountTaxIncl;
    }

    public void setReductionAmountTaxIncl(BigDecimal reductionAmountTaxIncl) {
        this.reductionAmountTaxIncl = reductionAmountTaxIncl;
    }

    public BigDecimal getReductionAmountTaxExcl() {
        return reductionAmountTaxExcl;
    }

    public void setReductionAmountTaxExcl(BigDecimal reductionAmountTaxExcl) {
        this.reductionAmountTaxExcl = reductionAmountTaxExcl;
    }

    public BigDecimal getGroupReduction() {
        return groupReduction;
    }

    public void setGroupReduction(BigDecimal groupReduction) {
        this.groupReduction = groupReduction;
    }

    public BigDecimal getProductQuantityDiscount() {
        return productQuantityDiscount;
    }

    public void setProductQuantityDiscount(BigDecimal productQuantityDiscount) {
        this.productQuantityDiscount = productQuantityDiscount;
    }

    public String getProductEan13() {
        return productEan13;
    }

    public void setProductEan13(String productEan13) {
        this.productEan13 = productEan13;
    }

    public String getProductIsbn() {
        return productIsbn;
    }

    public void setProductIsbn(String productIsbn) {
        this.productIsbn = productIsbn;
    }

    public String getProductUpc() {
        return productUpc;
    }

    public void setProductUpc(String productUpc) {
        this.productUpc = productUpc;
    }

    public String getProductReference() {
        return productReference;
    }

    public void setProductReference(String productReference) {
        this.productReference = productReference;
    }

    public String getProductSupplierReference() {
        return productSupplierReference;
    }

    public void setProductSupplierReference(String productSupplierReference) {
        this.productSupplierReference = productSupplierReference;
    }

    public BigDecimal getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(BigDecimal productWeight) {
        this.productWeight = productWeight;
    }

    public Integer getIdTaxRulesGroup() {
        return idTaxRulesGroup;
    }

    public void setIdTaxRulesGroup(Integer idTaxRulesGroup) {
        this.idTaxRulesGroup = idTaxRulesGroup;
    }

    public Integer getTaxComputationMethod() {
        return taxComputationMethod;
    }

    public void setTaxComputationMethod(Integer taxComputationMethod) {
        this.taxComputationMethod = taxComputationMethod;
    }

    public String getTaxName() {
        return taxName;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getEcotax() {
        return ecotax;
    }

    public void setEcotax(BigDecimal ecotax) {
        this.ecotax = ecotax;
    }

    public BigDecimal getEcotaxTaxRate() {
        return ecotaxTaxRate;
    }

    public void setEcotaxTaxRate(BigDecimal ecotaxTaxRate) {
        this.ecotaxTaxRate = ecotaxTaxRate;
    }

    public Integer getDiscountQuantityApplied() {
        return discountQuantityApplied;
    }

    public void setDiscountQuantityApplied(Integer discountQuantityApplied) {
        this.discountQuantityApplied = discountQuantityApplied;
    }

    public String getDownloadHash() {
        return downloadHash;
    }

    public void setDownloadHash(String downloadHash) {
        this.downloadHash = downloadHash;
    }

    public Integer getDownloadNb() {
        return downloadNb;
    }

    public void setDownloadNb(Integer downloadNb) {
        this.downloadNb = downloadNb;
    }

    public LocalDateTime getDownloadDeadline() {
        return downloadDeadline;
    }

    public void setDownloadDeadline(LocalDateTime downloadDeadline) {
        this.downloadDeadline = downloadDeadline;
    }

    public BigDecimal getTotalPriceTaxIncl() {
        return totalPriceTaxIncl;
    }

    public void setTotalPriceTaxIncl(BigDecimal totalPriceTaxIncl) {
        this.totalPriceTaxIncl = totalPriceTaxIncl;
    }

    public BigDecimal getTotalPriceTaxExcl() {
        return totalPriceTaxExcl;
    }

    public void setTotalPriceTaxExcl(BigDecimal totalPriceTaxExcl) {
        this.totalPriceTaxExcl = totalPriceTaxExcl;
    }

    public BigDecimal getUnitPriceTaxIncl() {
        return unitPriceTaxIncl;
    }

    public void setUnitPriceTaxIncl(BigDecimal unitPriceTaxIncl) {
        this.unitPriceTaxIncl = unitPriceTaxIncl;
    }

    public BigDecimal getUnitPriceTaxExcl() {
        return unitPriceTaxExcl;
    }

    public void setUnitPriceTaxExcl(BigDecimal unitPriceTaxExcl) {
        this.unitPriceTaxExcl = unitPriceTaxExcl;
    }

    public BigDecimal getTotalShippingPriceTaxIncl() {
        return totalShippingPriceTaxIncl;
    }

    public void setTotalShippingPriceTaxIncl(BigDecimal totalShippingPriceTaxIncl) {
        this.totalShippingPriceTaxIncl = totalShippingPriceTaxIncl;
    }

    public BigDecimal getTotalShippingPriceTaxExcl() {
        return totalShippingPriceTaxExcl;
    }

    public void setTotalShippingPriceTaxExcl(BigDecimal totalShippingPriceTaxExcl) {
        this.totalShippingPriceTaxExcl = totalShippingPriceTaxExcl;
    }

    public BigDecimal getPurchaseSupplierPrice() {
        return purchaseSupplierPrice;
    }

    public void setPurchaseSupplierPrice(BigDecimal purchaseSupplierPrice) {
        this.purchaseSupplierPrice = purchaseSupplierPrice;
    }

    public BigDecimal getOriginalProductPrice() {
        return originalProductPrice;
    }

    public void setOriginalProductPrice(BigDecimal originalProductPrice) {
        this.originalProductPrice = originalProductPrice;
    }

    public BigDecimal getOriginalWholesalePrice() {
        return originalWholesalePrice;
    }

    public void setOriginalWholesalePrice(BigDecimal originalWholesalePrice) {
        this.originalWholesalePrice = originalWholesalePrice;
    }

}

