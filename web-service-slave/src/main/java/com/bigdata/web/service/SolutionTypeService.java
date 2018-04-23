package com.bigdata.web.service;

import java.util.List;
import java.util.Map;

import com.bigdata.web.domain.SolutionType;

public interface SolutionTypeService {
    List<SolutionType> list(Map<String, Object> map);

    int insert(SolutionType solutionType);

    int del(Integer id);

    int count();

    List<SolutionType> list();

    SolutionType select(Integer stid);
}
