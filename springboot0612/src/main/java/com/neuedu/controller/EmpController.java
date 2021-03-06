package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.Dept;
import com.neuedu.pojo.Emp;
import com.neuedu.pojo.EmpWang;
import com.neuedu.pojo.Job;
import com.neuedu.service.DeptService;
import com.neuedu.service.EmpService;
//import com.neuedu.service.JobService;
import com.neuedu.service.JobService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Resource
    EmpService empService;
    @Resource
    JobService jobService;
    @Resource
    DeptService deptService;
    @GetMapping("/list")
    public PageInfo<Emp> getDept(Emp emp){
        List<Emp> depts =empService.getEmps(emp);
        PageInfo<Emp> pageInfo = new PageInfo<>(depts);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Emp> getAll(Emp emp){
        return empService.getAll(emp);
    }
    @PostMapping("/add")
    public int add(Emp emp){
        return empService.add(emp);
    }
    @GetMapping("/del")
    public int del(Emp emp){
        return empService.update(emp);
    }
    @PostMapping("/update")
    public int update(Emp emp){
        return empService.update(emp);
    }
    @GetMapping("/getOne")
    public Emp getOne(Integer eId){
        return empService.getEmpByIdTang(eId);
    }

    @GetMapping("/getDeptJob")
    public Map<String,List<?>> getDepuJob(){
        Map<String,List<?>> map = new HashMap<>();
        map.put("jobs", jobService.getAll(new Job()));
        Dept dept = new Dept();
        dept.setActive(1);
        map.put("depts", deptService.getAll(dept));
        return map;
    }

    /**
     * test
     * @param emp
     * @return
     */
    @GetMapping("/getemp")
    public PageInfo<Emp> getemp(Emp emp){
        List<Emp> depts =empService.getEmpsProbation(emp);
        PageInfo<Emp> pageInfo = new PageInfo<>(depts);
        return pageInfo;
    }


    @GetMapping("/getempdeptmob")
    public PageInfo<Emp> getempdeptmob(Emp emp){
        List<Emp> depts =empService.getEmpsDeptMob(emp);
        PageInfo<Emp> pageInfo = new PageInfo<>(depts);
        return pageInfo;
    }

    @GetMapping("/getempjobmob")
    public PageInfo<Emp> getempjobmob(Emp emp){
        List<Emp> jobs =empService.getEmpsJobMob(emp);
        PageInfo<Emp> pageInfo = new PageInfo<>(jobs);
        return pageInfo;
    }

    @GetMapping("/getOneTransfer")
    public Emp getOneDeptTransfer(Integer eId){
        return empService.getEmpTransferById(eId);
    }


}
