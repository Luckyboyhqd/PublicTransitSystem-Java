package com.pub.entity;

import java.util.Date;

public class PtsComfortEconmy {
    private String id;

    private String comfort;

    private String peakLoadCondition;

    private String averageFullLoadOperation;

    private String averagePassengerFares;

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

    public String getComfort() {
        return comfort;
    }

    public void setComfort(String comfort) {
        this.comfort = comfort == null ? null : comfort.trim();
    }

    public String getPeakLoadCondition() {
        return peakLoadCondition;
    }

    public void setPeakLoadCondition(String peakLoadCondition) {
        this.peakLoadCondition = peakLoadCondition == null ? null : peakLoadCondition.trim();
    }

    public String getAverageFullLoadOperation() {
        return averageFullLoadOperation;
    }

    public void setAverageFullLoadOperation(String averageFullLoadOperation) {
        this.averageFullLoadOperation = averageFullLoadOperation == null ? null : averageFullLoadOperation.trim();
    }

    public String getAveragePassengerFares() {
        return averagePassengerFares;
    }

    public void setAveragePassengerFares(String averagePassengerFares) {
        this.averagePassengerFares = averagePassengerFares == null ? null : averagePassengerFares.trim();
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