package com.xzit.tmms.mapper;

import com.xzit.tmms.bean.Meterial;

public interface MeterialMapper {
    int deleteByPrimaryKey(Integer meteId);

    int insert(Meterial record);

    int insertSelective(Meterial record);

    Meterial selectByPrimaryKey(Integer meteId);

    int updateByPrimaryKeySelective(Meterial record);

    int updateByPrimaryKey(Meterial record);
}