package com.bigdata.web.dao;

import java.util.List;

import com.bigdata.common.utils.Query;
import com.bigdata.web.domain.Signature;

public interface SignatureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Signature record);

    int insertSelective(Signature record);

    Signature selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Signature record);

    int updateByPrimaryKey(Signature record);

    List<Signature> list(Query query);

    int count();

    void upDelStatus(Integer id);
}