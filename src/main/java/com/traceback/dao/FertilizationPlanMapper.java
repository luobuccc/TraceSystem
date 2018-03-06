package com.traceback.dao;

import com.traceback.pojo.FertilizationPlan;

public interface FertilizationPlanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FertilizationPlan record);

    int insertSelective(FertilizationPlan record);

    FertilizationPlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FertilizationPlan record);

    int updateByPrimaryKey(FertilizationPlan record);
}