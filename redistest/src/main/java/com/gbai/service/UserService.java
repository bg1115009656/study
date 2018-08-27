package com.gbai.service;

import com.gbai.entity.UserEntity;
import com.gbai.jps.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: redistest
 * @description:
 * @author: gbai
 * @create: 2018-07-19 14:33
 **/
@Service
public class UserService {
    @Autowired
    private UserJPA userJPA;


    @Cacheable(cacheNames = "user.service.all")
    public List<UserEntity> findAll(){
        return userJPA.findAll();
    }
}
