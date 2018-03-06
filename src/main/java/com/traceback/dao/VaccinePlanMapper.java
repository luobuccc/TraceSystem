package com.traceback.dao;

import com.traceback.pojo.VaccinePlan;

public interface VaccinePlanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VaccinePlan record);

    int insertSelective(VaccinePlan record);

    VaccinePlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VaccinePlan record);

    int updateByPrimaryKey(VaccinePlan record);
}