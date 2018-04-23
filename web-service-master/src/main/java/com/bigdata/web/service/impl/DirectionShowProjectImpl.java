package com.bigdata.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.web.dao.ShowProjectMapper;
import com.bigdata.web.domain.ShowProject;
import com.bigdata.web.service.DirectionShowProject;

@Service("showProject")
public class DirectionShowProjectImpl implements DirectionShowProject{

    @Autowired
    ShowProjectMapper showProjectMapper;

    @Override
    public int insertShowProject(ShowProject showProject) {
        return showProjectMapper.insertSelective(showProject);
    }

    @Override
    public int delShowProject(Integer id) {
        return showProjectMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<ShowProject> selectShowProjects(Map<String, Object> map) {
        return showProjectMapper.selectShowProjects(map);
    }

    @Override
    public ShowProject selectShowProject(Integer id) {
        return showProjectMapper.selectByPrimaryKey(id);
    }

    @Override
    public int upShowProject(ShowProject showProject) {
        return showProjectMapper.updateByPrimaryKeySelective(showProject);
    }

    @Override
    public int count() {
        return showProjectMapper.count();
    }

    @Override
    public List<ShowProject> getShowProjectByRdID(Integer rdid) {
        return showProjectMapper.getShowProjectByRdID(rdid);
    }
}
