package com.xzit.uscdl.common.mapper.exam;

import com.xzit.uscdl.common.po.exam.Question;
import com.xzit.uscdl.common.po.exam.QuestionWithBLOBs;

public interface QuestionMapper {
    int deleteByPrimaryKey(Integer quesId);

    int insert(QuestionWithBLOBs record);

    int insertSelective(QuestionWithBLOBs record);

    QuestionWithBLOBs selectByPrimaryKey(Integer quesId);

    int updateByPrimaryKeySelective(QuestionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QuestionWithBLOBs record);

    int updateByPrimaryKey(Question record);
}