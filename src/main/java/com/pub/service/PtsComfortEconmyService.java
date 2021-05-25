package com.pub.service;

import com.pub.entity.PtsComfortEconmy;

import java.util.List;

public interface PtsComfortEconmyService {

    //查询列表
    List<PtsComfortEconmy> getComfortEconmy();

    //插入数据
    int addPtsComfortEconmy(String uid, String comfort, String peakLoadCondition, String averageFullLoadOperation, String averagePassengerFares);
}
