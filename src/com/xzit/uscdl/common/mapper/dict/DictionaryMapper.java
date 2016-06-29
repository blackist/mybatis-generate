package com.xzit.uscdl.common.mapper.dict;

import com.xzit.uscdl.common.po.dict.Dictionary;

public interface DictionaryMapper {
    int deleteByPrimaryKey(String dictValue);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    Dictionary selectByPrimaryKey(String dictValue);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);
}