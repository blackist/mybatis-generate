package com.xzit.uscdl.common.mapper.admin;

import com.xzit.uscdl.common.po.admin.AdminInfo;

public interface AdminInfoMapper {
    int deleteByPrimaryKey(Integer adminInfoId);

    int insert(AdminInfo record);

    int insertSelective(AdminInfo record);

    AdminInfo selectByPrimaryKey(Integer adminInfoId);

    int updateByPrimaryKeySelective(AdminInfo record);

    int updateByPrimaryKey(AdminInfo record);
}