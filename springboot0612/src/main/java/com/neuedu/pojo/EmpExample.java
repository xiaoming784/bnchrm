package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmpExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andDeptIsNull() {
            addCriterion("dept is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("dept is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(Integer value) {
            addCriterion("dept =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(Integer value) {
            addCriterion("dept <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(Integer value) {
            addCriterion("dept >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(Integer value) {
            addCriterion("dept <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(Integer value) {
            addCriterion("dept <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<Integer> values) {
            addCriterion("dept in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<Integer> values) {
            addCriterion("dept not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(Integer value1, Integer value2) {
            addCriterion("dept between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(Integer value1, Integer value2) {
            addCriterion("dept not between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(Integer value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(Integer value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(Integer value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(Integer value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(Integer value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(Integer value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<Integer> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<Integer> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(Integer value1, Integer value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(Integer value1, Integer value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andCreateDataIsNull() {
            addCriterion("create_data is null");
            return (Criteria) this;
        }

        public Criteria andCreateDataIsNotNull() {
            addCriterion("create_data is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDataEqualTo(Date value) {
            addCriterionForJDBCDate("create_data =", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_data <>", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataGreaterThan(Date value) {
            addCriterionForJDBCDate("create_data >", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_data >=", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataLessThan(Date value) {
            addCriterionForJDBCDate("create_data <", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_data <=", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataIn(List<Date> values) {
            addCriterionForJDBCDate("create_data in", values, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_data not in", values, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_data between", value1, value2, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_data not between", value1, value2, "createData");
            return (Criteria) this;
        }

        public Criteria andJobDateIsNull() {
            addCriterion("job_date is null");
            return (Criteria) this;
        }

        public Criteria andJobDateIsNotNull() {
            addCriterion("job_date is not null");
            return (Criteria) this;
        }

        public Criteria andJobDateEqualTo(Date value) {
            addCriterionForJDBCDate("job_date =", value, "jobDate");
            return (Criteria) this;
        }

        public Criteria andJobDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("job_date <>", value, "jobDate");
            return (Criteria) this;
        }

        public Criteria andJobDateGreaterThan(Date value) {
            addCriterionForJDBCDate("job_date >", value, "jobDate");
            return (Criteria) this;
        }

        public Criteria andJobDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("job_date >=", value, "jobDate");
            return (Criteria) this;
        }

        public Criteria andJobDateLessThan(Date value) {
            addCriterionForJDBCDate("job_date <", value, "jobDate");
            return (Criteria) this;
        }

        public Criteria andJobDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("job_date <=", value, "jobDate");
            return (Criteria) this;
        }

        public Criteria andJobDateIn(List<Date> values) {
            addCriterionForJDBCDate("job_date in", values, "jobDate");
            return (Criteria) this;
        }

        public Criteria andJobDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("job_date not in", values, "jobDate");
            return (Criteria) this;
        }

        public Criteria andJobDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("job_date between", value1, value2, "jobDate");
            return (Criteria) this;
        }

        public Criteria andJobDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("job_date not between", value1, value2, "jobDate");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNull() {
            addCriterion("work_type is null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNotNull() {
            addCriterion("work_type is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeEqualTo(Integer value) {
            addCriterion("work_type =", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotEqualTo(Integer value) {
            addCriterion("work_type <>", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThan(Integer value) {
            addCriterion("work_type >", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_type >=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThan(Integer value) {
            addCriterion("work_type <", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThanOrEqualTo(Integer value) {
            addCriterion("work_type <=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIn(List<Integer> values) {
            addCriterion("work_type in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotIn(List<Integer> values) {
            addCriterion("work_type not in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeBetween(Integer value1, Integer value2) {
            addCriterion("work_type between", value1, value2, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("work_type not between", value1, value2, "workType");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andPoliticIsNull() {
            addCriterion("politic is null");
            return (Criteria) this;
        }

        public Criteria andPoliticIsNotNull() {
            addCriterion("politic is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticEqualTo(Integer value) {
            addCriterion("politic =", value, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticNotEqualTo(Integer value) {
            addCriterion("politic <>", value, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticGreaterThan(Integer value) {
            addCriterion("politic >", value, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticGreaterThanOrEqualTo(Integer value) {
            addCriterion("politic >=", value, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticLessThan(Integer value) {
            addCriterion("politic <", value, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticLessThanOrEqualTo(Integer value) {
            addCriterion("politic <=", value, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticIn(List<Integer> values) {
            addCriterion("politic in", values, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticNotIn(List<Integer> values) {
            addCriterion("politic not in", values, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticBetween(Integer value1, Integer value2) {
            addCriterion("politic between", value1, value2, "politic");
            return (Criteria) this;
        }

        public Criteria andPoliticNotBetween(Integer value1, Integer value2) {
            addCriterion("politic not between", value1, value2, "politic");
            return (Criteria) this;
        }

        public Criteria andFolkIsNull() {
            addCriterion("folk is null");
            return (Criteria) this;
        }

        public Criteria andFolkIsNotNull() {
            addCriterion("folk is not null");
            return (Criteria) this;
        }

        public Criteria andFolkEqualTo(String value) {
            addCriterion("folk =", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkNotEqualTo(String value) {
            addCriterion("folk <>", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkGreaterThan(String value) {
            addCriterion("folk >", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkGreaterThanOrEqualTo(String value) {
            addCriterion("folk >=", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkLessThan(String value) {
            addCriterion("folk <", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkLessThanOrEqualTo(String value) {
            addCriterion("folk <=", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkLike(String value) {
            addCriterion("folk like", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkNotLike(String value) {
            addCriterion("folk not like", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkIn(List<String> values) {
            addCriterion("folk in", values, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkNotIn(List<String> values) {
            addCriterion("folk not in", values, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkBetween(String value1, String value2) {
            addCriterion("folk between", value1, value2, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkNotBetween(String value1, String value2) {
            addCriterion("folk not between", value1, value2, "folk");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNull() {
            addCriterion("native_place is null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNotNull() {
            addCriterion("native_place is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceEqualTo(String value) {
            addCriterion("native_place =", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotEqualTo(String value) {
            addCriterion("native_place <>", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThan(String value) {
            addCriterion("native_place >", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("native_place >=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThan(String value) {
            addCriterion("native_place <", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("native_place <=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLike(String value) {
            addCriterion("native_place like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotLike(String value) {
            addCriterion("native_place not like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIn(List<String> values) {
            addCriterion("native_place in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotIn(List<String> values) {
            addCriterion("native_place not in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceBetween(String value1, String value2) {
            addCriterion("native_place between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotBetween(String value1, String value2) {
            addCriterion("native_place not between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andBloodIsNull() {
            addCriterion("blood is null");
            return (Criteria) this;
        }

        public Criteria andBloodIsNotNull() {
            addCriterion("blood is not null");
            return (Criteria) this;
        }

        public Criteria andBloodEqualTo(Integer value) {
            addCriterion("blood =", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotEqualTo(Integer value) {
            addCriterion("blood <>", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodGreaterThan(Integer value) {
            addCriterion("blood >", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodGreaterThanOrEqualTo(Integer value) {
            addCriterion("blood >=", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodLessThan(Integer value) {
            addCriterion("blood <", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodLessThanOrEqualTo(Integer value) {
            addCriterion("blood <=", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodIn(List<Integer> values) {
            addCriterion("blood in", values, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotIn(List<Integer> values) {
            addCriterion("blood not in", values, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodBetween(Integer value1, Integer value2) {
            addCriterion("blood between", value1, value2, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotBetween(Integer value1, Integer value2) {
            addCriterion("blood not between", value1, value2, "blood");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNull() {
            addCriterion("marriage is null");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNotNull() {
            addCriterion("marriage is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageEqualTo(Integer value) {
            addCriterion("marriage =", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotEqualTo(Integer value) {
            addCriterion("marriage <>", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThan(Integer value) {
            addCriterion("marriage >", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThanOrEqualTo(Integer value) {
            addCriterion("marriage >=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThan(Integer value) {
            addCriterion("marriage <", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThanOrEqualTo(Integer value) {
            addCriterion("marriage <=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageIn(List<Integer> values) {
            addCriterion("marriage in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotIn(List<Integer> values) {
            addCriterion("marriage not in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageBetween(Integer value1, Integer value2) {
            addCriterion("marriage between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotBetween(Integer value1, Integer value2) {
            addCriterion("marriage not between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceIsNull() {
            addCriterion("birth_place is null");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceIsNotNull() {
            addCriterion("birth_place is not null");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceEqualTo(String value) {
            addCriterion("birth_place =", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceNotEqualTo(String value) {
            addCriterion("birth_place <>", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceGreaterThan(String value) {
            addCriterion("birth_place >", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("birth_place >=", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceLessThan(String value) {
            addCriterion("birth_place <", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceLessThanOrEqualTo(String value) {
            addCriterion("birth_place <=", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceLike(String value) {
            addCriterion("birth_place like", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceNotLike(String value) {
            addCriterion("birth_place not like", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceIn(List<String> values) {
            addCriterion("birth_place in", values, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceNotIn(List<String> values) {
            addCriterion("birth_place not in", values, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceBetween(String value1, String value2) {
            addCriterion("birth_place between", value1, value2, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceNotBetween(String value1, String value2) {
            addCriterion("birth_place not between", value1, value2, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andHouseIsNull() {
            addCriterion("house is null");
            return (Criteria) this;
        }

        public Criteria andHouseIsNotNull() {
            addCriterion("house is not null");
            return (Criteria) this;
        }

        public Criteria andHouseEqualTo(String value) {
            addCriterion("house =", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseNotEqualTo(String value) {
            addCriterion("house <>", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseGreaterThan(String value) {
            addCriterion("house >", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseGreaterThanOrEqualTo(String value) {
            addCriterion("house >=", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseLessThan(String value) {
            addCriterion("house <", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseLessThanOrEqualTo(String value) {
            addCriterion("house <=", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseLike(String value) {
            addCriterion("house like", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseNotLike(String value) {
            addCriterion("house not like", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseIn(List<String> values) {
            addCriterion("house in", values, "house");
            return (Criteria) this;
        }

        public Criteria andHouseNotIn(List<String> values) {
            addCriterion("house not in", values, "house");
            return (Criteria) this;
        }

        public Criteria andHouseBetween(String value1, String value2) {
            addCriterion("house between", value1, value2, "house");
            return (Criteria) this;
        }

        public Criteria andHouseNotBetween(String value1, String value2) {
            addCriterion("house not between", value1, value2, "house");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(Integer value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(Integer value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(Integer value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(Integer value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<Integer> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<Integer> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(Integer value1, Integer value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDiplomaIsNull() {
            addCriterion("diploma is null");
            return (Criteria) this;
        }

        public Criteria andDiplomaIsNotNull() {
            addCriterion("diploma is not null");
            return (Criteria) this;
        }

        public Criteria andDiplomaEqualTo(Integer value) {
            addCriterion("diploma =", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotEqualTo(Integer value) {
            addCriterion("diploma <>", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaGreaterThan(Integer value) {
            addCriterion("diploma >", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaGreaterThanOrEqualTo(Integer value) {
            addCriterion("diploma >=", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaLessThan(Integer value) {
            addCriterion("diploma <", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaLessThanOrEqualTo(Integer value) {
            addCriterion("diploma <=", value, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaIn(List<Integer> values) {
            addCriterion("diploma in", values, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotIn(List<Integer> values) {
            addCriterion("diploma not in", values, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaBetween(Integer value1, Integer value2) {
            addCriterion("diploma between", value1, value2, "diploma");
            return (Criteria) this;
        }

        public Criteria andDiplomaNotBetween(Integer value1, Integer value2) {
            addCriterion("diploma not between", value1, value2, "diploma");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSpicalIsNull() {
            addCriterion("spical is null");
            return (Criteria) this;
        }

        public Criteria andSpicalIsNotNull() {
            addCriterion("spical is not null");
            return (Criteria) this;
        }

        public Criteria andSpicalEqualTo(String value) {
            addCriterion("spical =", value, "spical");
            return (Criteria) this;
        }

        public Criteria andSpicalNotEqualTo(String value) {
            addCriterion("spical <>", value, "spical");
            return (Criteria) this;
        }

        public Criteria andSpicalGreaterThan(String value) {
            addCriterion("spical >", value, "spical");
            return (Criteria) this;
        }

        public Criteria andSpicalGreaterThanOrEqualTo(String value) {
            addCriterion("spical >=", value, "spical");
            return (Criteria) this;
        }

        public Criteria andSpicalLessThan(String value) {
            addCriterion("spical <", value, "spical");
            return (Criteria) this;
        }

        public Criteria andSpicalLessThanOrEqualTo(String value) {
            addCriterion("spical <=", value, "spical");
            return (Criteria) this;
        }

        public Criteria andSpicalLike(String value) {
            addCriterion("spical like", value, "spical");
            return (Criteria) this;
        }

        public Criteria andSpicalNotLike(String value) {
            addCriterion("spical not like", value, "spical");
            return (Criteria) this;
        }

        public Criteria andSpicalIn(List<String> values) {
            addCriterion("spical in", values, "spical");
            return (Criteria) this;
        }

        public Criteria andSpicalNotIn(List<String> values) {
            addCriterion("spical not in", values, "spical");
            return (Criteria) this;
        }

        public Criteria andSpicalBetween(String value1, String value2) {
            addCriterion("spical between", value1, value2, "spical");
            return (Criteria) this;
        }

        public Criteria andSpicalNotBetween(String value1, String value2) {
            addCriterion("spical not between", value1, value2, "spical");
            return (Criteria) this;
        }

        public Criteria andGraduateDateIsNull() {
            addCriterion("graduate_date is null");
            return (Criteria) this;
        }

        public Criteria andGraduateDateIsNotNull() {
            addCriterion("graduate_date is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateDateEqualTo(Date value) {
            addCriterionForJDBCDate("graduate_date =", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("graduate_date <>", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("graduate_date >", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("graduate_date >=", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateLessThan(Date value) {
            addCriterionForJDBCDate("graduate_date <", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("graduate_date <=", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateIn(List<Date> values) {
            addCriterionForJDBCDate("graduate_date in", values, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("graduate_date not in", values, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("graduate_date between", value1, value2, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("graduate_date not between", value1, value2, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andTrialBeginIsNull() {
            addCriterion("trial_begin is null");
            return (Criteria) this;
        }

        public Criteria andTrialBeginIsNotNull() {
            addCriterion("trial_begin is not null");
            return (Criteria) this;
        }

        public Criteria andTrialBeginEqualTo(Date value) {
            addCriterionForJDBCDate("trial_begin =", value, "trialBegin");
            return (Criteria) this;
        }

        public Criteria andTrialBeginNotEqualTo(Date value) {
            addCriterionForJDBCDate("trial_begin <>", value, "trialBegin");
            return (Criteria) this;
        }

        public Criteria andTrialBeginGreaterThan(Date value) {
            addCriterionForJDBCDate("trial_begin >", value, "trialBegin");
            return (Criteria) this;
        }

        public Criteria andTrialBeginGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trial_begin >=", value, "trialBegin");
            return (Criteria) this;
        }

        public Criteria andTrialBeginLessThan(Date value) {
            addCriterionForJDBCDate("trial_begin <", value, "trialBegin");
            return (Criteria) this;
        }

        public Criteria andTrialBeginLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trial_begin <=", value, "trialBegin");
            return (Criteria) this;
        }

        public Criteria andTrialBeginIn(List<Date> values) {
            addCriterionForJDBCDate("trial_begin in", values, "trialBegin");
            return (Criteria) this;
        }

        public Criteria andTrialBeginNotIn(List<Date> values) {
            addCriterionForJDBCDate("trial_begin not in", values, "trialBegin");
            return (Criteria) this;
        }

        public Criteria andTrialBeginBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trial_begin between", value1, value2, "trialBegin");
            return (Criteria) this;
        }

        public Criteria andTrialBeginNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trial_begin not between", value1, value2, "trialBegin");
            return (Criteria) this;
        }

        public Criteria andTrialEndIsNull() {
            addCriterion("trial_end is null");
            return (Criteria) this;
        }

        public Criteria andTrialEndIsNotNull() {
            addCriterion("trial_end is not null");
            return (Criteria) this;
        }

        public Criteria andTrialEndEqualTo(Date value) {
            addCriterionForJDBCDate("trial_end =", value, "trialEnd");
            return (Criteria) this;
        }

        public Criteria andTrialEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("trial_end <>", value, "trialEnd");
            return (Criteria) this;
        }

        public Criteria andTrialEndGreaterThan(Date value) {
            addCriterionForJDBCDate("trial_end >", value, "trialEnd");
            return (Criteria) this;
        }

        public Criteria andTrialEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trial_end >=", value, "trialEnd");
            return (Criteria) this;
        }

        public Criteria andTrialEndLessThan(Date value) {
            addCriterionForJDBCDate("trial_end <", value, "trialEnd");
            return (Criteria) this;
        }

        public Criteria andTrialEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trial_end <=", value, "trialEnd");
            return (Criteria) this;
        }

        public Criteria andTrialEndIn(List<Date> values) {
            addCriterionForJDBCDate("trial_end in", values, "trialEnd");
            return (Criteria) this;
        }

        public Criteria andTrialEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("trial_end not in", values, "trialEnd");
            return (Criteria) this;
        }

        public Criteria andTrialEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trial_end between", value1, value2, "trialEnd");
            return (Criteria) this;
        }

        public Criteria andTrialEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trial_end not between", value1, value2, "trialEnd");
            return (Criteria) this;
        }

        public Criteria andTrialStatusIsNull() {
            addCriterion("trial_status is null");
            return (Criteria) this;
        }

        public Criteria andTrialStatusIsNotNull() {
            addCriterion("trial_status is not null");
            return (Criteria) this;
        }

        public Criteria andTrialStatusEqualTo(Integer value) {
            addCriterion("trial_status =", value, "trialStatus");
            return (Criteria) this;
        }

        public Criteria andTrialStatusNotEqualTo(Integer value) {
            addCriterion("trial_status <>", value, "trialStatus");
            return (Criteria) this;
        }

        public Criteria andTrialStatusGreaterThan(Integer value) {
            addCriterion("trial_status >", value, "trialStatus");
            return (Criteria) this;
        }

        public Criteria andTrialStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("trial_status >=", value, "trialStatus");
            return (Criteria) this;
        }

        public Criteria andTrialStatusLessThan(Integer value) {
            addCriterion("trial_status <", value, "trialStatus");
            return (Criteria) this;
        }

        public Criteria andTrialStatusLessThanOrEqualTo(Integer value) {
            addCriterion("trial_status <=", value, "trialStatus");
            return (Criteria) this;
        }

        public Criteria andTrialStatusIn(List<Integer> values) {
            addCriterion("trial_status in", values, "trialStatus");
            return (Criteria) this;
        }

        public Criteria andTrialStatusNotIn(List<Integer> values) {
            addCriterion("trial_status not in", values, "trialStatus");
            return (Criteria) this;
        }

        public Criteria andTrialStatusBetween(Integer value1, Integer value2) {
            addCriterion("trial_status between", value1, value2, "trialStatus");
            return (Criteria) this;
        }

        public Criteria andTrialStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("trial_status not between", value1, value2, "trialStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}