package com.traceback.pojo;

import java.util.Date;

public class FeedPlan {
    private Integer id;

    private Integer planId;

    private Integer animalId;

    private String name;

    private String feedBatch;

    private String feedType;

    private Date feedTime;

    private String method;

    private Integer amount;

    private String img;

    private String remark;

    private Integer status;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer modifiedId;

    public FeedPlan(Integer id, Integer planId, Integer animalId, String name, String feedBatch, String feedType, Date feedTime, String method, Integer amount, String img, String remark, Integer status, Date gmtCreate, Date gmtModified, Integer modifiedId) {
        this.id = id;
        this.planId = planId;
        this.animalId = animalId;
        this.name = name;
        this.feedBatch = feedBatch;
        this.feedType = feedType;
        this.feedTime = feedTime;
        this.method = method;
        this.amount = amount;
        this.img = img;
        this.remark = remark;
        this.status = status;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.modifiedId = modifiedId;
    }

    public FeedPlan() {
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

    public Integer getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFeedBatch() {
        return feedBatch;
    }

    public void setFeedBatch(String feedBatch) {
        this.feedBatch = feedBatch == null ? null : feedBatch.trim();
    }

    public String getFeedType() {
        return feedType;
    }

    public void setFeedType(String feedType) {
        this.feedType = feedType == null ? null : feedType.trim();
    }

    public Date getFeedTime() {
        return feedTime;
    }

    public void setFeedTime(Date feedTime) {
        this.feedTime = feedTime;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
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