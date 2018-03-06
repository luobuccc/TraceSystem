package com.traceback.dao;

import com.traceback.pojo.LandBase;

public interface LandBaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LandBase record);

    int insertSelective(LandBase record);

    LandBase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LandBase record);

    int updateByPrimaryKey(LandBase record);
}