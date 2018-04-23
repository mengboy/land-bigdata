package com.bigdata.web.service;

import java.util.List;

import com.bigdata.web.domain.ReTeamRepresentative;

public interface ReTeamRepresentativeService {

    List<ReTeamRepresentative> reTeamRepresentative(Integer trid);

    int insert(ReTeamRepresentative reTeamRepresentative);

    int del(Integer id);

    /**
     * 查询代表属于那些团队
     * @param trId
     * @return
     */
    List<ReTeamRepresentative> rtrId(Integer trId);

    void up(ReTeamRepresentative reTeamRepresentative);

    List<Integer> getTrids(Integer tid);
}
