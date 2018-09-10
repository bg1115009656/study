package com.gbai;

import com.gbai.dao.UserMapper;
import com.gbai.entity.User;
import com.gbai.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisplustestApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads() {
        List<Map<String, Object>> users = userMapper.getAllUser();
        System.out.println(users.toString());
    }

}
