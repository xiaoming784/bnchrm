package com.neuedu.service.impl;

import com.neuedu.dao.DeptTransferMapper;
import com.neuedu.pojo.DeptTransfer;
import com.neuedu.service.DeptTransferService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DeptTransferImpl implements DeptTransferService{
    @Resource
    DeptTransferMapper deptTransferMapper;
    @Override
    public int add(DeptTransfer deptTransfer) {
        return deptTransferMapper.insertSelective(deptTransfer);
    }
}
