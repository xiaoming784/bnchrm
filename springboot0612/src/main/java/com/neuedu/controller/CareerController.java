package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.Career;
import com.neuedu.pojo.Dept;
import com.neuedu.service.CareerService;
import com.neuedu.service.DeptService;
import com.neuedu.service.EmpService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/career")
public class CareerController  {
    @Resource
    CareerService careerService;
    @Resource
    EmpService empService;
    @Resource
    DeptService deptService;
    @GetMapping("/list")
    public PageInfo<Career> getCareer(Career career){
        List<Career> careers=careerService.getCareer(career);
        PageInfo<Career> pageInfo=new PageInfo<>(careers);
        return  pageInfo;
    }
    @PostMapping("/add")
    public int add(Career career){

        if(career.getActive()==null){
            career.setActive(1);
        }

        return careerService.add(career);
    }
    @GetMapping("/del")
    public int del(Career career){
        return careerService.update(career);
    }
    @PostMapping("/update")
    public int update(Career career){
        return careerService.update(career);
    }
    @GetMapping("/getOne")
    public Career getOne(Integer id){
        return careerService.getCareerById(id);
    }

    /*@RequestMapping("search")
    public List<Career> search(PageInfo pageInfo, String name) {
        List<Emp> emps = empService.getEmpByName(name);
        List<Career> careers = new ArrayList<>();
        for (Emp emp : emps) {
            Integer id = emp.getId();
            Career career = careerService.getCareerByEmpId(id);
            careers.add(career);
        }

        return  careers;
    }*/
    @RequestMapping("/search")
    public List<Career> search(PageInfo pageInfo, String name) {
        System.out.println(name);
        List<Dept> depts = deptService.getDeptByName(name);
        System.out.println(depts.toString());
        List<Career> careers = new ArrayList<>();
        for (Dept dept : depts) {
            Integer id = dept.getId();
            Career career = careerService.getCareerByDeptId(id);
            careers.add(career);
        }
        return careers;
    }

   /* @GetMapping("/search")
    public PageInfo<Career> search(Career career){
        List<Career> careers=careerService.getCareer(career);
        PageInfo<Career> pageInfo=new PageInfo<>(careers);
        return  pageInfo;
    }*/


    /**
     * get  Empname by id
     * @param empId 員工號
     * @return
     */
    @GetMapping("/getEmpName")
    public String getEmpName(Integer empId) {
        return empService.getEmpById(empId).getName();
    }

}
