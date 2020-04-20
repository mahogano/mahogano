package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class Cart {

    private Integer idCart;

    private Integer idShopGroup;

    private Integer idShop;

    private Integer idCarrier;

    private String deliveryOption;

    private Integer idLang;

    private Integer idAddressDelivery;

    private Integer idAddressInvoice;

    private Integer idCurrency;

    private Integer idCustomer;

    private Integer idGuest;

    private String secureKey;

    private Integer recyclable;

    private Integer gift;

    private String giftMessage;

    private Integer mobileTheme;

    private Integer allowSeperatedPackage;

    private LocalDateTime dateAdd;

    private LocalDateTime dateUpd;

    private String checkoutSessionData;

    public Integer getIdCart() {
        return idCart;
    }

    public void setIdCart(Integer idCart) {
        this.idCart = idCart;
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

    public String getDeliveryOption() {
        return deliveryOption;
    }

    public void setDeliveryOption(String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }

    public Integer getIdLang() {
        return idLang;
    }

    public void setIdLang(Integer idLang) {
        this.idLang = idLang;
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

    public Integer getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(Integer idCurrency) {
        this.idCurrency = idCurrency;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Integer getIdGuest() {
        return idGuest;
    }

    public void setIdGuest(Integer idGuest) {
        this.idGuest = idGuest;
    }

    public String getSecureKey() {
        return secureKey;
    }

    public void setSecureKey(String secureKey) {
        this.secureKey = secureKey;
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

    public Integer getAllowSeperatedPackage() {
        return allowSeperatedPackage;
    }

    public void setAllowSeperatedPackage(Integer allowSeperatedPackage) {
        this.allowSeperatedPackage = allowSeperatedPackage;
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

    public String getCheckoutSessionData() {
        return checkoutSessionData;
    }

    public void setCheckoutSessionData(String checkoutSessionData) {
        this.checkoutSessionData = checkoutSessionData;
    }

}

