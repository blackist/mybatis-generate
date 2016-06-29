package com.xzit.ar.common.mapper.recruit;

import com.xzit.ar.common.po.recruit.ResumePost;

public interface ResumePostMapper {
    int insert(ResumePost record);

    int insertSelective(ResumePost record);
}