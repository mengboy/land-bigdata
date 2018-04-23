package com.bigdata.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.common.utils.Query;
import com.bigdata.web.dao.DataDownloadMapper;
import com.bigdata.web.domain.DataDownload;
import com.bigdata.web.service.DataDownloadService;

@Service("dataDownload")
public class DataDownloadImpl implements DataDownloadService{


    @Autowired
    DataDownloadMapper dataDownloadMapper;

    @Override
    public List<DataDownload> getDataDownloads(Map<String, Object> map) {
        return dataDownloadMapper.list(map);
    }

    @Override
    public int addDataDownload(DataDownload dataDownload) {
        return dataDownloadMapper.insertSelective(dataDownload);
    }

    @Override
    public int delDataDown(Integer id) {
        return dataDownloadMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int count(Query query) {
        return dataDownloadMapper.count();
    }
}
