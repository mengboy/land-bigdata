package com.bigdata.web.service;

import java.util.List;

import com.bigdata.common.utils.Query;
import com.bigdata.web.domain.NewsType;

public interface NewsService {
    int addNewsType(NewsType newsType);

    int removeNewsType(Integer id);

    List<NewsType> list(Query query);

    int count(Query query);

    NewsType selectNewsTypeById(Integer id);

    void editNewsType(NewsType newsType);

    List<NewsType> getTypes();
}
