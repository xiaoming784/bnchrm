package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.DeptTransfer;
import com.neuedu.pojo.Emp;
import com.neuedu.pojo.JobTransfer;
import com.neuedu.pojo.Quit;
import com.neuedu.service.TableService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/table")
public class TableController {
    @Resource
    TableService tableService;
    @GetMapping("/list")
    public PageInfo<Emp> getEmp(Emp emp){
        List<Emp> emps =tableService.getEmps(emp);
        PageInfo<Emp> pageInfo = new PageInfo<>(emps);
        System.out.println(pageInfo.toString());
        return pageInfo;
    }
    @GetMapping("/downlist")
    public List<Emp> getAllEmp(Emp emp){
        List<Emp> emps =tableService.getAllEmps(emp);
        return emps;
    }
    @GetMapping("/quit")
    public PageInfo<Quit> getQuitEmps(Quit quit){
        List<Quit> quitemps =tableService.getQuitEmps(quit);
        PageInfo<Quit> pageInfo = new PageInfo<>(quitemps);
        return pageInfo;
    }
    @GetMapping("/downquit")
    public List<Quit> getAllQuitEmps(Quit quit){
        List<Quit> quitemps =tableService.getAllQuitEmps(quit);
        return quitemps;
    }
    @GetMapping("/dept")
    public PageInfo<DeptTransfer> getDeptEmps(DeptTransfer deptTransfer){
        List<DeptTransfer> quitemps =tableService.getDeptEmps(deptTransfer);
        PageInfo<DeptTransfer> pageInfo = new PageInfo<>(quitemps);
        return pageInfo;
    }
    @GetMapping("/deptAfter")
    public PageInfo<DeptTransfer> getDeptEmpsAfter(DeptTransfer deptTransfer){
        List<DeptTransfer> quitemps =tableService.getDeptEmpsAfter(deptTransfer);
        PageInfo<DeptTransfer> pageInfo = new PageInfo<>(quitemps);
        return pageInfo;
    }
    @GetMapping("/downdept")
    public List<DeptTransfer> getAllDeptEmps(DeptTransfer deptTransfer){
        List<DeptTransfer> quitemps =tableService.getAllDeptEmps(deptTransfer);
        return quitemps;
    }
    @GetMapping("/job")
    public PageInfo<JobTransfer> getJobEmps(JobTransfer jobTransfer){
        List<JobTransfer> quitemps =tableService.getJobEmps(jobTransfer);
        PageInfo<JobTransfer> pageInfo = new PageInfo<>(quitemps);
        return pageInfo;
    }
    @GetMapping("/downjob")
    public List<JobTransfer> getAllJobEmps(JobTransfer jobTransfer){
        List<JobTransfer> quitemps =tableService.getAllJobEmps(jobTransfer);
        return quitemps;
    }
    @GetMapping("/report")
    public String getCounts(Model model){
        model.addAttribute("count1", tableService.getCounts());
        return String.valueOf(model);
    }
}
