package com.traceback.dao;

import com.traceback.pojo.ProcessDetail;

public interface ProcessDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProcessDetail record);

    int insertSelective(ProcessDetail record);

    ProcessDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProcessDetail record);

    int updateByPrimaryKey(ProcessDetail record);
}