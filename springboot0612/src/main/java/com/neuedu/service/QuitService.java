package com.neuedu.service;

import com.neuedu.pojo.Quit;
import com.neuedu.pojo.QuitWang;

import java.util.List;

public interface QuitService {
    List<Quit> getQuits(Quit quit);
    List<Quit> getAll(Quit quit);
    Quit getQuitById(int id);
    int add(QuitWang quitWang);
    int del(Quit quit);
    int update(Quit quit);
    int del2(QuitWang quitWang);
}
