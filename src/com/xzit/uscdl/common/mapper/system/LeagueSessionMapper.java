package com.xzit.uscdl.common.mapper.system;

import com.xzit.uscdl.common.po.system.LeagueSession;

public interface LeagueSessionMapper {
    int deleteByPrimaryKey(String sessionValue);

    int insert(LeagueSession record);

    int insertSelective(LeagueSession record);

    LeagueSession selectByPrimaryKey(String sessionValue);

    int updateByPrimaryKeySelective(LeagueSession record);

    int updateByPrimaryKeyWithBLOBs(LeagueSession record);

    int updateByPrimaryKey(LeagueSession record);
}