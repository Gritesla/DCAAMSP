package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;

public class DpBasicplan {
    private BigDecimal dpRespId;

    private String dpRespIdentifier;

    private String dpRespDate;

    private String dpRespPlanname;

    private String dpRespCompanyname;

    private String dpRespContact;

    private String dpRespPath;

    private String dpRespDetachmentid;

    private String dpRespDetachname;

    private String dpRespSquadronname;

    public BigDecimal getDpRespId() {
        return dpRespId;
    }

    public void setDpRespId(BigDecimal dpRespId) {
        this.dpRespId = dpRespId;
    }

    public String getDpRespIdentifier() {
        return dpRespIdentifier;
    }

    public void setDpRespIdentifier(String dpRespIdentifier) {
        this.dpRespIdentifier = dpRespIdentifier == null ? null : dpRespIdentifier.trim();
    }

    public String getDpRespDate() {
        return dpRespDate;
    }

    public void setDpRespDate(String dpRespDate) {
        this.dpRespDate = dpRespDate == null ? null : dpRespDate.trim();
    }

    public String getDpRespPlanname() {
        return dpRespPlanname;
    }

    public void setDpRespPlanname(String dpRespPlanname) {
        this.dpRespPlanname = dpRespPlanname == null ? null : dpRespPlanname.trim();
    }

    public String getDpRespCompanyname() {
        return dpRespCompanyname;
    }

    public void setDpRespCompanyname(String dpRespCompanyname) {
        this.dpRespCompanyname = dpRespCompanyname == null ? null : dpRespCompanyname.trim();
    }

    public String getDpRespContact() {
        return dpRespContact;
    }

    public void setDpRespContact(String dpRespContact) {
        this.dpRespContact = dpRespContact == null ? null : dpRespContact.trim();
    }

    public String getDpRespPath() {
        return dpRespPath;
    }

    public void setDpRespPath(String dpRespPath) {
        this.dpRespPath = dpRespPath == null ? null : dpRespPath.trim();
    }

    public String getDpRespDetachmentid() {
        return dpRespDetachmentid;
    }

    public void setDpRespDetachmentid(String dpRespDetachmentid) {
        this.dpRespDetachmentid = dpRespDetachmentid == null ? null : dpRespDetachmentid.trim();
    }

    public String getDpRespDetachname() {
        return dpRespDetachname;
    }

    public void setDpRespDetachname(String dpRespDetachname) {
        this.dpRespDetachname = dpRespDetachname == null ? null : dpRespDetachname.trim();
    }

    public String getDpRespSquadronname() {
        return dpRespSquadronname;
    }

    public void setDpRespSquadronname(String dpRespSquadronname) {
        this.dpRespSquadronname = dpRespSquadronname == null ? null : dpRespSquadronname.trim();
    }
}