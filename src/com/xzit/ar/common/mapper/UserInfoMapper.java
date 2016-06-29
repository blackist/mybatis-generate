package com.xzit.ar.common.mapper;

import com.xzit.ar.common.po.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userInfoId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userInfoId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}