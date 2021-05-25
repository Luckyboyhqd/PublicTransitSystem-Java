package com.pub.service;

import com.pub.entity.PtsUser;

import java.util.List;

public interface PtsUserService {

    //登录用户
    PtsUser getUserByNameAndPassword(String name, String pwd);

    //查询用户列表
    List<PtsUser> getPtsUsers();

    //添加用户
    int addUser(PtsUser user);

    //删除用户
    int delUser(String id);

    //批量删除
    int batchDel(String idList);

    //修改密码
    int changePwd(String id, String old, String nPwd);

    //更改状态
    int changeStatus(String id, int status);
}
