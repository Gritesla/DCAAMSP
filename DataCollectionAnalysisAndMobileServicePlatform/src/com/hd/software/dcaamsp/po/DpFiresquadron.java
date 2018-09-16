package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;

public class DpFiresquadron {
    private BigDecimal dpRespId;

    private String dpRespSquadronid;

    private String dpRespSquadronname;

    private String dpRespParentid;

    public BigDecimal getDpRespId() {
        return dpRespId;
    }

    public void setDpRespId(BigDecimal dpRespId) {
        this.dpRespId = dpRespId;
    }

    public String getDpRespSquadronid() {
        return dpRespSquadronid;
    }

    public void setDpRespSquadronid(String dpRespSquadronid) {
        this.dpRespSquadronid = dpRespSquadronid == null ? null : dpRespSquadronid.trim();
    }

    public String getDpRespSquadronname() {
        return dpRespSquadronname;
    }

    public void setDpRespSquadronname(String dpRespSquadronname) {
        this.dpRespSquadronname = dpRespSquadronname == null ? null : dpRespSquadronname.trim();
    }

    public String getDpRespParentid() {
        return dpRespParentid;
    }

    public void setDpRespParentid(String dpRespParentid) {
        this.dpRespParentid = dpRespParentid == null ? null : dpRespParentid.trim();
    }
}