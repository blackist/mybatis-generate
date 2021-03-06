package com.xzit.ar.common.mapper.recruit;

import com.xzit.ar.common.po.recruit.Recruit;

public interface RecruitMapper {
    int deleteByPrimaryKey(Integer recruitId);

    int insert(Recruit record);

    int insertSelective(Recruit record);

    Recruit selectByPrimaryKey(Integer recruitId);

    int updateByPrimaryKeySelective(Recruit record);

    int updateByPrimaryKey(Recruit record);
}