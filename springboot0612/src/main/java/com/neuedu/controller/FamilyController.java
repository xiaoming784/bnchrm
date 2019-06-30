package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.Family;
import com.neuedu.service.FamilyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/family")
public class FamilyController {
    @Resource
    FamilyService familyService;
    @GetMapping("/list")
    public PageInfo<Family> getFamily(Family family){
        List<Family> families =familyService.getFamily(family);
        PageInfo<Family> pageInfo = new PageInfo<>(families);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Family> getAll(Family family){
        return familyService.getAll(family);
    }
    @PostMapping("/add")
    public int add(Family family){
        if(family.getActive()==null){
            family.setActive(1);
        }
        return familyService.add(family);
    }
    @GetMapping("/del")
    public int del(Family family){
        return familyService.update(family);
    }
    @PostMapping("/update")
    public int update(Family family){
        return familyService.update(family);
    }
    @GetMapping("/getOne")
    public Family getOne(Integer id){
        return familyService.getFamilyById(id);
    }
}
