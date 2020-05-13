package com.offcn.springbootdemo.service.impl;

import com.offcn.springbootdemo.dao.UserDao;
import com.offcn.springbootdemo.pojo.User;
import com.offcn.springbootdemo.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Song Ziliang
 * @email s13008212144    @163.com
 * @date 2020/5/10
 */
@Service
public class TbUserServiceImpl implements TbUserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.getAll();
    }

    @Override
    public void createUser(User user) {
        userDao.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userDao.findOne(id);
    }

    @Override
    public void updateUser(Long id, User user) {
        user.setId(id);
        userDao.update(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.delete(id);
    }
}
