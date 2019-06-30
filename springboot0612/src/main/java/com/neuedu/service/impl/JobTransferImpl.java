package com.neuedu.service.impl;

import com.neuedu.dao.JobTransferMapper;
import com.neuedu.pojo.JobTransfer;
import com.neuedu.service.JobTransferService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class JobTransferImpl implements JobTransferService {
    @Resource
    JobTransferMapper jobTransferMapper;
    @Override
    public int add(JobTransfer jobTransfer) {
        return jobTransferMapper.insertSelective(jobTransfer);
    }
}
