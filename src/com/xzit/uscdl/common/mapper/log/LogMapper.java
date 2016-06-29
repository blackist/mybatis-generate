package com.xzit.uscdl.common.mapper.log;

import com.xzit.uscdl.common.po.log.Log;

public interface LogMapper {
    int deleteByPrimaryKey(Integer logId);

    int insert(Log record);

    int insertSelective(Log record);

    Log selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKey(Log record);
}