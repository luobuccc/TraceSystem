package com.traceback.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class PesticidePlan {
    private Integer id;

    private Integer planId;

    private String name;

    private String drugBatch;

    private String object;

    private String supervisor;

    private Date drugTime;

    private String method;

    private BigDecimal amount;

    private BigDecimal dilution;

    private String weather;

    private String remark;

    private Integer status;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer modifiedId;

    public PesticidePlan(Integer id, Integer planId, String name, String drugBatch, String object, String supervisor, Date drugTime, String method, BigDecimal amount, BigDecimal dilution, String weather, String remark, Integer status, Date gmtCreate, Date gmtModified, Integer modifiedId) {
        this.id = id;
        this.planId = planId;
        this.name = name;
        this.drugBatch = drugBatch;
        this.object = object;
        this.supervisor = supervisor;
        this.drugTime = drugTime;
        this.method = method;
        this.amount = amount;
        this.dilution = dilution;
        this.weather = weather;
        this.remark = remark;
        this.status = status;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.modifiedId = modifiedId;
    }

    public PesticidePlan() {
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

    public String getDrugBatch() {
        return drugBatch;
    }

    public void setDrugBatch(String drugBatch) {
        this.drugBatch = drugBatch == null ? null : drugBatch.trim();
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object == null ? null : object.trim();
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor == null ? null : supervisor.trim();
    }

    public Date getDrugTime() {
        return drugTime;
    }

    public void setDrugTime(Date drugTime) {
        this.drugTime = drugTime;
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

    public BigDecimal getDilution() {
        return dilution;
    }

    public void setDilution(BigDecimal dilution) {
        this.dilution = dilution;
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