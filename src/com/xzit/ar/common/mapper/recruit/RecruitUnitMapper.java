package com.xzit.ar.common.mapper.recruit;

import com.xzit.ar.common.po.recruit.RecruitUnit;

public interface RecruitUnitMapper {
    int deleteByPrimaryKey(Integer unitId);

    int insert(RecruitUnit record);

    int insertSelective(RecruitUnit record);

    RecruitUnit selectByPrimaryKey(Integer unitId);

    int updateByPrimaryKeySelective(RecruitUnit record);

    int updateByPrimaryKeyWithBLOBs(RecruitUnit record);

    int updateByPrimaryKey(RecruitUnit record);
}