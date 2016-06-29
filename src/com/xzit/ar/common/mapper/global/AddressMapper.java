package com.xzit.ar.common.mapper.global;

import com.xzit.ar.common.po.global.Address;

public interface AddressMapper {
    int deleteByPrimaryKey(Integer addrId);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer addrId);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}