package com.pub.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PtsConvenienceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PtsConvenienceExample() {
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

        public Criteria andDepartureIntervalIsNull() {
            addCriterion("departure_interval is null");
            return (Criteria) this;
        }

        public Criteria andDepartureIntervalIsNotNull() {
            addCriterion("departure_interval is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureIntervalEqualTo(String value) {
            addCriterion("departure_interval =", value, "departureInterval");
            return (Criteria) this;
        }

        public Criteria andDepartureIntervalNotEqualTo(String value) {
            addCriterion("departure_interval <>", value, "departureInterval");
            return (Criteria) this;
        }

        public Criteria andDepartureIntervalGreaterThan(String value) {
            addCriterion("departure_interval >", value, "departureInterval");
            return (Criteria) this;
        }

        public Criteria andDepartureIntervalGreaterThanOrEqualTo(String value) {
            addCriterion("departure_interval >=", value, "departureInterval");
            return (Criteria) this;
        }

        public Criteria andDepartureIntervalLessThan(String value) {
            addCriterion("departure_interval <", value, "departureInterval");
            return (Criteria) this;
        }

        public Criteria andDepartureIntervalLessThanOrEqualTo(String value) {
            addCriterion("departure_interval <=", value, "departureInterval");
            return (Criteria) this;
        }

        public Criteria andDepartureIntervalLike(String value) {
            addCriterion("departure_interval like", value, "departureInterval");
            return (Criteria) this;
        }

        public Criteria andDepartureIntervalNotLike(String value) {
            addCriterion("departure_interval not like", value, "departureInterval");
            return (Criteria) this;
        }

        public Criteria andDepartureIntervalIn(List<String> values) {
            addCriterion("departure_interval in", values, "departureInterval");
            return (Criteria) this;
        }

        public Criteria andDepartureIntervalNotIn(List<String> values) {
            addCriterion("departure_interval not in", values, "departureInterval");
            return (Criteria) this;
        }

        public Criteria andDepartureIntervalBetween(String value1, String value2) {
            addCriterion("departure_interval between", value1, value2, "departureInterval");
            return (Criteria) this;
        }

        public Criteria andDepartureIntervalNotBetween(String value1, String value2) {
            addCriterion("departure_interval not between", value1, value2, "departureInterval");
            return (Criteria) this;
        }

        public Criteria andWaitingTimeIsNull() {
            addCriterion("waiting_time is null");
            return (Criteria) this;
        }

        public Criteria andWaitingTimeIsNotNull() {
            addCriterion("waiting_time is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingTimeEqualTo(String value) {
            addCriterion("waiting_time =", value, "waitingTime");
            return (Criteria) this;
        }

        public Criteria andWaitingTimeNotEqualTo(String value) {
            addCriterion("waiting_time <>", value, "waitingTime");
            return (Criteria) this;
        }

        public Criteria andWaitingTimeGreaterThan(String value) {
            addCriterion("waiting_time >", value, "waitingTime");
            return (Criteria) this;
        }

        public Criteria andWaitingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("waiting_time >=", value, "waitingTime");
            return (Criteria) this;
        }

        public Criteria andWaitingTimeLessThan(String value) {
            addCriterion("waiting_time <", value, "waitingTime");
            return (Criteria) this;
        }

        public Criteria andWaitingTimeLessThanOrEqualTo(String value) {
            addCriterion("waiting_time <=", value, "waitingTime");
            return (Criteria) this;
        }

        public Criteria andWaitingTimeLike(String value) {
            addCriterion("waiting_time like", value, "waitingTime");
            return (Criteria) this;
        }

        public Criteria andWaitingTimeNotLike(String value) {
            addCriterion("waiting_time not like", value, "waitingTime");
            return (Criteria) this;
        }

        public Criteria andWaitingTimeIn(List<String> values) {
            addCriterion("waiting_time in", values, "waitingTime");
            return (Criteria) this;
        }

        public Criteria andWaitingTimeNotIn(List<String> values) {
            addCriterion("waiting_time not in", values, "waitingTime");
            return (Criteria) this;
        }

        public Criteria andWaitingTimeBetween(String value1, String value2) {
            addCriterion("waiting_time between", value1, value2, "waitingTime");
            return (Criteria) this;
        }

        public Criteria andWaitingTimeNotBetween(String value1, String value2) {
            addCriterion("waiting_time not between", value1, value2, "waitingTime");
            return (Criteria) this;
        }

        public Criteria andTransferDistanceIsNull() {
            addCriterion("transfer_distance is null");
            return (Criteria) this;
        }

        public Criteria andTransferDistanceIsNotNull() {
            addCriterion("transfer_distance is not null");
            return (Criteria) this;
        }

        public Criteria andTransferDistanceEqualTo(String value) {
            addCriterion("transfer_distance =", value, "transferDistance");
            return (Criteria) this;
        }

        public Criteria andTransferDistanceNotEqualTo(String value) {
            addCriterion("transfer_distance <>", value, "transferDistance");
            return (Criteria) this;
        }

        public Criteria andTransferDistanceGreaterThan(String value) {
            addCriterion("transfer_distance >", value, "transferDistance");
            return (Criteria) this;
        }

        public Criteria andTransferDistanceGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_distance >=", value, "transferDistance");
            return (Criteria) this;
        }

        public Criteria andTransferDistanceLessThan(String value) {
            addCriterion("transfer_distance <", value, "transferDistance");
            return (Criteria) this;
        }

        public Criteria andTransferDistanceLessThanOrEqualTo(String value) {
            addCriterion("transfer_distance <=", value, "transferDistance");
            return (Criteria) this;
        }

        public Criteria andTransferDistanceLike(String value) {
            addCriterion("transfer_distance like", value, "transferDistance");
            return (Criteria) this;
        }

        public Criteria andTransferDistanceNotLike(String value) {
            addCriterion("transfer_distance not like", value, "transferDistance");
            return (Criteria) this;
        }

        public Criteria andTransferDistanceIn(List<String> values) {
            addCriterion("transfer_distance in", values, "transferDistance");
            return (Criteria) this;
        }

        public Criteria andTransferDistanceNotIn(List<String> values) {
            addCriterion("transfer_distance not in", values, "transferDistance");
            return (Criteria) this;
        }

        public Criteria andTransferDistanceBetween(String value1, String value2) {
            addCriterion("transfer_distance between", value1, value2, "transferDistance");
            return (Criteria) this;
        }

        public Criteria andTransferDistanceNotBetween(String value1, String value2) {
            addCriterion("transfer_distance not between", value1, value2, "transferDistance");
            return (Criteria) this;
        }

        public Criteria andTransferRateIsNull() {
            addCriterion("transfer_rate is null");
            return (Criteria) this;
        }

        public Criteria andTransferRateIsNotNull() {
            addCriterion("transfer_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTransferRateEqualTo(String value) {
            addCriterion("transfer_rate =", value, "transferRate");
            return (Criteria) this;
        }

        public Criteria andTransferRateNotEqualTo(String value) {
            addCriterion("transfer_rate <>", value, "transferRate");
            return (Criteria) this;
        }

        public Criteria andTransferRateGreaterThan(String value) {
            addCriterion("transfer_rate >", value, "transferRate");
            return (Criteria) this;
        }

        public Criteria andTransferRateGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_rate >=", value, "transferRate");
            return (Criteria) this;
        }

        public Criteria andTransferRateLessThan(String value) {
            addCriterion("transfer_rate <", value, "transferRate");
            return (Criteria) this;
        }

        public Criteria andTransferRateLessThanOrEqualTo(String value) {
            addCriterion("transfer_rate <=", value, "transferRate");
            return (Criteria) this;
        }

        public Criteria andTransferRateLike(String value) {
            addCriterion("transfer_rate like", value, "transferRate");
            return (Criteria) this;
        }

        public Criteria andTransferRateNotLike(String value) {
            addCriterion("transfer_rate not like", value, "transferRate");
            return (Criteria) this;
        }

        public Criteria andTransferRateIn(List<String> values) {
            addCriterion("transfer_rate in", values, "transferRate");
            return (Criteria) this;
        }

        public Criteria andTransferRateNotIn(List<String> values) {
            addCriterion("transfer_rate not in", values, "transferRate");
            return (Criteria) this;
        }

        public Criteria andTransferRateBetween(String value1, String value2) {
            addCriterion("transfer_rate between", value1, value2, "transferRate");
            return (Criteria) this;
        }

        public Criteria andTransferRateNotBetween(String value1, String value2) {
            addCriterion("transfer_rate not between", value1, value2, "transferRate");
            return (Criteria) this;
        }

        public Criteria andAverageStopSpacingIsNull() {
            addCriterion("average_stop_spacing is null");
            return (Criteria) this;
        }

        public Criteria andAverageStopSpacingIsNotNull() {
            addCriterion("average_stop_spacing is not null");
            return (Criteria) this;
        }

        public Criteria andAverageStopSpacingEqualTo(String value) {
            addCriterion("average_stop_spacing =", value, "averageStopSpacing");
            return (Criteria) this;
        }

        public Criteria andAverageStopSpacingNotEqualTo(String value) {
            addCriterion("average_stop_spacing <>", value, "averageStopSpacing");
            return (Criteria) this;
        }

        public Criteria andAverageStopSpacingGreaterThan(String value) {
            addCriterion("average_stop_spacing >", value, "averageStopSpacing");
            return (Criteria) this;
        }

        public Criteria andAverageStopSpacingGreaterThanOrEqualTo(String value) {
            addCriterion("average_stop_spacing >=", value, "averageStopSpacing");
            return (Criteria) this;
        }

        public Criteria andAverageStopSpacingLessThan(String value) {
            addCriterion("average_stop_spacing <", value, "averageStopSpacing");
            return (Criteria) this;
        }

        public Criteria andAverageStopSpacingLessThanOrEqualTo(String value) {
            addCriterion("average_stop_spacing <=", value, "averageStopSpacing");
            return (Criteria) this;
        }

        public Criteria andAverageStopSpacingLike(String value) {
            addCriterion("average_stop_spacing like", value, "averageStopSpacing");
            return (Criteria) this;
        }

        public Criteria andAverageStopSpacingNotLike(String value) {
            addCriterion("average_stop_spacing not like", value, "averageStopSpacing");
            return (Criteria) this;
        }

        public Criteria andAverageStopSpacingIn(List<String> values) {
            addCriterion("average_stop_spacing in", values, "averageStopSpacing");
            return (Criteria) this;
        }

        public Criteria andAverageStopSpacingNotIn(List<String> values) {
            addCriterion("average_stop_spacing not in", values, "averageStopSpacing");
            return (Criteria) this;
        }

        public Criteria andAverageStopSpacingBetween(String value1, String value2) {
            addCriterion("average_stop_spacing between", value1, value2, "averageStopSpacing");
            return (Criteria) this;
        }

        public Criteria andAverageStopSpacingNotBetween(String value1, String value2) {
            addCriterion("average_stop_spacing not between", value1, value2, "averageStopSpacing");
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