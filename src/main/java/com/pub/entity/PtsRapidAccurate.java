package com.pub.entity;

import java.util.Date;

public class PtsRapidAccurate {
    private String id;

    private String wireMeshDensity;

    private String busAccessibility;

    private String travelTimeByBus;

    private String siteCoverage;

    private String runningSpeed;

    private String accuracyRate;

    private String userId;

    private Date fillTime;

    private String remark;

    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWireMeshDensity() {
        return wireMeshDensity;
    }

    public void setWireMeshDensity(String wireMeshDensity) {
        this.wireMeshDensity = wireMeshDensity == null ? null : wireMeshDensity.trim();
    }

    public String getBusAccessibility() {
        return busAccessibility;
    }

    public void setBusAccessibility(String busAccessibility) {
        this.busAccessibility = busAccessibility == null ? null : busAccessibility.trim();
    }

    public String getTravelTimeByBus() {
        return travelTimeByBus;
    }

    public void setTravelTimeByBus(String travelTimeByBus) {
        this.travelTimeByBus = travelTimeByBus == null ? null : travelTimeByBus.trim();
    }

    public String getSiteCoverage() {
        return siteCoverage;
    }

    public void setSiteCoverage(String siteCoverage) {
        this.siteCoverage = siteCoverage == null ? null : siteCoverage.trim();
    }

    public String getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(String runningSpeed) {
        this.runningSpeed = runningSpeed == null ? null : runningSpeed.trim();
    }

    public String getAccuracyRate() {
        return accuracyRate;
    }

    public void setAccuracyRate(String accuracyRate) {
        this.accuracyRate = accuracyRate == null ? null : accuracyRate.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getFillTime() {
        return fillTime;
    }

    public void setFillTime(Date fillTime) {
        this.fillTime = fillTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}