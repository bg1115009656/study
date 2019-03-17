package com.gbai.quartz;

import com.gbai.quartz.dao.JobEntityMapper;
import com.gbai.quartz.service.JobEntityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.ConcurrentMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuartzApplicationTests {

    @Resource
    JobEntityMapper jobEntityMapper;
    @Resource
    JobEntityService jobEntityService;

    @Test
    public void contextLoads() throws Exception {
//        jobEntitySevice.sendMail();
        ConcurrentMap

    }

}

