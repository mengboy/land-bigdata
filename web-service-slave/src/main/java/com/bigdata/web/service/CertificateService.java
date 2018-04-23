package com.bigdata.web.service;

import java.util.List;

import com.bigdata.common.utils.Query;
import com.bigdata.web.domain.Certificate;

public interface CertificateService {
    void insert(Certificate certificate);

    void update(Certificate certificate);

    void upDelStatus(Integer id);

    Certificate selectById(Integer id);

    int count();

    List<Certificate> list(Query query);
}
