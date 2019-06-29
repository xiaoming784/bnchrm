package com.neuedu.pojo;

import java.util.Date;

public class Quit extends MyPage {
    private Integer qId;

    private Integer empId;

    private Date quitDate;

    private Date quitDateSearch;

    public Date getQuitDateSearch() {
        return quitDateSearch;
    }

    public void setQuitDateSearch(Date quitDateSearch) {
        this.quitDateSearch = quitDateSearch;
    }

    private Integer quitType;

    private String departure;

    private Integer entering;

    private String remarks;

    private Emp emp;

    private Dept dept;

    private Job job;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Date getQuitDate() {
        return quitDate;
    }

    public void setQuitDate(Date quitDate) {
        this.quitDate = quitDate;
    }

    public Integer getQuitType() {
        return quitType;
    }

    public void setQuitType(Integer quitType) {
        this.quitType = quitType;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure == null ? null : departure.trim();
    }

    public Integer getEntering() {
        return entering;
    }

    public void setEntering(Integer entering) {
        this.entering = entering;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}