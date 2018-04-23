package com.bigdata.web.dao;

import java.util.List;
import java.util.Map;

import com.bigdata.web.domain.ResearchDirection;

public interface ResearchDirectionMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(ResearchDirection record);

    int insertSelective(ResearchDirection record);

    ResearchDirection selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(ResearchDirection record);

    int updateByPrimaryKeyWithBLOBs(ResearchDirection record);

    int updateByPrimaryKey(ResearchDirection record);

    List<ResearchDirection> list(Map<String, Object> params);

    int count();

    List<ResearchDirection> getDirections();

}