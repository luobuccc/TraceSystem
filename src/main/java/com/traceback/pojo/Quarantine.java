package com.traceback.pojo;

import java.util.Date;

public class Quarantine {
    private Integer id;

    private Integer animalId;

    private String checker;

    private Date quarantineTime;

    private Integer isNormal;

    private String remark;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer modifiedId;

    public Quarantine(Integer id, Integer animalId, String checker, Date quarantineTime, Integer isNormal, String remark, Date gmtCreate, Date gmtModified, Integer modifiedId) {
        this.id = id;
        this.animalId = animalId;
        this.checker = checker;
        this.quarantineTime = quarantineTime;
        this.isNormal = isNormal;
        this.remark = remark;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.modifiedId = modifiedId;
    }

    public Quarantine() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    public Date getQuarantineTime() {
        return quarantineTime;
    }

    public void setQuarantineTime(Date quarantineTime) {
        this.quarantineTime = quarantineTime;
    }

    public Integer getIsNormal() {
        return isNormal;
    }

    public void setIsNormal(Integer isNormal) {
        this.isNormal = isNormal;
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