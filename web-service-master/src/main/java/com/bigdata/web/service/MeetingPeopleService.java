package com.bigdata.web.service;

import java.util.List;

import com.bigdata.common.utils.Query;
import com.bigdata.web.domain.MeetingPeople;

public interface MeetingPeopleService {
    void insert(MeetingPeople meetingPeople);

    void update(MeetingPeople meetingPeople);

    void upDelStatus(Integer id);

    MeetingPeople select(Integer id);

    List<MeetingPeople> list(Query query);

    int count();
}
