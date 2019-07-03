package com.neuedu.pojo;

import java.util.Date;

public class HandleTrial extends MyPage{
    private Integer id;

    private Integer empId;

    private String comments;

    private Integer commentsResults;

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

    public Integer getCommentsResults() {
        return commentsResults;
    }

    public void setCommentsResults(Integer commentsResults) {
        this.commentsResults = commentsResults;
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