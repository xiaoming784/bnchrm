package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class QuitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuitExample() {
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

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andQuitDateIsNull() {
            addCriterion("quit_date is null");
            return (Criteria) this;
        }

        public Criteria andQuitDateIsNotNull() {
            addCriterion("quit_date is not null");
            return (Criteria) this;
        }

        public Criteria andQuitDateEqualTo(Date value) {
            addCriterionForJDBCDate("quit_date =", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("quit_date <>", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("quit_date >", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("quit_date >=", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateLessThan(Date value) {
            addCriterionForJDBCDate("quit_date <", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("quit_date <=", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateIn(List<Date> values) {
            addCriterionForJDBCDate("quit_date in", values, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("quit_date not in", values, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("quit_date between", value1, value2, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("quit_date not between", value1, value2, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitTypeIsNull() {
            addCriterion("quit_type is null");
            return (Criteria) this;
        }

        public Criteria andQuitTypeIsNotNull() {
            addCriterion("quit_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuitTypeEqualTo(Integer value) {
            addCriterion("quit_type =", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeNotEqualTo(Integer value) {
            addCriterion("quit_type <>", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeGreaterThan(Integer value) {
            addCriterion("quit_type >", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("quit_type >=", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeLessThan(Integer value) {
            addCriterion("quit_type <", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeLessThanOrEqualTo(Integer value) {
            addCriterion("quit_type <=", value, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeIn(List<Integer> values) {
            addCriterion("quit_type in", values, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeNotIn(List<Integer> values) {
            addCriterion("quit_type not in", values, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeBetween(Integer value1, Integer value2) {
            addCriterion("quit_type between", value1, value2, "quitType");
            return (Criteria) this;
        }

        public Criteria andQuitTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("quit_type not between", value1, value2, "quitType");
            return (Criteria) this;
        }

        public Criteria andDepartureIsNull() {
            addCriterion("departure is null");
            return (Criteria) this;
        }

        public Criteria andDepartureIsNotNull() {
            addCriterion("departure is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureEqualTo(String value) {
            addCriterion("departure =", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotEqualTo(String value) {
            addCriterion("departure <>", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureGreaterThan(String value) {
            addCriterion("departure >", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureGreaterThanOrEqualTo(String value) {
            addCriterion("departure >=", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLessThan(String value) {
            addCriterion("departure <", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLessThanOrEqualTo(String value) {
            addCriterion("departure <=", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLike(String value) {
            addCriterion("departure like", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotLike(String value) {
            addCriterion("departure not like", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureIn(List<String> values) {
            addCriterion("departure in", values, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotIn(List<String> values) {
            addCriterion("departure not in", values, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureBetween(String value1, String value2) {
            addCriterion("departure between", value1, value2, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotBetween(String value1, String value2) {
            addCriterion("departure not between", value1, value2, "departure");
            return (Criteria) this;
        }

        public Criteria andEnteringIsNull() {
            addCriterion("entering is null");
            return (Criteria) this;
        }

        public Criteria andEnteringIsNotNull() {
            addCriterion("entering is not null");
            return (Criteria) this;
        }

        public Criteria andEnteringEqualTo(Integer value) {
            addCriterion("entering =", value, "entering");
            return (Criteria) this;
        }

        public Criteria andEnteringNotEqualTo(Integer value) {
            addCriterion("entering <>", value, "entering");
            return (Criteria) this;
        }

        public Criteria andEnteringGreaterThan(Integer value) {
            addCriterion("entering >", value, "entering");
            return (Criteria) this;
        }

        public Criteria andEnteringGreaterThanOrEqualTo(Integer value) {
            addCriterion("entering >=", value, "entering");
            return (Criteria) this;
        }

        public Criteria andEnteringLessThan(Integer value) {
            addCriterion("entering <", value, "entering");
            return (Criteria) this;
        }

        public Criteria andEnteringLessThanOrEqualTo(Integer value) {
            addCriterion("entering <=", value, "entering");
            return (Criteria) this;
        }

        public Criteria andEnteringIn(List<Integer> values) {
            addCriterion("entering in", values, "entering");
            return (Criteria) this;
        }

        public Criteria andEnteringNotIn(List<Integer> values) {
            addCriterion("entering not in", values, "entering");
            return (Criteria) this;
        }

        public Criteria andEnteringBetween(Integer value1, Integer value2) {
            addCriterion("entering between", value1, value2, "entering");
            return (Criteria) this;
        }

        public Criteria andEnteringNotBetween(Integer value1, Integer value2) {
            addCriterion("entering not between", value1, value2, "entering");
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
/*
        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("emp.dept_id =", value, "deptId");
            return (Criteria) this;
        }*/
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