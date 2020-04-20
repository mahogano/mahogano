package com.mahogano.core.presta.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Orders {

    private Integer idOrder;

    private String reference;

    private Integer idShopGroup;

    private Integer idShop;

    private Integer idCarrier;

    private Integer idLang;

    private Integer idCustomer;

    private Integer idCart;

    private Integer idCurrency;

    private Integer idAddressDelivery;

    private Integer idAddressInvoice;

    private Integer currentState;

    private String secureKey;

    private String payment;

    private BigDecimal conversionRate;

    private String module;

    private Integer recyclable;

    private Integer gift;

    private String giftMessage;

    private Integer mobileTheme;

    private String shippingNumber;

    private BigDecimal totalDiscounts;

    private BigDecimal totalDiscountsTaxIncl;

    private BigDecimal totalDiscountsTaxExcl;

    private BigDecimal totalPaid;

    private BigDecimal totalPaidTaxIncl;

    private BigDecimal totalPaidTaxExcl;

    private BigDecimal totalPaidReal;

    private BigDecimal totalProducts;

    private BigDecimal totalProductsWt;

    private BigDecimal totalShipping;

    private BigDecimal totalShippingTaxIncl;

    private BigDecimal totalShippingTaxExcl;

    private BigDecimal carrierTaxRate;

    private BigDecimal totalWrapping;

    private BigDecimal totalWrappingTaxIncl;

    private BigDecimal totalWrappingTaxExcl;

    private Integer roundMode;

    private Integer roundType;

    private Integer invoiceNumber;

    private Integer deliveryNumber;

    private LocalDateTime invoiceDate;

    private LocalDateTime deliveryDate;

    private Integer valid;

    private LocalDateTime dateAdd;

    private LocalDateTime dateUpd;

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(Integer idShopGroup) {
        this.idShopGroup = idShopGroup;
    }

    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
    }

    public Integer getIdCarrier() {
        return idCarrier;
    }

    public void setIdCarrier(Integer idCarrier) {
        this.idCarrier = idCarrier;
    }

    public Integer getIdLang() {
        return idLang;
    }

    public void setIdLang(Integer idLang) {
        this.idLang = idLang;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Integer getIdCart() {
        return idCart;
    }

    public void setIdCart(Integer idCart) {
        this.idCart = idCart;
    }

    public Integer getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(Integer idCurrency) {
        this.idCurrency = idCurrency;
    }

    public Integer getIdAddressDelivery() {
        return idAddressDelivery;
    }

    public void setIdAddressDelivery(Integer idAddressDelivery) {
        this.idAddressDelivery = idAddressDelivery;
    }

    public Integer getIdAddressInvoice() {
        return idAddressInvoice;
    }

    public void setIdAddressInvoice(Integer idAddressInvoice) {
        this.idAddressInvoice = idAddressInvoice;
    }

    public Integer getCurrentState() {
        return currentState;
    }

    public void setCurrentState(Integer currentState) {
        this.currentState = currentState;
    }

    public String getSecureKey() {
        return secureKey;
    }

    public void setSecureKey(String secureKey) {
        this.secureKey = secureKey;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Integer getRecyclable() {
        return recyclable;
    }

    public void setRecyclable(Integer recyclable) {
        this.recyclable = recyclable;
    }

    public Integer getGift() {
        return gift;
    }

    public void setGift(Integer gift) {
        this.gift = gift;
    }

    public String getGiftMessage() {
        return giftMessage;
    }

    public void setGiftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
    }

    public Integer getMobileTheme() {
        return mobileTheme;
    }

    public void setMobileTheme(Integer mobileTheme) {
        this.mobileTheme = mobileTheme;
    }

    public String getShippingNumber() {
        return shippingNumber;
    }

    public void setShippingNumber(String shippingNumber) {
        this.shippingNumber = shippingNumber;
    }

    public BigDecimal getTotalDiscounts() {
        return totalDiscounts;
    }

    public void setTotalDiscounts(BigDecimal totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }

    public BigDecimal getTotalDiscountsTaxIncl() {
        return totalDiscountsTaxIncl;
    }

    public void setTotalDiscountsTaxIncl(BigDecimal totalDiscountsTaxIncl) {
        this.totalDiscountsTaxIncl = totalDiscountsTaxIncl;
    }

    public BigDecimal getTotalDiscountsTaxExcl() {
        return totalDiscountsTaxExcl;
    }

    public void setTotalDiscountsTaxExcl(BigDecimal totalDiscountsTaxExcl) {
        this.totalDiscountsTaxExcl = totalDiscountsTaxExcl;
    }

    public BigDecimal getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(BigDecimal totalPaid) {
        this.totalPaid = totalPaid;
    }

    public BigDecimal getTotalPaidTaxIncl() {
        return totalPaidTaxIncl;
    }

    public void setTotalPaidTaxIncl(BigDecimal totalPaidTaxIncl) {
        this.totalPaidTaxIncl = totalPaidTaxIncl;
    }

    public BigDecimal getTotalPaidTaxExcl() {
        return totalPaidTaxExcl;
    }

    public void setTotalPaidTaxExcl(BigDecimal totalPaidTaxExcl) {
        this.totalPaidTaxExcl = totalPaidTaxExcl;
    }

    public BigDecimal getTotalPaidReal() {
        return totalPaidReal;
    }

    public void setTotalPaidReal(BigDecimal totalPaidReal) {
        this.totalPaidReal = totalPaidReal;
    }

    public BigDecimal getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(BigDecimal totalProducts) {
        this.totalProducts = totalProducts;
    }

    public BigDecimal getTotalProductsWt() {
        return totalProductsWt;
    }

    public void setTotalProductsWt(BigDecimal totalProductsWt) {
        this.totalProductsWt = totalProductsWt;
    }

    public BigDecimal getTotalShipping() {
        return totalShipping;
    }

    public void setTotalShipping(BigDecimal totalShipping) {
        this.totalShipping = totalShipping;
    }

    public BigDecimal getTotalShippingTaxIncl() {
        return totalShippingTaxIncl;
    }

    public void setTotalShippingTaxIncl(BigDecimal totalShippingTaxIncl) {
        this.totalShippingTaxIncl = totalShippingTaxIncl;
    }

    public BigDecimal getTotalShippingTaxExcl() {
        return totalShippingTaxExcl;
    }

    public void setTotalShippingTaxExcl(BigDecimal totalShippingTaxExcl) {
        this.totalShippingTaxExcl = totalShippingTaxExcl;
    }

    public BigDecimal getCarrierTaxRate() {
        return carrierTaxRate;
    }

    public void setCarrierTaxRate(BigDecimal carrierTaxRate) {
        this.carrierTaxRate = carrierTaxRate;
    }

    public BigDecimal getTotalWrapping() {
        return totalWrapping;
    }

    public void setTotalWrapping(BigDecimal totalWrapping) {
        this.totalWrapping = totalWrapping;
    }

    public BigDecimal getTotalWrappingTaxIncl() {
        return totalWrappingTaxIncl;
    }

    public void setTotalWrappingTaxIncl(BigDecimal totalWrappingTaxIncl) {
        this.totalWrappingTaxIncl = totalWrappingTaxIncl;
    }

    public BigDecimal getTotalWrappingTaxExcl() {
        return totalWrappingTaxExcl;
    }

    public void setTotalWrappingTaxExcl(BigDecimal totalWrappingTaxExcl) {
        this.totalWrappingTaxExcl = totalWrappingTaxExcl;
    }

    public Integer getRoundMode() {
        return roundMode;
    }

    public void setRoundMode(Integer roundMode) {
        this.roundMode = roundMode;
    }

    public Integer getRoundType() {
        return roundType;
    }

    public void setRoundType(Integer roundType) {
        this.roundType = roundType;
    }

    public Integer getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Integer invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Integer getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(Integer deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public LocalDateTime getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
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

}

