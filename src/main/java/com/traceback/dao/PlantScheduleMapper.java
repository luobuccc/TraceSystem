package com.traceback.dao;

import com.traceback.pojo.PlantSchedule;

public interface PlantScheduleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PlantSchedule record);

    int insertSelective(PlantSchedule record);

    PlantSchedule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlantSchedule record);

    int updateByPrimaryKey(PlantSchedule record);
}