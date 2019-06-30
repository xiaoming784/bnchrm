package com.neuedu.controller;

import com.neuedu.pojo.DeptTransfer;
import com.neuedu.service.DeptTransferService;
import com.neuedu.service.EmpService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/depttransfer")
public class DeptTransferController {
    @Resource
    DeptTransferService deptTransferService;
    @Resource
    EmpService empService;
    @PostMapping("/add")
    public int update(DeptTransfer deptTransfer){
        int i=empService.updateDept(deptTransfer.getEmpId(),deptTransfer.getAfterDept());
        return deptTransferService.add(deptTransfer);
    }
}
