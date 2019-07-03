package com.neuedu.service;

import com.neuedu.pojo.*;

import java.util.List;

public interface TableService {
    List<Emp> getEmps(Emp emp);

    //int add(Emp emp);

    List<Emp> getQuitEmps(Emp emp);

    List<Quit> getQuitEmps(Quit quit);

    List<DeptTransfer> getDeptEmps(DeptTransfer deptTransfer);

    List<DeptTransfer> getDeptEmpsAfter(DeptTransfer deptTransfer);

    List<JobTransfer> getJobEmps(JobTransfer jobTransfer);

    long getCounts();

    List<Emp> getAllEmps(Emp emp);

    List<Quit> getAllQuitEmps(Quit quit);

    List<DeptTransfer> getAllDeptEmps(DeptTransfer deptTransfer);

    List<JobTransfer> getAllJobEmps(JobTransfer jobTransfer);
}
