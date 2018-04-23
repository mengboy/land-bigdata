package com.bigdata.web.dao;

import java.util.List;
import java.util.Map;

import com.bigdata.web.domain.DiscussSpace;

public interface DiscussSpaceMapper {
    int deleteByPrimaryKey(Integer dsid);

    int insert(DiscussSpace record);

    int insertSelective(DiscussSpace record);

    DiscussSpace selectByPrimaryKey(Integer dsid);

    int updateByPrimaryKeySelective(DiscussSpace record);

    int updateByPrimaryKey(DiscussSpace record);

    List<DiscussSpace> list(Map<String, Object> map);

    int count();

    List<DiscussSpace> getDiscussSpace(Integer rdid);
}