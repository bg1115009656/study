package com.gbai;

import com.gbai.dao.test.UserMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * @program: study
 * @description:
 * @author: gbai
 * @create: 2018-09-13 17:51
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {
    @Autowired
    UserMapper userMapper;

    @org.junit.Test
    public void contextLoads() {
        List<Map<String, Object>> users = userMapper.getAllUser();
        System.out.println(users.toString());
    }
}
