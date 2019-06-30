package com.neuedu.service;

import com.neuedu.pojo.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> getEmps(Emp emp);
    List<Emp> getEmpsProbation(Emp emp);
    List<Emp> getEmpsDeptMob(Emp emp);
    List<Emp> getEmpsJobMob(Emp emp);
    List<Emp> getAll(Emp emp);
    Emp getEmpById(int id);
    Emp getEmpTransferById(int id);
    int add(Emp emp);
    int del(Emp emp);
    int update(Emp emp);
    int updateResults(int id,int results);
    int updateDept(int id,int dept);
    int updateJob(int id,int job);
}
