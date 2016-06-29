package com.xzit.ar.common.mapper;

import com.xzit.ar.common.po.Attachment;

public interface AttachmentMapper {
    int deleteByPrimaryKey(Integer attaId);

    int insert(Attachment record);

    int insertSelective(Attachment record);

    Attachment selectByPrimaryKey(Integer attaId);

    int updateByPrimaryKeySelective(Attachment record);

    int updateByPrimaryKey(Attachment record);
}