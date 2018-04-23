package com.bigdata.web.service;

import java.util.List;
import java.util.Map;

import com.bigdata.web.domain.TeamRepresentative;

public interface TeamRepresentativeService {

    List<TeamRepresentative> teamRepresentatives(Map<String, Object> map);

    int count();

    int add(TeamRepresentative teamRepresentative);

    int del(Integer id);

    TeamRepresentative get(Integer id);

    int update(TeamRepresentative teamRepresentative);

}
