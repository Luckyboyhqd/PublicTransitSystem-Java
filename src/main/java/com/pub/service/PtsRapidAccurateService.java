package com.pub.service;

import com.pub.entity.PtsRapidAccurate;

import java.util.List;

public interface PtsRapidAccurateService {

    //查看信息
    List<PtsRapidAccurate> getPtsRapidAccurate();

    //添加信息
    int addPtsRapidAccurate(String uid, String wireMeshDensity, String busAccessibility, String travelTimeByBus, String siteCoverage, String runningSpeed, String accuracyRate);
}
