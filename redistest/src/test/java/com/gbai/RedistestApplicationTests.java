package com.gbai;

import com.gbai.service.UserService;
import com.gbai.singleton.SingleEnum;
import org.databene.contiperf.PerfTest;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedistestApplicationTests {

    @Rule
    public ContiPerfRule i = new ContiPerfRule();

    @Test
    @PerfTest(invocations = 100000,threads = 100)
    public void contextLoads() {
        userService.findAll();
    }

    @Autowired
    private UserService userService;
    @Test
    public void findAll(){
        userService.findAll();
    }

    SingleEnum singleEnum = SingleEnum.INSTANCE;

}
