package com.mahogano.core.presta.entity;


public class Badge {

    private Integer idBadge;

    private Integer idPsBadge;

    private String type;

    private Integer idGroup;

    private Integer groupPosition;

    private Integer scoring;

    private Integer awb;

    private Integer validated;

    public Integer getIdBadge() {
        return idBadge;
    }

    public void setIdBadge(Integer idBadge) {
        this.idBadge = idBadge;
    }

    public Integer getIdPsBadge() {
        return idPsBadge;
    }

    public void setIdPsBadge(Integer idPsBadge) {
        this.idPsBadge = idPsBadge;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public Integer getGroupPosition() {
        return groupPosition;
    }

    public void setGroupPosition(Integer groupPosition) {
        this.groupPosition = groupPosition;
    }

    public Integer getScoring() {
        return scoring;
    }

    public void setScoring(Integer scoring) {
        this.scoring = scoring;
    }

    public Integer getAwb() {
        return awb;
    }

    public void setAwb(Integer awb) {
        this.awb = awb;
    }

    public Integer getValidated() {
        return validated;
    }

    public void setValidated(Integer validated) {
        this.validated = validated;
    }

}

