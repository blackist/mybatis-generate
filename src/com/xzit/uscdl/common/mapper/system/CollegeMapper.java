package com.xzit.uscdl.common.mapper.system;

import com.xzit.uscdl.common.po.system.College;

public interface CollegeMapper {
    int deleteByPrimaryKey(Integer collegeId);

    int insert(College record);

    int insertSelective(College record);

    College selectByPrimaryKey(Integer collegeId);

    int updateByPrimaryKeySelective(College record);

    int updateByPrimaryKey(College record);
}