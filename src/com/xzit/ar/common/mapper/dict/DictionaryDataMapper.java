package com.xzit.ar.common.mapper.dict;

import com.xzit.ar.common.po.dict.DictionaryData;

public interface DictionaryDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictionaryData record);

    int insertSelective(DictionaryData record);

    DictionaryData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictionaryData record);

    int updateByPrimaryKey(DictionaryData record);
}