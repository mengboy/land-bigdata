package com.bigdata.web.service;

import com.bigdata.web.domain.About;

public interface AboutService {
    About getAbout();

    int saveAbout(About about);

    int update(About about);
}
