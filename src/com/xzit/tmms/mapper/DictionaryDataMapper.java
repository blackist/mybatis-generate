package com.xzit.tmms.mapper;

import com.xzit.tmms.bean.DictionaryData;

public interface DictionaryDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictionaryData record);

    int insertSelective(DictionaryData record);

    DictionaryData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictionaryData record);

    int updateByPrimaryKey(DictionaryData record);
}