package com.xzit.uscdl.common.mapper.admin;

import com.xzit.uscdl.common.po.admin.DictionaryData;

public interface DictionaryDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictionaryData record);

    int insertSelective(DictionaryData record);

    DictionaryData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictionaryData record);

    int updateByPrimaryKey(DictionaryData record);
}