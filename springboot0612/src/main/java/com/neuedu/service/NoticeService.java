package com.neuedu.service;

import com.neuedu.pojo.Notice;

import java.util.List;

public interface NoticeService {
    List<Notice> getNotices(Notice notice);

    int add(Notice notice);

    void del(Notice notice);
}
