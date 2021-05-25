package com.pub.service.impl;

import com.pub.dao.PtsRapidAccurateMapper;
import com.pub.dao.PtsUserMapper;
import com.pub.entity.PtsRapidAccurate;
import com.pub.service.PtsRapidAccurateService;
import com.pub.utils.UuidUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PtsRapidAccurateServiceImpl implements PtsRapidAccurateService {
    @Autowired
    private PtsRapidAccurateMapper ptsRapidAccurateMapper;
    @Autowired
    private PtsUserMapper ptsUserMapper;
    /**
     * 获取信息
     * @return
     */
    @Override
    public List<PtsRapidAccurate> getPtsRapidAccurate() {
        List<PtsRapidAccurate> list = ptsRapidAccurateMapper.getPtsRapidAccurate();
        if(list != null && list.size() != 0){
            List<PtsRapidAccurate> pra = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                PtsRapidAccurate p = list.get(i);
                PtsRapidAccurate pe = new PtsRapidAccurate();
                pe.setId(p.getId());
                pe.setWireMeshDensity(p.getWireMeshDensity());
                pe.setBusAccessibility(p.getBusAccessibility());
                pe.setTravelTimeByBus(p.getTravelTimeByBus());
                pe.setSiteCoverage(p.getSiteCoverage());
                pe.setRunningSpeed(p.getRunningSpeed());
                pe.setAccuracyRate(p.getAccuracyRate());
                String userId = p.getUserId();
                String name = ptsUserMapper.getUserNameById(userId);
                pe.setUserId(name);
                Date date = p.getFillTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String time = sdf.format(date);
                pe.setRemark(time);
                pra.add(pe);
            }
            for (int i = 0; i < pra.size(); i++) {
                PtsRapidAccurate p = pra.get(i);
                p.setNum(pra.size());
            }
            return pra;
        }
        return null;
    }

    /**
     * 添加信息
     * @param uid
     * @param wireMeshDensity
     * @param busAccessibility
     * @param travelTimeByBus
     * @param siteCoverage
     * @param runningSpeed
     * @param accuracyRate
     * @return
     */
    @Override
    public int addPtsRapidAccurate(String uid, String wireMeshDensity, String busAccessibility, String travelTimeByBus, String siteCoverage, String runningSpeed, String accuracyRate) {
        if(uid == null){
            return -2;
        }
        PtsRapidAccurate p = ptsRapidAccurateMapper.getRapidByUserId(uid);
        if(p != null){
            return -1;
        }
        PtsRapidAccurate pra = new PtsRapidAccurate();
        pra.setId(UuidUtils.getUUID());
        pra.setWireMeshDensity(wireMeshDensity);
        pra.setBusAccessibility(busAccessibility);
        pra.setTravelTimeByBus(travelTimeByBus);
        pra.setSiteCoverage(siteCoverage);
        pra.setRunningSpeed(runningSpeed);
        pra.setAccuracyRate(accuracyRate);
        pra.setUserId(uid);
        pra.setFillTime(new Date());
        return ptsRapidAccurateMapper.insert(pra);
    }
}
