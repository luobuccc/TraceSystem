package com.traceback.dao;

import com.traceback.pojo.PesticidePlan;

public interface PesticidePlanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PesticidePlan record);

    int insertSelective(PesticidePlan record);

    PesticidePlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PesticidePlan record);

    int updateByPrimaryKey(PesticidePlan record);
}