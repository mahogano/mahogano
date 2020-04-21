package com.mahogano.core.presta.entity;


public class Attachment {

    private Integer idAttachment;

    private String file;

    private String fileName;

    private Long fileSize;

    private String mime;

    public Integer getIdAttachment() {
        return idAttachment;
    }

    public void setIdAttachment(Integer idAttachment) {
        this.idAttachment = idAttachment;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

}

