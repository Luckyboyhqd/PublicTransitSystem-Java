package com.pub.service.impl;

import com.pub.dao.PtsConvenienceMapper;
import com.pub.dao.PtsUserMapper;
import com.pub.entity.PtsConvenience;
import com.pub.service.PtsConvenienceService;
import com.pub.utils.UuidUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PtsConvenienceServiceImpl implements PtsConvenienceService {
    @Autowired
    private PtsConvenienceMapper ptsConvenienceMapper;
    @Autowired
    private PtsUserMapper ptsUserMapper;

    /**
     * 查询便捷性
     * @return
     */
    @Override
    public List<PtsConvenience> getPtsConveniences() {
        List<PtsConvenience> list = ptsConvenienceMapper.getPtsConveniences();
        if(list != null && list.size() != 0){
            List<PtsConvenience> p = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                PtsConvenience pc = list.get(i);
                PtsConvenience pce = new PtsConvenience();
                pce.setId(pc.getId());
                pce.setDepartureInterval(pc.getDepartureInterval());
                pce.setWaitingTime(pc.getWaitingTime());
                pce.setTransferDistance(pc.getTransferDistance());
                pce.setTransferRate(pc.getTransferRate());
                pce.setAverageStopSpacing(pc.getAverageStopSpacing());
                String userId = pc.getUserId();
                //获取用户名
                String name = ptsUserMapper.getUserNameById(userId);
                pce.setUserId(name);
                Date date = pc.getFillTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String time = sdf.format(date);
                pce.setRemark(time);
                p.add(pce);
            }
            for (int i = 0; i < p.size(); i++) {
                PtsConvenience pp = p.get(i);
                pp.setNum(p.size());
            }
            return p;
        }
        return null;
    }

    /**
     * 添加调查信息
     * @param uid
     * @param departureInterval
     * @param waitingTime
     * @param transferDistance
     * @param transferRate
     * @param averageStopSpacing
     * @return
     */
    @Override
    public int addConvenience(String uid, String departureInterval, String waitingTime, String transferDistance, String transferRate, String averageStopSpacing) {
        if(uid == null){
            return -2;
        }
        PtsConvenience p = ptsConvenienceMapper.getConvenienceByUserId(uid);
        if(p != null){
            return -1;//记录已经存在
        }
        PtsConvenience pc = new PtsConvenience();
        pc.setId(UuidUtils.getUUID());
        pc.setDepartureInterval(departureInterval);
        pc.setWaitingTime(waitingTime);
        pc.setTransferDistance(transferDistance);
        pc.setTransferRate(transferRate);
        pc.setAverageStopSpacing(averageStopSpacing);
        pc.setUserId(uid);
        pc.setFillTime(new Date());
        return ptsConvenienceMapper.insert(pc);
    }
}
