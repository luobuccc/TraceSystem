package com.traceback.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class LandBase {
    private Integer id;

    private Integer companyId;

    private String baseName;

    private Integer type;

    private String address;

    private BigDecimal area;

    private Integer state;

    private Integer blokeNum;

    private Integer employeeNum;

    private String remark;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer modifiedId;

    public LandBase(Integer id, Integer companyId, String baseName, Integer type, String address, BigDecimal area, Integer state, Integer blokeNum, Integer employeeNum, String remark, Date gmtCreate, Date gmtModified, Integer modifiedId) {
        this.id = id;
        this.companyId = companyId;
        this.baseName = baseName;
        this.type = type;
        this.address = address;
        this.area = area;
        this.state = state;
        this.blokeNum = blokeNum;
        this.employeeNum = employeeNum;
        this.remark = remark;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.modifiedId = modifiedId;
    }

    public LandBase() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName == null ? null : baseName.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getBlokeNum() {
        return blokeNum;
    }

    public void setBlokeNum(Integer blokeNum) {
        this.blokeNum = blokeNum;
    }

    public Integer getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(Integer employeeNum) {
        this.employeeNum = employeeNum;
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