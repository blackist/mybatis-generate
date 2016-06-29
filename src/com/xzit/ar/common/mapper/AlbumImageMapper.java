package com.xzit.ar.common.mapper;

import com.xzit.ar.common.po.AlbumImage;

public interface AlbumImageMapper {
    int insert(AlbumImage record);

    int insertSelective(AlbumImage record);
}