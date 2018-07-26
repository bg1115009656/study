package com.gbai.controller;

import com.gbai.bean.User;
import com.gbai.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;
    @GetMapping("user/{id}")
    public User getUserByid(@PathVariable("id") int id){
        User user = userMapper.selectByPrimaryKey(id);
        System.out.println(user);
        return user;
    }
}
