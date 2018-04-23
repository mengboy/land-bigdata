package com.bigdata.web.dao;

import java.util.List;
import java.util.Map;

import com.bigdata.web.domain.ShowProject;

public interface ShowProjectMapper {
    int deleteByPrimaryKey(Integer spid);

    int insert(ShowProject record);

    int insertSelective(ShowProject record);

    ShowProject selectByPrimaryKey(Integer spid);

    int updateByPrimaryKeySelective(ShowProject record);

    int updateByPrimaryKeyWithBLOBs(ShowProject record);

    int updateByPrimaryKey(ShowProject record);

    List<ShowProject> selectShowProjects(Map<String, Object> map);

    int count();

    List<ShowProject> getShowProjectByRdID(Integer rdid);
}