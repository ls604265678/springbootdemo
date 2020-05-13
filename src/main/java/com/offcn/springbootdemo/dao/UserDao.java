package com.offcn.springbootdemo.dao;

import com.offcn.springbootdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Song Ziliang
 * @email s13008212144    @163.com
 * @date 2020/5/10
 */
//@Mapper
public interface UserDao {
    public void save(User user);

    public void update(User user);

    public void delete(Long id);
    //@Select("select * from tb_user")
    public List<User> getAll();

    public User findOne(Long id);
}
