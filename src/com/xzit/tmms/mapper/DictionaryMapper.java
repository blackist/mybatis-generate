package com.xzit.tmms.mapper;

import com.xzit.tmms.bean.Dictionary;

public interface DictionaryMapper {
    int deleteByPrimaryKey(String dictValue);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    Dictionary selectByPrimaryKey(String dictValue);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);
}