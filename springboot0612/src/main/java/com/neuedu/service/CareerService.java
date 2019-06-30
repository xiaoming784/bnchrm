package com.neuedu.service;

import com.neuedu.pojo.Career;

import java.util.List;

public interface CareerService {
    List<Career> getCareer(Career career);
    List<Career> getAll(Career career);
    Career getCareerById(int id);

    int add(Career career);
    int del(Career career);
    int update(Career career);



    Career getCareerByDeptId(Integer id);
}
