package com.bigdata.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.web.dao.PositionMapper;
import com.bigdata.web.domain.Position;
import com.bigdata.web.service.PositionService;

@Service("positionService")
public class PositionServiceImpl implements PositionService{

    @Autowired
    PositionMapper positionMapper;

    @Override
    public List<Position> listPosition(Map<String, Object> map) {
        return positionMapper.list(map);
    }

    @Override
    public int insertPosition(Position position) {

        return positionMapper.insertSelective(position);
    }

    @Override
    public int delPosition(Integer id) {
        return positionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updatePosition(Position position) {
        return positionMapper.updateByPrimaryKeySelective(position);
    }

    @Override
    public int count() {
        return positionMapper.count();
    }

    @Override
    public Position getPosition(Integer pId) {
        return positionMapper.selectByPrimaryKey(pId);
    }



    @Override
    public List<Position> getPositionByPlace(Map<String, Object> map) {
        return positionMapper.getPositionByPlace(map);
    }


    @Override
    public List<String> getWorkPlaces(Integer typeId) {
        return positionMapper.getWorkPlaces(typeId);
    }
}
