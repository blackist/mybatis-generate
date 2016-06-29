package com.xzit.uscdl.common.mapper.exam;

import com.xzit.uscdl.common.po.exam.Answer;

public interface AnswerMapper {
    int deleteByPrimaryKey(Integer ansId);

    int insert(Answer record);

    int insertSelective(Answer record);

    Answer selectByPrimaryKey(Integer ansId);

    int updateByPrimaryKeySelective(Answer record);

    int updateByPrimaryKeyWithBLOBs(Answer record);

    int updateByPrimaryKey(Answer record);
}