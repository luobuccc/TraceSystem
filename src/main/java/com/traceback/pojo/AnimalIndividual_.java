package com.traceback.pojo;

import java.util.Date;

public class AnimalIndividual_ {
    private Integer id;

    private Integer planId;

    private Integer homeId;

    private String name;

    private String varietyName;

    private Integer fatherId;

    private Integer motherId;

    private Date inTime;

    private String healthState;

    private Date outTime;

    private String outNotes;

    private String superiorSourceCode;

    private Integer status;

    private String remark;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer modifiedId;

    public AnimalIndividual_(Integer id, Integer planId, Integer homeId, String name, String varietyName, Integer fatherId, Integer motherId, Date inTime, String healthState, Date outTime, String outNotes, String superiorSourceCode, Integer status, String remark, Date gmtCreate, Date gmtModified, Integer modifiedId) {
        this.id = id;
        this.planId = planId;
        this.homeId = homeId;
        this.name = name;
        this.varietyName = varietyName;
        this.fatherId = fatherId;
        this.motherId = motherId;
        this.inTime = inTime;
        this.healthState = healthState;
        this.outTime = outTime;
        this.outNotes = outNotes;
        this.superiorSourceCode = superiorSourceCode;
        this.status = status;
        this.remark = remark;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.modifiedId = modifiedId;
    }

    public AnimalIndividual_() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getVarietyName() {
        return varietyName;
    }

    public void setVarietyName(String varietyName) {
        this.varietyName = varietyName == null ? null : varietyName.trim();
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public Integer getMotherId() {
        return motherId;
    }

    public void setMotherId(Integer motherId) {
        this.motherId = motherId;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public String getHealthState() {
        return healthState;
    }

    public void setHealthState(String healthState) {
        this.healthState = healthState == null ? null : healthState.trim();
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