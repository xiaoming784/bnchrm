package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CareerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CareerExample() {
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

        public Criteria andBeginDataIsNull() {
            addCriterion("begin_data is null");
            return (Criteria) this;
        }

        public Criteria andBeginDataIsNotNull() {
            addCriterion("begin_data is not null");
            return (Criteria) this;
        }

        public Criteria andBeginDataEqualTo(Date value) {
            addCriterionForJDBCDate("begin_data =", value, "beginData");
            return (Criteria) this;
        }

        public Criteria andBeginDataNotEqualTo(Date value) {
            addCriterionForJDBCDate("begin_data <>", value, "beginData");
            return (Criteria) this;
        }

        public Criteria andBeginDataGreaterThan(Date value) {
            addCriterionForJDBCDate("begin_data >", value, "beginData");
            return (Criteria) this;
        }

        public Criteria andBeginDataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("begin_data >=", value, "beginData");
            return (Criteria) this;
        }

        public Criteria andBeginDataLessThan(Date value) {
            addCriterionForJDBCDate("begin_data <", value, "beginData");
            return (Criteria) this;
        }

        public Criteria andBeginDataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("begin_data <=", value, "beginData");
            return (Criteria) this;
        }

        public Criteria andBeginDataIn(List<Date> values) {
            addCriterionForJDBCDate("begin_data in", values, "beginData");
            return (Criteria) this;
        }

        public Criteria andBeginDataNotIn(List<Date> values) {
            addCriterionForJDBCDate("begin_data not in", values, "beginData");
            return (Criteria) this;
        }

        public Criteria andBeginDataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("begin_data between", value1, value2, "beginData");
            return (Criteria) this;
        }

        public Criteria andBeginDataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("begin_data not between", value1, value2, "beginData");
            return (Criteria) this;
        }

        public Criteria andEndDataIsNull() {
            addCriterion("end_data is null");
            return (Criteria) this;
        }

        public Criteria andEndDataIsNotNull() {
            addCriterion("end_data is not null");
            return (Criteria) this;
        }

        public Criteria andEndDataEqualTo(Date value) {
            addCriterionForJDBCDate("end_data =", value, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_data <>", value, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataGreaterThan(Date value) {
            addCriterionForJDBCDate("end_data >", value, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_data >=", value, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataLessThan(Date value) {
            addCriterionForJDBCDate("end_data <", value, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_data <=", value, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataIn(List<Date> values) {
            addCriterionForJDBCDate("end_data in", values, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_data not in", values, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_data between", value1, value2, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_data not between", value1, value2, "endData");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("unit_name =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("unit_name <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("unit_name >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_name >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("unit_name <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("unit_name <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("unit_name like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("unit_name not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("unit_name in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("unit_name not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("unit_name between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("unit_name not between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andWorkersIsNull() {
            addCriterion("workers is null");
            return (Criteria) this;
        }

        public Criteria andWorkersIsNotNull() {
            addCriterion("workers is not null");
            return (Criteria) this;
        }

        public Criteria andWorkersEqualTo(String value) {
            addCriterion("workers =", value, "workers");
            return (Criteria) this;
        }

        public Criteria andWorkersNotEqualTo(String value) {
            addCriterion("workers <>", value, "workers");
            return (Criteria) this;
        }

        public Criteria andWorkersGreaterThan(String value) {
            addCriterion("workers >", value, "workers");
            return (Criteria) this;
        }

        public Criteria andWorkersGreaterThanOrEqualTo(String value) {
            addCriterion("workers >=", value, "workers");
            return (Criteria) this;
        }

        public Criteria andWorkersLessThan(String value) {
            addCriterion("workers <", value, "workers");
            return (Criteria) this;
        }

        public Criteria andWorkersLessThanOrEqualTo(String value) {
            addCriterion("workers <=", value, "workers");
            return (Criteria) this;
        }

        public Criteria andWorkersLike(String value) {
            addCriterion("workers like", value, "workers");
            return (Criteria) this;
        }

        public Criteria andWorkersNotLike(String value) {
            addCriterion("workers not like", value, "workers");
            return (Criteria) this;
        }

        public Criteria andWorkersIn(List<String> values) {
            addCriterion("workers in", values, "workers");
            return (Criteria) this;
        }

        public Criteria andWorkersNotIn(List<String> values) {
            addCriterion("workers not in", values, "workers");
            return (Criteria) this;
        }

        public Criteria andWorkersBetween(String value1, String value2) {
            addCriterion("workers between", value1, value2, "workers");
            return (Criteria) this;
        }

        public Criteria andWorkersNotBetween(String value1, String value2) {
            addCriterion("workers not between", value1, value2, "workers");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("post is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("post is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("post =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("post <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("post >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("post >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("post <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("post <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("post like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("post not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("post in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("post not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("post between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("post not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Integer value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Integer value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Integer value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Integer value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Integer> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Integer> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Integer value1, Integer value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andWitnessIsNull() {
            addCriterion("witness is null");
            return (Criteria) this;
        }

        public Criteria andWitnessIsNotNull() {
            addCriterion("witness is not null");
            return (Criteria) this;
        }

        public Criteria andWitnessEqualTo(String value) {
            addCriterion("witness =", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessNotEqualTo(String value) {
            addCriterion("witness <>", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessGreaterThan(String value) {
            addCriterion("witness >", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessGreaterThanOrEqualTo(String value) {
            addCriterion("witness >=", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessLessThan(String value) {
            addCriterion("witness <", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessLessThanOrEqualTo(String value) {
            addCriterion("witness <=", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessLike(String value) {
            addCriterion("witness like", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessNotLike(String value) {
            addCriterion("witness not like", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessIn(List<String> values) {
            addCriterion("witness in", values, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessNotIn(List<String> values) {
            addCriterion("witness not in", values, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessBetween(String value1, String value2) {
            addCriterion("witness between", value1, value2, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessNotBetween(String value1, String value2) {
            addCriterion("witness not between", value1, value2, "witness");
            return (Criteria) this;
        }

        public Criteria andWitJobIsNull() {
            addCriterion("wit_job is null");
            return (Criteria) this;
        }

        public Criteria andWitJobIsNotNull() {
            addCriterion("wit_job is not null");
            return (Criteria) this;
        }

        public Criteria andWitJobEqualTo(String value) {
            addCriterion("wit_job =", value, "witJob");
            return (Criteria) this;
        }

        public Criteria andWitJobNotEqualTo(String value) {
            addCriterion("wit_job <>", value, "witJob");
            return (Criteria) this;
        }

        public Criteria andWitJobGreaterThan(String value) {
            addCriterion("wit_job >", value, "witJob");
            return (Criteria) this;
        }

        public Criteria andWitJobGreaterThanOrEqualTo(String value) {
            addCriterion("wit_job >=", value, "witJob");
            return (Criteria) this;
        }

        public Criteria andWitJobLessThan(String value) {
            addCriterion("wit_job <", value, "witJob");
            return (Criteria) this;
        }

        public Criteria andWitJobLessThanOrEqualTo(String value) {
            addCriterion("wit_job <=", value, "witJob");
            return (Criteria) this;
        }

        public Criteria andWitJobLike(String value) {
            addCriterion("wit_job like", value, "witJob");
            return (Criteria) this;
        }

        public Criteria andWitJobNotLike(String value) {
            addCriterion("wit_job not like", value, "witJob");
            return (Criteria) this;
        }

        public Criteria andWitJobIn(List<String> values) {
            addCriterion("wit_job in", values, "witJob");
            return (Criteria) this;
        }

        public Criteria andWitJobNotIn(List<String> values) {
            addCriterion("wit_job not in", values, "witJob");
            return (Criteria) this;
        }

        public Criteria andWitJobBetween(String value1, String value2) {
            addCriterion("wit_job between", value1, value2, "witJob");
            return (Criteria) this;
        }

        public Criteria andWitJobNotBetween(String value1, String value2) {
            addCriterion("wit_job not between", value1, value2, "witJob");
            return (Criteria) this;
        }

        public Criteria andWitPhoneIsNull() {
            addCriterion("wit_phone is null");
            return (Criteria) this;
        }

        public Criteria andWitPhoneIsNotNull() {
            addCriterion("wit_phone is not null");
            return (Criteria) this;
        }

        public Criteria andWitPhoneEqualTo(String value) {
            addCriterion("wit_phone =", value, "witPhone");
            return (Criteria) this;
        }

        public Criteria andWitPhoneNotEqualTo(String value) {
            addCriterion("wit_phone <>", value, "witPhone");
            return (Criteria) this;
        }

        public Criteria andWitPhoneGreaterThan(String value) {
            addCriterion("wit_phone >", value, "witPhone");
            return (Criteria) this;
        }

        public Criteria andWitPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("wit_phone >=", value, "witPhone");
            return (Criteria) this;
        }

        public Criteria andWitPhoneLessThan(String value) {
            addCriterion("wit_phone <", value, "witPhone");
            return (Criteria) this;
        }

        public Criteria andWitPhoneLessThanOrEqualTo(String value) {
            addCriterion("wit_phone <=", value, "witPhone");
            return (Criteria) this;
        }

        public Criteria andWitPhoneLike(String value) {
            addCriterion("wit_phone like", value, "witPhone");
            return (Criteria) this;
        }

        public Criteria andWitPhoneNotLike(String value) {
            addCriterion("wit_phone not like", value, "witPhone");
            return (Criteria) this;
        }

        public Criteria andWitPhoneIn(List<String> values) {
            addCriterion("wit_phone in", values, "witPhone");
            return (Criteria) this;
        }

        public Criteria andWitPhoneNotIn(List<String> values) {
            addCriterion("wit_phone not in", values, "witPhone");
            return (Criteria) this;
        }

        public Criteria andWitPhoneBetween(String value1, String value2) {
            addCriterion("wit_phone between", value1, value2, "witPhone");
            return (Criteria) this;
        }

        public Criteria andWitPhoneNotBetween(String value1, String value2) {
            addCriterion("wit_phone not between", value1, value2, "witPhone");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("emp_name =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("emp_name >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("emp_name <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("emp_name like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("emp_name not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("emp_name in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Integer value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Integer value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Integer value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Integer value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Integer value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Integer> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Integer> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Integer value1, Integer value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Integer value1, Integer value2) {
            addCriterion("active not between", value1, value2, "active");
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