package com.xzit.ar.common.mapper;

import com.xzit.ar.common.po.UserRole;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);
}