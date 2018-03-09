package com.traceback.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class FertilizationPlan {
    private Integer id;

    private Integer planId;

    private String name;

    private String fretBatch;

    private String fretType;

    private String supervisor;

    private Date fretTime;

    private String method;

    private BigDecimal amount;

    private String weather;

    private String remark;

    private Integer status;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer modifiedId;

    public FertilizationPlan(Integer id, Integer planId, String name, String fretBatch, String fretType, String supervisor, Date fretTime, String method, BigDecimal amount, String weather, String remark, Integer status, Date gmtCreate, Date gmtModified, Integer modifiedId) {
        this.id = id;
        this.planId = planId;
        this.name = name;
        this.fretBatch = fretBatch;
        this.fretType = fretType;
        this.supervisor = supervisor;
        this.fretTime = fretTime;
        this.method = method;
        this.amount = amount;
        this.weather = weather;
        this.remark = remark;
        this.status = status;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.modifiedId = modifiedId;
    }

    public FertilizationPlan() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFretBatch() {
        return fretBatch;
    }

    public void setFretBatch(String fretBatch) {
        this.fretBatch = fretBatch == null ? null : fretBatch.trim();
    }

    public String getFretType() {
        return fretType;
    }

    public void setFretType(String fretType) {
        this.fretType = fretType == null ? null : fretType.trim();
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor == null ? null : supervisor.trim();
    }

    public Date getFretTime() {
        return fretTime;
    }

    public void setFretTime(Date fretTime) {
        this.fretTime = fretTime;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather == null ? null : weather.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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