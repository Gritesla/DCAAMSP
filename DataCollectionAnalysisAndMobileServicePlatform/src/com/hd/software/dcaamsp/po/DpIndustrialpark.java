package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;

public class DpIndustrialpark {
    private BigDecimal dpRespId;

    private String dpRespParkname;

    private String dpRespParkid;

    private String dpRespSummary;

    private String dpRespAddress;

    private String dpRespRemark;

    private String dpRespGisX;

    private String dpRespGisY;

    private String dpRespDetachmentid;

    public BigDecimal getDpRespId() {
        return dpRespId;
    }

    public void setDpRespId(BigDecimal dpRespId) {
        this.dpRespId = dpRespId;
    }

    public String getDpRespParkname() {
        return dpRespParkname;
    }

    public void setDpRespParkname(String dpRespParkname) {
        this.dpRespParkname = dpRespParkname == null ? null : dpRespParkname.trim();
    }

    public String getDpRespParkid() {
        return dpRespParkid;
    }

    public void setDpRespParkid(String dpRespParkid) {
        this.dpRespParkid = dpRespParkid == null ? null : dpRespParkid.trim();
    }

    public String getDpRespSummary() {
        return dpRespSummary;
    }

    public void setDpRespSummary(String dpRespSummary) {
        this.dpRespSummary = dpRespSummary == null ? null : dpRespSummary.trim();
    }

    public String getDpRespAddress() {
        return dpRespAddress;
    }

    public void setDpRespAddress(String dpRespAddress) {
        this.dpRespAddress = dpRespAddress == null ? null : dpRespAddress.trim();
    }

    public String getDpRespRemark() {
        return dpRespRemark;
    }

    public void setDpRespRemark(String dpRespRemark) {
        this.dpRespRemark = dpRespRemark == null ? null : dpRespRemark.trim();
    }

    public String getDpRespGisX() {
        return dpRespGisX;
    }

    public void setDpRespGisX(String dpRespGisX) {
        this.dpRespGisX = dpRespGisX == null ? null : dpRespGisX.trim();
    }

    public String getDpRespGisY() {
        return dpRespGisY;
    }

    public void setDpRespGisY(String dpRespGisY) {
        this.dpRespGisY = dpRespGisY == null ? null : dpRespGisY.trim();
    }

    public String getDpRespDetachmentid() {
        return dpRespDetachmentid;
    }

    public void setDpRespDetachmentid(String dpRespDetachmentid) {
        this.dpRespDetachmentid = dpRespDetachmentid == null ? null : dpRespDetachmentid.trim();
    }
}