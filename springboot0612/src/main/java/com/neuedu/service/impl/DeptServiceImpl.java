package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.DeptMapper;
import com.neuedu.pojo.Dept;
import com.neuedu.pojo.DeptExample;
import com.neuedu.service.DeptService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    DeptMapper deptMapper;
    @Override
    public List<Dept> getDepts(Dept dept) {
        PageHelper.startPage(dept.getPageNo(), dept.getPageSize());
        DeptExample deptExample = new DeptExample();
        DeptExample.Criteria criteria = deptExample.createCriteria();
        if(StringUtils.isNotBlank(dept.getDeptName()))
            criteria.andDeptNameLike("%"+dept.getDeptName()+"%");
        if(dept.getActive()!=null)
            criteria.andActiveEqualTo(dept.getActive());
        return deptMapper.selectByExample(deptExample);
    }

    @Override
    public List<Dept> getAll(Dept dept) {
        DeptExample deptExample = new DeptExample();
        return deptMapper.selectByExample(deptExample);
    }

    @Override
    public Dept getDeptById(int dId) {
        return deptMapper.selectByPrimaryKey(dId);
    }

    @Override
    public int add(Dept dept) {
        dept.setCreateDate(new Date());
        return deptMapper.insertSelective(dept);
    }

    @Override
    public int del(Dept dept) {
        return deptMapper.updateByPrimaryKeySelective(dept);
    }

    @Override
    public int update(Dept dept) {
        return deptMapper.updateByPrimaryKeySelective(dept);
    }
}
