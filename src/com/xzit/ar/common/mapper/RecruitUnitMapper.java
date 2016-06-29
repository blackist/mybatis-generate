package com.xzit.ar.common.mapper;

import com.xzit.ar.common.po.RecruitUnit;

public interface RecruitUnitMapper {
    int deleteByPrimaryKey(Integer unitId);

    int insert(RecruitUnit record);

    int insertSelective(RecruitUnit record);

    RecruitUnit selectByPrimaryKey(Integer unitId);

    int updateByPrimaryKeySelective(RecruitUnit record);

    int updateByPrimaryKeyWithBLOBs(RecruitUnit record);

    int updateByPrimaryKey(RecruitUnit record);
}