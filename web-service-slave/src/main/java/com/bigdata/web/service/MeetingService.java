package com.bigdata.web.service;

import java.util.List;
import java.util.Map;

import com.bigdata.web.domain.Meeting;

public interface MeetingService {
    void insert(Meeting meeting);

    void update(Meeting meeting);

    void upDelStatus(Integer id);

    Meeting select(Integer id);

    List<Meeting> list(Map map);

    int count();
}
