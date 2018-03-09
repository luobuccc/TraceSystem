package com.traceback.dao;

import com.traceback.pojo.PlantProduct;

public interface PlantProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PlantProduct record);

    int insertSelective(PlantProduct record);

    PlantProduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlantProduct record);

    int updateByPrimaryKey(PlantProduct record);
}