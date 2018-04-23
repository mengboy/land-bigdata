package com.bigdata.web.domain;

import java.util.Date;

public class Position {
    private Integer pId;

    private String pName;

    private Integer jtId;

    private String pWorkPlace;

    private Date createDate;

    private String pDesc;

    private Integer sn;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public Integer getJtId() {
        return jtId;
    }

    public void setJtId(Integer jtId) {
        this.jtId = jtId;
    }

    public String getpWorkPlace() {
        return pWorkPlace;
    }

    public void setpWorkPlace(String pWorkPlace) {
        this.pWorkPlace = pWorkPlace == null ? null : pWorkPlace.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getpDesc() {
        return pDesc;
    }

    public void setpDesc(String pDesc) {
        this.pDesc = pDesc == null ? null : pDesc.trim();
    }

    public Integer getSn() {
        return sn;
    }

    public void setSn(Integer sn) {
        this.sn = sn;
    }
}