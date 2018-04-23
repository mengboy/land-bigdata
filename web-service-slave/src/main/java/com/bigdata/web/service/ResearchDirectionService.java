package com.bigdata.web.service;

import java.util.List;
import java.util.Map;

import com.bigdata.web.domain.ResearchDirection;

public interface ResearchDirectionService {
    List<ResearchDirection> list(Map<String, Object> params);

    int add(ResearchDirection researchDirection);

    int del(Integer id);

    int update(ResearchDirection researchDirection);

    ResearchDirection selectById(Integer id);

    List<ResearchDirection> getDirections();

    int count();

    List<ResearchDirection> getAllDirection();
}
