package com.gbai;

import com.gbai.mapper.UserMapper;
import com.gbai.modle.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads() {

        List<User> users = userMapper.selectAllUser();
        System.out.println(users.toString());
    }

    @Test
    public void test() {
        User user = new User();
        user.setUsername("gbai");
        user.setPassword("123456");
        int flag = userMapper.insert(user);
        System.out.println(flag);
    }

}
