package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;
import java.math.BigDecimal;

public class Customer {

    private Integer idCustomer;

    private Integer idShopGroup;

    private Integer idShop;

    private Integer idGender;

    private Integer idDefaultGroup;

    private Integer idLang;

    private Integer idRisk;

    private String company;

    private String siret;

    private String ape;

    private String firstname;

    private String lastname;

    private String email;

    private String passwd;

    private LocalDateTime lastPasswdGen;

    private LocalDateTime birthday;

    private Integer newsletter;

    private String ipRegistrationNewsletter;

    private LocalDateTime newsletterDateAdd;

    private Integer optin;

    private String website;

    private BigDecimal outstandingAllowAmount;

    private Integer showPublicPrices;

    private Integer maxPaymentDays;

    private String secureKey;

    private String note;

    private Integer active;

    private Integer isGuest;

    private Integer deleted;

    private LocalDateTime dateAdd;

    private LocalDateTime dateUpd;

    private String resetPasswordToken;

    private LocalDateTime resetPasswordValidity;

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
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

    public Integer getIdGender() {
        return idGender;
    }

    public void setIdGender(Integer idGender) {
        this.idGender = idGender;
    }

    public Integer getIdDefaultGroup() {
        return idDefaultGroup;
    }

    public void setIdDefaultGroup(Integer idDefaultGroup) {
        this.idDefaultGroup = idDefaultGroup;
    }

    public Integer getIdLang() {
        return idLang;
    }

    public void setIdLang(Integer idLang) {
        this.idLang = idLang;
    }

    public Integer getIdRisk() {
        return idRisk;
    }

    public void setIdRisk(Integer idRisk) {
        this.idRisk = idRisk;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
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

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public LocalDateTime getLastPasswdGen() {
        return lastPasswdGen;
    }

    public void setLastPasswdGen(LocalDateTime lastPasswdGen) {
        this.lastPasswdGen = lastPasswdGen;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public Integer getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(Integer newsletter) {
        this.newsletter = newsletter;
    }

    public String getIpRegistrationNewsletter() {
        return ipRegistrationNewsletter;
    }

    public void setIpRegistrationNewsletter(String ipRegistrationNewsletter) {
        this.ipRegistrationNewsletter = ipRegistrationNewsletter;
    }

    public LocalDateTime getNewsletterDateAdd() {
        return newsletterDateAdd;
    }

    public void setNewsletterDateAdd(LocalDateTime newsletterDateAdd) {
        this.newsletterDateAdd = newsletterDateAdd;
    }

    public Integer getOptin() {
        return optin;
    }

    public void setOptin(Integer optin) {
        this.optin = optin;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public BigDecimal getOutstandingAllowAmount() {
        return outstandingAllowAmount;
    }

    public void setOutstandingAllowAmount(BigDecimal outstandingAllowAmount) {
        this.outstandingAllowAmount = outstandingAllowAmount;
    }

    public Integer getShowPublicPrices() {
        return showPublicPrices;
    }

    public void setShowPublicPrices(Integer showPublicPrices) {
        this.showPublicPrices = showPublicPrices;
    }

    public Integer getMaxPaymentDays() {
        return maxPaymentDays;
    }

    public void setMaxPaymentDays(Integer maxPaymentDays) {
        this.maxPaymentDays = maxPaymentDays;
    }

    public String getSecureKey() {
        return secureKey;
    }

    public void setSecureKey(String secureKey) {
        this.secureKey = secureKey;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getIsGuest() {
        return isGuest;
    }

    public void setIsGuest(Integer isGuest) {
        this.isGuest = isGuest;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
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

    public String getResetPasswordToken() {
        return resetPasswordToken;
    }

    public void setResetPasswordToken(String resetPasswordToken) {
        this.resetPasswordToken = resetPasswordToken;
    }

    public LocalDateTime getResetPasswordValidity() {
        return resetPasswordValidity;
    }

    public void setResetPasswordValidity(LocalDateTime resetPasswordValidity) {
        this.resetPasswordValidity = resetPasswordValidity;
    }

}

