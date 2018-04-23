package com.bigdata.web.service;

import java.util.List;
import java.util.Map;

import com.bigdata.web.domain.DiscussSpace;

public interface DirectionDiscussSpaceService {
    int insert(DiscussSpace discussSpace);

    List<DiscussSpace> list(Map<String, Object> map);

    DiscussSpace select(Integer id);

    int del(Integer id);

    int count();

    void upCaseAnalysis(DiscussSpace discussSpace);

    List<DiscussSpace> getDiscussSpace(Integer rdid);
}
