package com.mahogano.core.presta.entity;


public class Translation {

    private Integer idTranslation;

    private Integer idLang;

    private String key;

    private String translation;

    private String domain;

    private String theme;

    public Integer getIdTranslation() {
        return idTranslation;
    }

    public void setIdTranslation(Integer idTranslation) {
        this.idTranslation = idTranslation;
    }

    public Integer getIdLang() {
        return idLang;
    }

    public void setIdLang(Integer idLang) {
        this.idLang = idLang;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

}

