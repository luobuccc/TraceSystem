package com.traceback.pojo;

import java.util.Date;

public class AnimalIndividual {
    private Integer id;

    private Integer planId;

    private Integer homeId;

    private Integer earId;

    private String varietyName;

    private Date inTime;

    private Date outTime;

    private String outNotes;

    private String superiorSourceCode;

    private Integer status;

    private String remark;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer modifiedId;

    public AnimalIndividual(Integer id, Integer planId, Integer homeId, Integer earId, String varietyName, Date inTime, Date outTime, String outNotes, String superiorSourceCode, Integer status, String remark, Date gmtCreate, Date gmtModified, Integer modifiedId) {
        this.id = id;
        this.planId = planId;
        this.homeId = homeId;
        this.earId = earId;
        this.varietyName = varietyName;
        this.inTime = inTime;
        this.outTime = outTime;
        this.outNotes = outNotes;
        this.superiorSourceCode = superiorSourceCode;
        this.status = status;
        this.remark = remark;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.modifiedId = modifiedId;
    }

    public AnimalIndividual() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getHomeId() {
        return homeId;
    }

    public void setHomeId(Integer homeId) {
        this.homeId = homeId;
    }

    public Integer getEarId() {
        return earId;
    }

    public void setEarId(Integer earId) {
        this.earId = earId;
    }

    public String getVarietyName() {
        return varietyName;
    }

    public void setVarietyName(String varietyName) {
        this.varietyName = varietyName == null ? null : varietyName.trim();
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public String getOutNotes() {
        return outNotes;
    }

    public void setOutNotes(String outNotes) {
        this.outNotes = outNotes == null ? null : outNotes.trim();
    }

    public String getSuperiorSourceCode() {
        return superiorSourceCode;
    }

    public void setSuperiorSourceCode(String superiorSourceCode) {
        this.superiorSourceCode = superiorSourceCode == null ? null : superiorSourceCode.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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