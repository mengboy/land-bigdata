package com.bigdata.web.service;

import java.util.List;
import java.util.Map;

import com.bigdata.web.domain.Solution;

public interface SolutionService {
    List<Solution> solutions(Map<String, Object> map);

    Solution getSolutionById(Integer id);

    int delSolution(Integer id);

    int insertSolution(Solution solution);

    int upSolution(Solution solution);

    int count();
}
