package com.traceback.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class SlaughterSingle {
    private Integer id;

    private Integer slaughterBatchId;

    private Integer anamalId;

    private Integer quarantineId;

    private String name;

    private BigDecimal weight;

    private Integer processingId;

    private Date slaughterTime;

    private String remark;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer modifiedId;

    public SlaughterSingle(Integer id, Integer slaughterBatchId, Integer anamalId, Integer quarantineId, String name, BigDecimal weight, Integer processingId, Date slaughterTime, String remark, Date gmtCreate, Date gmtModified, Integer modifiedId) {
        this.id = id;
        this.slaughterBatchId = slaughterBatchId;
        this.anamalId = anamalId;
        this.quarantineId = quarantineId;
        this.name = name;
        this.weight = weight;
        this.processingId = processingId;
        this.slaughterTime = slaughterTime;
        this.remark = remark;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.modifiedId = modifiedId;
    }

    public SlaughterSingle() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSlaughterBatchId() {
        return slaughterBatchId;
    }

    public void setSlaughterBatchId(Integer slaughterBatchId) {
        this.slaughterBatchId = slaughterBatchId;
    }

    public Integer getAnamalId() {
        return anamalId;
    }

    public void setAnamalId(Integer anamalId) {
        this.anamalId = anamalId;
    }

    public Integer getQuarantineId() {
        return quarantineId;
    }

    public void setQuarantineId(Integer quarantineId) {
        this.quarantineId = quarantineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getProcessingId() {
        return processingId;
    }

    public void setProcessingId(Integer processingId) {
        this.processingId = processingId;
    }

    public Date getSlaughterTime() {
        return slaughterTime;
    }

    public void setSlaughterTime(Date slaughterTime) {
        this.slaughterTime = slaughterTime;
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