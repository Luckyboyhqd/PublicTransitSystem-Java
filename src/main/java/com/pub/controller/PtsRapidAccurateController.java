package com.pub.controller;

import com.pub.entity.PtsRapidAccurate;
import com.pub.service.PtsRapidAccurateService;
import com.pub.utils.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PtsRapidAccurateController {
    @Autowired
    private PtsRapidAccurateService ptsRapidAccurateService;

    /**
     * 获取调查信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getPtsRapidAccurate", method = RequestMethod.POST)
    public ResultSet getPtsRapidAccurate(){
        List<PtsRapidAccurate> list = ptsRapidAccurateService.getPtsRapidAccurate();
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
    @RequestMapping(value = "/addPtsRapidAccurate", method = RequestMethod.POST)
    public ResultSet addPtsRapidAccurate(String uid, String wireMeshDensity, String busAccessibility, String travelTimeByBus, String siteCoverage, String runningSpeed, String accuracyRate){
        int temp = ptsRapidAccurateService.addPtsRapidAccurate(uid, wireMeshDensity, busAccessibility, travelTimeByBus, siteCoverage, runningSpeed, accuracyRate);
        if(temp == 1){
            return new ResultSet().setCode(HttpStatus.OK.value()).setData(temp).setMsg("成功");
        }else if(temp == -1){
            return new ResultSet().setCode(HttpStatus.UNAUTHORIZED.value()).setData(-1).setMsg("用户已经存在");
        }
        return new ResultSet().setCode(HttpStatus.NOT_ACCEPTABLE.value()).setData(0).setMsg("失败");
    }

}
