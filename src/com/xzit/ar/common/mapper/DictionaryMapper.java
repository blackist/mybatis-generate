package com.xzit.ar.common.mapper;

import com.xzit.ar.common.po.Dictionary;

public interface DictionaryMapper {
    int deleteByPrimaryKey(String dictValue);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    Dictionary selectByPrimaryKey(String dictValue);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);
}