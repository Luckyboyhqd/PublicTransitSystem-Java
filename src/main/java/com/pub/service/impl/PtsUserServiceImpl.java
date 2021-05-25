package com.pub.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pub.dao.PtsUserMapper;
import com.pub.entity.PtsUser;
import com.pub.service.PtsUserService;
import com.pub.utils.UuidUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class PtsUserServiceImpl implements PtsUserService {
    @Autowired
    private PtsUserMapper ptsUserMapper;
    /**
     * 登录验证
     * @param name
     * @param password
     * @return
     */
    @Override
    public PtsUser getUserByNameAndPassword(String name, String password) {
        PtsUser users = ptsUserMapper.gethUserByName(name);
        String pwd = MD5Util(name, password);
        if(users != null){
            //将查询出来的密码和前端传过来的密码进行验证
            if(users.getPassword().equals(pwd)){
                //登录成功 将当前登录时间录入
                ptsUserMapper.updateTime(name, pwd, new Date());
                return users;
            }
        }
        return null;
    }

    /**
     * 查询用户列表
     * @return
     */
    @Override
    public List<PtsUser> getPtsUsers() {
        List<PtsUser> user = ptsUserMapper.getPtsUsers();
        if(user != null && user.size() != 0){
            for (int i = 0; i < user.size(); i++) {
                PtsUser u = user.get(i);
                u.setRemark(String.valueOf(user.size()));
                Date date = u.getRecentOpertionTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String time = sdf.format(date);
                u.setPassword(time);
            }
            return user;
        }
        return null;
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @Override
    public int addUser(PtsUser user) {
        String name = user.getName();
        PtsUser u = ptsUserMapper.gethUserByName(name);
        if(u != null){
            return -1;//用户已经存在
        }
        String password = MD5Util(name, user.getPassword());
        user.setId(UuidUtils.getUUID());
        user.setPassword(password);
        user.setCreateTime(new Date());
        user.setRecentOpertionTime(new Date());
        user.setStatus(1);
        return ptsUserMapper.insert(user);
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @Override
    public int delUser(String id) {
        return ptsUserMapper.deleteByPrimaryKey(id);
    }

    /**
     * 批量删除用户
     * @param ids
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
                    ptsUserMapper.deleteByPrimaryKey(id);
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
     * 修改密码
     * @param id
     * @param old
     * @param nPwd
     * @return
     */
    @Override
    public int changePwd(String id, String old, String nPwd) {
        PtsUser user = ptsUserMapper.selectByPrimaryKey(id);
        if(user != null){
            String name = user.getName();
            String pwd = MD5Util(name,old);
            if(pwd.equals(user.getPassword())){
                String newPassword = MD5Util(name,nPwd);
                return ptsUserMapper.updatePasswordById(id,newPassword);
            }
            return 0;
        }
        return 0;
    }

    /**
     * 更改状态
     * @param id
     * @param status
     * @return
     */
    @Override
    public int changeStatus(String id, int status) {
        return ptsUserMapper.changeStatus(id, status);
    }

    /**
     * MD5加密
     * @param name
     * @param password
     * @return
     */
    public static String MD5Util(String name, String password){
        String hashAlgorithmName = "MD5";// 加密方法
        int hashIterations = 1;// 加密次数
        ByteSource credentialsSalt = ByteSource.Util.bytes(name);// 加盐
        Object obj = new SimpleHash(hashAlgorithmName, password, credentialsSalt, hashIterations);
        String pwd = obj.toString();//加密后密码
        return pwd;
    }

}
