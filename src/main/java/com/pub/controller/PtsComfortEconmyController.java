package com.pub.controller;

import com.pub.entity.PtsComfortEconmy;
import com.pub.service.PtsComfortEconmyService;
import com.pub.utils.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PtsComfortEconmyController {
    @Autowired
    private PtsComfortEconmyService ptsComfortEconmyService;

    /**
     * 获取调查信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getComfortEconmy", method = RequestMethod.POST)
    public ResultSet getComfortEconmy(){
        List<PtsComfortEconmy> list = ptsComfortEconmyService.getComfortEconmy();
        if(list != null && list.size()!= 0){
            return new ResultSet().setCode(HttpStatus.OK.value()).setData(list).setMsg("查询成功");
        }
        return new ResultSet().setCode(HttpStatus.NOT_ACCEPTABLE.value()).setData(null).setMsg("查询失败");
    }

    /**
     * 添加调查信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addPtsComfortEconmy", method = RequestMethod.POST)
    public ResultSet addPtsComfortEconmy(String uid, String comfort, String peakLoadCondition, String averageFullLoadOperation, String averagePassengerFares){
        int temp = ptsComfortEconmyService.addPtsComfortEconmy(uid, comfort, peakLoadCondition, averageFullLoadOperation, averagePassengerFares);
        if(temp == 1){
            return new ResultSet().setCode(HttpStatus.OK.value()).setData(temp).setMsg("成功");
        }else if(temp == -1){
            return new ResultSet().setCode(HttpStatus.UNAUTHORIZED.value()).setData(-1).setMsg("用户已经存在");
        }
        return new ResultSet().setCode(HttpStatus.NOT_ACCEPTABLE.value()).setData(0).setMsg("失败");
    }


}
