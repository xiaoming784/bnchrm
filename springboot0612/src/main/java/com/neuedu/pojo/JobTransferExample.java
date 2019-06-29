package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class JobTransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobTransferExample() {
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

        public Criteria andBeforeJobIsNull() {
            addCriterion("before_job is null");
            return (Criteria) this;
        }

        public Criteria andBeforeJobIsNotNull() {
            addCriterion("before_job is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeJobEqualTo(Integer value) {
            addCriterion("before_job =", value, "beforeJob");
            return (Criteria) this;
        }

        public Criteria andBeforeJobNotEqualTo(Integer value) {
            addCriterion("before_job <>", value, "beforeJob");
            return (Criteria) this;
        }

        public Criteria andBeforeJobGreaterThan(Integer value) {
            addCriterion("before_job >", value, "beforeJob");
            return (Criteria) this;
        }

        public Criteria andBeforeJobGreaterThanOrEqualTo(Integer value) {
            addCriterion("before_job >=", value, "beforeJob");
            return (Criteria) this;
        }

        public Criteria andBeforeJobLessThan(Integer value) {
            addCriterion("before_job <", value, "beforeJob");
            return (Criteria) this;
        }

        public Criteria andBeforeJobLessThanOrEqualTo(Integer value) {
            addCriterion("before_job <=", value, "beforeJob");
            return (Criteria) this;
        }

        public Criteria andBeforeJobIn(List<Integer> values) {
            addCriterion("before_job in", values, "beforeJob");
            return (Criteria) this;
        }

        public Criteria andBeforeJobNotIn(List<Integer> values) {
            addCriterion("before_job not in", values, "beforeJob");
            return (Criteria) this;
        }

        public Criteria andBeforeJobBetween(Integer value1, Integer value2) {
            addCriterion("before_job between", value1, value2, "beforeJob");
            return (Criteria) this;
        }

        public Criteria andBeforeJobNotBetween(Integer value1, Integer value2) {
            addCriterion("before_job not between", value1, value2, "beforeJob");
            return (Criteria) this;
        }

        public Criteria andAfterJobIsNull() {
            addCriterion("after_job is null");
            return (Criteria) this;
        }

        public Criteria andAfterJobIsNotNull() {
            addCriterion("after_job is not null");
            return (Criteria) this;
        }

        public Criteria andAfterJobEqualTo(Integer value) {
            addCriterion("after_job =", value, "afterJob");
            return (Criteria) this;
        }

        public Criteria andAfterJobNotEqualTo(Integer value) {
            addCriterion("after_job <>", value, "afterJob");
            return (Criteria) this;
        }

        public Criteria andAfterJobGreaterThan(Integer value) {
            addCriterion("after_job >", value, "afterJob");
            return (Criteria) this;
        }

        public Criteria andAfterJobGreaterThanOrEqualTo(Integer value) {
            addCriterion("after_job >=", value, "afterJob");
            return (Criteria) this;
        }

        public Criteria andAfterJobLessThan(Integer value) {
            addCriterion("after_job <", value, "afterJob");
            return (Criteria) this;
        }

        public Criteria andAfterJobLessThanOrEqualTo(Integer value) {
            addCriterion("after_job <=", value, "afterJob");
            return (Criteria) this;
        }

        public Criteria andAfterJobIn(List<Integer> values) {
            addCriterion("after_job in", values, "afterJob");
            return (Criteria) this;
        }

        public Criteria andAfterJobNotIn(List<Integer> values) {
            addCriterion("after_job not in", values, "afterJob");
            return (Criteria) this;
        }

        public Criteria andAfterJobBetween(Integer value1, Integer value2) {
            addCriterion("after_job between", value1, value2, "afterJob");
            return (Criteria) this;
        }

        public Criteria andAfterJobNotBetween(Integer value1, Integer value2) {
            addCriterion("after_job not between", value1, value2, "afterJob");
            return (Criteria) this;
        }

        public Criteria andTranTypeIsNull() {
            addCriterion("tran_type is null");
            return (Criteria) this;
        }

        public Criteria andTranTypeIsNotNull() {
            addCriterion("tran_type is not null");
            return (Criteria) this;
        }

        public Criteria andTranTypeEqualTo(Integer value) {
            addCriterion("tran_type =", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeNotEqualTo(Integer value) {
            addCriterion("tran_type <>", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeGreaterThan(Integer value) {
            addCriterion("tran_type >", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tran_type >=", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeLessThan(Integer value) {
            addCriterion("tran_type <", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeLessThanOrEqualTo(Integer value) {
            addCriterion("tran_type <=", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeIn(List<Integer> values) {
            addCriterion("tran_type in", values, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeNotIn(List<Integer> values) {
            addCriterion("tran_type not in", values, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeBetween(Integer value1, Integer value2) {
            addCriterion("tran_type between", value1, value2, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tran_type not between", value1, value2, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranReasonIsNull() {
            addCriterion("tran_reason is null");
            return (Criteria) this;
        }

        public Criteria andTranReasonIsNotNull() {
            addCriterion("tran_reason is not null");
            return (Criteria) this;
        }

        public Criteria andTranReasonEqualTo(String value) {
            addCriterion("tran_reason =", value, "tranReason");
            return (Criteria) this;
        }

        public Criteria andTranReasonNotEqualTo(String value) {
            addCriterion("tran_reason <>", value, "tranReason");
            return (Criteria) this;
        }

        public Criteria andTranReasonGreaterThan(String value) {
            addCriterion("tran_reason >", value, "tranReason");
            return (Criteria) this;
        }

        public Criteria andTranReasonGreaterThanOrEqualTo(String value) {
            addCriterion("tran_reason >=", value, "tranReason");
            return (Criteria) this;
        }

        public Criteria andTranReasonLessThan(String value) {
            addCriterion("tran_reason <", value, "tranReason");
            return (Criteria) this;
        }

        public Criteria andTranReasonLessThanOrEqualTo(String value) {
            addCriterion("tran_reason <=", value, "tranReason");
            return (Criteria) this;
        }

        public Criteria andTranReasonLike(String value) {
            addCriterion("tran_reason like", value, "tranReason");
            return (Criteria) this;
        }

        public Criteria andTranReasonNotLike(String value) {
            addCriterion("tran_reason not like", value, "tranReason");
            return (Criteria) this;
        }

        public Criteria andTranReasonIn(List<String> values) {
            addCriterion("tran_reason in", values, "tranReason");
            return (Criteria) this;
        }

        public Criteria andTranReasonNotIn(List<String> values) {
            addCriterion("tran_reason not in", values, "tranReason");
            return (Criteria) this;
        }

        public Criteria andTranReasonBetween(String value1, String value2) {
            addCriterion("tran_reason between", value1, value2, "tranReason");
            return (Criteria) this;
        }

        public Criteria andTranReasonNotBetween(String value1, String value2) {
            addCriterion("tran_reason not between", value1, value2, "tranReason");
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

        public Criteria andTranDateIsNull() {
            addCriterion("tran_date is null");
            return (Criteria) this;
        }

        public Criteria andTranDateIsNotNull() {
            addCriterion("tran_date is not null");
            return (Criteria) this;
        }

        public Criteria andTranDateEqualTo(Date value) {
            addCriterionForJDBCDate("tran_date =", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("tran_date <>", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateGreaterThan(Date value) {
            addCriterionForJDBCDate("tran_date >", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tran_date >=", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateLessThan(Date value) {
            addCriterionForJDBCDate("tran_date <", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tran_date <=", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateIn(List<Date> values) {
            addCriterionForJDBCDate("tran_date in", values, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("tran_date not in", values, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tran_date between", value1, value2, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tran_date not between", value1, value2, "tranDate");
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