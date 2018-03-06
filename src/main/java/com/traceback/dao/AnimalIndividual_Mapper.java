package com.traceback.dao;

import com.traceback.pojo.AnimalIndividual_;

public interface AnimalIndividual_Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AnimalIndividual_ record);

    int insertSelective(AnimalIndividual_ record);

    AnimalIndividual_ selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AnimalIndividual_ record);

    int updateByPrimaryKey(AnimalIndividual_ record);
}