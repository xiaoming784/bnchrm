package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.QuitMapper;
import com.neuedu.pojo.Quit;
import com.neuedu.pojo.QuitExample;
import com.neuedu.pojo.QuitWang;
import com.neuedu.service.QuitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QuitServiceImpl implements QuitService {
    @Resource
    QuitMapper quitMapper;
    @Override
    public List<Quit> getQuits(Quit quit) {
        PageHelper.startPage(quit.getPageNo(), quit.getPageSize());
        QuitExample quitExample = new QuitExample();
//        QuitExample.Criteria criteria = quitExample.createCriteria();
//        if(StringUtils.isNotBlank(quit.getName()))
//            criteria.andNameLike("%"+quit.getName()+"%");
//        if(quit.getActive()!=null)
//            criteria.andActiveEqualTo(quit.getActive());

        return quitMapper.selectByExample(quitExample);
    }

    @Override
    public List<Quit> getAll(Quit quit) {
        QuitExample quitExample = new QuitExample();
        return quitMapper.selectByExample(quitExample);
    }

    @Override
    public Quit getQuitById(int id) {
        return quitMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(QuitWang quitWang) {
        //quit.setCreateDate(new Date());
        return quitMapper.insertSelective(quitWang);
    }

    @Override
    public int del(Quit quit) {
        return quitMapper.updateByPrimaryKeySelective(quit);
    }

    @Override
    public int update(Quit quit) {
        return quitMapper.updateByPrimaryKeySelective(quit);
    }
    @Override
    public  int del2(QuitWang quitWang){
        return quitMapper.deleteByPrimaryKey(quitWang.getqId());
    }
}
