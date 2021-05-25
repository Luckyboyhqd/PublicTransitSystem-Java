package com.pub.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PtsRapidAccurateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PtsRapidAccurateExample() {
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

        public Criteria andWireMeshDensityIsNull() {
            addCriterion("wire_mesh_density is null");
            return (Criteria) this;
        }

        public Criteria andWireMeshDensityIsNotNull() {
            addCriterion("wire_mesh_density is not null");
            return (Criteria) this;
        }

        public Criteria andWireMeshDensityEqualTo(String value) {
            addCriterion("wire_mesh_density =", value, "wireMeshDensity");
            return (Criteria) this;
        }

        public Criteria andWireMeshDensityNotEqualTo(String value) {
            addCriterion("wire_mesh_density <>", value, "wireMeshDensity");
            return (Criteria) this;
        }

        public Criteria andWireMeshDensityGreaterThan(String value) {
            addCriterion("wire_mesh_density >", value, "wireMeshDensity");
            return (Criteria) this;
        }

        public Criteria andWireMeshDensityGreaterThanOrEqualTo(String value) {
            addCriterion("wire_mesh_density >=", value, "wireMeshDensity");
            return (Criteria) this;
        }

        public Criteria andWireMeshDensityLessThan(String value) {
            addCriterion("wire_mesh_density <", value, "wireMeshDensity");
            return (Criteria) this;
        }

        public Criteria andWireMeshDensityLessThanOrEqualTo(String value) {
            addCriterion("wire_mesh_density <=", value, "wireMeshDensity");
            return (Criteria) this;
        }

        public Criteria andWireMeshDensityLike(String value) {
            addCriterion("wire_mesh_density like", value, "wireMeshDensity");
            return (Criteria) this;
        }

        public Criteria andWireMeshDensityNotLike(String value) {
            addCriterion("wire_mesh_density not like", value, "wireMeshDensity");
            return (Criteria) this;
        }

        public Criteria andWireMeshDensityIn(List<String> values) {
            addCriterion("wire_mesh_density in", values, "wireMeshDensity");
            return (Criteria) this;
        }

        public Criteria andWireMeshDensityNotIn(List<String> values) {
            addCriterion("wire_mesh_density not in", values, "wireMeshDensity");
            return (Criteria) this;
        }

        public Criteria andWireMeshDensityBetween(String value1, String value2) {
            addCriterion("wire_mesh_density between", value1, value2, "wireMeshDensity");
            return (Criteria) this;
        }

        public Criteria andWireMeshDensityNotBetween(String value1, String value2) {
            addCriterion("wire_mesh_density not between", value1, value2, "wireMeshDensity");
            return (Criteria) this;
        }

        public Criteria andBusAccessibilityIsNull() {
            addCriterion("bus_accessibility is null");
            return (Criteria) this;
        }

        public Criteria andBusAccessibilityIsNotNull() {
            addCriterion("bus_accessibility is not null");
            return (Criteria) this;
        }

        public Criteria andBusAccessibilityEqualTo(String value) {
            addCriterion("bus_accessibility =", value, "busAccessibility");
            return (Criteria) this;
        }

        public Criteria andBusAccessibilityNotEqualTo(String value) {
            addCriterion("bus_accessibility <>", value, "busAccessibility");
            return (Criteria) this;
        }

        public Criteria andBusAccessibilityGreaterThan(String value) {
            addCriterion("bus_accessibility >", value, "busAccessibility");
            return (Criteria) this;
        }

        public Criteria andBusAccessibilityGreaterThanOrEqualTo(String value) {
            addCriterion("bus_accessibility >=", value, "busAccessibility");
            return (Criteria) this;
        }

        public Criteria andBusAccessibilityLessThan(String value) {
            addCriterion("bus_accessibility <", value, "busAccessibility");
            return (Criteria) this;
        }

        public Criteria andBusAccessibilityLessThanOrEqualTo(String value) {
            addCriterion("bus_accessibility <=", value, "busAccessibility");
            return (Criteria) this;
        }

        public Criteria andBusAccessibilityLike(String value) {
            addCriterion("bus_accessibility like", value, "busAccessibility");
            return (Criteria) this;
        }

        public Criteria andBusAccessibilityNotLike(String value) {
            addCriterion("bus_accessibility not like", value, "busAccessibility");
            return (Criteria) this;
        }

        public Criteria andBusAccessibilityIn(List<String> values) {
            addCriterion("bus_accessibility in", values, "busAccessibility");
            return (Criteria) this;
        }

        public Criteria andBusAccessibilityNotIn(List<String> values) {
            addCriterion("bus_accessibility not in", values, "busAccessibility");
            return (Criteria) this;
        }

        public Criteria andBusAccessibilityBetween(String value1, String value2) {
            addCriterion("bus_accessibility between", value1, value2, "busAccessibility");
            return (Criteria) this;
        }

        public Criteria andBusAccessibilityNotBetween(String value1, String value2) {
            addCriterion("bus_accessibility not between", value1, value2, "busAccessibility");
            return (Criteria) this;
        }

        public Criteria andTravelTimeByBusIsNull() {
            addCriterion("travel_time_by_bus is null");
            return (Criteria) this;
        }

        public Criteria andTravelTimeByBusIsNotNull() {
            addCriterion("travel_time_by_bus is not null");
            return (Criteria) this;
        }

        public Criteria andTravelTimeByBusEqualTo(String value) {
            addCriterion("travel_time_by_bus =", value, "travelTimeByBus");
            return (Criteria) this;
        }

        public Criteria andTravelTimeByBusNotEqualTo(String value) {
            addCriterion("travel_time_by_bus <>", value, "travelTimeByBus");
            return (Criteria) this;
        }

        public Criteria andTravelTimeByBusGreaterThan(String value) {
            addCriterion("travel_time_by_bus >", value, "travelTimeByBus");
            return (Criteria) this;
        }

        public Criteria andTravelTimeByBusGreaterThanOrEqualTo(String value) {
            addCriterion("travel_time_by_bus >=", value, "travelTimeByBus");
            return (Criteria) this;
        }

        public Criteria andTravelTimeByBusLessThan(String value) {
            addCriterion("travel_time_by_bus <", value, "travelTimeByBus");
            return (Criteria) this;
        }

        public Criteria andTravelTimeByBusLessThanOrEqualTo(String value) {
            addCriterion("travel_time_by_bus <=", value, "travelTimeByBus");
            return (Criteria) this;
        }

        public Criteria andTravelTimeByBusLike(String value) {
            addCriterion("travel_time_by_bus like", value, "travelTimeByBus");
            return (Criteria) this;
        }

        public Criteria andTravelTimeByBusNotLike(String value) {
            addCriterion("travel_time_by_bus not like", value, "travelTimeByBus");
            return (Criteria) this;
        }

        public Criteria andTravelTimeByBusIn(List<String> values) {
            addCriterion("travel_time_by_bus in", values, "travelTimeByBus");
            return (Criteria) this;
        }

        public Criteria andTravelTimeByBusNotIn(List<String> values) {
            addCriterion("travel_time_by_bus not in", values, "travelTimeByBus");
            return (Criteria) this;
        }

        public Criteria andTravelTimeByBusBetween(String value1, String value2) {
            addCriterion("travel_time_by_bus between", value1, value2, "travelTimeByBus");
            return (Criteria) this;
        }

        public Criteria andTravelTimeByBusNotBetween(String value1, String value2) {
            addCriterion("travel_time_by_bus not between", value1, value2, "travelTimeByBus");
            return (Criteria) this;
        }

        public Criteria andSiteCoverageIsNull() {
            addCriterion("site_coverage is null");
            return (Criteria) this;
        }

        public Criteria andSiteCoverageIsNotNull() {
            addCriterion("site_coverage is not null");
            return (Criteria) this;
        }

        public Criteria andSiteCoverageEqualTo(String value) {
            addCriterion("site_coverage =", value, "siteCoverage");
            return (Criteria) this;
        }

        public Criteria andSiteCoverageNotEqualTo(String value) {
            addCriterion("site_coverage <>", value, "siteCoverage");
            return (Criteria) this;
        }

        public Criteria andSiteCoverageGreaterThan(String value) {
            addCriterion("site_coverage >", value, "siteCoverage");
            return (Criteria) this;
        }

        public Criteria andSiteCoverageGreaterThanOrEqualTo(String value) {
            addCriterion("site_coverage >=", value, "siteCoverage");
            return (Criteria) this;
        }

        public Criteria andSiteCoverageLessThan(String value) {
            addCriterion("site_coverage <", value, "siteCoverage");
            return (Criteria) this;
        }

        public Criteria andSiteCoverageLessThanOrEqualTo(String value) {
            addCriterion("site_coverage <=", value, "siteCoverage");
            return (Criteria) this;
        }

        public Criteria andSiteCoverageLike(String value) {
            addCriterion("site_coverage like", value, "siteCoverage");
            return (Criteria) this;
        }

        public Criteria andSiteCoverageNotLike(String value) {
            addCriterion("site_coverage not like", value, "siteCoverage");
            return (Criteria) this;
        }

        public Criteria andSiteCoverageIn(List<String> values) {
            addCriterion("site_coverage in", values, "siteCoverage");
            return (Criteria) this;
        }

        public Criteria andSiteCoverageNotIn(List<String> values) {
            addCriterion("site_coverage not in", values, "siteCoverage");
            return (Criteria) this;
        }

        public Criteria andSiteCoverageBetween(String value1, String value2) {
            addCriterion("site_coverage between", value1, value2, "siteCoverage");
            return (Criteria) this;
        }

        public Criteria andSiteCoverageNotBetween(String value1, String value2) {
            addCriterion("site_coverage not between", value1, value2, "siteCoverage");
            return (Criteria) this;
        }

        public Criteria andRunningSpeedIsNull() {
            addCriterion("running_speed is null");
            return (Criteria) this;
        }

        public Criteria andRunningSpeedIsNotNull() {
            addCriterion("running_speed is not null");
            return (Criteria) this;
        }

        public Criteria andRunningSpeedEqualTo(String value) {
            addCriterion("running_speed =", value, "runningSpeed");
            return (Criteria) this;
        }

        public Criteria andRunningSpeedNotEqualTo(String value) {
            addCriterion("running_speed <>", value, "runningSpeed");
            return (Criteria) this;
        }

        public Criteria andRunningSpeedGreaterThan(String value) {
            addCriterion("running_speed >", value, "runningSpeed");
            return (Criteria) this;
        }

        public Criteria andRunningSpeedGreaterThanOrEqualTo(String value) {
            addCriterion("running_speed >=", value, "runningSpeed");
            return (Criteria) this;
        }

        public Criteria andRunningSpeedLessThan(String value) {
            addCriterion("running_speed <", value, "runningSpeed");
            return (Criteria) this;
        }

        public Criteria andRunningSpeedLessThanOrEqualTo(String value) {
            addCriterion("running_speed <=", value, "runningSpeed");
            return (Criteria) this;
        }

        public Criteria andRunningSpeedLike(String value) {
            addCriterion("running_speed like", value, "runningSpeed");
            return (Criteria) this;
        }

        public Criteria andRunningSpeedNotLike(String value) {
            addCriterion("running_speed not like", value, "runningSpeed");
            return (Criteria) this;
        }

        public Criteria andRunningSpeedIn(List<String> values) {
            addCriterion("running_speed in", values, "runningSpeed");
            return (Criteria) this;
        }

        public Criteria andRunningSpeedNotIn(List<String> values) {
            addCriterion("running_speed not in", values, "runningSpeed");
            return (Criteria) this;
        }

        public Criteria andRunningSpeedBetween(String value1, String value2) {
            addCriterion("running_speed between", value1, value2, "runningSpeed");
            return (Criteria) this;
        }

        public Criteria andRunningSpeedNotBetween(String value1, String value2) {
            addCriterion("running_speed not between", value1, value2, "runningSpeed");
            return (Criteria) this;
        }

        public Criteria andAccuracyRateIsNull() {
            addCriterion("accuracy_rate is null");
            return (Criteria) this;
        }

        public Criteria andAccuracyRateIsNotNull() {
            addCriterion("accuracy_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAccuracyRateEqualTo(String value) {
            addCriterion("accuracy_rate =", value, "accuracyRate");
            return (Criteria) this;
        }

        public Criteria andAccuracyRateNotEqualTo(String value) {
            addCriterion("accuracy_rate <>", value, "accuracyRate");
            return (Criteria) this;
        }

        public Criteria andAccuracyRateGreaterThan(String value) {
            addCriterion("accuracy_rate >", value, "accuracyRate");
            return (Criteria) this;
        }

        public Criteria andAccuracyRateGreaterThanOrEqualTo(String value) {
            addCriterion("accuracy_rate >=", value, "accuracyRate");
            return (Criteria) this;
        }

        public Criteria andAccuracyRateLessThan(String value) {
            addCriterion("accuracy_rate <", value, "accuracyRate");
            return (Criteria) this;
        }

        public Criteria andAccuracyRateLessThanOrEqualTo(String value) {
            addCriterion("accuracy_rate <=", value, "accuracyRate");
            return (Criteria) this;
        }

        public Criteria andAccuracyRateLike(String value) {
            addCriterion("accuracy_rate like", value, "accuracyRate");
            return (Criteria) this;
        }

        public Criteria andAccuracyRateNotLike(String value) {
            addCriterion("accuracy_rate not like", value, "accuracyRate");
            return (Criteria) this;
        }

        public Criteria andAccuracyRateIn(List<String> values) {
            addCriterion("accuracy_rate in", values, "accuracyRate");
            return (Criteria) this;
        }

        public Criteria andAccuracyRateNotIn(List<String> values) {
            addCriterion("accuracy_rate not in", values, "accuracyRate");
            return (Criteria) this;
        }

        public Criteria andAccuracyRateBetween(String value1, String value2) {
            addCriterion("accuracy_rate between", value1, value2, "accuracyRate");
            return (Criteria) this;
        }

        public Criteria andAccuracyRateNotBetween(String value1, String value2) {
            addCriterion("accuracy_rate not between", value1, value2, "accuracyRate");
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