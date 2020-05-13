package com.offcn.springbootdemo.service;

import com.offcn.springbootdemo.pojo.User;

import java.util.List;

/**
 * @author Song Ziliang
 * @email s13008212144    @163.com
 * @date 2020/5/10
 */
public interface TbUserService {
    //获取全部用户数据
    public List<User> getUserList();
    //新增用户数据
    public void createUser(User user);
    //获取指定id用户信息
    public User getUser(Long id);
    //更新指定id用户信息
    public void updateUser(Long id, User user);
    //删除指定id用户
    public void deleteUser(Long id);
}
