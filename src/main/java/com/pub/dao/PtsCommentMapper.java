package com.pub.dao;

import com.pub.entity.PtsComment;
import com.pub.entity.PtsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PtsCommentMapper {
    int countByExample(PtsCommentExample example);

    int deleteByExample(PtsCommentExample example);

    int deleteByPrimaryKey(String id);

    int insert(PtsComment record);

    int insertSelective(PtsComment record);

    List<PtsComment> selectByExample(PtsCommentExample example);

    PtsComment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PtsComment record, @Param("example") PtsCommentExample example);

    int updateByExample(@Param("record") PtsComment record, @Param("example") PtsCommentExample example);

    int updateByPrimaryKeySelective(PtsComment record);

    int updateByPrimaryKey(PtsComment record);

    /**
     * 查询评论
     * @return
     */
    List<PtsComment> getComments();

    /**
     * 查看是否存在记录
     * @param userName
     * @param email
     * @return
     */
    PtsComment getCommentByNameAndEmail(@Param("userName")String userName, @Param("email")String email);
}