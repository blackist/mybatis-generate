package com.xzit.ar.common.mapper;

import com.xzit.ar.common.po.Subscription;

public interface SubscriptionMapper {
    int deleteByPrimaryKey(Integer subId);

    int insert(Subscription record);

    int insertSelective(Subscription record);

    Subscription selectByPrimaryKey(Integer subId);

    int updateByPrimaryKeySelective(Subscription record);

    int updateByPrimaryKey(Subscription record);
}