package com.bigdata.web.service;

import java.util.List;
import java.util.Map;

import com.bigdata.web.domain.ShowProject;

public interface DirectionShowProject {
    int insertShowProject(ShowProject showProject);

    int delShowProject(Integer Id);

    List<ShowProject> selectShowProjects(Map<String, Object> map);

    ShowProject selectShowProject(Integer id);

    int upShowProject(ShowProject showProject);

    int count();

    List<ShowProject> getShowProjectByRdID(Integer rdid);
}
