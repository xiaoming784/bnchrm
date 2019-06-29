package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.Dept;
import com.neuedu.service.DeptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Resource
    DeptService deptService;
    @GetMapping("/list")
    public PageInfo<Dept> getDept(Dept dept){
        List<Dept> depts =deptService.getDepts(dept);
        PageInfo<Dept> pageInfo = new PageInfo<>(depts);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Dept> getAll(Dept dept){
        return deptService.getAll(dept);
    }
    @PostMapping("/add")
    public int add(Dept dept){
        return deptService.add(dept);
    }
    @GetMapping("/del")
    public int del(Dept dept){
        return deptService.update(dept);
    }
    @PostMapping("/update")
    public int update(Dept dept){
        return deptService.update(dept);
    }
    @GetMapping("/getOne")
    public Dept getOne(Integer dId){
        return deptService.getDeptById(dId);
    }
}
