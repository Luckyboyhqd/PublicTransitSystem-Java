package com.pub.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PtsComfortEconmyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PtsComfortEconmyExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andComfortIsNull() {
            addCriterion("comfort is null");
            return (Criteria) this;
        }

        public Criteria andComfortIsNotNull() {
            addCriterion("comfort is not null");
            return (Criteria) this;
        }

        public Criteria andComfortEqualTo(String value) {
            addCriterion("comfort =", value, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortNotEqualTo(String value) {
            addCriterion("comfort <>", value, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortGreaterThan(String value) {
            addCriterion("comfort >", value, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortGreaterThanOrEqualTo(String value) {
            addCriterion("comfort >=", value, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortLessThan(String value) {
            addCriterion("comfort <", value, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortLessThanOrEqualTo(String value) {
            addCriterion("comfort <=", value, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortLike(String value) {
            addCriterion("comfort like", value, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortNotLike(String value) {
            addCriterion("comfort not like", value, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortIn(List<String> values) {
            addCriterion("comfort in", values, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortNotIn(List<String> values) {
            addCriterion("comfort not in", values, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortBetween(String value1, String value2) {
            addCriterion("comfort between", value1, value2, "comfort");
            return (Criteria) this;
        }

        public Criteria andComfortNotBetween(String value1, String value2) {
            addCriterion("comfort not between", value1, value2, "comfort");
            return (Criteria) this;
        }

        public Criteria andPeakLoadConditionIsNull() {
            addCriterion("peak_load_condition is null");
            return (Criteria) this;
        }

        public Criteria andPeakLoadConditionIsNotNull() {
            addCriterion("peak_load_condition is not null");
            return (Criteria) this;
        }

        public Criteria andPeakLoadConditionEqualTo(String value) {
            addCriterion("peak_load_condition =", value, "peakLoadCondition");
            return (Criteria) this;
        }

        public Criteria andPeakLoadConditionNotEqualTo(String value) {
            addCriterion("peak_load_condition <>", value, "peakLoadCondition");
            return (Criteria) this;
        }

        public Criteria andPeakLoadConditionGreaterThan(String value) {
            addCriterion("peak_load_condition >", value, "peakLoadCondition");
            return (Criteria) this;
        }

        public Criteria andPeakLoadConditionGreaterThanOrEqualTo(String value) {
            addCriterion("peak_load_condition >=", value, "peakLoadCondition");
            return (Criteria) this;
        }

        public Criteria andPeakLoadConditionLessThan(String value) {
            addCriterion("peak_load_condition <", value, "peakLoadCondition");
            return (Criteria) this;
        }

        public Criteria andPeakLoadConditionLessThanOrEqualTo(String value) {
            addCriterion("peak_load_condition <=", value, "peakLoadCondition");
            return (Criteria) this;
        }

        public Criteria andPeakLoadConditionLike(String value) {
            addCriterion("peak_load_condition like", value, "peakLoadCondition");
            return (Criteria) this;
        }

        public Criteria andPeakLoadConditionNotLike(String value) {
            addCriterion("peak_load_condition not like", value, "peakLoadCondition");
            return (Criteria) this;
        }

        public Criteria andPeakLoadConditionIn(List<String> values) {
            addCriterion("peak_load_condition in", values, "peakLoadCondition");
            return (Criteria) this;
        }

        public Criteria andPeakLoadConditionNotIn(List<String> values) {
            addCriterion("peak_load_condition not in", values, "peakLoadCondition");
            return (Criteria) this;
        }

        public Criteria andPeakLoadConditionBetween(String value1, String value2) {
            addCriterion("peak_load_condition between", value1, value2, "peakLoadCondition");
            return (Criteria) this;
        }

        public Criteria andPeakLoadConditionNotBetween(String value1, String value2) {
            addCriterion("peak_load_condition not between", value1, value2, "peakLoadCondition");
            return (Criteria) this;
        }

        public Criteria andAverageFullLoadOperationIsNull() {
            addCriterion("average_full_load_operation is null");
            return (Criteria) this;
        }

        public Criteria andAverageFullLoadOperationIsNotNull() {
            addCriterion("average_full_load_operation is not null");
            return (Criteria) this;
        }

        public Criteria andAverageFullLoadOperationEqualTo(String value) {
            addCriterion("average_full_load_operation =", value, "averageFullLoadOperation");
            return (Criteria) this;
        }

        public Criteria andAverageFullLoadOperationNotEqualTo(String value) {
            addCriterion("average_full_load_operation <>", value, "averageFullLoadOperation");
            return (Criteria) this;
        }

        public Criteria andAverageFullLoadOperationGreaterThan(String value) {
            addCriterion("average_full_load_operation >", value, "averageFullLoadOperation");
            return (Criteria) this;
        }

        public Criteria andAverageFullLoadOperationGreaterThanOrEqualTo(String value) {
            addCriterion("average_full_load_operation >=", value, "averageFullLoadOperation");
            return (Criteria) this;
        }

        public Criteria andAverageFullLoadOperationLessThan(String value) {
            addCriterion("average_full_load_operation <", value, "averageFullLoadOperation");
            return (Criteria) this;
        }

        public Criteria andAverageFullLoadOperationLessThanOrEqualTo(String value) {
            addCriterion("average_full_load_operation <=", value, "averageFullLoadOperation");
            return (Criteria) this;
        }

        public Criteria andAverageFullLoadOperationLike(String value) {
            addCriterion("average_full_load_operation like", value, "averageFullLoadOperation");
            return (Criteria) this;
        }

        public Criteria andAverageFullLoadOperationNotLike(String value) {
            addCriterion("average_full_load_operation not like", value, "averageFullLoadOperation");
            return (Criteria) this;
        }

        public Criteria andAverageFullLoadOperationIn(List<String> values) {
            addCriterion("average_full_load_operation in", values, "averageFullLoadOperation");
            return (Criteria) this;
        }

        public Criteria andAverageFullLoadOperationNotIn(List<String> values) {
            addCriterion("average_full_load_operation not in", values, "averageFullLoadOperation");
            return (Criteria) this;
        }

        public Criteria andAverageFullLoadOperationBetween(String value1, String value2) {
            addCriterion("average_full_load_operation between", value1, value2, "averageFullLoadOperation");
            return (Criteria) this;
        }

        public Criteria andAverageFullLoadOperationNotBetween(String value1, String value2) {
            addCriterion("average_full_load_operation not between", value1, value2, "averageFullLoadOperation");
            return (Criteria) this;
        }

        public Criteria andAveragePassengerFaresIsNull() {
            addCriterion("average_passenger_fares is null");
            return (Criteria) this;
        }

        public Criteria andAveragePassengerFaresIsNotNull() {
            addCriterion("average_passenger_fares is not null");
            return (Criteria) this;
        }

        public Criteria andAveragePassengerFaresEqualTo(String value) {
            addCriterion("average_passenger_fares =", value, "averagePassengerFares");
            return (Criteria) this;
        }

        public Criteria andAveragePassengerFaresNotEqualTo(String value) {
            addCriterion("average_passenger_fares <>", value, "averagePassengerFares");
            return (Criteria) this;
        }

        public Criteria andAveragePassengerFaresGreaterThan(String value) {
            addCriterion("average_passenger_fares >", value, "averagePassengerFares");
            return (Criteria) this;
        }

        public Criteria andAveragePassengerFaresGreaterThanOrEqualTo(String value) {
            addCriterion("average_passenger_fares >=", value, "averagePassengerFares");
            return (Criteria) this;
        }

        public Criteria andAveragePassengerFaresLessThan(String value) {
            addCriterion("average_passenger_fares <", value, "averagePassengerFares");
            return (Criteria) this;
        }

        public Criteria andAveragePassengerFaresLessThanOrEqualTo(String value) {
            addCriterion("average_passenger_fares <=", value, "averagePassengerFares");
            return (Criteria) this;
        }

        public Criteria andAveragePassengerFaresLike(String value) {
            addCriterion("average_passenger_fares like", value, "averagePassengerFares");
            return (Criteria) this;
        }

        public Criteria andAveragePassengerFaresNotLike(String value) {
            addCriterion("average_passenger_fares not like", value, "averagePassengerFares");
            return (Criteria) this;
        }

        public Criteria andAveragePassengerFaresIn(List<String> values) {
            addCriterion("average_passenger_fares in", values, "averagePassengerFares");
            return (Criteria) this;
        }

        public Criteria andAveragePassengerFaresNotIn(List<String> values) {
            addCriterion("average_passenger_fares not in", values, "averagePassengerFares");
            return (Criteria) this;
        }

        public Criteria andAveragePassengerFaresBetween(String value1, String value2) {
            addCriterion("average_passenger_fares between", value1, value2, "averagePassengerFares");
            return (Criteria) this;
        }

        public Criteria andAveragePassengerFaresNotBetween(String value1, String value2) {
            addCriterion("average_passenger_fares not between", value1, value2, "averagePassengerFares");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andFillTimeIsNull() {
            addCriterion("fill_time is null");
            return (Criteria) this;
        }

        public Criteria andFillTimeIsNotNull() {
            addCriterion("fill_time is not null");
            return (Criteria) this;
        }

        public Criteria andFillTimeEqualTo(Date value) {
            addCriterion("fill_time =", value, "fillTime");
            return (Criteria) this;
        }

        public Criteria andFillTimeNotEqualTo(Date value) {
            addCriterion("fill_time <>", value, "fillTime");
            return (Criteria) this;
        }

        public Criteria andFillTimeGreaterThan(Date value) {
            addCriterion("fill_time >", value, "fillTime");
            return (Criteria) this;
        }

        public Criteria andFillTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fill_time >=", value, "fillTime");
            return (Criteria) this;
        }

        public Criteria andFillTimeLessThan(Date value) {
            addCriterion("fill_time <", value, "fillTime");
            return (Criteria) this;
        }

        public Criteria andFillTimeLessThanOrEqualTo(Date value) {
            addCriterion("fill_time <=", value, "fillTime");
            return (Criteria) this;
        }

        public Criteria andFillTimeIn(List<Date> values) {
            addCriterion("fill_time in", values, "fillTime");
            return (Criteria) this;
        }

        public Criteria andFillTimeNotIn(List<Date> values) {
            addCriterion("fill_time not in", values, "fillTime");
            return (Criteria) this;
        }

        public Criteria andFillTimeBetween(Date value1, Date value2) {
            addCriterion("fill_time between", value1, value2, "fillTime");
            return (Criteria) this;
        }

        public Criteria andFillTimeNotBetween(Date value1, Date value2) {
            addCriterion("fill_time not between", value1, value2, "fillTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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