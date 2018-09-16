package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;

public class SysUser {
    private BigDecimal dpRespId;

    private String dpRespUsercode;

    private String dpRespUsername;

    private String dpRespPassword;

    private String dpRespSalt;

    private String dpRespLock;

    private String dpRespPlatform;

    private String dpRespDel;

    private String dpRespSquadronid;

    private BigDecimal dpRespRoleid;

    public BigDecimal getDpRespId() {
        return dpRespId;
    }

    public void setDpRespId(BigDecimal dpRespId) {
        this.dpRespId = dpRespId;
    }

    public String getDpRespUsercode() {
        return dpRespUsercode;
    }

    public void setDpRespUsercode(String dpRespUsercode) {
        this.dpRespUsercode = dpRespUsercode == null ? null : dpRespUsercode.trim();
    }

    public String getDpRespUsername() {
        return dpRespUsername;
    }

    public void setDpRespUsername(String dpRespUsername) {
        this.dpRespUsername = dpRespUsername == null ? null : dpRespUsername.trim();
    }

    public String getDpRespPassword() {
        return dpRespPassword;
    }

    public void setDpRespPassword(String dpRespPassword) {
        this.dpRespPassword = dpRespPassword == null ? null : dpRespPassword.trim();
    }

    public String getDpRespSalt() {
        return dpRespSalt;
    }

    public void setDpRespSalt(String dpRespSalt) {
        this.dpRespSalt = dpRespSalt == null ? null : dpRespSalt.trim();
    }

    public String getDpRespLock() {
        return dpRespLock;
    }

    public void setDpRespLock(String dpRespLock) {
        this.dpRespLock = dpRespLock == null ? null : dpRespLock.trim();
    }

    public String getDpRespPlatform() {
        return dpRespPlatform;
    }

    public void setDpRespPlatform(String dpRespPlatform) {
        this.dpRespPlatform = dpRespPlatform == null ? null : dpRespPlatform.trim();
    }

    public String getDpRespDel() {
        return dpRespDel;
    }

    public void setDpRespDel(String dpRespDel) {
        this.dpRespDel = dpRespDel == null ? null : dpRespDel.trim();
    }

    public String getDpRespSquadronid() {
        return dpRespSquadronid;
    }

    public void setDpRespSquadronid(String dpRespSquadronid) {
        this.dpRespSquadronid = dpRespSquadronid == null ? null : dpRespSquadronid.trim();
    }

    public BigDecimal getDpRespRoleid() {
        return dpRespRoleid;
    }

    public void setDpRespRoleid(BigDecimal dpRespRoleid) {
        this.dpRespRoleid = dpRespRoleid;
    }
}