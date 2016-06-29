package com.xzit.uscdl.common.mapper.admin;

import com.xzit.uscdl.common.po.admin.Tutor;

public interface TutorMapper {
    int deleteByPrimaryKey(Integer tutorId);

    int insert(Tutor record);

    int insertSelective(Tutor record);

    Tutor selectByPrimaryKey(Integer tutorId);

    int updateByPrimaryKeySelective(Tutor record);

    int updateByPrimaryKey(Tutor record);
}