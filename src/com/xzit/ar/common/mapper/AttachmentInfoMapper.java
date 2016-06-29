package com.xzit.ar.common.mapper;

import com.xzit.ar.common.po.AttachmentInfo;

public interface AttachmentInfoMapper {
    int insert(AttachmentInfo record);

    int insertSelective(AttachmentInfo record);
}