package com.xzit.uscdl.common.mapper.exam;

import com.xzit.uscdl.common.po.exam.Score;

public interface ScoreMapper {
    int deleteByPrimaryKey(Integer scoreId);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer scoreId);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}