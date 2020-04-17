package com.mahogano.core.magento.entity;

public class CoreTranslate {

    private Integer keyId;

    private String string;

    private Integer storeId;

    private String translate;

    private String locale;

    private Long crcString;

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Long getCrcString() {
        return crcString;
    }

    public void setCrcString(Long crcString) {
        this.crcString = crcString;
    }

}

