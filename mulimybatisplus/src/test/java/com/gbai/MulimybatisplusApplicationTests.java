package com.gbai;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.gbai.dao.book.BookMapper;
import com.gbai.dao.test.UserMapper;
import com.gbai.entity.Book;
import com.gbai.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MulimybatisplusApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Autowired
    BookMapper bookMapper;

    @Test
    public void contextLoads() {
        List<Map<String, Object>> users = userMapper.getAllUser();
        List<Book> books = bookMapper.selectList(null);
        System.out.println(users.toString());
        System.out.println(books.toString());

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
        ew.in("username","李四").and("password='1'").andNew("password is null").and("id=1");
//        Integer integer = userMapper.selectCount(ew);
        List<Map<String, Object>> users = userMapper.selectMaps(ew);
        System.out.println(ew.getSqlSegment());
        System.out.println(users.toString());
    }

}
