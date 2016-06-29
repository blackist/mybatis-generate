package com.xzit.ar.common.mapper;

import com.xzit.ar.common.po.Activity;

public interface ActivityMapper {
    int deleteByPrimaryKey(Integer actId);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Integer actId);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKeyWithBLOBs(Activity record);

    int updateByPrimaryKey(Activity record);
}