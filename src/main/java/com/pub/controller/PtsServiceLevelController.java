package com.pub.controller;

import com.pub.dao.PtsUserMapper;
import com.pub.entity.PtsServiceLevel;
import com.pub.service.PtsServiceLevelService;
import com.pub.utils.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class PtsServiceLevelController {
    @Autowired
    private PtsServiceLevelService ptsServiceLevelService;
    @Autowired
    private PtsUserMapper ptsUserMapper;

    @ResponseBody
    @RequestMapping(value = "/getServiceLevels", method = RequestMethod.POST)
    public ResultSet getServiceLevels(){
        List<PtsServiceLevel> levels = ptsServiceLevelService.getServiceLevels();
        List<PtsServiceLevel> l = new ArrayList<>();
        if(levels != null && levels.size()!= 0){
            for (int i = 0; i < levels.size(); i++) {
                PtsServiceLevel p = levels.get(i);
                PtsServiceLevel ps = new PtsServiceLevel();
                ps.setId(p.getId());
                ps.setCountTime(p.getCountTime());
                ps.setUserId(ptsUserMapper.getUserNameById(p.getUserId()));
                Date date = p.getCountTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String time = sdf.format(date);
                ps.setRemark(time);
                ps.setLevel(p.getLevel());
                l.add(ps);
            }
            for (int i = 0; i < l.size(); i++) {
                PtsServiceLevel p = l.get(i);
                p.setNum(l.size());
            }
            return new ResultSet().setCode(HttpStatus.OK.value()).setData(l).setMsg("查询成功");
        }
        return new ResultSet().setCode(HttpStatus.NOT_ACCEPTABLE.value()).setData(null).setMsg("查询失败");
    }

}
