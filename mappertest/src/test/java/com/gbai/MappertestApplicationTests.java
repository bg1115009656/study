package com.gbai;

import com.gbai.bean.User;
import com.gbai.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MappertestApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Test
    public void contextLoads() {

        User user = userMapper.selectByPrimaryKey(2);
        List<User> users = userMapper.selectAll();
        System.out.println(users.toString());

    }

    @Test
    public void insertTest() {
        User user = new User();
        user.setId(3);
        user.setName("yang");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }
    @Test
    public void updateTest() {
        User user = new User();
        user.setId(2);
        user.setName("yangcaocao");
        int i = userMapper.updateByPrimaryKey(user);
        System.out.println(i);
    }
    @Test
    public void deleteTest(){
        User user = new User();
        user.setId(3);
        userMapper.delete(user);
    }

}
