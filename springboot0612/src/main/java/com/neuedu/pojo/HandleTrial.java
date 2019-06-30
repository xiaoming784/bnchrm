package com.neuedu.pojo;

import java.util.Date;

public class HandleTrial extends MyPage{
    private Integer id;

    private Integer empId;

    private String comments;

    private Integer results;

    private Date handleData;

    private String remarks;

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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Integer getResults() {
        return results;
    }

    public void setResults(Integer results) {
        this.results = results;
    }

    public Date getHandleData() {
        return handleData;
    }

    public void setHandleData(Date handleData) {
        this.handleData = handleData;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}