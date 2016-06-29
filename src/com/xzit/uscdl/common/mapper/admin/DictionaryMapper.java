package com.xzit.uscdl.common.mapper.admin;

import com.xzit.uscdl.common.po.admin.Dictionary;

public interface DictionaryMapper {
    int deleteByPrimaryKey(String dictValue);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    Dictionary selectByPrimaryKey(String dictValue);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);
}