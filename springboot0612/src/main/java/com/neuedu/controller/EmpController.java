package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.dao.TalentPoolMapper;
import com.neuedu.pojo.Emp;
import com.neuedu.pojo.TalentPool;
import com.neuedu.service.EmpService;
import com.neuedu.service.TalentPoolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Resource
    EmpService empService;
    @GetMapping("/list")
    public PageInfo<Emp> getEmp(Emp emp){
        List<Emp> emps =empService.getEmps(emp);
        PageInfo<Emp> pageInfo = new PageInfo<>(emps);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Emp> getAll(){
        return empService.getAll();
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
    public Emp getOne(Integer emp_id){ return empService.getEmpById(emp_id); }
    @Resource
    TalentPoolService talentPoolService;
    @GetMapping("/getList")
    public PageInfo<TalentPool> getTalentPool(TalentPool talentPool){
        List<TalentPool> talentPools =talentPoolService.getTalentPools(talentPool);
        PageInfo<TalentPool> pageInfo = new PageInfo<>(talentPools);
        return pageInfo;
    }
}
