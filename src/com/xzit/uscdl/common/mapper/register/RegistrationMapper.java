package com.xzit.uscdl.common.mapper.register;

import com.xzit.uscdl.common.po.register.Registration;

public interface RegistrationMapper {
    int deleteByPrimaryKey(Integer registId);

    int insert(Registration record);

    int insertSelective(Registration record);

    Registration selectByPrimaryKey(Integer registId);

    int updateByPrimaryKeySelective(Registration record);

    int updateByPrimaryKey(Registration record);
}