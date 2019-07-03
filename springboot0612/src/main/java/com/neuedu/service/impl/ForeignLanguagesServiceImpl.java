package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.EmpMapper;
import com.neuedu.dao.ForeignLanguagesMapper;
import com.neuedu.pojo.*;
import com.neuedu.service.ForeignLanguagesService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class ForeignLanguagesServiceImpl implements ForeignLanguagesService {
    @Resource
    //@Autowired
    ForeignLanguagesMapper foreignLanguagesMapper;
    @Resource
    EmpMapper empMapper;
    @Override
    public List<ForeignLanguages> getForeignLanguges(ForeignLanguages foreignLanguages) {
        PageHelper.startPage(foreignLanguages.getPageNo(), foreignLanguages.getPageSize());
        ForeignLanguagesExample foreignLanguagesExample=new ForeignLanguagesExample();
        ForeignLanguagesExample.Criteria criteria = foreignLanguagesExample.createCriteria();
        if(StringUtils.isNotBlank(foreignLanguages.getEmpName()))
            criteria.andEmpNameLike("%"+foreignLanguages.getEmpName()+"%");
        if(foreignLanguages.getActive()!=null)
            criteria.andActiveEqualTo(foreignLanguages.getActive());

        List<ForeignLanguages> foreignLanguagess = foreignLanguagesMapper.selectByExample(foreignLanguagesExample);
        for (ForeignLanguages foreignLanguages2:foreignLanguagess) {
            Emp emp =  empMapper.selectByPrimaryKey(foreignLanguages2.getId());
            System.out.println("---------------"+foreignLanguages2.getId());
            System.out.println("------------"+emp.getName());
            System.out.println("----------"+emp.getDeptId());
            if (emp != null && emp.getName() != null && emp.getDeptId() != null) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                String empName = empMapper.selectByPrimaryKey(foreignLanguages2.getId()).getName();
                Integer deptId = empMapper.selectByPrimaryKey(foreignLanguages2.getId()).getDeptId();
                System.out.println("-=-=-===-=========="+empName+deptId);
                foreignLanguages2.setEmpName(empName);
                foreignLanguages2.setDeptId(deptId);
                System.out.println("----=-=-=-=-=-"+foreignLanguages2.getDeptId()+foreignLanguages2.getEmpName());
            } else {
                foreignLanguages2.setEmpName("无此员工");
                foreignLanguages2.setDeptId(0);
            }
        }
        return foreignLanguagess;
    }

    @Override
    public List<ForeignLanguages> getAll(ForeignLanguages foreignLanguages) {
        ForeignLanguagesExample foreignLanguagesExample=new ForeignLanguagesExample();
        return foreignLanguagesMapper.selectByExample(foreignLanguagesExample);
    }

    @Override
    public ForeignLanguages getForeignLanguagesById(int id) {
        return foreignLanguagesMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(ForeignLanguages foreignLanguages) {
        return foreignLanguagesMapper.insertSelective(foreignLanguages);
    }

    @Override
    public int del(ForeignLanguages foreignLanguages) {

        return foreignLanguagesMapper.deleteByPrimaryKey(foreignLanguages.getId());
    }

    @Override
    public int update(ForeignLanguages foreignLanguages) {

        return foreignLanguagesMapper.updateByPrimaryKeySelective(foreignLanguages);
    }

}
