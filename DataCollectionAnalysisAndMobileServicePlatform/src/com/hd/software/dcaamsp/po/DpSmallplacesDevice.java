package com.hd.software.dcaamsp.po;

public class DpSmallplacesDevice {
    private String dpRespUnitcode;

    private String dpRespDeviceid;

    private String dpRespLayer;

    private String dpRespDoornumber;

    public String getDpRespUnitcode() {
        return dpRespUnitcode;
    }

    public void setDpRespUnitcode(String dpRespUnitcode) {
        this.dpRespUnitcode = dpRespUnitcode == null ? null : dpRespUnitcode.trim();
    }

    public String getDpRespDeviceid() {
        return dpRespDeviceid;
    }

    public void setDpRespDeviceid(String dpRespDeviceid) {
        this.dpRespDeviceid = dpRespDeviceid == null ? null : dpRespDeviceid.trim();
    }

    public String getDpRespLayer() {
        return dpRespLayer;
    }

    public void setDpRespLayer(String dpRespLayer) {
        this.dpRespLayer = dpRespLayer == null ? null : dpRespLayer.trim();
    }

    public String getDpRespDoornumber() {
        return dpRespDoornumber;
    }

    public void setDpRespDoornumber(String dpRespDoornumber) {
        this.dpRespDoornumber = dpRespDoornumber == null ? null : dpRespDoornumber.trim();
    }
}