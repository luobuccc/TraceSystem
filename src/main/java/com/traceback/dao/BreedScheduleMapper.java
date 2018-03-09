package com.traceback.dao;

import com.traceback.pojo.BreedSchedule;

public interface BreedScheduleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BreedSchedule record);

    int insertSelective(BreedSchedule record);

    BreedSchedule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BreedSchedule record);

    int updateByPrimaryKey(BreedSchedule record);
}