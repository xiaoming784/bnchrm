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
        if(StringUtils.isNotBlank(emp.getName())){
            criteria.andNameLike("%"+emp.getName()+"%");
        }
        //根据试用期状态查询的判断
        if(emp.getResults()!=null){
            criteria.andResultsEqualTo(emp.getResults());
        }
        System.out.println("emp的结果:"+emp);
        System.out.println("empexample结果："+empExample);
        System.out.println("测试输出形式");
        System.out.println("传递过来的试用期状态:"+emp.getResults());
        //System.out.println("criteria.andresultsequalto结果："+criteria.andResultsEqualTo(emp.getResults()));

        return empMapper.selectByExample(empExample);
    }

    @Override
    public List<Emp> getEmpsProbation(Emp emp) {
        PageHelper.startPage(emp.getPageNo(), emp.getPageSize());
        EmpExample empExample = new EmpExample();
        EmpExample.Criteria criteria = empExample.createCriteria();
        if(StringUtils.isNotBlank(emp.getName())){
            criteria.andNameLike("%"+emp.getName()+"%");
        }

        System.out.println("test:"+emp.getResults());
        //根据试用期状态查询的判断
        if(emp.getResults()!=null)
            criteria.andResultsEqualTo(emp.getResults());

        return empMapper.selectByProbation(empExample);
    }

    @Override
    public List<Emp> getEmpsDeptMob(Emp emp) {
        PageHelper.startPage(emp.getPageNo(), emp.getPageSize());
        EmpExample empExample = new EmpExample();
        EmpExample.Criteria criteria = empExample.createCriteria();
        if(StringUtils.isNotBlank(emp.getName())) {
            criteria.andNameLike("%" + emp.getName() + "%");
        }

        return empMapper.selectByMob(empExample);
    }

    @Override
    public List<Emp> getEmpsJobMob(Emp emp) {
        PageHelper.startPage(emp.getPageNo(), emp.getPageSize());
        EmpExample empExample = new EmpExample();
        EmpExample.Criteria criteria = empExample.createCriteria();
        if(StringUtils.isNotBlank(emp.getName())) {
            criteria.andNameLike("%" + emp.getName() + "%");
        }

        return empMapper.selectByMob(empExample);
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
    public Emp getEmpTransferById(int id) {
        return empMapper.selectTransferByPrimaryKey(id);
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
    public int updateResults(int id, int results) {
        return empMapper.updateResults(id,results);
    }

    @Override
    public int updateDept(int id, int dept) {
        return empMapper.updateDept(id,dept);
    }

    @Override
    public int updateJob(int id, int job) {
        return empMapper.updateJob(id,job);
    }

}
