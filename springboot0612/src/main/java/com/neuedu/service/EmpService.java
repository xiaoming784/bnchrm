package com.neuedu.service;

import com.neuedu.pojo.Emp;
import com.neuedu.pojo.EmpWang;

import java.util.List;

public interface EmpService {
    List<Emp> getEmps(Emp emp);
    List<Emp> getEmpsProbation(Emp emp);
    List<Emp> getEmpsDeptMob(Emp emp);
    List<Emp> getEmpsJobMob(Emp emp);
    List<Emp> getAll(Emp emp);
    Emp getEmpById(int eId);
    Emp getEmpTransferById(int eId);
    int add(Emp emp);
    int del(Emp emp);
    int update(Emp emp);
    int updateResults(int id,int results);
    int updateDept(int id,int dept);
    int updateJob(int id,int job);

    Emp getEmpByIdTang(Integer eId);

    int updatewang(EmpWang emp2);

    int addwang(EmpWang emp2);

    EmpWang getEmpByIdWang(Integer integer);

//    EmpWang getEmpwangById(Integer eId);

   /* int updateWang(EmpWang empWang2);

    int addwang(EmpWang empWang2);*/
}
