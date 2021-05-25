package com.pub.entity;

import java.util.Date;

public class PtsConvenience {
    private String id;

    private String departureInterval;

    private String waitingTime;

    private String transferDistance;

    private String transferRate;

    private String averageStopSpacing;

    private String userId;

    private Date fillTime;

    private String remark;

    private int num;

    private PtsRapidAccurate rapid;

    private PtsComfortEconmy comfort;

    public PtsRapidAccurate getRapid() {
        return rapid;
    }

    public void setRapid(PtsRapidAccurate rapid) {
        this.rapid = rapid;
    }

    public PtsComfortEconmy getComfort() {
        return comfort;
    }

    public void setComfort(PtsComfortEconmy comfort) {
        this.comfort = comfort;
    }

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

    public String getDepartureInterval() {
        return departureInterval;
    }

    public void setDepartureInterval(String departureInterval) {
        this.departureInterval = departureInterval == null ? null : departureInterval.trim();
    }

    public String getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(String waitingTime) {
        this.waitingTime = waitingTime == null ? null : waitingTime.trim();
    }

    public String getTransferDistance() {
        return transferDistance;
    }

    public void setTransferDistance(String transferDistance) {
        this.transferDistance = transferDistance == null ? null : transferDistance.trim();
    }

    public String getTransferRate() {
        return transferRate;
    }

    public void setTransferRate(String transferRate) {
        this.transferRate = transferRate == null ? null : transferRate.trim();
    }

    public String getAverageStopSpacing() {
        return averageStopSpacing;
    }

    public void setAverageStopSpacing(String averageStopSpacing) {
        this.averageStopSpacing = averageStopSpacing == null ? null : averageStopSpacing.trim();
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