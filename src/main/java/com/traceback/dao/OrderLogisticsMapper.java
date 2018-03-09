package com.traceback.dao;

import com.traceback.pojo.OrderLogistics;

public interface OrderLogisticsMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderLogistics record);

    int insertSelective(OrderLogistics record);

    OrderLogistics selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrderLogistics record);

    int updateByPrimaryKey(OrderLogistics record);
}