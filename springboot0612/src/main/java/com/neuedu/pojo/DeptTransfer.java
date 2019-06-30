package com.neuedu.pojo;

import java.util.Date;

public class DeptTransfer {
    private Integer id;

    private Integer empId;

    private Integer beforeDept;

    private Integer afterDept;

    private Integer tranType;

    private String tranReason;

    private String remarks;

    private Date tranDate;

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

    public Integer getBeforeDept() {
        return beforeDept;
    }

    public void setBeforeDept(Integer beforeDept) {
        this.beforeDept = beforeDept;
    }

    public Integer getAfterDept() {
        return afterDept;
    }

    public void setAfterDept(Integer afterDept) {
        this.afterDept = afterDept;
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