package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.TalentPoolMapper;
import com.neuedu.pojo.TalentPool;
import com.neuedu.pojo.TalentPoolExample;
import com.neuedu.service.TalentPoolService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TalentPoolServiceImpl implements TalentPoolService{
    @Resource
    TalentPoolMapper talentPoolMapper;
    @Override
    public List<TalentPool> getTalentPools(TalentPool talentPool) {
        PageHelper.startPage(talentPool.getPageNo(), talentPool.getPageSize());
        TalentPoolExample empExample = new TalentPoolExample();
        TalentPoolExample.Criteria criteria = empExample.createCriteria();
        if(talentPool.getSex()!=null)
            criteria.andSexEqualTo(talentPool.getSex());
        if(talentPool.getActive()!=null)
            criteria.andActiveEqualTo(talentPool.getActive());
        if(StringUtils.isNotBlank(talentPool.getName()))
            criteria.andNameLike("%"+talentPool.getName()+"%");
        if(talentPool.getEmpId()!=null)
            criteria.andEmpIdEqualTo(talentPool.getEmpId());

        return talentPoolMapper.selectByExample(empExample);
    }

    @Override
    public List<TalentPool> getAll(TalentPool talentPool) {
        TalentPoolExample talentPoolExample = new TalentPoolExample();
        return talentPoolMapper.selectByExample(talentPoolExample);
    }

    @Override
    public TalentPool getTalentPoolById(int id) {
        return talentPoolMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(TalentPool talentPool) {
        return talentPoolMapper.insertSelective(talentPool);
    }

    @Override
    public int del(TalentPool talentPool) {
        return talentPoolMapper.updateByPrimaryKeySelective(talentPool);
    }

    @Override
    public int update(TalentPool talentPool) {
        return talentPoolMapper.updateByPrimaryKeySelective(talentPool);
    }
}
