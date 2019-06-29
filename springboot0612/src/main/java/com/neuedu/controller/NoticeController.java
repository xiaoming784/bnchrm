package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.Job;
import com.neuedu.pojo.Notice;
import com.neuedu.service.NoticeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/notice")
public class NoticeController {
    @Resource
    NoticeService noticeService;
    @GetMapping("/list")
    public PageInfo<Notice> getDept(Notice notice){
        List<Notice> notices =noticeService.getNotices(notice);
        PageInfo<Notice> pageInfo = new PageInfo<>(notices);
        return pageInfo;
    }
    @PostMapping("/add")
    public int add(Notice notice){
        return noticeService.add(notice);
    }
    @GetMapping("/del")
    public void del(Notice notice){
        noticeService.del(notice);
    }
}
