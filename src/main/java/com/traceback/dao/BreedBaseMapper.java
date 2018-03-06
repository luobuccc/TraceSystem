package com.traceback.dao;

import com.traceback.pojo.BreedBase;

public interface BreedBaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BreedBase record);

    int insertSelective(BreedBase record);

    BreedBase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BreedBase record);

    int updateByPrimaryKey(BreedBase record);
}