package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.EmpMapper;
import com.neuedu.pojo.Emp;
import com.neuedu.pojo.EmpExample;
import com.neuedu.pojo.EmpWang;
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
        if(emp.getSex()!=null)
            criteria.andSexEqualTo(emp.getSex());
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
    public Emp getEmpById(int eId) {
        return empMapper.selectByPrimaryKey(eId);
    }

/*    @Override
    public EmpWang getEmpWangById(int eId) {
        return empMapper.selectByPrimaryKey(eId);
    }*/

    @Override
    public Emp getEmpTransferById(int eId) {
        return empMapper.selectTransferByPrimaryKey(eId);
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

    @Override
    public Emp getEmpByIdTang(Integer eId) {
        return empMapper.selectByPrimaryKeyTang(eId);
    }

    @Override
    public int updatewang(EmpWang emp2) {
        return empMapper.updateByPrimaryKeySelectiveWang(emp2);    }

    @Override
    public int addwang(EmpWang emp2) {
        return empMapper.insertSelectiveWang(emp2);    }

    @Override
    public EmpWang getEmpByIdWang(Integer eId) {
        return empMapper.selectByPrimaryKeyWang(eId);
    }

}
