package com.bigdata.web.dao;

import java.util.List;
import java.util.Map;

import com.bigdata.web.domain.TeamRepresentative;

public interface TeamRepresentativeMapper {
    int deleteByPrimaryKey(Integer trid);

    int insert(TeamRepresentative record);

    TeamRepresentative insertSelective(TeamRepresentative record);

    TeamRepresentative selectByPrimaryKey(Integer trid);

    int updateByPrimaryKeySelective(TeamRepresentative record);

    int updateByPrimaryKey(TeamRepresentative record);

    List<TeamRepresentative> list(Map<String, Object> map);

    int count();
}