package com.bigdata.web.dao;

import java.util.List;
import java.util.Map;

import com.bigdata.web.domain.JobType;

public interface JobTypeMapper {
    int deleteByPrimaryKey(Integer jtId);

    int insert(JobType record);

    int insertSelective(JobType record);

    JobType selectByPrimaryKey(Integer jtId);

    int updateByPrimaryKeySelective(JobType record);

    int updateByPrimaryKeyWithBLOBs(JobType record);

    int updateByPrimaryKey(JobType record);

    List<JobType> list(Map<String, Object> map);

    int count();
}