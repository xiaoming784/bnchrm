package com.neuedu.service;

import com.neuedu.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> getDepts(Dept dept);
    List<Dept> getAll(Dept dept);
    Dept getDeptById(int id);
    int add(Dept dept);
    int del(Dept dept);
    int update(Dept dept);
}