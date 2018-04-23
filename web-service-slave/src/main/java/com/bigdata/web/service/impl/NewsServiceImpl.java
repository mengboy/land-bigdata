package com.bigdata.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.common.utils.Query;
import com.bigdata.web.dao.NewsTypeMapper;
import com.bigdata.web.domain.NewsType;
import com.bigdata.web.service.NewsService;

@Service("newsType")
public class NewsServiceImpl implements NewsService{

    @Autowired
    NewsTypeMapper newsTypeMapper;

    @Override
    public int addNewsType(NewsType newsType) {
        newsTypeMapper.insertSelective(newsType);
        return 0;
    }


    @Override
    public int removeNewsType(Integer id) {
        return newsTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<NewsType> list(Query query) {
        return newsTypeMapper.selectNewsTypes(query);
    }

    @Override
    public int count(Query query) {
        return newsTypeMapper.count();
    }

    @Override
    public NewsType selectNewsTypeById(Integer id) {
        return newsTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public void editNewsType(NewsType newsType) {
        newsTypeMapper.updateByPrimaryKeySelective(newsType);
    }

    @Override
    public List<NewsType> getTypes() {
        return newsTypeMapper.getTypes();
    }
}
