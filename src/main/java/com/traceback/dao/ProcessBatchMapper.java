package com.traceback.dao;

import com.traceback.pojo.ProcessBatch;

public interface ProcessBatchMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProcessBatch record);

    int insertSelective(ProcessBatch record);

    ProcessBatch selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProcessBatch record);

    int updateByPrimaryKey(ProcessBatch record);
}