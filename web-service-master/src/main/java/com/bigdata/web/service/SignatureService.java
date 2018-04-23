package com.bigdata.web.service;

import java.util.List;

import com.bigdata.common.utils.Query;
import com.bigdata.web.domain.Signature;

public interface SignatureService {
    void insert(Signature signature);

    void update(Signature signature);

    void del(Integer id);

    void select(Integer id);

    List<Signature> list(Query query);

    int count();

    void upDelStatus(Integer id);
}
