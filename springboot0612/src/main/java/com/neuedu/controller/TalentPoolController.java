package com.neuedu.controller;


import com.github.pagehelper.PageInfo;
import com.neuedu.dao.QuitMapper;
import com.neuedu.pojo.*;
import com.neuedu.service.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/talentPool")
public class TalentPoolController {
    //员工
    @Resource
    EmpService empService;
    @Resource
    QuitService quitService;
    @Resource
    HandleTrialService handleTrialService;
    @Resource
    CareerService careerService;
    @Resource
    ForeignLanguagesService foreignLanguagesService;
    @Resource
    FamilyService familyService;
    @GetMapping("/empList")
    public PageInfo<Emp> getEmp(Emp emp){
        List<Emp> emps =empService.getEmps(emp);
        PageInfo<Emp> pageInfo = new PageInfo<>(emps);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Emp> getAll(Emp emp){
        return empService.getAll(emp);
    }
    @PostMapping("/add")
    public int add(EmpWang emp){
        EmpWang emp2=empService.getEmpByIdWang(emp.getEmpId());
        System.out.println("=================="+emp.getEmpId());
        System.out.println("+++++++++++++++"+emp2);
        if(emp.geteId()!=null){
            TalentPool talentPool=talentPoolService.getTalentPoolById(emp.geteId());
            System.out.println(talentPool);
            talentPool.setActive(2);
            System.out.println(talentPool.getActive());
            talentPoolService.update(talentPool);
        }
        if(emp2!=null){
            emp2.setResults(0);
            emp2.setTrialBegin(new Date());
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar.add(Calendar.MONTH, +1);
            emp2.setTrialEnd(calendar.getTime());
            return empService.updatewang(emp2);
        }
        else {
            emp2.setResults(0);
            return empService.addwang(emp2);
        }

    }
    @PostMapping("/addNew")
    public int addNew(Emp emp){
        emp.setResults(0);
        emp.setTrialBegin(new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH, +3);
        emp.setTrialEnd(calendar.getTime());
        int a=empService.add(emp);
        Emp emp1 = new Emp();
        List<Emp> emps = empService.getAll(emp1);
        Emp emp2=emps.get(emps.size()-1);
        System.out.println(emp2.geteId());
        QuitWang quitWang=new QuitWang();
        HandleTrial handleTrial=new HandleTrial();
        quitWang.setqId(emp2.geteId());
        System.out.println("--------------------------"+quitWang.getqId());
        quitWang.setEmpId(emp2.geteId());
        quitWang.setEntering(1);
        quitService.add(quitWang);
        handleTrial.setId(emp2.geteId());
        handleTrial.setEmpId(emp2.geteId());
        handleTrial.setCommentsResults(0);
        handleTrialService.add(handleTrial);
        Career career=new Career();
        career.setId(emp2.geteId());
        career.setActive(1);
        careerService.add(career);
        ForeignLanguages foreignLanguages=new ForeignLanguages();
        foreignLanguages.setId(emp2.geteId());
        foreignLanguages.setEmpId(emp2.geteId());
        foreignLanguages.setActive(1);
        foreignLanguagesService.add(foreignLanguages);
        Family family=new Family();
        family.setId(emp2.geteId());
        family.setEmpId(emp2.geteId());
        family.setActive(1);
        familyService.add(family);
        return a;
    }
    @GetMapping("/del")
    public int del(Emp emp){
        //emp = empService.getEmpById(emp.getEmpId());
        System.out.println(emp.geteId()+"666");
        TalentPool talentPool;
        if(emp.getResults()==1)
            emp.setResults(4);
//        else if(emp.getResults()==0)
//            emp.setResults(1);
        if(emp.geteId()!=null){
            talentPool=talentPoolService.getTalentPoolById(emp.geteId());
            if(talentPool!=null){
                System.out.println(talentPool);
                talentPool.setActive(1);
                System.out.println(talentPool.getActive());
                talentPoolService.update(talentPool);
            }else{
                talentPool = new TalentPool();
                talentPool.setId(emp.geteId());
                talentPool.setEmpId(emp.geteId());
                talentPool.setActive(1);
                talentPool.setBirthday(emp.getBirthday());
                talentPool.setBirthPlace(emp.getBirthPlace());
                talentPool.setBlood(emp.getBlood());
                talentPool.setCreateData(emp.getCreateData());
                talentPool.setDegree(emp.getDegree());
                talentPool.setDept(emp.getDeptId());
                talentPool.setDiploma(emp.getDiploma());
                talentPool.setEmail(emp.getEmail());
                talentPool.setFolk(emp.getFolk());
                talentPool.setGraduateDate(emp.getGraduateDate());
                talentPool.setHeight(emp.getHeight());
                talentPool.setHouse(emp.getHouse());
                talentPool.setIdCard(emp.getIdCard());
                talentPool.setJob(emp.getJobId());
                talentPool.setJobDate(emp.getJobDate());
                talentPool.setMarriage(emp.getMarriage());
                talentPool.setName(emp.getName());
                talentPool.setNativePlace(emp.getNativePlace());
                talentPool.setPhone(emp.getPhone());
                talentPool.setPolitic(emp.getPolitic());
                talentPool.setSchool(emp.getSchool());
                talentPool.setSex(emp.getSex());
                talentPool.setSource(emp.getSource());
                talentPool.setSpical(emp.getSpical());
                talentPool.setWorkType(emp.getWorkType());
                talentPoolService.add(talentPool);
            }
        }
        return empService.update(emp);
    }
    @PostMapping("/update")
    public int update(Emp emp){
        return empService.update(emp);
    }
    @GetMapping("/getOne")
    public Emp getOne(Integer empId){
        System.out.println(empId);
        return empService.getEmpById(empId); }
    @GetMapping("/getOneQuit")
    public Quit getOneQuit(Integer eId){
        return  quitService.getQuitById(eId);
    }
    @PostMapping("/addQuit")
    public  int addQuit(QuitWang quitWang){
        System.out.println("--------------------"+quitWang);
        Emp emp=empService.getEmpById(quitWang.getEmpId());
        del(emp);
        HandleTrial handleTrial=handleTrialService.getHandleTrialById(quitWang.getEmpId());
        handleTrial.setCommentsResults(4);
        quitService.del2(quitWang);
        handleTrialService.update(handleTrial);
        return quitService.add(quitWang);
    }
    //人才
    @Resource
    TalentPoolService talentPoolService;
    @GetMapping("/list")
    public PageInfo<TalentPool> getTalentPool(TalentPool talentPool){
        List<TalentPool> talentPools =talentPoolService.getTalentPools(talentPool);
        PageInfo<TalentPool> pageInfo = new PageInfo<>(talentPools);
        return pageInfo;
    }
    @GetMapping("/getAllTalent")
    public List<TalentPool> getAllTalent(TalentPool talentPool){
        return talentPoolService.getAll(talentPool);
    }
    @PostMapping("/addTalent")
    public int addTalent(TalentPool talentPool){
        return talentPoolService.add(talentPool);
    }
    @GetMapping("/getOneTalent")
    public TalentPool getOneTalent(Integer id){ return talentPoolService.getTalentPoolById(id); }
    @GetMapping("/getOneEmp")
    public Emp getOneEmp(Integer eId){
        System.out.println(eId);
        Emp emp = empService.getEmpById(eId);
        System.out.println(emp.getBirthday());
        return empService.getEmpById(eId);
    }
    @GetMapping("/delTalent")
    public int delTalent(TalentPool talentPool){return talentPoolService.update(talentPool);}
    @Resource
    DeptService deptService;
    @GetMapping("/getDept")
    public List<Dept> getDept(){
        Dept dept=new Dept();
        List<Dept> depts = deptService.getAll(dept);
        return  depts;
    }
    @Resource
    JobService jobService;
    @GetMapping("/getJob")
    public List<Job> getJob(){
        Job job=new Job();
        List<Job> jobs = jobService.getAll(job);
        return  jobs;
    }
}
