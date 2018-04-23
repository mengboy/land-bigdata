package com.bigdata.web.service;

import java.util.List;
import java.util.Map;

import com.bigdata.web.domain.JobType;

public interface JobTypeService {
    List<JobType> listJobType(Map<String, Object> map);

    int insertJobType(JobType jobType);

    int delJobType(Integer id);

    int updateJobType(JobType jobType);

    int count();

    Object selectType(Integer id);
}
