package com.xzit.ar.common.mapper.origin;

import com.xzit.ar.common.po.origin.Origin;

public interface OriginMapper {
    int deleteByPrimaryKey(Integer originId);

    int insert(Origin record);

    int insertSelective(Origin record);

    Origin selectByPrimaryKey(Integer originId);

    int updateByPrimaryKeySelective(Origin record);

    int updateByPrimaryKeyWithBLOBs(Origin record);

    int updateByPrimaryKey(Origin record);
}