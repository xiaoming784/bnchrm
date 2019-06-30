package com.neuedu.service.impl;

import com.neuedu.dao.HandleTrialMapper;
import com.neuedu.pojo.HandleTrial;
import com.neuedu.service.HandleTrialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HandleTrrialServiceImpl implements HandleTrialService{
    @Resource
    HandleTrialMapper handleTrialMapper;
    @Override
    public int update(HandleTrial handleTrial) {
        return handleTrialMapper.updateByPrimaryKeySelective(handleTrial);
    }
}
