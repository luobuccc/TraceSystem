package com.traceback.dao;

import com.traceback.pojo.LandBlock;

public interface LandBlockMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LandBlock record);

    int insertSelective(LandBlock record);

    LandBlock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LandBlock record);

    int updateByPrimaryKey(LandBlock record);
}