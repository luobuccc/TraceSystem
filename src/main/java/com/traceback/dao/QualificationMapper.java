package com.traceback.dao;

import com.traceback.pojo.Qualification;

public interface QualificationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Qualification record);

    int insertSelective(Qualification record);

    Qualification selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Qualification record);

    int updateByPrimaryKey(Qualification record);
}