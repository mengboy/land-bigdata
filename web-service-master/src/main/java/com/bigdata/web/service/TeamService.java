package com.bigdata.web.service;

import java.util.List;
import java.util.Map;

import com.bigdata.web.domain.Team;

public interface TeamService {

    List<Team> teams(Map<String, Object> map);

    int insertTeam(Team team);

    int upTeam(Team team);

    int delTeam(Integer id);

    Team getTeam(Integer id);

    int count();




}
