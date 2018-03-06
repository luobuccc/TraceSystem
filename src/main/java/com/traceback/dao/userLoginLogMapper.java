package com.traceback.dao;

import com.traceback.pojo.userLoginLog;

public interface userLoginLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(userLoginLog record);

    int insertSelective(userLoginLog record);

    userLoginLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(userLoginLog record);

    int updateByPrimaryKey(userLoginLog record);
}