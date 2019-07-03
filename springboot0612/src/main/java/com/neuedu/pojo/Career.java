package com.neuedu.pojo;

import java.util.Date;

public class Career extends MyPage{
    private Integer id;

    private Integer deptId;

    private String empName;

    private Date beginData;

    private Date endData;

    private String unitName;

    private String workers;

    private String post;

    private Integer salary;

    private String witness;

    private String witJob;

    private String witPhone;

    private String remarks;

    private Integer active;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public Date getBeginData() {
        return beginData;
    }

    public void setBeginData(Date beginData) {
        this.beginData = beginData;
    }

    public Date getEndData() {
        return endData;
    }

    public void setEndData(Date endData) {
        this.endData = endData;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public String getWorkers() {
        return workers;
    }

    public void setWorkers(String workers) {
        this.workers = workers == null ? null : workers.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getWitness() {
        return witness;
    }

    public void setWitness(String witness) {
        this.witness = witness == null ? null : witness.trim();
    }

    public String getWitJob() {
        return witJob;
    }

    public void setWitJob(String witJob) {
        this.witJob = witJob == null ? null : witJob.trim();
    }

    public String getWitPhone() {
        return witPhone;
    }

    public void setWitPhone(String witPhone) {
        this.witPhone = witPhone == null ? null : witPhone.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
}