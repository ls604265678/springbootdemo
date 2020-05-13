package com.offcn.springbootdemo.controller;

import com.offcn.springbootdemo.pojo.User;
import com.offcn.springbootdemo.service.TbUserService;
import com.offcn.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Song Ziliang
 * @email s13008212144    @163.com
 * @date 2020/5/10
 */
@RestController
@RequestMapping("/users")
public class UserControllerDb {
    @Autowired
    TbUserService userService;
    /***
     * 获取全部用户信息
     * @return
     */
    @GetMapping("/")
    public List<User> getUserList(){
        return userService.getUserList();
    }

    /***
     * 新增用户
     * @param user
     * @return
     */
    @PostMapping("/")
    public String createUser(@RequestBody User user) {
        userService.createUser(user);
        return "success";
    }

    /***
     * 获取指定id用户信息
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public User getUser(@PathVariable("id")Long id) {

        return userService.getUser(id);
    }
    /**
     * 更新指定id用户信息
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/{id}")
    public String updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        userService.updateUser(id, user);
        return "success";
    }

    /***
     * 删除指定id用户
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long id) {

        userService.deleteUser(id);
        return "success";

    }
}
