package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.HandleTrialMapper;
import com.neuedu.pojo.HandleTrial;
import com.neuedu.pojo.HandleTrialExample;
import com.neuedu.service.HandleTrialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HandleTrrialServiceImpl implements HandleTrialService{
    @Resource
    HandleTrialMapper handleTrialMapper;

    @Override
    public List<HandleTrial> getHandleTrials(HandleTrial handleTrial) {
        PageHelper.startPage(handleTrial.getPageNo(), handleTrial.getPageSize());
        HandleTrialExample handleTrialExample = new HandleTrialExample();
        HandleTrialExample.Criteria criteria = handleTrialExample.createCriteria();
//        if(StringUtils.isNotBlank(handleTrial.getName()))
//            criteria.andNameLike("%"+handleTrial.getName()+"%");
//        if(handleTrial.getActive()!=null)
//            criteria.andActiveEqualTo(handleTrial.getActive());

        return handleTrialMapper.selectByExample(handleTrialExample);
    }

    @Override
    public List<HandleTrial> getAll(HandleTrial handleTrial) {
        HandleTrialExample handleTrialExample = new HandleTrialExample();
        return handleTrialMapper.selectByExample(handleTrialExample);
    }

    @Override
    public HandleTrial getHandleTrialById(int id) {
        return handleTrialMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(HandleTrial handleTrial) {
        // handleTrial.setCreateDate(new Date());
        return handleTrialMapper.insertSelective(handleTrial);
    }

    @Override
    public int del(HandleTrial handleTrial) {
        return handleTrialMapper.updateByPrimaryKeySelective(handleTrial);
    }

    @Override
    public int update(HandleTrial handleTrial) {
        return handleTrialMapper.updateByPrimaryKeySelective(handleTrial);
    }
}
