package com.xzit.ar.common.mapper;

import com.xzit.ar.common.po.UserOrigin;

public interface UserOriginMapper {
    int insert(UserOrigin record);

    int insertSelective(UserOrigin record);
}