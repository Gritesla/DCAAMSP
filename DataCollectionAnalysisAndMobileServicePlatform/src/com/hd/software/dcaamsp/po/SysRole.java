package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;

public class SysRole {
    private BigDecimal dpRespRoleid;

    private String dpRespName;

    private String dpRespAvailable;

    public BigDecimal getDpRespRoleid() {
        return dpRespRoleid;
    }

    public void setDpRespRoleid(BigDecimal dpRespRoleid) {
        this.dpRespRoleid = dpRespRoleid;
    }

    public String getDpRespName() {
        return dpRespName;
    }

    public void setDpRespName(String dpRespName) {
        this.dpRespName = dpRespName == null ? null : dpRespName.trim();
    }

    public String getDpRespAvailable() {
        return dpRespAvailable;
    }

    public void setDpRespAvailable(String dpRespAvailable) {
        this.dpRespAvailable = dpRespAvailable == null ? null : dpRespAvailable.trim();
    }
}