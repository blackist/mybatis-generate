package com.xzit.uscdl.common.mapper.user;

import com.xzit.uscdl.common.po.user.UserInstitute;

public interface UserInstituteMapper {
    int deleteByPrimaryKey(Integer instiId);

    int insert(UserInstitute record);

    int insertSelective(UserInstitute record);

    UserInstitute selectByPrimaryKey(Integer instiId);

    int updateByPrimaryKeySelective(UserInstitute record);

    int updateByPrimaryKey(UserInstitute record);
}