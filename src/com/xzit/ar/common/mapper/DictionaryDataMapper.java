package com.xzit.ar.common.mapper;

import com.xzit.ar.common.po.DictionaryData;

public interface DictionaryDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictionaryData record);

    int insertSelective(DictionaryData record);

    DictionaryData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictionaryData record);

    int updateByPrimaryKey(DictionaryData record);
}