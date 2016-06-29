package com.xzit.ar.common.mapper.info;

import com.xzit.ar.common.po.info.Information;

public interface InformationMapper {
    int deleteByPrimaryKey(Integer infoId);

    int insert(Information record);

    int insertSelective(Information record);

    Information selectByPrimaryKey(Integer infoId);

    int updateByPrimaryKeySelective(Information record);

    int updateByPrimaryKeyWithBLOBs(Information record);

    int updateByPrimaryKey(Information record);
}