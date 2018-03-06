package com.traceback.dao;

import com.traceback.pojo.SlaughterSingle;

public interface SlaughterSingleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SlaughterSingle record);

    int insertSelective(SlaughterSingle record);

    SlaughterSingle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SlaughterSingle record);

    int updateByPrimaryKey(SlaughterSingle record);
}