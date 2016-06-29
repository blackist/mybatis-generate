package com.xzit.ar.common.mapper.user;

import com.xzit.ar.common.po.user.UserResume;

public interface UserResumeMapper {
    int deleteByPrimaryKey(Integer resumeId);

    int insert(UserResume record);

    int insertSelective(UserResume record);

    UserResume selectByPrimaryKey(Integer resumeId);

    int updateByPrimaryKeySelective(UserResume record);

    int updateByPrimaryKey(UserResume record);
}