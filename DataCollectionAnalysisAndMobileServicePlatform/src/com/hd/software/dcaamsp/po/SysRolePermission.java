package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;

public class SysRolePermission {
    private BigDecimal dpRespId;

    private Object dpRespRoleid;

    private Object dpRespPermissionid;

    public BigDecimal getDpRespId() {
        return dpRespId;
    }

    public void setDpRespId(BigDecimal dpRespId) {
        this.dpRespId = dpRespId;
    }

    public Object getDpRespRoleid() {
        return dpRespRoleid;
    }

    public void setDpRespRoleid(Object dpRespRoleid) {
        this.dpRespRoleid = dpRespRoleid;
    }

    public Object getDpRespPermissionid() {
        return dpRespPermissionid;
    }

    public void setDpRespPermissionid(Object dpRespPermissionid) {
        this.dpRespPermissionid = dpRespPermissionid;
    }
}