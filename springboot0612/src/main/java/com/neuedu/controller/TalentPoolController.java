package com.neuedu.controller;


import com.github.pagehelper.PageInfo;
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
    public List<Emp> getAll(){
        return empService.getAll();
    }
    @PostMapping("/add")
    public int add(Emp emp){
        //emp.setResults(12);
//        int res = JOptionPane.showConfirmDialog(null, "是否继续操作", "是否继续", JOptionPane.YES_NO_OPTION);
//        if (res == JOptionPane.YES_OPTION) {
//            System.out.println("选择是后执行的代码"); // 点击“是”后执行这个代码块
//            emp.setResults(12);
//            return empService.add(emp);
//        } else {
//            System.out.println("选择否后执行的代码"); // 点击“否”后执行这个代码块
//            return empService.add(emp);
//        }

        Emp emp2=empService.getEmpById(emp.getEmpId());
        if(emp.getEmpId()!=null){

            TalentPool talentPool=talentPoolService.getTalentPoolById(emp.getEmpId());
            System.out.println(talentPool);
            talentPool.setActive(2);
            System.out.println(talentPool.getActive());
            talentPoolService.update(talentPool);

        }
//       TalentPool talentPool=talentPoolService.getTalentPoolById(emp.getEmpId());
//       if(talentPool!=null) {
//           System.out.println(talentPool);
//           talentPool.setActive(2);
//           System.out.println(talentPool.getActive());
//           talentPoolService.update(talentPool);
//       }
        if(emp2!=null){
            emp2.setResults(0);
            emp2.setTrialBegin(new Date());
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar.add(Calendar.MONTH, +1);
            emp2.setTrialEnd(calendar.getTime());
            return empService.update(emp2);
        }
        else {
            emp.setResults(0);
            return empService.add(emp);
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
        List<Emp> emps = empService.getAll();
        Emp emp2=emps.get(emps.size()-1);
        Quit quit=new  Quit();
        HandleTrial handleTrial=new HandleTrial();
        quit.setqId(emp2.getEmpId());
        quit.setEmpId(emp2.getEmpId());
        quit.setEntering(1);
        quitService.add(quit);
        handleTrial.setId(emp2.getEmpId());
        handleTrial.setEmpId(emp2.getEmpId());
        handleTrial.setResults(0);
        handleTrialService.add(handleTrial);
        Career career=new Career();
        career.setId(emp2.getEmpId());
        career.setActive(1);
        careerService.add(career);
        ForeignLanguages foreignLanguages=new ForeignLanguages();
        foreignLanguages.setId(emp2.getEmpId());
        foreignLanguages.setActive(1);
        foreignLanguagesService.add(foreignLanguages);
        Family family=new Family();
        family.setId(emp2.getEmpId());
        family.setActive(1);
        familyService.add(family);
        return a;
    }
//    @PostMapping("/talentEmp")
//    public int talentEmp(TalentPool talentPool){
//        Emp emp = null;
//        emp.setEmpId(talentPool.getEmpId());
//        emp.setName(talentPool.getName());
//
//        return empService.add(emp);
//    }
    @GetMapping("/del")
    public int del(Emp emp){
        //emp = empService.getEmpById(emp.getEmpId());
        System.out.println(emp.getEmpId()+"666");
        TalentPool talentPool;
        if(emp.getResults()==1)
            emp.setResults(4);
//        else if(emp.getResults()==0)
//            emp.setResults(1);
        if(emp.getEmpId()!=null){
            talentPool=talentPoolService.getTalentPoolById(emp.getEmpId());
            if(talentPool!=null){
                System.out.println(talentPool);
                talentPool.setActive(1);
                System.out.println(talentPool.getActive());
                talentPoolService.update(talentPool);
            }else{
                talentPool = new TalentPool();
                talentPool.setId(emp.getEmpId());
                talentPool.setEmpId(emp.getEmpId());
                talentPool.setActive(1);
                talentPool.setBirthday(emp.getBirthday());
                talentPool.setBirthPlace(emp.getBirthPlace());
                talentPool.setBlood(emp.getBlood());
                talentPool.setCreateData(emp.getCreateData());
                talentPool.setDegree(emp.getDegree());
                talentPool.setDept(emp.getDept());
                talentPool.setDiploma(emp.getDiploma());
                talentPool.setEmail(emp.getEmail());
                talentPool.setFolk(emp.getFolk());
                talentPool.setGraduateDate(emp.getGraduateDate());
                talentPool.setHeight(emp.getHeight());
                talentPool.setHouse(emp.getHouse());
                talentPool.setIdCard(emp.getIdCard());
                talentPool.setJob(emp.getJob());
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
    public Quit getOneQuit(Integer empId){
//        if(quitService.getQuitById(empId)!=null){
//            return  quitService.getQuitById(empId);
//        }else {
//            Quit quit=null;
//            quit.setEmpId(empId);
//            quitService.add(quit);
//            return  quitService.getQuitById(empId);
//        }

        return  quitService.getQuitById(empId);
    }
    @PostMapping("/addQuit")
    public  int addQuit(Quit quit){
        System.out.println(quit);
        Emp emp=empService.getEmpById(quit.getEmpId());
        del(emp);
        HandleTrial handleTrial=handleTrialService.getHandleTrialById(quit.getEmpId());
        handleTrial.setResults(4);
        handleTrialService.update(handleTrial);
        return quitService.update(quit);
//        Quit quit2=quitService.getQuitById(quit.getEmpId());
//        if(quit2!=null){
//            quit2.setDeparture(quit.getDeparture());
//            quit2.setQuitDate(quit.getQuitDate());
//            quit2.setQuitType(quit.getQuitType());
//            quit2.setRemarks(quit.getRemarks());
//            return  quitService.update(quit2);
//        }else{
//            quit.setqId(quit.getEmpId());
//            return  quitService.add(quit);
//        }
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
    public Emp getOneEmp(Integer empId){ return empService.getEmpById(empId); }
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
        List<Job> jobs = jobService.getAll();
        return  jobs;
    }
//    public Map<String,List<?>> getDeptJob(){
//        Map<String,List<?>> map = new HashMap<>();
//        Dept dept = new Dept();
//        dept.setActive(1);
//        map.put("depts", deptService.getAll(dept));
//        System.out.println(map);
//        return map;
//    }
}
