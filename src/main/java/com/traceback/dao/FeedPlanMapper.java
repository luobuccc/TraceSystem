package com.traceback.dao;

import com.traceback.pojo.FeedPlan;

public interface FeedPlanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FeedPlan record);

    int insertSelective(FeedPlan record);

    FeedPlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FeedPlan record);

    int updateByPrimaryKey(FeedPlan record);
}