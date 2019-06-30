package com.neuedu.service;

import com.neuedu.pojo.TalentPool;

import java.util.List;
public interface TalentPoolService {
    List<TalentPool> getTalentPools(TalentPool talentPool);
    List<TalentPool> getAll(TalentPool talentPool);
    TalentPool getTalentPoolById(int id);
  //  TalentPool getTalentPoolByEmpId(int emp_id);
    int add(TalentPool talentPool);
    int del(TalentPool talentPool);
    int update(TalentPool talentPool);
}
