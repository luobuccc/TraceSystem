package com.traceback.dao;

import com.traceback.pojo.AnimalProduct;

public interface AnimalProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AnimalProduct record);

    int insertSelective(AnimalProduct record);

    AnimalProduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AnimalProduct record);

    int updateByPrimaryKey(AnimalProduct record);
}