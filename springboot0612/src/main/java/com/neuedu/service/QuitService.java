package com.neuedu.service;

import com.neuedu.pojo.Quit;

import java.util.List;

public interface QuitService {
    List<Quit> getQuits(Quit quit);
    List<Quit> getAll(Quit quit);
    Quit getQuitById(int id);
    int add(Quit quit);
    int del(Quit quit);
    int update(Quit quit);
}
