package com.gbai;

import com.gbai.mapper.UsernameMapper;
import com.gbai.modle.Username;
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
    UsernameMapper usernameMapper;

    @Test
    public void contextLoads() {

        List<Username> usernames = usernameMapper.selectAllUser();
        System.out.println(usernames.toString());
    }

    @Test
    public void test() {
        Username username = new Username();
        username.setUsername("gbai");
        username.setPassword("123456");
        int flag = usernameMapper.insert(username);
        System.out.println(flag);
    }

}
