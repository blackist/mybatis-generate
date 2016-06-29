package com.xzit.uscdl.common.mapper.admin;

import com.xzit.uscdl.common.po.admin.Class;

public interface ClassMapper {
    int deleteByPrimaryKey(Integer classId);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(Integer classId);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}