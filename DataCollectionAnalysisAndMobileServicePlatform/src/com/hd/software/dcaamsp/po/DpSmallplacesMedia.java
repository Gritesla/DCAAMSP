package com.hd.software.dcaamsp.po;

public class DpSmallplacesMedia {
    private String dpRespMediaid;

    private String dpRespUnitcode;

    private String dpRespMediatype;

    private String dpRespMediaaddress;

    private String dpRespThumbnailaddress;

    public String getDpRespMediaid() {
        return dpRespMediaid;
    }

    public void setDpRespMediaid(String dpRespMediaid) {
        this.dpRespMediaid = dpRespMediaid == null ? null : dpRespMediaid.trim();
    }

    public String getDpRespUnitcode() {
        return dpRespUnitcode;
    }

    public void setDpRespUnitcode(String dpRespUnitcode) {
        this.dpRespUnitcode = dpRespUnitcode == null ? null : dpRespUnitcode.trim();
    }

    public String getDpRespMediatype() {
        return dpRespMediatype;
    }

    public void setDpRespMediatype(String dpRespMediatype) {
        this.dpRespMediatype = dpRespMediatype == null ? null : dpRespMediatype.trim();
    }

    public String getDpRespMediaaddress() {
        return dpRespMediaaddress;
    }

    public void setDpRespMediaaddress(String dpRespMediaaddress) {
        this.dpRespMediaaddress = dpRespMediaaddress == null ? null : dpRespMediaaddress.trim();
    }

    public String getDpRespThumbnailaddress() {
        return dpRespThumbnailaddress;
    }

    public void setDpRespThumbnailaddress(String dpRespThumbnailaddress) {
        this.dpRespThumbnailaddress = dpRespThumbnailaddress == null ? null : dpRespThumbnailaddress.trim();
    }
}