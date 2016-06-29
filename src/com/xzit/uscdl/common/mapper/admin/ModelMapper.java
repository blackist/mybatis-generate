package com.xzit.uscdl.common.mapper.admin;

import com.xzit.uscdl.common.po.admin.Model;

public interface ModelMapper {
    int deleteByPrimaryKey(Integer modelId);

    int insert(Model record);

    int insertSelective(Model record);

    Model selectByPrimaryKey(Integer modelId);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);
}