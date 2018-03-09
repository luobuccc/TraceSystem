package com.traceback.dao;

import com.traceback.pojo.AnimalIndividual;

public interface AnimalIndividualMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AnimalIndividual record);

    int insertSelective(AnimalIndividual record);

    AnimalIndividual selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AnimalIndividual record);

    int updateByPrimaryKey(AnimalIndividual record);
}