package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.Job;
import com.neuedu.service.JobService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/job")
public class JobController {
    @Resource
    JobService jobService;
    @GetMapping("/list")
    public PageInfo<Job> getDept(Job job){
        List<Job> jobs =jobService.getJobs(job);
        PageInfo<Job> pageInfo = new PageInfo<>(jobs);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Job> getAll(Job job){
        return jobService.getAll(job);
    }
    @PostMapping("/add")
    public int add(Job job){
        return jobService.add(job);
    }
    @GetMapping("/del")
    public int del(Job job){
        return jobService.update(job);
    }
    @PostMapping("/update")
    public int update(Job job){
        return jobService.update(job);
    }
    @GetMapping("/getOne")
    public Job getOne(Integer jId){
        return jobService.getJobById(jId);
    }
}
