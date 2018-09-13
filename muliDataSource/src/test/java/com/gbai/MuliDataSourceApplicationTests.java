package com.gbai;

import com.gbai.mapper.book.BookMapper;
import com.gbai.mapper.test.UserMapper;
import com.gbai.modle.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MuliDataSourceApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Autowired
    BookMapper bookMapper;

    @Test
    public void contextLoads() {

        List<User> users = userMapper.selectAllUser();
        List<User> book = bookMapper.selectAllBook();
        System.out.println(users.toString());
        System.out.println(book.toString());
    }

    @Test
    public void test() {

    }

}
