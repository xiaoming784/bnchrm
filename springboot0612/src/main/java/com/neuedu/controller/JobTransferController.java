package com.neuedu.controller;

import com.neuedu.pojo.JobTransfer;
import com.neuedu.service.EmpService;
import com.neuedu.service.JobTransferService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/jobtransfer")
public class JobTransferController {
    @Resource
    JobTransferService jobTransferService;
    @Resource
    EmpService empService;
    @PostMapping("/add")
    public int update(JobTransfer jobTransfer){
        int i=empService.updateDept(jobTransfer.getEmpId(),jobTransfer.getAfterJob());
        return jobTransferService.add(jobTransfer);
    }
}
