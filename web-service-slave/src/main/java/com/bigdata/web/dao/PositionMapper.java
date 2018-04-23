package com.bigdata.web.dao;

import java.util.List;
import java.util.Map;

import com.bigdata.web.domain.Position;

public interface PositionMapper {
    int deleteByPrimaryKey(Integer pId);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKeyWithBLOBs(Position record);

    int updateByPrimaryKey(Position record);

    List<Position> list(Map<String, Object> map);

    int count();

    List<Position> getPositionByPlace(Map<String, Object> map);

    List<String> getWorkPlaces(Integer typeId);
}