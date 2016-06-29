package com.xzit.uscdl.common.mapper.dict;

import com.xzit.uscdl.common.po.dict.DictionaryData;

public interface DictionaryDataMapper {
    int deleteByPrimaryKey(Integer dictdataId);

    int insert(DictionaryData record);

    int insertSelective(DictionaryData record);

    DictionaryData selectByPrimaryKey(Integer dictdataId);

    int updateByPrimaryKeySelective(DictionaryData record);

    int updateByPrimaryKey(DictionaryData record);
}