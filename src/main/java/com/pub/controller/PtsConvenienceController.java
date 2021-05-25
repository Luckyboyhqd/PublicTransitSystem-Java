package com.pub.controller;

import com.pub.entity.PtsConvenience;
import com.pub.service.PtsConvenienceService;
import com.pub.utils.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PtsConvenienceController {
    @Autowired
    private PtsConvenienceService ptsConvenienceService;

    /**
     * 获取调查信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getPtsConveniences", method = RequestMethod.POST)
    public ResultSet getPtsConveniences(){
        List<PtsConvenience> list = ptsConvenienceService.getPtsConveniences();
        if(list != null && list.size()!= 0){
            return new ResultSet().setCode(HttpStatus.OK.value()).setData(list).setMsg("查询成功");
        }
        return new ResultSet().setCode(HttpStatus.NOT_ACCEPTABLE.value()).setData(null).setMsg("查询失败");
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
    @ResponseBody
    @RequestMapping(value = "/addConvenience", method = RequestMethod.POST)
    public ResultSet addConvenience(String uid, String departureInterval, String waitingTime, String transferDistance, String transferRate, String averageStopSpacing){
        int temp = ptsConvenienceService.addConvenience(uid, departureInterval, waitingTime, transferDistance, transferRate, averageStopSpacing);
        if(temp == 1){
            return new ResultSet().setCode(HttpStatus.OK.value()).setData(temp).setMsg("成功");
        }else if(temp == -1){
            return new ResultSet().setCode(HttpStatus.UNAUTHORIZED.value()).setData(-1).setMsg("用户已经存在");
        }
        return new ResultSet().setCode(HttpStatus.NOT_ACCEPTABLE.value()).setData(0).setMsg("失败");
    }
}
