package com.pub.service.impl;

import com.pub.dao.PtsCommentMapper;
import com.pub.dao.PtsUserMapper;
import com.pub.entity.PtsComment;
import com.pub.entity.PtsUser;
import com.pub.service.PtsCommentService;
import com.pub.utils.UuidUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@Service
public class PtsCommentServiceImpl implements PtsCommentService {
    @Autowired
    private PtsCommentMapper ptsCommentMapper;
    @Autowired
    private PtsUserMapper ptsUserMapper;

    /**
     * 查询
     * @return
     */
    @Override
    public List<PtsComment> getComments() {
        return ptsCommentMapper.getComments();
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @Override
    public int delComment(String id) {
        return ptsCommentMapper.deleteByPrimaryKey(id);
    }

    /**
     * 批量删除
     * @param
     * @return
     */
    @Override
    public int batchDel(String ids) {
        ObjectMapper oMapper = new ObjectMapper();
        String[] idList = null;
        try {
            idList = oMapper.readValue(ids, String[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(ids != null && idList.length != 0){
            for (int i = 0; i < idList.length; i++) {
                String id = idList[i];
                try{
                    ptsCommentMapper.deleteByPrimaryKey(id);
                }catch (Exception e){
                    e.printStackTrace();
                    continue;
                }
            }
            return 1;
        }
        return 0;
    }

    /**
     * 添加评论
     * @param uid
     * @param comment
     * @return
     */
    @Override
    public int addComment(String uid, String comment) {
        //查询用户记录
        PtsUser user = ptsUserMapper.getUserById(uid);
        if(user == null){
            return 0;
        }
        //获取用户信息
        String userName = user.getName();
        String email = user.getEmail();
        PtsComment comment1 = ptsCommentMapper.getCommentByNameAndEmail(userName, email);
        if(comment1 != null){
            return -1;
        }
        PtsComment pc = new PtsComment();
        pc.setId(UuidUtils.getUUID());
        pc.setComment(comment);
        pc.setUserName(userName);
        pc.setUserEmail(email);
        pc.setCommentTime(new Date());
        return ptsCommentMapper.insert(pc);
    }
}
