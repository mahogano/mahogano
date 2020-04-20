package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class SmartyLazyCache {

    private String templateHash;

    private String cacheId;

    private String compileId;

    private String filepath;

    private LocalDateTime lastUpdate;

    public String getTemplateHash() {
        return templateHash;
    }

    public void setTemplateHash(String templateHash) {
        this.templateHash = templateHash;
    }

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public String getCompileId() {
        return compileId;
    }

    public void setCompileId(String compileId) {
        this.compileId = compileId;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}

