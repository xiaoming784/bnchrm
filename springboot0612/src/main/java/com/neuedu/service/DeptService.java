package com.neuedu.service;

import com.neuedu.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> getDepts(Dept dept);
    List<Dept> getAll(Dept dept);
    Dept getDeptById(int dId);
    int add(Dept dept);
    int del(Dept dept);
    int update(Dept dept);

    List<Dept> getDeptByName(String name);
}
