package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.ForeignLanguages;
import com.neuedu.service.ForeignLanguagesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/foreign_languages")
public class ForeignLanguagesController {
    @Resource
    ForeignLanguagesService foreignLanguagesService;
    @GetMapping("/list")
    public PageInfo<ForeignLanguages> getForeignLanguages(ForeignLanguages foreignLanguages){
        List<ForeignLanguages> foreignLanguages1 =foreignLanguagesService.getForeignLanguges(foreignLanguages);
        PageInfo<ForeignLanguages> pageInfo = new PageInfo<>(foreignLanguages1);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<ForeignLanguages> getAll(ForeignLanguages foreignLanguages){
        return foreignLanguagesService.getAll(foreignLanguages);
    }
    @PostMapping("/add")
    public int add(ForeignLanguages foreignLanguages){
        if(foreignLanguages.getActive()==null){
            foreignLanguages.setActive(1);
        }
        return foreignLanguagesService.add(foreignLanguages);
    }
    @GetMapping("/del")
    public int del(ForeignLanguages foreignLanguages){
        return foreignLanguagesService.update(foreignLanguages);
    }
    @PostMapping("/update")
    public int update(ForeignLanguages foreignLanguages){
        return foreignLanguagesService.update(foreignLanguages);
    }
    @GetMapping("/getOne")
    public ForeignLanguages getOne(Integer id){
        return foreignLanguagesService.getForeignLanguagesById(id);
    }
}
