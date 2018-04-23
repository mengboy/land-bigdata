package com.bigdata.web.dao;

import java.util.List;

import com.bigdata.common.utils.Query;
import com.bigdata.web.domain.Certificate;

public interface CertificateMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Certificate record);

    int insertSelective(Certificate record);

    Certificate selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Certificate record);

    int updateByPrimaryKey(Certificate record);

    void upDelStatus(Integer cid);

    List<Certificate> list(Query query);

    int count();
}