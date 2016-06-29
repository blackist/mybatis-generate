package com.xzit.uscdl.common.mapper.user;

import com.xzit.uscdl.common.po.user.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userInfoId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userInfoId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}