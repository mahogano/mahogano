package com.mahogano.core.presta.entity;


public class Lang {

    private Integer idLang;

    private String name;

    private Integer active;

    private String isoCode;

    private String languageCode;

    private String locale;

    private String dateFormatLite;

    private String dateFormatFull;

    private Integer isRtl;

    public Integer getIdLang() {
        return idLang;
    }

    public void setIdLang(Integer idLang) {
        this.idLang = idLang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getDateFormatLite() {
        return dateFormatLite;
    }

    public void setDateFormatLite(String dateFormatLite) {
        this.dateFormatLite = dateFormatLite;
    }

    public String getDateFormatFull() {
        return dateFormatFull;
    }

    public void setDateFormatFull(String dateFormatFull) {
        this.dateFormatFull = dateFormatFull;
    }

    public Integer getIsRtl() {
        return isRtl;
    }

    public void setIsRtl(Integer isRtl) {
        this.isRtl = isRtl;
    }

}

