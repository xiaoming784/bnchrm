package com.neuedu.service;

import com.neuedu.pojo.HandleTrial;

import java.util.List;

public interface HandleTrialService {
    List<HandleTrial> getHandleTrials(HandleTrial handleTrial);
    List<HandleTrial> getAll(HandleTrial handleTrial);
    HandleTrial getHandleTrialById(int id);
    int add(HandleTrial handleTrial);
    int del(HandleTrial handleTrial);
    int update(HandleTrial handleTrial);
}
