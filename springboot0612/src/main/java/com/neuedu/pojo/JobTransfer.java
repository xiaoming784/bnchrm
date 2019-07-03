package com.neuedu.pojo;

import java.util.Date;

public class JobTransfer extends MyPage{
    private Integer id;

    private Integer empId;

    private Integer beforeJob;

    private Integer afterJob;

    private Integer tranType;

    private String tranReason;

    private String remarks;

    private Date tranDate;

    private Date tranDateSearch;

    public Date getTranDateSearch() {
        return tranDateSearch;
    }

    public void setTranDateSearch(Date tranDateSearch) {
        this.tranDateSearch = tranDateSearch;
    }

    private Emp emp;

    private Job job;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getBeforeJob() {
        return beforeJob;
    }

    public void setBeforeJob(Integer beforeJob) {
        this.beforeJob = beforeJob;
    }

    public Integer getAfterJob() {
        return afterJob;
    }

    public void setAfterJob(Integer afterJob) {
        this.afterJob = afterJob;
    }

    public Integer getTranType() {
        return tranType;
    }

    public void setTranType(Integer tranType) {
        this.tranType = tranType;
    }

    public String getTranReason() {
        return tranReason;
    }

    public void setTranReason(String tranReason) {
        this.tranReason = tranReason == null ? null : tranReason.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getTranDate() {
        return tranDate;
    }

    public void setTranDate(Date tranDate) {
        this.tranDate = tranDate;
    }
}