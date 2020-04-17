package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class SalesFlatOrder {

    private Integer entityId;

    private String state;

    private String status;

    private String couponCode;

    private String protectCode;

    private String shippingDescription;

    private Integer isVirtual;

    private Integer storeId;

    private Integer customerId;

    private BigDecimal baseDiscountAmount;

    private BigDecimal baseDiscountCanceled;

    private BigDecimal baseDiscountInvoiced;

    private BigDecimal baseDiscountRefunded;

    private BigDecimal baseGrandTotal;

    private BigDecimal baseShippingAmount;

    private BigDecimal baseShippingCanceled;

    private BigDecimal baseShippingInvoiced;

    private BigDecimal baseShippingRefunded;

    private BigDecimal baseShippingTaxAmount;

    private BigDecimal baseShippingTaxRefunded;

    private BigDecimal baseSubtotal;

    private BigDecimal baseSubtotalCanceled;

    private BigDecimal baseSubtotalInvoiced;

    private BigDecimal baseSubtotalRefunded;

    private BigDecimal baseTaxAmount;

    private BigDecimal baseTaxCanceled;

    private BigDecimal baseTaxInvoiced;

    private BigDecimal baseTaxRefunded;

    private BigDecimal baseToGlobalRate;

    private BigDecimal baseToOrderRate;

    private BigDecimal baseTotalCanceled;

    private BigDecimal baseTotalInvoiced;

    private BigDecimal baseTotalInvoicedCost;

    private BigDecimal baseTotalOfflineRefunded;

    private BigDecimal baseTotalOnlineRefunded;

    private BigDecimal baseTotalPaid;

    private BigDecimal baseTotalQtyOrdered;

    private BigDecimal baseTotalRefunded;

    private BigDecimal discountAmount;

    private BigDecimal discountCanceled;

    private BigDecimal discountInvoiced;

    private BigDecimal discountRefunded;

    private BigDecimal grandTotal;

    private BigDecimal shippingAmount;

    private BigDecimal shippingCanceled;

    private BigDecimal shippingInvoiced;

    private BigDecimal shippingRefunded;

    private BigDecimal shippingTaxAmount;

    private BigDecimal shippingTaxRefunded;

    private BigDecimal storeToBaseRate;

    private BigDecimal storeToOrderRate;

    private BigDecimal subtotal;

    private BigDecimal subtotalCanceled;

    private BigDecimal subtotalInvoiced;

    private BigDecimal subtotalRefunded;

    private BigDecimal taxAmount;

    private BigDecimal taxCanceled;

    private BigDecimal taxInvoiced;

    private BigDecimal taxRefunded;

    private BigDecimal totalCanceled;

    private BigDecimal totalInvoiced;

    private BigDecimal totalOfflineRefunded;

    private BigDecimal totalOnlineRefunded;

    private BigDecimal totalPaid;

    private BigDecimal totalQtyOrdered;

    private BigDecimal totalRefunded;

    private Integer canShipPartially;

    private Integer canShipPartiallyItem;

    private Integer customerIsGuest;

    private Integer customerNoteNotify;

    private Integer billingAddressId;

    private Integer customerGroupId;

    private Integer editIncrement;

    private Integer emailSent;

    private Integer forcedShipmentWithInvoice;

    private Integer paymentAuthExpiration;

    private Integer quoteAddressId;

    private Integer quoteId;

    private Integer shippingAddressId;

    private BigDecimal adjustmentNegative;

    private BigDecimal adjustmentPositive;

    private BigDecimal baseAdjustmentNegative;

    private BigDecimal baseAdjustmentPositive;

    private BigDecimal baseShippingDiscountAmount;

    private BigDecimal baseSubtotalInclTax;

    private BigDecimal baseTotalDue;

    private BigDecimal paymentAuthorizationAmount;

    private BigDecimal shippingDiscountAmount;

    private BigDecimal subtotalInclTax;

    private BigDecimal totalDue;

    private BigDecimal weight;

    private LocalDateTime customerDob;

    private String incrementId;

    private String appliedRuleIds;

    private String baseCurrencyCode;

    private String customerEmail;

    private String customerFirstname;

    private String customerLastname;

    private String customerMiddlename;

    private String customerPrefix;

    private String customerSuffix;

    private String customerTaxvat;

    private String discountDescription;

    private String extCustomerId;

    private String extOrderId;

    private String globalCurrencyCode;

    private String holdBeforeState;

    private String holdBeforeStatus;

    private String orderCurrencyCode;

    private String originalIncrementId;

    private String relationChildId;

    private String relationChildRealId;

    private String relationParentId;

    private String relationParentRealId;

    private String remoteIp;

    private String shippingMethod;

    private String storeCurrencyCode;

    private String storeName;

    private String xForwardedFor;

    private String customerNote;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Integer totalItemCount;

    private Integer customerGender;

    private BigDecimal hiddenTaxAmount;

    private BigDecimal baseHiddenTaxAmount;

    private BigDecimal shippingHiddenTaxAmount;

    private BigDecimal baseShippingHiddenTaxAmnt;

    private BigDecimal hiddenTaxInvoiced;

    private BigDecimal baseHiddenTaxInvoiced;

    private BigDecimal hiddenTaxRefunded;

    private BigDecimal baseHiddenTaxRefunded;

    private BigDecimal shippingInclTax;

    private BigDecimal baseShippingInclTax;

    private String couponRuleName;

    private Integer paypalIpnCustomerNotified;

    private Integer giftMessageId;

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getProtectCode() {
        return protectCode;
    }

    public void setProtectCode(String protectCode) {
        this.protectCode = protectCode;
    }

    public String getShippingDescription() {
        return shippingDescription;
    }

    public void setShippingDescription(String shippingDescription) {
        this.shippingDescription = shippingDescription;
    }

    public Integer getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(Integer isVirtual) {
        this.isVirtual = isVirtual;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getBaseDiscountAmount() {
        return baseDiscountAmount;
    }

    public void setBaseDiscountAmount(BigDecimal baseDiscountAmount) {
        this.baseDiscountAmount = baseDiscountAmount;
    }

    public BigDecimal getBaseDiscountCanceled() {
        return baseDiscountCanceled;
    }

    public void setBaseDiscountCanceled(BigDecimal baseDiscountCanceled) {
        this.baseDiscountCanceled = baseDiscountCanceled;
    }

    public BigDecimal getBaseDiscountInvoiced() {
        return baseDiscountInvoiced;
    }

    public void setBaseDiscountInvoiced(BigDecimal baseDiscountInvoiced) {
        this.baseDiscountInvoiced = baseDiscountInvoiced;
    }

    public BigDecimal getBaseDiscountRefunded() {
        return baseDiscountRefunded;
    }

    public void setBaseDiscountRefunded(BigDecimal baseDiscountRefunded) {
        this.baseDiscountRefunded = baseDiscountRefunded;
    }

    public BigDecimal getBaseGrandTotal() {
        return baseGrandTotal;
    }

    public void setBaseGrandTotal(BigDecimal baseGrandTotal) {
        this.baseGrandTotal = baseGrandTotal;
    }

    public BigDecimal getBaseShippingAmount() {
        return baseShippingAmount;
    }

    public void setBaseShippingAmount(BigDecimal baseShippingAmount) {
        this.baseShippingAmount = baseShippingAmount;
    }

    public BigDecimal getBaseShippingCanceled() {
        return baseShippingCanceled;
    }

    public void setBaseShippingCanceled(BigDecimal baseShippingCanceled) {
        this.baseShippingCanceled = baseShippingCanceled;
    }

    public BigDecimal getBaseShippingInvoiced() {
        return baseShippingInvoiced;
    }

    public void setBaseShippingInvoiced(BigDecimal baseShippingInvoiced) {
        this.baseShippingInvoiced = baseShippingInvoiced;
    }

    public BigDecimal getBaseShippingRefunded() {
        return baseShippingRefunded;
    }

    public void setBaseShippingRefunded(BigDecimal baseShippingRefunded) {
        this.baseShippingRefunded = baseShippingRefunded;
    }

    public BigDecimal getBaseShippingTaxAmount() {
        return baseShippingTaxAmount;
    }

    public void setBaseShippingTaxAmount(BigDecimal baseShippingTaxAmount) {
        this.baseShippingTaxAmount = baseShippingTaxAmount;
    }

    public BigDecimal getBaseShippingTaxRefunded() {
        return baseShippingTaxRefunded;
    }

    public void setBaseShippingTaxRefunded(BigDecimal baseShippingTaxRefunded) {
        this.baseShippingTaxRefunded = baseShippingTaxRefunded;
    }

    public BigDecimal getBaseSubtotal() {
        return baseSubtotal;
    }

    public void setBaseSubtotal(BigDecimal baseSubtotal) {
        this.baseSubtotal = baseSubtotal;
    }

    public BigDecimal getBaseSubtotalCanceled() {
        return baseSubtotalCanceled;
    }

    public void setBaseSubtotalCanceled(BigDecimal baseSubtotalCanceled) {
        this.baseSubtotalCanceled = baseSubtotalCanceled;
    }

    public BigDecimal getBaseSubtotalInvoiced() {
        return baseSubtotalInvoiced;
    }

    public void setBaseSubtotalInvoiced(BigDecimal baseSubtotalInvoiced) {
        this.baseSubtotalInvoiced = baseSubtotalInvoiced;
    }

    public BigDecimal getBaseSubtotalRefunded() {
        return baseSubtotalRefunded;
    }

    public void setBaseSubtotalRefunded(BigDecimal baseSubtotalRefunded) {
        this.baseSubtotalRefunded = baseSubtotalRefunded;
    }

    public BigDecimal getBaseTaxAmount() {
        return baseTaxAmount;
    }

    public void setBaseTaxAmount(BigDecimal baseTaxAmount) {
        this.baseTaxAmount = baseTaxAmount;
    }

    public BigDecimal getBaseTaxCanceled() {
        return baseTaxCanceled;
    }

    public void setBaseTaxCanceled(BigDecimal baseTaxCanceled) {
        this.baseTaxCanceled = baseTaxCanceled;
    }

    public BigDecimal getBaseTaxInvoiced() {
        return baseTaxInvoiced;
    }

    public void setBaseTaxInvoiced(BigDecimal baseTaxInvoiced) {
        this.baseTaxInvoiced = baseTaxInvoiced;
    }

    public BigDecimal getBaseTaxRefunded() {
        return baseTaxRefunded;
    }

    public void setBaseTaxRefunded(BigDecimal baseTaxRefunded) {
        this.baseTaxRefunded = baseTaxRefunded;
    }

    public BigDecimal getBaseToGlobalRate() {
        return baseToGlobalRate;
    }

    public void setBaseToGlobalRate(BigDecimal baseToGlobalRate) {
        this.baseToGlobalRate = baseToGlobalRate;
    }

    public BigDecimal getBaseToOrderRate() {
        return baseToOrderRate;
    }

    public void setBaseToOrderRate(BigDecimal baseToOrderRate) {
        this.baseToOrderRate = baseToOrderRate;
    }

    public BigDecimal getBaseTotalCanceled() {
        return baseTotalCanceled;
    }

    public void setBaseTotalCanceled(BigDecimal baseTotalCanceled) {
        this.baseTotalCanceled = baseTotalCanceled;
    }

    public BigDecimal getBaseTotalInvoiced() {
        return baseTotalInvoiced;
    }

    public void setBaseTotalInvoiced(BigDecimal baseTotalInvoiced) {
        this.baseTotalInvoiced = baseTotalInvoiced;
    }

    public BigDecimal getBaseTotalInvoicedCost() {
        return baseTotalInvoicedCost;
    }

    public void setBaseTotalInvoicedCost(BigDecimal baseTotalInvoicedCost) {
        this.baseTotalInvoicedCost = baseTotalInvoicedCost;
    }

    public BigDecimal getBaseTotalOfflineRefunded() {
        return baseTotalOfflineRefunded;
    }

    public void setBaseTotalOfflineRefunded(BigDecimal baseTotalOfflineRefunded) {
        this.baseTotalOfflineRefunded = baseTotalOfflineRefunded;
    }

    public BigDecimal getBaseTotalOnlineRefunded() {
        return baseTotalOnlineRefunded;
    }

    public void setBaseTotalOnlineRefunded(BigDecimal baseTotalOnlineRefunded) {
        this.baseTotalOnlineRefunded = baseTotalOnlineRefunded;
    }

    public BigDecimal getBaseTotalPaid() {
        return baseTotalPaid;
    }

    public void setBaseTotalPaid(BigDecimal baseTotalPaid) {
        this.baseTotalPaid = baseTotalPaid;
    }

    public BigDecimal getBaseTotalQtyOrdered() {
        return baseTotalQtyOrdered;
    }

    public void setBaseTotalQtyOrdered(BigDecimal baseTotalQtyOrdered) {
        this.baseTotalQtyOrdered = baseTotalQtyOrdered;
    }

    public BigDecimal getBaseTotalRefunded() {
        return baseTotalRefunded;
    }

    public void setBaseTotalRefunded(BigDecimal baseTotalRefunded) {
        this.baseTotalRefunded = baseTotalRefunded;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getDiscountCanceled() {
        return discountCanceled;
    }

    public void setDiscountCanceled(BigDecimal discountCanceled) {
        this.discountCanceled = discountCanceled;
    }

    public BigDecimal getDiscountInvoiced() {
        return discountInvoiced;
    }

    public void setDiscountInvoiced(BigDecimal discountInvoiced) {
        this.discountInvoiced = discountInvoiced;
    }

    public BigDecimal getDiscountRefunded() {
        return discountRefunded;
    }

    public void setDiscountRefunded(BigDecimal discountRefunded) {
        this.discountRefunded = discountRefunded;
    }

    public BigDecimal getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }

    public BigDecimal getShippingAmount() {
        return shippingAmount;
    }

    public void setShippingAmount(BigDecimal shippingAmount) {
        this.shippingAmount = shippingAmount;
    }

    public BigDecimal getShippingCanceled() {
        return shippingCanceled;
    }

    public void setShippingCanceled(BigDecimal shippingCanceled) {
        this.shippingCanceled = shippingCanceled;
    }

    public BigDecimal getShippingInvoiced() {
        return shippingInvoiced;
    }

    public void setShippingInvoiced(BigDecimal shippingInvoiced) {
        this.shippingInvoiced = shippingInvoiced;
    }

    public BigDecimal getShippingRefunded() {
        return shippingRefunded;
    }

    public void setShippingRefunded(BigDecimal shippingRefunded) {
        this.shippingRefunded = shippingRefunded;
    }

    public BigDecimal getShippingTaxAmount() {
        return shippingTaxAmount;
    }

    public void setShippingTaxAmount(BigDecimal shippingTaxAmount) {
        this.shippingTaxAmount = shippingTaxAmount;
    }

    public BigDecimal getShippingTaxRefunded() {
        return shippingTaxRefunded;
    }

    public void setShippingTaxRefunded(BigDecimal shippingTaxRefunded) {
        this.shippingTaxRefunded = shippingTaxRefunded;
    }

    public BigDecimal getStoreToBaseRate() {
        return storeToBaseRate;
    }

    public void setStoreToBaseRate(BigDecimal storeToBaseRate) {
        this.storeToBaseRate = storeToBaseRate;
    }

    public BigDecimal getStoreToOrderRate() {
        return storeToOrderRate;
    }

    public void setStoreToOrderRate(BigDecimal storeToOrderRate) {
        this.storeToOrderRate = storeToOrderRate;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getSubtotalCanceled() {
        return subtotalCanceled;
    }

    public void setSubtotalCanceled(BigDecimal subtotalCanceled) {
        this.subtotalCanceled = subtotalCanceled;
    }

    public BigDecimal getSubtotalInvoiced() {
        return subtotalInvoiced;
    }

    public void setSubtotalInvoiced(BigDecimal subtotalInvoiced) {
        this.subtotalInvoiced = subtotalInvoiced;
    }

    public BigDecimal getSubtotalRefunded() {
        return subtotalRefunded;
    }

    public void setSubtotalRefunded(BigDecimal subtotalRefunded) {
        this.subtotalRefunded = subtotalRefunded;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getTaxCanceled() {
        return taxCanceled;
    }

    public void setTaxCanceled(BigDecimal taxCanceled) {
        this.taxCanceled = taxCanceled;
    }

    public BigDecimal getTaxInvoiced() {
        return taxInvoiced;
    }

    public void setTaxInvoiced(BigDecimal taxInvoiced) {
        this.taxInvoiced = taxInvoiced;
    }

    public BigDecimal getTaxRefunded() {
        return taxRefunded;
    }

    public void setTaxRefunded(BigDecimal taxRefunded) {
        this.taxRefunded = taxRefunded;
    }

    public BigDecimal getTotalCanceled() {
        return totalCanceled;
    }

    public void setTotalCanceled(BigDecimal totalCanceled) {
        this.totalCanceled = totalCanceled;
    }

    public BigDecimal getTotalInvoiced() {
        return totalInvoiced;
    }

    public void setTotalInvoiced(BigDecimal totalInvoiced) {
        this.totalInvoiced = totalInvoiced;
    }

    public BigDecimal getTotalOfflineRefunded() {
        return totalOfflineRefunded;
    }

    public void setTotalOfflineRefunded(BigDecimal totalOfflineRefunded) {
        this.totalOfflineRefunded = totalOfflineRefunded;
    }

    public BigDecimal getTotalOnlineRefunded() {
        return totalOnlineRefunded;
    }

    public void setTotalOnlineRefunded(BigDecimal totalOnlineRefunded) {
        this.totalOnlineRefunded = totalOnlineRefunded;
    }

    public BigDecimal getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(BigDecimal totalPaid) {
        this.totalPaid = totalPaid;
    }

    public BigDecimal getTotalQtyOrdered() {
        return totalQtyOrdered;
    }

    public void setTotalQtyOrdered(BigDecimal totalQtyOrdered) {
        this.totalQtyOrdered = totalQtyOrdered;
    }

    public BigDecimal getTotalRefunded() {
        return totalRefunded;
    }

    public void setTotalRefunded(BigDecimal totalRefunded) {
        this.totalRefunded = totalRefunded;
    }

    public Integer getCanShipPartially() {
        return canShipPartially;
    }

    public void setCanShipPartially(Integer canShipPartially) {
        this.canShipPartially = canShipPartially;
    }

    public Integer getCanShipPartiallyItem() {
        return canShipPartiallyItem;
    }

    public void setCanShipPartiallyItem(Integer canShipPartiallyItem) {
        this.canShipPartiallyItem = canShipPartiallyItem;
    }

    public Integer getCustomerIsGuest() {
        return customerIsGuest;
    }

    public void setCustomerIsGuest(Integer customerIsGuest) {
        this.customerIsGuest = customerIsGuest;
    }

    public Integer getCustomerNoteNotify() {
        return customerNoteNotify;
    }

    public void setCustomerNoteNotify(Integer customerNoteNotify) {
        this.customerNoteNotify = customerNoteNotify;
    }

    public Integer getBillingAddressId() {
        return billingAddressId;
    }

    public void setBillingAddressId(Integer billingAddressId) {
        this.billingAddressId = billingAddressId;
    }

    public Integer getCustomerGroupId() {
        return customerGroupId;
    }

    public void setCustomerGroupId(Integer customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    public Integer getEditIncrement() {
        return editIncrement;
    }

    public void setEditIncrement(Integer editIncrement) {
        this.editIncrement = editIncrement;
    }

    public Integer getEmailSent() {
        return emailSent;
    }

    public void setEmailSent(Integer emailSent) {
        this.emailSent = emailSent;
    }

    public Integer getForcedShipmentWithInvoice() {
        return forcedShipmentWithInvoice;
    }

    public void setForcedShipmentWithInvoice(Integer forcedShipmentWithInvoice) {
        this.forcedShipmentWithInvoice = forcedShipmentWithInvoice;
    }

    public Integer getPaymentAuthExpiration() {
        return paymentAuthExpiration;
    }

    public void setPaymentAuthExpiration(Integer paymentAuthExpiration) {
        this.paymentAuthExpiration = paymentAuthExpiration;
    }

    public Integer getQuoteAddressId() {
        return quoteAddressId;
    }

    public void setQuoteAddressId(Integer quoteAddressId) {
        this.quoteAddressId = quoteAddressId;
    }

    public Integer getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
    }

    public Integer getShippingAddressId() {
        return shippingAddressId;
    }

    public void setShippingAddressId(Integer shippingAddressId) {
        this.shippingAddressId = shippingAddressId;
    }

    public BigDecimal getAdjustmentNegative() {
        return adjustmentNegative;
    }

    public void setAdjustmentNegative(BigDecimal adjustmentNegative) {
        this.adjustmentNegative = adjustmentNegative;
    }

    public BigDecimal getAdjustmentPositive() {
        return adjustmentPositive;
    }

    public void setAdjustmentPositive(BigDecimal adjustmentPositive) {
        this.adjustmentPositive = adjustmentPositive;
    }

    public BigDecimal getBaseAdjustmentNegative() {
        return baseAdjustmentNegative;
    }

    public void setBaseAdjustmentNegative(BigDecimal baseAdjustmentNegative) {
        this.baseAdjustmentNegative = baseAdjustmentNegative;
    }

    public BigDecimal getBaseAdjustmentPositive() {
        return baseAdjustmentPositive;
    }

    public void setBaseAdjustmentPositive(BigDecimal baseAdjustmentPositive) {
        this.baseAdjustmentPositive = baseAdjustmentPositive;
    }

    public BigDecimal getBaseShippingDiscountAmount() {
        return baseShippingDiscountAmount;
    }

    public void setBaseShippingDiscountAmount(BigDecimal baseShippingDiscountAmount) {
        this.baseShippingDiscountAmount = baseShippingDiscountAmount;
    }

    public BigDecimal getBaseSubtotalInclTax() {
        return baseSubtotalInclTax;
    }

    public void setBaseSubtotalInclTax(BigDecimal baseSubtotalInclTax) {
        this.baseSubtotalInclTax = baseSubtotalInclTax;
    }

    public BigDecimal getBaseTotalDue() {
        return baseTotalDue;
    }

    public void setBaseTotalDue(BigDecimal baseTotalDue) {
        this.baseTotalDue = baseTotalDue;
    }

    public BigDecimal getPaymentAuthorizationAmount() {
        return paymentAuthorizationAmount;
    }

    public void setPaymentAuthorizationAmount(BigDecimal paymentAuthorizationAmount) {
        this.paymentAuthorizationAmount = paymentAuthorizationAmount;
    }

    public BigDecimal getShippingDiscountAmount() {
        return shippingDiscountAmount;
    }

    public void setShippingDiscountAmount(BigDecimal shippingDiscountAmount) {
        this.shippingDiscountAmount = shippingDiscountAmount;
    }

    public BigDecimal getSubtotalInclTax() {
        return subtotalInclTax;
    }

    public void setSubtotalInclTax(BigDecimal subtotalInclTax) {
        this.subtotalInclTax = subtotalInclTax;
    }

    public BigDecimal getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(BigDecimal totalDue) {
        this.totalDue = totalDue;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public LocalDateTime getCustomerDob() {
        return customerDob;
    }

    public void setCustomerDob(LocalDateTime customerDob) {
        this.customerDob = customerDob;
    }

    public String getIncrementId() {
        return incrementId;
    }

    public void setIncrementId(String incrementId) {
        this.incrementId = incrementId;
    }

    public String getAppliedRuleIds() {
        return appliedRuleIds;
    }

    public void setAppliedRuleIds(String appliedRuleIds) {
        this.appliedRuleIds = appliedRuleIds;
    }

    public String getBaseCurrencyCode() {
        return baseCurrencyCode;
    }

    public void setBaseCurrencyCode(String baseCurrencyCode) {
        this.baseCurrencyCode = baseCurrencyCode;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerFirstname() {
        return customerFirstname;
    }

    public void setCustomerFirstname(String customerFirstname) {
        this.customerFirstname = customerFirstname;
    }

    public String getCustomerLastname() {
        return customerLastname;
    }

    public void setCustomerLastname(String customerLastname) {
        this.customerLastname = customerLastname;
    }

    public String getCustomerMiddlename() {
        return customerMiddlename;
    }

    public void setCustomerMiddlename(String customerMiddlename) {
        this.customerMiddlename = customerMiddlename;
    }

    public String getCustomerPrefix() {
        return customerPrefix;
    }

    public void setCustomerPrefix(String customerPrefix) {
        this.customerPrefix = customerPrefix;
    }

    public String getCustomerSuffix() {
        return customerSuffix;
    }

    public void setCustomerSuffix(String customerSuffix) {
        this.customerSuffix = customerSuffix;
    }

    public String getCustomerTaxvat() {
        return customerTaxvat;
    }

    public void setCustomerTaxvat(String customerTaxvat) {
        this.customerTaxvat = customerTaxvat;
    }

    public String getDiscountDescription() {
        return discountDescription;
    }

    public void setDiscountDescription(String discountDescription) {
        this.discountDescription = discountDescription;
    }

    public String getExtCustomerId() {
        return extCustomerId;
    }

    public void setExtCustomerId(String extCustomerId) {
        this.extCustomerId = extCustomerId;
    }

    public String getExtOrderId() {
        return extOrderId;
    }

    public void setExtOrderId(String extOrderId) {
        this.extOrderId = extOrderId;
    }

    public String getGlobalCurrencyCode() {
        return globalCurrencyCode;
    }

    public void setGlobalCurrencyCode(String globalCurrencyCode) {
        this.globalCurrencyCode = globalCurrencyCode;
    }

    public String getHoldBeforeState() {
        return holdBeforeState;
    }

    public void setHoldBeforeState(String holdBeforeState) {
        this.holdBeforeState = holdBeforeState;
    }

    public String getHoldBeforeStatus() {
        return holdBeforeStatus;
    }

    public void setHoldBeforeStatus(String holdBeforeStatus) {
        this.holdBeforeStatus = holdBeforeStatus;
    }

    public String getOrderCurrencyCode() {
        return orderCurrencyCode;
    }

    public void setOrderCurrencyCode(String orderCurrencyCode) {
        this.orderCurrencyCode = orderCurrencyCode;
    }

    public String getOriginalIncrementId() {
        return originalIncrementId;
    }

    public void setOriginalIncrementId(String originalIncrementId) {
        this.originalIncrementId = originalIncrementId;
    }

    public String getRelationChildId() {
        return relationChildId;
    }

    public void setRelationChildId(String relationChildId) {
        this.relationChildId = relationChildId;
    }

    public String getRelationChildRealId() {
        return relationChildRealId;
    }

    public void setRelationChildRealId(String relationChildRealId) {
        this.relationChildRealId = relationChildRealId;
    }

    public String getRelationParentId() {
        return relationParentId;
    }

    public void setRelationParentId(String relationParentId) {
        this.relationParentId = relationParentId;
    }

    public String getRelationParentRealId() {
        return relationParentRealId;
    }

    public void setRelationParentRealId(String relationParentRealId) {
        this.relationParentRealId = relationParentRealId;
    }

    public String getRemoteIp() {
        return remoteIp;
    }

    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public String getStoreCurrencyCode() {
        return storeCurrencyCode;
    }

    public void setStoreCurrencyCode(String storeCurrencyCode) {
        this.storeCurrencyCode = storeCurrencyCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getXForwardedFor() {
        return xForwardedFor;
    }

    public void setXForwardedFor(String xForwardedFor) {
        this.xForwardedFor = xForwardedFor;
    }

    public String getCustomerNote() {
        return customerNote;
    }

    public void setCustomerNote(String customerNote) {
        this.customerNote = customerNote;
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

    public Integer getTotalItemCount() {
        return totalItemCount;
    }

    public void setTotalItemCount(Integer totalItemCount) {
        this.totalItemCount = totalItemCount;
    }

    public Integer getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(Integer customerGender) {
        this.customerGender = customerGender;
    }

    public BigDecimal getHiddenTaxAmount() {
        return hiddenTaxAmount;
    }

    public void setHiddenTaxAmount(BigDecimal hiddenTaxAmount) {
        this.hiddenTaxAmount = hiddenTaxAmount;
    }

    public BigDecimal getBaseHiddenTaxAmount() {
        return baseHiddenTaxAmount;
    }

    public void setBaseHiddenTaxAmount(BigDecimal baseHiddenTaxAmount) {
        this.baseHiddenTaxAmount = baseHiddenTaxAmount;
    }

    public BigDecimal getShippingHiddenTaxAmount() {
        return shippingHiddenTaxAmount;
    }

    public void setShippingHiddenTaxAmount(BigDecimal shippingHiddenTaxAmount) {
        this.shippingHiddenTaxAmount = shippingHiddenTaxAmount;
    }

    public BigDecimal getBaseShippingHiddenTaxAmnt() {
        return baseShippingHiddenTaxAmnt;
    }

    public void setBaseShippingHiddenTaxAmnt(BigDecimal baseShippingHiddenTaxAmnt) {
        this.baseShippingHiddenTaxAmnt = baseShippingHiddenTaxAmnt;
    }

    public BigDecimal getHiddenTaxInvoiced() {
        return hiddenTaxInvoiced;
    }

    public void setHiddenTaxInvoiced(BigDecimal hiddenTaxInvoiced) {
        this.hiddenTaxInvoiced = hiddenTaxInvoiced;
    }

    public BigDecimal getBaseHiddenTaxInvoiced() {
        return baseHiddenTaxInvoiced;
    }

    public void setBaseHiddenTaxInvoiced(BigDecimal baseHiddenTaxInvoiced) {
        this.baseHiddenTaxInvoiced = baseHiddenTaxInvoiced;
    }

    public BigDecimal getHiddenTaxRefunded() {
        return hiddenTaxRefunded;
    }

    public void setHiddenTaxRefunded(BigDecimal hiddenTaxRefunded) {
        this.hiddenTaxRefunded = hiddenTaxRefunded;
    }

    public BigDecimal getBaseHiddenTaxRefunded() {
        return baseHiddenTaxRefunded;
    }

    public void setBaseHiddenTaxRefunded(BigDecimal baseHiddenTaxRefunded) {
        this.baseHiddenTaxRefunded = baseHiddenTaxRefunded;
    }

    public BigDecimal getShippingInclTax() {
        return shippingInclTax;
    }

    public void setShippingInclTax(BigDecimal shippingInclTax) {
        this.shippingInclTax = shippingInclTax;
    }

    public BigDecimal getBaseShippingInclTax() {
        return baseShippingInclTax;
    }

    public void setBaseShippingInclTax(BigDecimal baseShippingInclTax) {
        this.baseShippingInclTax = baseShippingInclTax;
    }

    public String getCouponRuleName() {
        return couponRuleName;
    }

    public void setCouponRuleName(String couponRuleName) {
        this.couponRuleName = couponRuleName;
    }

    public Integer getPaypalIpnCustomerNotified() {
        return paypalIpnCustomerNotified;
    }

    public void setPaypalIpnCustomerNotified(Integer paypalIpnCustomerNotified) {
        this.paypalIpnCustomerNotified = paypalIpnCustomerNotified;
    }

    public Integer getGiftMessageId() {
        return giftMessageId;
    }

    public void setGiftMessageId(Integer giftMessageId) {
        this.giftMessageId = giftMessageId;
    }

}

