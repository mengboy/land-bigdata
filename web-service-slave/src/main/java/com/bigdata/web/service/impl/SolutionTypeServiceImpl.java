package com.bigdata.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.web.dao.SolutionTypeMapper;
import com.bigdata.web.domain.SolutionType;
import com.bigdata.web.service.SolutionTypeService;

@Service("soluctionType")
public class SolutionTypeServiceImpl implements SolutionTypeService{

    @Autowired
    SolutionTypeMapper solutionTypeMapper;

    @Override
    public List<SolutionType> list(Map<String, Object> map) {
        return solutionTypeMapper.list(map);
    }

    @Override
    public int insert(SolutionType solutionType) {
        return solutionTypeMapper.insertSelective(solutionType);
    }

    @Override
    public int del(Integer id) {
        return solutionTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int count() {
        return solutionTypeMapper.count();
    }

    @Override
    public List<SolutionType> list() {
        return solutionTypeMapper.solutionTypes();
    }

    @Override
    public SolutionType select(Integer stid) {
        return solutionTypeMapper.selectByPrimaryKey(stid);
    }
}
