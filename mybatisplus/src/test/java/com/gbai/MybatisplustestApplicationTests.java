package com.gbai;

import com.gbai.entity.User;
import com.gbai.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisplustestApplicationTests {

    @Test
    public void contextLoads() {
        User user = new User();
        List<User> users = user.selectAll();
        System.out.println(users.toString());
    }

}
