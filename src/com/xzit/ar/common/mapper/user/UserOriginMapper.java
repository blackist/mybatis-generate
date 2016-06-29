package com.xzit.ar.common.mapper.user;

import com.xzit.ar.common.po.user.UserOrigin;

public interface UserOriginMapper {
    int insert(UserOrigin record);

    int insertSelective(UserOrigin record);
}