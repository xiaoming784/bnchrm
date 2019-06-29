package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.NoticeMapper;
import com.neuedu.pojo.Notice;
import com.neuedu.pojo.NoticeExample;
import com.neuedu.service.NoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Resource
    NoticeMapper noticeMapper;
    @Override
    public List<Notice> getNotices(Notice notice) {
        PageHelper.startPage(notice.getPageNo(),notice.getPageSize());
        NoticeExample noticeExample = new NoticeExample();
        NoticeExample.Criteria criteria = noticeExample.createCriteria();
        return noticeMapper.selectByExample(noticeExample);
    }

    @Override
    public int add(Notice notice) {
        return noticeMapper.insertSelective(notice);
    }

    @Override
    public void del(Notice notice) {
        noticeMapper.deleteByPrimaryKey(notice.getdId());
    }
}
