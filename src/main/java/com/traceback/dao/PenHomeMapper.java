package com.traceback.dao;

import com.traceback.pojo.PenHome;

public interface PenHomeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PenHome record);

    int insertSelective(PenHome record);

    PenHome selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PenHome record);

    int updateByPrimaryKey(PenHome record);
}