package com.pub.service.impl;

import com.pub.dao.PtsConvenienceMapper;
import com.pub.dao.PtsServiceLevelMapper;
import com.pub.entity.PtsConvenience;
import com.pub.entity.PtsServiceLevel;
import com.pub.service.PtsServiceLevelService;
import com.pub.utils.UuidUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PtsServiceLevelServiceImpl implements PtsServiceLevelService {
    @Autowired
    private PtsServiceLevelMapper ptsServiceLevelMapper;
    @Autowired
    private PtsConvenienceMapper ptsConvenienceMapper;

    @Override
    public List<PtsServiceLevel> getServiceLevels() {
        List<PtsConvenience> list = ptsConvenienceMapper.getAllAttribute();
        if(list != null && list.size() != 0){
            List<PtsServiceLevel> level = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                int wellNumber = 0;
                PtsConvenience p = list.get(i);
                String departureInterval = p.getDepartureInterval();
                if(departureInterval.equals("良好")){
                    wellNumber += 1;
                }
                String waitingTime = p.getWaitingTime();
                if(waitingTime.equals("良好")){
                    wellNumber += 1;
                }
                String transferDistance = p.getTransferDistance();
                if(transferDistance.equals("良好")){
                    wellNumber += 1;
                }
                String transferRate = p.getTransferRate();
                if(transferRate.equals("良好")){
                    wellNumber += 1;
                }
                String averageStopSpacing = p.getAverageStopSpacing();
                if(averageStopSpacing.equals("良好")){
                    wellNumber += 1;
                }
                String wireMeshDensity = p.getRapid().getWireMeshDensity();
                if(wireMeshDensity.equals("良好")){
                    wellNumber += 1;
                }
                String busAccessibility = p.getRapid().getBusAccessibility();
                if(busAccessibility.equals("良好")){
                    wellNumber += 1;
                }
                String travelTimeByBus = p.getRapid().getTravelTimeByBus();
                if(travelTimeByBus.equals("良好")){
                    wellNumber += 1;
                }
                String siteCoverage = p.getRapid().getSiteCoverage();
                if(siteCoverage.equals("良好")){
                    wellNumber += 1;
                }
                String runningSpeed = p.getRapid().getRunningSpeed();
                if(runningSpeed.equals("良好")){
                    wellNumber += 1;
                }
                String accuracyRate = p.getRapid().getAccuracyRate();
                if(accuracyRate.equals("良好")){
                    wellNumber += 1;
                }
                String comfort = p.getComfort().getComfort();
                if(comfort.equals("良好")){
                    wellNumber += 1;
                }
                String peakLoadCondition = p.getComfort().getPeakLoadCondition();
                if(peakLoadCondition.equals("良好")){
                    wellNumber += 1;
                }
                String averageFullLoadOperation = p.getComfort().getAverageFullLoadOperation();
                if(averageFullLoadOperation.equals("良好")){
                    wellNumber += 1;
                }
                String averagePassengerFares = p.getComfort().getAveragePassengerFares();
                if(averagePassengerFares.equals("良好")){
                    wellNumber += 1;
                }
                String userId = p.getComfort().getUserId();
                //查询是否已经存在
                PtsServiceLevel s = ptsServiceLevelMapper.getServiceLevelByUserId(userId);
                if(s != null){
                    level.add(s);
                }else{
                    PtsServiceLevel l = new PtsServiceLevel();
                    l.setId(UuidUtils.getUUID());
                    l.setUserId(userId);
                    l.setCountTime(new Date());
                    double aa = wellNumber / 15.0;
                    String n = String.format("%.2f", aa);
                    BigDecimal b = new BigDecimal(n);
                    l.setLevel(b);
                    ptsServiceLevelMapper.insert(l);
                    level.add(l);
                }
            }
            return level;
        }
        return null;
    }


}
