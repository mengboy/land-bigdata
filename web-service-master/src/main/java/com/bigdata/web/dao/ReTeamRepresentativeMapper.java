package com.bigdata.web.dao;

import java.util.List;

import com.bigdata.web.domain.ReTeamRepresentative;

public interface ReTeamRepresentativeMapper {
    int deleteByPrimaryKey(Integer rtrid);

    int insert(ReTeamRepresentative record);

    int insertSelective(ReTeamRepresentative record);

    ReTeamRepresentative selectByPrimaryKey(Integer rtrid);

    int updateByPrimaryKeySelective(ReTeamRepresentative record);

    int updateByPrimaryKey(ReTeamRepresentative record);

    List<ReTeamRepresentative> selectBytrid(Integer trid);

    /**
     * 查询一个代表属于哪些团队
     * @return
     */
    List<ReTeamRepresentative> selectByidAdntid(Integer trId);

    List<Integer> getTrids(Integer tid);
}