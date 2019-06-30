package com.neuedu.service.impl;

import com.neuedu.dao.JobMapper;
import com.neuedu.pojo.Job;
import com.neuedu.pojo.JobExample;
import com.neuedu.service.JobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    @Resource
    JobMapper jobMapper;
    @Override
    public List<Job> getAll() {
        JobExample jobExample = new JobExample();
        return jobMapper.selectByExample(jobExample);
    }
}
