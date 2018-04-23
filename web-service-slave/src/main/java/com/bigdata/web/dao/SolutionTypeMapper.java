package com.bigdata.web.dao;

import java.util.List;
import java.util.Map;

import com.bigdata.web.domain.SolutionType;

public interface SolutionTypeMapper {
    int deleteByPrimaryKey(Integer stid);

    int insert(SolutionType record);

    int insertSelective(SolutionType record);

    SolutionType selectByPrimaryKey(Integer stid);

    int updateByPrimaryKeySelective(SolutionType record);

    int updateByPrimaryKey(SolutionType record);

    List<SolutionType> list(Map<String, Object> map);

    List<SolutionType> solutionTypes();

    int count();
}