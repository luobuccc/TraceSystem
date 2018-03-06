package com.traceback.dao;

import com.traceback.pojo.Seed;

public interface SeedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Seed record);

    int insertSelective(Seed record);

    Seed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Seed record);

    int updateByPrimaryKey(Seed record);
}