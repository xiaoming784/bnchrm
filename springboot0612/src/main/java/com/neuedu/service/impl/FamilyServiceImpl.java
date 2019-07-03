package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.DeptMapper;
import com.neuedu.dao.EmpMapper;
import com.neuedu.dao.FamilyMapper;
import com.neuedu.pojo.*;
import com.neuedu.service.FamilyService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class FamilyServiceImpl implements FamilyService {
    @Resource
    FamilyMapper familyMapper;
    @Resource
    DeptMapper deptMapper;
    @Resource
    EmpMapper empMapper;
    @Override
    public List<Family> getFamily(Family family) {
        PageHelper.startPage(family.getPageNo(), family.getPageSize());
        FamilyExample familyExample = new FamilyExample();
        FamilyExample.Criteria criteria = familyExample.createCriteria();
        if(StringUtils.isNotBlank(family.getEmpName()))
            criteria.andEmpNameLike("%"+family.getEmpName()+"%");
        if(family.getActive()!=null)
            criteria.andActiveEqualTo(family.getActive());

        List<Family> families = familyMapper.selectByExample(familyExample);
        for (Family family1:families) {
            Emp emp =  empMapper.selectByPrimaryKey(family1.getId());
            if (emp != null && emp.getName() != null && emp.getDeptId()!= null) {
                String empName = empMapper.selectByPrimaryKey(family1.getId()).getName();
                Integer deptId = empMapper.selectByPrimaryKey(family1.getId()).getDeptId();
                family1.setEmpName(empName);
                family1.setDeptId(deptId);
            } else {
                family1.setEmpName("无此员工");
                family1.setDeptId(0);
            }
        }
        return families;
    }

    @Override
    public List<Family> getAll(Family family) {
        FamilyExample familyExample = new FamilyExample();
        return familyMapper.selectByExample(familyExample);
    }

    @Override
    public Family getFamilyById(int id) {
        return familyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Family family) {
        return familyMapper.insertSelective(family);
    }

    /*@Override
    public int del(Family family) {
        return familyMapper.deleteByPrimaryKey(family.getId());
    }*/

    @Override
    public int del(Family family) {
        return familyMapper.updateByPrimaryKeySelective(family);
    }

    @Override
    public int update(Family family) {
        return familyMapper.updateByPrimaryKeySelective(family);
    }
}
