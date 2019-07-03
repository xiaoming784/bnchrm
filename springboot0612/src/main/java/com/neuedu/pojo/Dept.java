package com.neuedu.pojo;

import java.util.Date;

public class Dept extends MyPage{
    private Integer dId;

    private String deptName;

    private Integer type;

    private String deptPhone;

    private String fax;

    private String description;

    private Integer parentId;

    private Date createDate;

    private Integer active;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDeptPhone() {
        return deptPhone;
    }

    public void setDeptPhone(String deptPhone) {
        this.deptPhone = deptPhone == null ? null : deptPhone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
}