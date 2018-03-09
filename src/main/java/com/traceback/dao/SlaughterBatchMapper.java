package com.traceback.dao;

import com.traceback.pojo.SlaughterBatch;

public interface SlaughterBatchMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SlaughterBatch record);

    int insertSelective(SlaughterBatch record);

    SlaughterBatch selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SlaughterBatch record);

    int updateByPrimaryKey(SlaughterBatch record);
}