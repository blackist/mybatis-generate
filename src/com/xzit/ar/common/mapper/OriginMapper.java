package com.xzit.ar.common.mapper;

import com.xzit.ar.common.po.Origin;

public interface OriginMapper {
    int deleteByPrimaryKey(Integer originId);

    int insert(Origin record);

    int insertSelective(Origin record);

    Origin selectByPrimaryKey(Integer originId);

    int updateByPrimaryKeySelective(Origin record);

    int updateByPrimaryKeyWithBLOBs(Origin record);

    int updateByPrimaryKey(Origin record);
}