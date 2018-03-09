package com.traceback.pojo;

import java.util.Date;

public class ProcessBatch {
    private Integer id;

    private Integer plansId;

    private String name;

    private String type;

    private Integer processingStatusId;

    private String remark;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer modifiedId;

    public ProcessBatch(Integer id, Integer plansId, String name, String type, Integer processingStatusId, String remark, Date gmtCreate, Date gmtModified, Integer modifiedId) {
        this.id = id;
        this.plansId = plansId;
        this.name = name;
        this.type = type;
        this.processingStatusId = processingStatusId;
        this.remark = remark;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.modifiedId = modifiedId;
    }

    public ProcessBatch() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlansId() {
        return plansId;
    }

    public void setPlansId(Integer plansId) {
        this.plansId = plansId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getProcessingStatusId() {
        return processingStatusId;
    }

    public void setProcessingStatusId(Integer processingStatusId) {
        this.processingStatusId = processingStatusId;
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