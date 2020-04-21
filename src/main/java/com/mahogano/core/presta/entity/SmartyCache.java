package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class SmartyCache {

    private String idSmartyCache;

    private String name;

    private String cacheId;

    private LocalDateTime modified;

    private String content;

    public String getIdSmartyCache() {
        return idSmartyCache;
    }

    public void setIdSmartyCache(String idSmartyCache) {
        this.idSmartyCache = idSmartyCache;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}

