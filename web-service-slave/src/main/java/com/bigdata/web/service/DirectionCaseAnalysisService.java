package com.bigdata.web.service;

import java.util.List;
import java.util.Map;

import com.bigdata.web.domain.CaseAnalysis;

public interface DirectionCaseAnalysisService {
    List<CaseAnalysis> getCaseAnalysisList(Map<String, Object> map);

    int insertCaseAnalysis(CaseAnalysis analysis);

    CaseAnalysis getCaseAnalysis(Integer id);

    int delCaseAnalysis(Integer id);
    
    int count();

    void upCaseAnalysis(CaseAnalysis caseAnalysis);

    List<CaseAnalysis> getCaseAnalysisByRdID(Integer rdid);
}
