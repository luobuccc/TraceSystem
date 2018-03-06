package com.traceback.pojo;

import java.util.Date;

public class SlaughterBatch {
    private Integer id;

    private String lotNumber;

    private String supervisor;

    private String remark;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer modifiedId;

    public SlaughterBatch(Integer id, String lotNumber, String supervisor, String remark, Date gmtCreate, Date gmtModified, Integer modifiedId) {
        this.id = id;
        this.lotNumber = lotNumber;
        this.supervisor = supervisor;
        this.remark = remark;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.modifiedId = modifiedId;
    }

    public SlaughterBatch() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber == null ? null : lotNumber.trim();
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor == null ? null : supervisor.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getModifiedId() {
        return modifiedId;
    }

    public void setModifiedId(Integer modifiedId) {
        this.modifiedId = modifiedId;
    }
}