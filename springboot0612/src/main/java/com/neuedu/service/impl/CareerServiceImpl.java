package com.neuedu.service.impl;


import com.github.pagehelper.PageHelper;
import com.neuedu.dao.CareerMapper;
import com.neuedu.dao.EmpMapper;
import com.neuedu.pojo.Career;
import com.neuedu.pojo.CareerExample;
import com.neuedu.pojo.Emp;
import com.neuedu.pojo.Family;
import com.neuedu.service.CareerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CareerServiceImpl implements CareerService {
    @Resource
    CareerMapper careerMapper;
    @Resource
    EmpMapper empMapper;

    @Override
    public List<Career> getCareer(Career career) {
        PageHelper.startPage(career.getPageNo(), career.getPageSize());
        CareerExample careerExample=new CareerExample();
        CareerExample.Criteria criteria=careerExample.createCriteria();
        if(StringUtils.isNotBlank(career.getEmpName()))
            criteria.andEmpNameLike("%"+career.getEmpName()+"%");
        if(career.getActive()!=null)
            criteria.andActiveEqualTo(career.getActive());

        List<Career> careers = careerMapper.selectByExample(careerExample);
        for (Career career1:careers) {
            Emp emp =  empMapper.selectByPrimaryKey(career1.getId());
            if (emp != null && emp.getName() != null && emp.getDept()!= null) {
                String empName = empMapper.selectByPrimaryKey(career1.getId()).getName();
                Integer deptId = empMapper.selectByPrimaryKey(career1.getId()).getDept();
                career1.setEmpName(empName);
                career1.setDeptId(deptId);
            } else {
                career1.setEmpName("无此员工");
                career1.setDeptId(0);
            }
        }
        return careers;

    }

    @Override
    public List<Career> getAll(Career career) {
        CareerExample careerExample=new CareerExample();
        return careerMapper.selectByExample(careerExample);
    }

    @Override
    public Career getCareerById(int id) {

        return careerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Career career) {
        return careerMapper.insertSelective(career);
    }

    @Override
    public int del(Career career) {

        return careerMapper.updateByPrimaryKeySelective(career);
    }

    @Override
    public int update(Career career) {

        return careerMapper.updateByPrimaryKeySelective(career);
    }

/*    @Override
    public Career getCareerByEmpId(Integer id) {
        return careerMapper.selectByPrimaryKey(id);
    }*/

    @Override
    public Career getCareerByDeptId(Integer id) {
        return careerMapper.selectByPrimaryKey(id);
    }
}
