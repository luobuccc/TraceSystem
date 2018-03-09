package com.traceback.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class PlantProduct {
    private Integer id;

    private Integer processingId;

    private String name;

    private String category;

    private String approvalStandards;

    private BigDecimal weight;

    private BigDecimal price;

    private Date packageTime;

    private Integer shelfLife;

    private Date expireTime;

    private String traceabilityCode;

    private String remark;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer modifiedId;

    private Integer productType;

    public PlantProduct(Integer id, Integer processingId, String name, String category, String approvalStandards, BigDecimal weight, BigDecimal price, Date packageTime, Integer shelfLife, Date expireTime, String traceabilityCode, String remark, Date gmtCreate, Date gmtModified, Integer modifiedId, Integer productType) {
        this.id = id;
        this.processingId = processingId;
        this.name = name;
        this.category = category;
        this.approvalStandards = approvalStandards;
        this.weight = weight;
        this.price = price;
        this.packageTime = packageTime;
        this.shelfLife = shelfLife;
        this.expireTime = expireTime;
        this.traceabilityCode = traceabilityCode;
        this.remark = remark;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.modifiedId = modifiedId;
        this.productType = productType;
    }

    public PlantProduct() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProcessingId() {
        return processingId;
    }

    public void setProcessingId(Integer processingId) {
        this.processingId = processingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getApprovalStandards() {
        return approvalStandards;
    }

    public void setApprovalStandards(String approvalStandards) {
        this.approvalStandards = approvalStandards == null ? null : approvalStandards.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getPackageTime() {
        return packageTime;
    }

    public void setPackageTime(Date packageTime) {
        this.packageTime = packageTime;
    }

    public Integer getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(Integer shelfLife) {
        this.shelfLife = shelfLife;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String getTraceabilityCode() {
        return traceabilityCode;
    }

    public void setTraceabilityCode(String traceabilityCode) {
        this.traceabilityCode = traceabilityCode == null ? null : traceabilityCode.trim();
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

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }
}