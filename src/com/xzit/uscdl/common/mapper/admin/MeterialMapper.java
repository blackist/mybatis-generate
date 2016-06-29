package com.xzit.uscdl.common.mapper.admin;

import com.xzit.uscdl.common.po.admin.Meterial;

public interface MeterialMapper {
    int deleteByPrimaryKey(Integer meteId);

    int insert(Meterial record);

    int insertSelective(Meterial record);

    Meterial selectByPrimaryKey(Integer meteId);

    int updateByPrimaryKeySelective(Meterial record);

    int updateByPrimaryKey(Meterial record);
}