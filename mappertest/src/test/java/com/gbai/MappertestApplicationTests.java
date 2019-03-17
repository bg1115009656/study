package com.gbai;

import com.gbai.bean.User;
import com.gbai.mapper.UserMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MappertestApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Test
    public void contextLoads() {

        User user = userMapper.selectByPrimaryKey(2);
        PageHelper.startPage(1,15);
        List<User> users = userMapper.selectAllList();
        PageInfo<User> pageInfo = new PageInfo(users);
        System.out.println(pageInfo.getList().toString());

    }

    @Test
    public void insertTest() {
        User user = new User();
//        user.setId(5L);
        user.setName("yang");
        user.setNickname("lover");
        int insert = userMapper.saveOrUpdate(user);
        System.out.println(insert);
    }
    @Test
    public void updateTest() {
        User user = new User();
        user.setId(2L);
        user.setName("yangcaocao");
        int i = userMapper.updateByPrimaryKey(user);
        System.out.println(i);
    }
    @Test
    public void deleteTest(){
        User user = new User();
        user.setId(3L);
        userMapper.delete(user);
    }

}
