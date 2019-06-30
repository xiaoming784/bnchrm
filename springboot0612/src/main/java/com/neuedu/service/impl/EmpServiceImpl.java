package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.EmpMapper;
import com.neuedu.pojo.Emp;
import com.neuedu.pojo.EmpExample;
import com.neuedu.service.EmpService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


@Service
public class EmpServiceImpl implements EmpService{
    @Resource
    EmpMapper empMapper;
    @Override
    public List<Emp> getEmps(Emp emp) {

        PageHelper.startPage(emp.getPageNo(), emp.getPageSize());
        EmpExample empExample = new EmpExample();
        EmpExample.Criteria criteria = empExample.createCriteria();
        if(StringUtils.isNotBlank(emp.getName()))
            criteria.andNameLike("%"+emp.getName()+"%");
        if(emp.getEmpId()!=null)
            criteria.andEmpIdEqualTo(emp.getEmpId());
        if(emp.getSex()!=null)
            criteria.andSexEqualTo(emp.getSex());
        if(emp.getResults()!=null)
            criteria.andResultsEqualTo(emp.getResults());


        return empMapper.selectByExample(empExample);
    }

    @Override
    public List<Emp> getAll() {

        EmpExample empExample = new EmpExample();
        return empMapper.selectByExample(empExample);
    }

    @Override
    public Emp getEmpById(int emp_id) {
        return empMapper.selectByPrimaryKey(emp_id);
    }

    @Override
    public int add(Emp emp) {
//        if(emp.getName()=="1")
//            System.out.println("666");
        return empMapper.insertSelective(emp);
    }

    @Override
    public int del(Emp emp) {
//        emp.setCreateDate(new Date());
        return empMapper.updateByPrimaryKeySelective(emp);
    }

    @Override
    public int update(Emp emp) {
        return empMapper.updateByPrimaryKeySelective(emp);
    }
}
