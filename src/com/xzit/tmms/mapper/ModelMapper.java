package com.xzit.tmms.mapper;

import com.xzit.tmms.bean.Model;

public interface ModelMapper {
    int deleteByPrimaryKey(Integer modelId);

    int insert(Model record);

    int insertSelective(Model record);

    Model selectByPrimaryKey(Integer modelId);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);
}