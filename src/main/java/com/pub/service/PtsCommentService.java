package com.pub.service;

import com.pub.entity.PtsComment;

import java.util.List;

public interface PtsCommentService {

    List<PtsComment> getComments();

    int delComment(String id);

    int batchDel(String idList);

    /**
     * 添加评论
     * @param uid
     * @param comment
     * @return
     */
    int addComment(String uid, String comment);
}
