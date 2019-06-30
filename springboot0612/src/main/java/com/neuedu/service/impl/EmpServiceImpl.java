package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.EmpMapper;
import com.neuedu.pojo.Emp;
import com.neuedu.pojo.EmpExample;
import com.neuedu.service.EmpService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    EmpMapper empMapper;
    @Override
    public List<Emp> getEmps(Emp emp) {
        PageHelper.startPage(emp.getPageNo(), emp.getPageSize());
        EmpExample empExample = new EmpExample();
        EmpExample.Criteria criteria = empExample.createCriteria();
        if(StringUtils.isNotBlank(emp.getName()))
            criteria.andNameLike("%"+emp.getName()+"%");
        return empMapper.selectByExample(empExample);
    }

    @Override
    public List<Emp> getAll(Emp emp) {
        EmpExample deptExample = new EmpExample();
        return empMapper.selectByExample(deptExample);
    }

    @Override
    public Emp getEmpById(int id) {
        return empMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Emp emp) {
        return empMapper.insertSelective(emp);
    }

    @Override
    public int del(Emp emp) {
        return empMapper.updateByPrimaryKeySelective(emp);
    }

    @Override
    public int update(Emp emp) {
        return empMapper.updateByPrimaryKeySelective(emp);
    }

    @Override
    public List<Emp> getEmpByName(String name) {
        EmpExample empExample = new EmpExample();
        EmpExample.Criteria criteria = empExample.createCriteria();
        criteria.andNameLike("%" + name +"%");
        List<Emp> emps = empMapper.selectByExample(empExample);
        return emps;
    }

}
