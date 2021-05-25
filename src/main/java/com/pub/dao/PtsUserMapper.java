package com.pub.dao;

import com.pub.entity.PtsConvenience;
import com.pub.entity.PtsUser;
import com.pub.entity.PtsUserExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PtsUserMapper {
    int countByExample(PtsUserExample example);

    int deleteByExample(PtsUserExample example);

    int insert(PtsUser record);

    int insertSelective(PtsUser record);

    List<PtsUser> selectByExample(PtsUserExample example);

    int updateByExampleSelective(@Param("record") PtsUser record, @Param("example") PtsUserExample example);

    int updateByExample(@Param("record") PtsUser record, @Param("example") PtsUserExample example);

    /**
     * 登录方法
     * @param name
     * @return
     */
    PtsUser gethUserByName(String name);

    int updateTime(@Param("name")String name, @Param("pwd")String pwd, @Param("date")Date date);

    /**
     * 获取用户列表
     * @return
     */
    List<PtsUser> getPtsUsers();

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String id);

    /**
     * 查找用户
     * @param id
     * @return
     */
    PtsUser selectByPrimaryKey(String id);

    /**
     * 更改状态
     * @param id
     * @param newPassword
     * @return
     */
    int updatePasswordById(@Param("id")String id, @Param("newPassword")String newPassword);

    /**
     * 更改状态
     * @param id
     * @param status
     * @return
     */
    int changeStatus(@Param("id")String id, @Param("status")int status);

    /**
     * 获取用户名
     * @param userId
     * @return
     */
    String getUserNameById(String userId);

    /**
     * 查询用户
     * @param uid
     * @return
     */
    PtsUser getUserById(String uid);
}