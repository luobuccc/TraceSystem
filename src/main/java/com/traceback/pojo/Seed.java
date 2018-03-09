package com.traceback.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Seed {
    private Integer id;

    private String number;

    private String name;

    private String bach;

    private String supplier;

    private String procurementStaff;

    private Date purchaseTime;

    private BigDecimal quantity;

    private String remark;

    private Integer status;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer modifiedId;

    public Seed(Integer id, String number, String name, String bach, String supplier, String procurementStaff, Date purchaseTime, BigDecimal quantity, String remark, Integer status, Date gmtCreate, Date gmtModified, Integer modifiedId) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.bach = bach;
        this.supplier = supplier;
        this.procurementStaff = procurementStaff;
        this.purchaseTime = purchaseTime;
        this.quantity = quantity;
        this.remark = remark;
        this.status = status;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.modifiedId = modifiedId;
    }

    public Seed() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBach() {
        return bach;
    }

    public void setBach(String bach) {
        this.bach = bach == null ? null : bach.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getProcurementStaff() {
        return procurementStaff;
    }

    public void setProcurementStaff(String procurementStaff) {
        this.procurementStaff = procurementStaff == null ? null : procurementStaff.trim();
    }

    public Date getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
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