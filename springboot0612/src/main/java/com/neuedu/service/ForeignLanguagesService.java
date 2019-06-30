package com.neuedu.service;

import com.neuedu.pojo.ForeignLanguages;
import java.util.List;

public interface ForeignLanguagesService {
    List<ForeignLanguages> getForeignLanguges(ForeignLanguages foreignLanguages);
    List<ForeignLanguages> getAll(ForeignLanguages foreignLanguages);
    ForeignLanguages getForeignLanguagesById(int id);
    int add(ForeignLanguages foreignLanguages);
    int del(ForeignLanguages foreignLanguages);
    int update(ForeignLanguages foreignLanguages);
}
