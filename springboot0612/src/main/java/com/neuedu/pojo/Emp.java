package com.neuedu.pojo;

import java.util.Date;

public class Emp extends MyPage{
    private Integer eId;

    private String name;

    private Integer sex;

    private Date birthday;

    private String idCard;

    private Integer deptId;

    private Integer jobId;

    private Date createData;

    private Date createDataSearch;

    private Date jobDate;

    private Integer workType;

    private Integer source;

    private Integer politic;

    private String folk;

    private String nativePlace;

    private String phone;

    private String email;

    private Integer height;

    private Integer blood;

    private Integer marriage;

    private String birthPlace;

    private String house;

    private Integer degree;

    private Integer diploma;

    private String school;

    private String spical;

    private Date graduateDate;

    private Date trialBegin;

    private Date trialEnd;

    private Integer results;

    private Dept dept;

    private Job job;

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Date getCreateDataSearch() {
        return createDataSearch;
    }

    public void setCreateDataSearch(Date createDataSearch) {
        this.createDataSearch = createDataSearch;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Date getCreateData() {
        return createData;
    }

    public void setCreateData(Date createData) {
        this.createData = createData;
    }

    public Date getJobDate() {
        return jobDate;
    }

    public void setJobDate(Date jobDate) {
        this.jobDate = jobDate;
    }

    public Integer getWorkType() {
        return workType;
    }

    public void setWorkType(Integer workType) {
        this.workType = workType;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getPolitic() {
        return politic;
    }

    public void setPolitic(Integer politic) {
        this.politic = politic;
    }

    public String getFolk() {
        return folk;
    }

    public void setFolk(String folk) {
        this.folk = folk == null ? null : folk.trim();
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getBlood() {
        return blood;
    }

    public void setBlood(Integer blood) {
        this.blood = blood;
    }

    public Integer getMarriage() {
        return marriage;
    }

    public void setMarriage(Integer marriage) {
        this.marriage = marriage;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace == null ? null : birthPlace.trim();
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house == null ? null : house.trim();
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public Integer getDiploma() {
        return diploma;
    }

    public void setDiploma(Integer diploma) {
        this.diploma = diploma;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getSpical() {
        return spical;
    }

    public void setSpical(String spical) {
        this.spical = spical == null ? null : spical.trim();
    }

    public Date getGraduateDate() {
        return graduateDate;
    }

    public void setGraduateDate(Date graduateDate) {
        this.graduateDate = graduateDate;
    }

    public Date getTrialBegin() {
        return trialBegin;
    }

    public void setTrialBegin(Date trialBegin) {
        this.trialBegin = trialBegin;
    }

    public Date getTrialEnd() {
        return trialEnd;
    }

    public void setTrialEnd(Date trialEnd) {
        this.trialEnd = trialEnd;
    }

    public Integer getResults() {
        return results;
    }

    public void setResults(Integer results) {
        this.results = results;
    }
}