package com.pub.controller;

import com.pub.entity.PtsComment;
import com.pub.service.PtsCommentService;
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
public class PtsCommentController {
    @Autowired
    private PtsCommentService ptsCommentService;

    /**
     * 查询评论
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getComments", method = RequestMethod.POST)
    public ResultSet getComments(){
        List<PtsComment> list = ptsCommentService.getComments();
        List<PtsComment> l = new ArrayList<>();
        if(list != null && list.size()!= 0){
            for (int i = 0; i < list.size(); i++) {
                PtsComment t = list.get(i);
                Date date = t.getCommentTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String time = sdf.format(date);
                t.setNum(list.size());
                t.setRemark(time);
                l.add(t);
            }
            return new ResultSet().setCode(HttpStatus.OK.value()).setData(l).setMsg("查询成功");
        }
        return new ResultSet().setCode(HttpStatus.NOT_ACCEPTABLE.value()).setData(null).setMsg("查询失败");
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delComment", method = RequestMethod.POST)
    public int delComment(String id){
        int temp = ptsCommentService.delComment(id);
        return temp;
    }

    /**
     * 批量删除
     * @param idList
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delAll", method = RequestMethod.POST)
    public int delAll(String idList){
        //此处前端传list后台无法 出现异常 Failed to instantiate [java.util.List]: Specified class is an interface
        int temp = ptsCommentService.batchDel(idList);
        return temp;
    }

    /**
     * 添加信息
     * @param uid
     * @param comment
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addComment", method = RequestMethod.POST)
    public ResultSet addComment(String uid, String comment){
        int temp = ptsCommentService.addComment(uid, comment);
        if(temp == 1){
            return new ResultSet().setCode(HttpStatus.OK.value()).setData(temp).setMsg("成功");
        }else if(temp == -1){
            return new ResultSet().setCode(HttpStatus.UNAUTHORIZED.value()).setData(-1).setMsg("评论已经存在");
        }
        return new ResultSet().setCode(HttpStatus.NOT_ACCEPTABLE.value()).setData(0).setMsg("失败");
    }

}
