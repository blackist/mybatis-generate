package com.xzit.ar.common.mapper;

import com.xzit.ar.common.po.ResumePost;

public interface ResumePostMapper {
    int insert(ResumePost record);

    int insertSelective(ResumePost record);
}