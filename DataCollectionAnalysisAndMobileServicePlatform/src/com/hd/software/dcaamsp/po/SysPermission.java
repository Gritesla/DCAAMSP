package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;

public class SysPermission {
    private BigDecimal dpRespCode;

    private String dpRespName;

    private String dpRespType;

    private BigDecimal dpRespPcode;

    private String dpRespAvailable;

    private String dpRespSort;

    private String dpRespPids;

    private String dpRespUrl;

    private String dpRespDesp;

    public BigDecimal getDpRespCode() {
        return dpRespCode;
    }

    public void setDpRespCode(BigDecimal dpRespCode) {
        this.dpRespCode = dpRespCode;
    }

    public String getDpRespName() {
        return dpRespName;
    }

    public void setDpRespName(String dpRespName) {
        this.dpRespName = dpRespName == null ? null : dpRespName.trim();
    }

    public String getDpRespType() {
        return dpRespType;
    }

    public void setDpRespType(String dpRespType) {
        this.dpRespType = dpRespType == null ? null : dpRespType.trim();
    }

    public BigDecimal getDpRespPcode() {
        return dpRespPcode;
    }

    public void setDpRespPcode(BigDecimal dpRespPcode) {
        this.dpRespPcode = dpRespPcode;
    }

    public String getDpRespAvailable() {
        return dpRespAvailable;
    }

    public void setDpRespAvailable(String dpRespAvailable) {
        this.dpRespAvailable = dpRespAvailable == null ? null : dpRespAvailable.trim();
    }

    public String getDpRespSort() {
        return dpRespSort;
    }

    public void setDpRespSort(String dpRespSort) {
        this.dpRespSort = dpRespSort == null ? null : dpRespSort.trim();
    }

    public String getDpRespPids() {
        return dpRespPids;
    }

    public void setDpRespPids(String dpRespPids) {
        this.dpRespPids = dpRespPids == null ? null : dpRespPids.trim();
    }

    public String getDpRespUrl() {
        return dpRespUrl;
    }

    public void setDpRespUrl(String dpRespUrl) {
        this.dpRespUrl = dpRespUrl == null ? null : dpRespUrl.trim();
    }

    public String getDpRespDesp() {
        return dpRespDesp;
    }

    public void setDpRespDesp(String dpRespDesp) {
        this.dpRespDesp = dpRespDesp == null ? null : dpRespDesp.trim();
    }
}