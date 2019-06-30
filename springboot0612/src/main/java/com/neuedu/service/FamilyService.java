package com.neuedu.service;

import com.neuedu.pojo.Family;

import java.util.List;

public interface FamilyService {
    List<Family> getFamily(Family family);
    List<Family> getAll(Family family);
    Family getFamilyById(int id);
    int add(Family family);
    int del(Family family);
    int update(Family family);
}
