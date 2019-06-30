package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.JobMapper;
import com.neuedu.pojo.Job;
import com.neuedu.pojo.JobExample;
import com.neuedu.service.JobService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    @Resource
    JobMapper jobMapper;
    @Override
    public List<Job> getJobs(Job job) {
        PageHelper.startPage(job.getPageNo(), job.getPageSize());
        JobExample jobExample = new JobExample();
        JobExample.Criteria criteria = jobExample.createCriteria();
        if(StringUtils.isNotBlank(job.getName()))
            criteria.andNameLike("%"+job.getName()+"%");
        return jobMapper.selectByExample(jobExample);
    }

    @Override
    public List<Job> getAll(Job job) {
        JobExample deptExample = new JobExample();
        return jobMapper.selectByExample(deptExample);
    }

    @Override
    public Job getJobById(int id) {
        return jobMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Job job) {
        return jobMapper.insertSelective(job);
    }

    @Override
    public int del(Job job) {
        return jobMapper.updateByPrimaryKeySelective(job);
    }

    @Override
    public int update(Job job) {
        return jobMapper.updateByPrimaryKeySelective(job);
    }

}
