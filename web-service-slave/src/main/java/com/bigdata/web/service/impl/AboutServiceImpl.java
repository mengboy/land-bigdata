package com.bigdata.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.web.dao.AboutMapper;
import com.bigdata.web.domain.About;
import com.bigdata.web.service.AboutService;

@Service("aboutService")
public class AboutServiceImpl implements AboutService{

    @Autowired
    AboutMapper aboutMapper;

    @Override
    public About getAbout() {
        return aboutMapper.select();
    }

    @Override
    public int saveAbout(About about) {
        return aboutMapper.insertSelective(about);
    }

    @Override
    public int update(About about) {
        return aboutMapper.updateByPrimaryKeySelective(about);
    }
}
