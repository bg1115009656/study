package com.gbai;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
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

    @Test
    public void test(){
        EntityWrapper<User> ew = new EntityWrapper<>();
////        ew.setEntity(new User(1l));
//        ew.where("password is null");
////        ew.orNew("id=1");
////
////        ew.groupBy("id,username");
////        ew.having("username='李四'");
//        ew.in("username","李四");
//        Condition ew = new Condition();
//        ew.in("username","李四").and("password='1'").andNew("password is null").and("id=1");
//        Integer integer = userMapper.selectCount(ew);
        ew.where("username={0}","李四");
        List<Map<String, Object>> users = userMapper.selectMaps(ew);
        System.out.println(ew.getSqlSegment());
        System.out.println(users.toString());
    }



}
