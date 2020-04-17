package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class SalesFlatQuoteAddress {

    private Integer addressId;

    private Integer quoteId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Integer customerId;

    private Integer saveInAddressBook;

    private Integer customerAddressId;

    private String addressType;

    private String email;

    private String prefix;

    private String firstname;

    private String middlename;

    private String lastname;

    private String suffix;

    private String company;

    private String street;

    private String city;

    private String region;

    private Integer regionId;

    private String postcode;

    private String countryId;

    private String telephone;

    private String fax;

    private Integer sameAsBilling;

    private Integer freeShipping;

    private Integer collectShippingRates;

    private String shippingMethod;

    private String shippingDescription;

    private BigDecimal weight;

    private BigDecimal subtotal;

    private BigDecimal baseSubtotal;

    private BigDecimal subtotalWithDiscount;

    private BigDecimal baseSubtotalWithDiscount;

    private BigDecimal taxAmount;

    private BigDecimal baseTaxAmount;

    private BigDecimal shippingAmount;

    private BigDecimal baseShippingAmount;

    private BigDecimal shippingTaxAmount;

    private BigDecimal baseShippingTaxAmount;

    private BigDecimal discountAmount;

    private BigDecimal baseDiscountAmount;

    private BigDecimal grandTotal;

    private BigDecimal baseGrandTotal;

    private String customerNotes;

    private String appliedTaxes;

    private String discountDescription;

    private BigDecimal shippingDiscountAmount;

    private BigDecimal baseShippingDiscountAmount;

    private BigDecimal subtotalInclTax;

    private BigDecimal baseSubtotalTotalInclTax;

    private BigDecimal hiddenTaxAmount;

    private BigDecimal baseHiddenTaxAmount;

    private BigDecimal shippingHiddenTaxAmount;

    private BigDecimal baseShippingHiddenTaxAmnt;

    private BigDecimal shippingInclTax;

    private BigDecimal baseShippingInclTax;

    private String vatId;

    private Integer vatIsValid;

    private String vatRequestId;

    private String vatRequestDate;

    private Integer vatRequestSuccess;

    private Integer giftMessageId;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
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

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getSaveInAddressBook() {
        return saveInAddressBook;
    }

    public void setSaveInAddressBook(Integer saveInAddressBook) {
        this.saveInAddressBook = saveInAddressBook;
    }

    public Integer getCustomerAddressId() {
        return customerAddressId;
    }

    public void setCustomerAddressId(Integer customerAddressId) {
        this.customerAddressId = customerAddressId;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Integer getSameAsBilling() {
        return sameAsBilling;
    }

    public void setSameAsBilling(Integer sameAsBilling) {
        this.sameAsBilling = sameAsBilling;
    }

    public Integer getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(Integer freeShipping) {
        this.freeShipping = freeShipping;
    }

    public Integer getCollectShippingRates() {
        return collectShippingRates;
    }

    public void setCollectShippingRates(Integer collectShippingRates) {
        this.collectShippingRates = collectShippingRates;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public String getShippingDescription() {
        return shippingDescription;
    }

    public void setShippingDescription(String shippingDescription) {
        this.shippingDescription = shippingDescription;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getBaseSubtotal() {
        return baseSubtotal;
    }

    public void setBaseSubtotal(BigDecimal baseSubtotal) {
        this.baseSubtotal = baseSubtotal;
    }

    public BigDecimal getSubtotalWithDiscount() {
        return subtotalWithDiscount;
    }

    public void setSubtotalWithDiscount(BigDecimal subtotalWithDiscount) {
        this.subtotalWithDiscount = subtotalWithDiscount;
    }

    public BigDecimal getBaseSubtotalWithDiscount() {
        return baseSubtotalWithDiscount;
    }

    public void setBaseSubtotalWithDiscount(BigDecimal baseSubtotalWithDiscount) {
        this.baseSubtotalWithDiscount = baseSubtotalWithDiscount;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getBaseTaxAmount() {
        return baseTaxAmount;
    }

    public void setBaseTaxAmount(BigDecimal baseTaxAmount) {
        this.baseTaxAmount = baseTaxAmount;
    }

    public BigDecimal getShippingAmount() {
        return shippingAmount;
    }

    public void setShippingAmount(BigDecimal shippingAmount) {
        this.shippingAmount = shippingAmount;
    }

    public BigDecimal getBaseShippingAmount() {
        return baseShippingAmount;
    }

    public void setBaseShippingAmount(BigDecimal baseShippingAmount) {
        this.baseShippingAmount = baseShippingAmount;
    }

    public BigDecimal getShippingTaxAmount() {
        return shippingTaxAmount;
    }

    public void setShippingTaxAmount(BigDecimal shippingTaxAmount) {
        this.shippingTaxAmount = shippingTaxAmount;
    }

    public BigDecimal getBaseShippingTaxAmount() {
        return baseShippingTaxAmount;
    }

    public void setBaseShippingTaxAmount(BigDecimal baseShippingTaxAmount) {
        this.baseShippingTaxAmount = baseShippingTaxAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getBaseDiscountAmount() {
        return baseDiscountAmount;
    }

    public void setBaseDiscountAmount(BigDecimal baseDiscountAmount) {
        this.baseDiscountAmount = baseDiscountAmount;
    }

    public BigDecimal getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }

    public BigDecimal getBaseGrandTotal() {
        return baseGrandTotal;
    }

    public void setBaseGrandTotal(BigDecimal baseGrandTotal) {
        this.baseGrandTotal = baseGrandTotal;
    }

    public String getCustomerNotes() {
        return customerNotes;
    }

    public void setCustomerNotes(String customerNotes) {
        this.customerNotes = customerNotes;
    }

    public String getAppliedTaxes() {
        return appliedTaxes;
    }

    public void setAppliedTaxes(String appliedTaxes) {
        this.appliedTaxes = appliedTaxes;
    }

    public String getDiscountDescription() {
        return discountDescription;
    }

    public void setDiscountDescription(String discountDescription) {
        this.discountDescription = discountDescription;
    }

    public BigDecimal getShippingDiscountAmount() {
        return shippingDiscountAmount;
    }

    public void setShippingDiscountAmount(BigDecimal shippingDiscountAmount) {
        this.shippingDiscountAmount = shippingDiscountAmount;
    }

    public BigDecimal getBaseShippingDiscountAmount() {
        return baseShippingDiscountAmount;
    }

    public void setBaseShippingDiscountAmount(BigDecimal baseShippingDiscountAmount) {
        this.baseShippingDiscountAmount = baseShippingDiscountAmount;
    }

    public BigDecimal getSubtotalInclTax() {
        return subtotalInclTax;
    }

    public void setSubtotalInclTax(BigDecimal subtotalInclTax) {
        this.subtotalInclTax = subtotalInclTax;
    }

    public BigDecimal getBaseSubtotalTotalInclTax() {
        return baseSubtotalTotalInclTax;
    }

    public void setBaseSubtotalTotalInclTax(BigDecimal baseSubtotalTotalInclTax) {
        this.baseSubtotalTotalInclTax = baseSubtotalTotalInclTax;
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

    public String getVatId() {
        return vatId;
    }

    public void setVatId(String vatId) {
        this.vatId = vatId;
    }

    public Integer getVatIsValid() {
        return vatIsValid;
    }

    public void setVatIsValid(Integer vatIsValid) {
        this.vatIsValid = vatIsValid;
    }

    public String getVatRequestId() {
        return vatRequestId;
    }

    public void setVatRequestId(String vatRequestId) {
        this.vatRequestId = vatRequestId;
    }

    public String getVatRequestDate() {
        return vatRequestDate;
    }

    public void setVatRequestDate(String vatRequestDate) {
        this.vatRequestDate = vatRequestDate;
    }

    public Integer getVatRequestSuccess() {
        return vatRequestSuccess;
    }

    public void setVatRequestSuccess(Integer vatRequestSuccess) {
        this.vatRequestSuccess = vatRequestSuccess;
    }

    public Integer getGiftMessageId() {
        return giftMessageId;
    }

    public void setGiftMessageId(Integer giftMessageId) {
        this.giftMessageId = giftMessageId;
    }

}

