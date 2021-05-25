package com.pub.service.impl;

import com.pub.dao.PtsComfortEconmyMapper;
import com.pub.dao.PtsUserMapper;
import com.pub.entity.PtsComfortEconmy;
import com.pub.service.PtsComfortEconmyService;
import com.pub.utils.UuidUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PtsComfortEconmyServiceImpl implements PtsComfortEconmyService {
    @Autowired
    private PtsComfortEconmyMapper ptsComfortEconmyMapper;
    @Autowired
    private PtsUserMapper ptsUserMapper;

    /**
     * 查询
     * @return
     */
    @Override
    public List<PtsComfortEconmy> getComfortEconmy() {
        List<PtsComfortEconmy> list = ptsComfortEconmyMapper.getComfortEconmy();
        if(list != null && list.size() != 0){
            List<PtsComfortEconmy> p = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                PtsComfortEconmy pc = list.get(i);
                PtsComfortEconmy pce = new PtsComfortEconmy();
                pce.setId(pc.getId());
                pce.setComfort(pc.getComfort());
                pce.setPeakLoadCondition(pc.getPeakLoadCondition());
                pce.setAverageFullLoadOperation(pc.getAverageFullLoadOperation());
                pce.setAveragePassengerFares(pc.getAveragePassengerFares());
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
                PtsComfortEconmy pp = p.get(i);
                pp.setNum(p.size());
            }
            return p;
        }
        return null;
    }

    /**
     * 插入
     * @param uid
     * @param comfort
     * @param peakLoadCondition
     * @param averageFullLoadOperation
     * @param averagePassengerFares
     * @return
     */
    @Override
    public int addPtsComfortEconmy(String uid, String comfort, String peakLoadCondition, String averageFullLoadOperation, String averagePassengerFares) {
        if(uid == null){
            return -2;
        }
        PtsComfortEconmy p = ptsComfortEconmyMapper.getComfortEconmyByUserId(uid);
        if(p != null){
            return -1;//记录已经存在
        }
        PtsComfortEconmy pc = new PtsComfortEconmy();
        pc.setId(UuidUtils.getUUID());
        pc.setComfort(comfort);
        pc.setPeakLoadCondition(peakLoadCondition);
        pc.setAveragePassengerFares(averagePassengerFares);
        pc.setAverageFullLoadOperation(averageFullLoadOperation);
        pc.setUserId(uid);
        pc.setFillTime(new Date());
        return ptsComfortEconmyMapper.insert(pc);
    }
}
