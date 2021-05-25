package com.pub.service;

import com.pub.entity.PtsConvenience;

import java.util.List;

public interface PtsConvenienceService {

    //获取列表
    List<PtsConvenience> getPtsConveniences();

    //添加信息
    int addConvenience(String uid, String departureInterval, String waitingTime, String transferDistance, String transferRate, String averageStopSpacing);
}
