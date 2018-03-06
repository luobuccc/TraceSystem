package com.traceback.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class PlantSchedule {
    private Integer id;

    private Integer blockId;

    private Integer seedId;

    private Date plantingTime;

    private String growingAge;

    private Date harvestTime;

    private BigDecimal plantingArea;

    private String supervisor;

    private BigDecimal estimatedHarvest;

    private BigDecimal actualHarvest;

    private String remark;

    private Integer status;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer modifiedId;

    public PlantSchedule(Integer id, Integer blockId, Integer seedId, Date plantingTime, String growingAge, Date harvestTime, BigDecimal plantingArea, String supervisor, BigDecimal estimatedHarvest, BigDecimal actualHarvest, String remark, Integer status, Date gmtCreate, Date gmtModified, Integer modifiedId) {
        this.id = id;
        this.blockId = blockId;
        this.seedId = seedId;
        this.plantingTime = plantingTime;
        this.growingAge = growingAge;
        this.harvestTime = harvestTime;
        this.plantingArea = plantingArea;
        this.supervisor = supervisor;
        this.estimatedHarvest = estimatedHarvest;
        this.actualHarvest = actualHarvest;
        this.remark = remark;
        this.status = status;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.modifiedId = modifiedId;
    }

    public PlantSchedule() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBlockId() {
        return blockId;
    }

    public void setBlockId(Integer blockId) {
        this.blockId = blockId;
    }

    public Integer getSeedId() {
        return seedId;
    }

    public void setSeedId(Integer seedId) {
        this.seedId = seedId;
    }

    public Date getPlantingTime() {
        return plantingTime;
    }

    public void setPlantingTime(Date plantingTime) {
        this.plantingTime = plantingTime;
    }

    public String getGrowingAge() {
        return growingAge;
    }

    public void setGrowingAge(String growingAge) {
        this.growingAge = growingAge == null ? null : growingAge.trim();
    }

    public Date getHarvestTime() {
        return harvestTime;
    }

    public void setHarvestTime(Date harvestTime) {
        this.harvestTime = harvestTime;
    }

    public BigDecimal getPlantingArea() {
        return plantingArea;
    }

    public void setPlantingArea(BigDecimal plantingArea) {
        this.plantingArea = plantingArea;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor == null ? null : supervisor.trim();
    }

    public BigDecimal getEstimatedHarvest() {
        return estimatedHarvest;
    }

    public void setEstimatedHarvest(BigDecimal estimatedHarvest) {
        this.estimatedHarvest = estimatedHarvest;
    }

    public BigDecimal getActualHarvest() {
        return actualHarvest;
    }

    public void setActualHarvest(BigDecimal actualHarvest) {
        this.actualHarvest = actualHarvest;
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