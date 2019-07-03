package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.DeptTransferMapper;
import com.neuedu.dao.EmpMapper;
import com.neuedu.dao.JobTransferMapper;
import com.neuedu.dao.QuitMapper;
import com.neuedu.pojo.*;
import com.neuedu.service.TableService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class TableServiceImpl implements TableService {
    @Resource
    EmpMapper empMapper;
    @Resource
    DeptTransferMapper deptTransferMapper;
    @Resource
    JobTransferMapper jobTransferMapper;
    @Resource
    QuitMapper quitMapper;
    @Override
    public List<Emp> getEmps(Emp emp) {
        PageHelper.startPage(emp.getPageNo(), emp.getPageSize());
        EmpExample empExample = new EmpExample();
        EmpExample.Criteria criteria = empExample.createCriteria();
        if (emp.getDeptId()!=null)
            criteria.andDeptIdEqualTo(emp.getDeptId());
        /*if(StringUtils.isNotBlank(emp.getDept().getDeptName()))
            criteria.andDeptNameEqualTo(emp.getDept().getDeptName());*/
        if (emp.getCreateData()!=null)
            criteria.andCreateDataBetween(emp.getCreateData(),emp.getCreateDataSearch());
        return empMapper.selectByExampleWithDept(empExample);
    }
    @Override
    public List<Emp> getAllEmps(Emp emp) {
        EmpExample empExample = new EmpExample();
        EmpExample.Criteria criteria = empExample.createCriteria();
        if (emp.getDeptId()!=null)
            criteria.andDeptIdEqualTo(emp.getDeptId());
        /*if(StringUtils.isNotBlank(emp.getDept().getDeptName()))
            criteria.andDeptNameEqualTo(emp.getDept().getDeptName());*/
        if (emp.getCreateData()!=null)
            criteria.andCreateDataBetween(emp.getCreateData(),emp.getCreateDataSearch());
        return empMapper.selectByExampleWithDept(empExample);
    }

/*    @Override
    public int add(Emp emp) {
        emp.setCreateData(new Date());
        return empMapper.insertSelective(emp);
    }*/

    @Override
    public List<Emp> getQuitEmps(Emp emp) {
        return null;
    }

    @Override
    /*public List<Emp> getQuitEmps(Emp emp) {
        PageHelper.startPage(emp.getPageNo(), emp.getPageSize());
        return empMapper.selectByExampleWithQuit(null);
    }*/
    public List<Quit> getQuitEmps(Quit quit) {
        PageHelper.startPage(quit.getPageNo(), quit.getPageSize());
        QuitExample quitExample = new QuitExample();
        QuitExample.Criteria criteria = quitExample.createCriteria();
        criteria.andQuitDateIsNotNull();
        //Emp emp = quit.getEmp();
        System.out.println("--------------"+quit.getQuitDate());
        //System.out.println("--------------"+quit.getEmp().getDeptId());
        /*if (emp.getDeptId()!=null)
            criteria.andDeptIdEqualTo(emp.getDeptId());*/
        if (quit.getQuitDate()!=null)
            criteria.andQuitDateBetween(quit.getQuitDate(),quit.getQuitDateSearch());
        return quitMapper.selectByExampleWithEmp(quitExample);
    }
    @Override
    public List<Quit> getAllQuitEmps(Quit quit) {
        QuitExample quitExample = new QuitExample();
        QuitExample.Criteria criteria = quitExample.createCriteria();
        /*if (quit.emp.getDept()!=null)
            criteria.andemp(quit.emp.getDept());*/
        if (quit.getQuitDate()!=null)
            criteria.andQuitDateBetween(quit.getQuitDate(),quit.getQuitDateSearch());
        return quitMapper.selectByExampleWithEmp(quitExample);
    }

    @Override
    public List<DeptTransfer> getAllDeptEmps(DeptTransfer deptTransfer) {
        DeptTransferExample deptTransferExample = new DeptTransferExample();
        DeptTransferExample.Criteria criteria = deptTransferExample.createCriteria();
        if (deptTransfer.getTranDate()!=null)
            criteria.andTranDateBetween(deptTransfer.getTranDate(), deptTransfer.getTranDateSearch());
        return deptTransferMapper.selectByExampleWithEmp(deptTransferExample);    }

    @Override
    public List<JobTransfer> getAllJobEmps(JobTransfer jobTransfer) {
        JobTransferExample jobTransferExample = new JobTransferExample();
        JobTransferExample.Criteria criteria = jobTransferExample.createCriteria();
        if (jobTransfer.getTranDate()!=null)
            criteria.andTranDateBetween(jobTransfer.getTranDate(),jobTransfer.getTranDateSearch());
        return jobTransferMapper.selectByExampleWithEmp(jobTransferExample);    }

    @Override
    public List<DeptTransfer> getDeptEmps(DeptTransfer deptTransfer) {
        PageHelper.startPage(deptTransfer.getPageNo(), deptTransfer.getPageSize());
        DeptTransferExample deptTransferExample = new DeptTransferExample();
        DeptTransferExample.Criteria criteria = deptTransferExample.createCriteria();
        if (deptTransfer.getTranDate()!=null)
            criteria.andTranDateBetween(deptTransfer.getTranDate(), deptTransfer.getTranDateSearch());
        return deptTransferMapper.selectByExampleWithEmp(deptTransferExample);
    }

    @Override
    public List<DeptTransfer> getDeptEmpsAfter(DeptTransfer deptTransfer) {
        PageHelper.startPage(deptTransfer.getPageNo(), deptTransfer.getPageSize());
        DeptTransferExample deptTransferExample = new DeptTransferExample();
        DeptTransferExample.Criteria criteria = deptTransferExample.createCriteria();
        if (deptTransfer.getTranDate()!=null)
            criteria.andTranDateBetween(deptTransfer.getTranDate(), deptTransfer.getTranDateSearch());
        return deptTransferMapper.selectByExampleWithEmpAfter(deptTransferExample);
    }

    @Override
    public List<JobTransfer> getJobEmps(JobTransfer jobTransfer) {
        PageHelper.startPage(jobTransfer.getPageNo(), jobTransfer.getPageSize());
        JobTransferExample jobTransferExample = new JobTransferExample();
        JobTransferExample.Criteria criteria = jobTransferExample.createCriteria();
        if (jobTransfer.getTranDate()!=null)
            criteria.andTranDateBetween(jobTransfer.getTranDate(),jobTransfer.getTranDateSearch());
        return jobTransferMapper.selectByExampleWithEmp(jobTransferExample);
    }

    @Override
    public long getCounts(){
        EmpExample empExample = new EmpExample();
        EmpExample.Criteria criteria = empExample.createCriteria();
        //criteria.andDeptEqualTo(1);
        return empMapper.countByExample(empExample);
    }

}
