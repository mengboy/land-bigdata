package com.bigdata.web.service;

import java.util.List;
import java.util.Map;

import com.bigdata.common.utils.Query;
import com.bigdata.web.domain.DataDownload;

public interface DataDownloadService {

    List<DataDownload> getDataDownloads(Map<String, Object> map);

    int addDataDownload(DataDownload dataDownload);

    int delDataDown(Integer id);

    int count(Query query);
}
