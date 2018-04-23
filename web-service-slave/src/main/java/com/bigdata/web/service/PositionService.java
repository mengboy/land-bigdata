package com.bigdata.web.service;

import java.util.List;
import java.util.Map;

import com.bigdata.web.domain.Position;

public interface PositionService {
    List<Position> listPosition(Map<String, Object> map);

    int insertPosition(Position position);

    int delPosition(Integer id);

    int updatePosition(Position position);

    int count();

    Position getPosition(Integer pId);

    List<Position> getPositionByPlace(Map<String, Object> map);

    List<String> getWorkPlaces(Integer typeId);
}
