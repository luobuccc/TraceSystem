package com.traceback.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class BreedBase {
    private Integer id;

    private Integer companyId;

    private String name;

    private Integer type;

    private String address;

    private BigDecimal area;

    private Integer status;

    private Integer employeeNum;

    private Integer homeNum;

    private String remark;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer modifiedId;

    public BreedBase(Integer id, Integer companyId, String name, Integer type, String address, BigDecimal area, Integer status, Integer employeeNum, Integer homeNum, String remark, Date gmtCreate, Date gmtModified, Integer modifiedId) {
        this.id = id;
        this.companyId = companyId;
        this.name = name;
        this.type = type;
        this.address = address;
        this.area = area;
        this.status = status;
        this.employeeNum = employeeNum;
        this.homeNum = homeNum;
        this.remark = remark;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.modifiedId = modifiedId;
    }

    public BreedBase() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(Integer employeeNum) {
        this.employeeNum = employeeNum;
    }

    public Integer getHomeNum() {
        return homeNum;
    }

    public void setHomeNum(Integer homeNum) {
        this.homeNum = homeNum;
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