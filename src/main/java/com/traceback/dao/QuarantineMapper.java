package com.traceback.dao;

import com.traceback.pojo.Quarantine;

public interface QuarantineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Quarantine record);

    int insertSelective(Quarantine record);

    Quarantine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Quarantine record);

    int updateByPrimaryKey(Quarantine record);
}