package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class Mail {

    private Integer idMail;

    private String recipient;

    private String template;

    private String subject;

    private Integer idLang;

    private LocalDateTime dateAdd;

    public Integer getIdMail() {
        return idMail;
    }

    public void setIdMail(Integer idMail) {
        this.idMail = idMail;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getIdLang() {
        return idLang;
    }

    public void setIdLang(Integer idLang) {
        this.idLang = idLang;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

}

