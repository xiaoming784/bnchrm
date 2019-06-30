package com.neuedu.service;

import com.neuedu.pojo.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> getEmps(Emp emp);
    List<Emp> getAll(Emp emp);
    Emp getEmpById(int id);
    int add(Emp emp);
    int del(Emp emp);
    int update(Emp emp);

    List<Emp> getEmpByName(String name);
}
