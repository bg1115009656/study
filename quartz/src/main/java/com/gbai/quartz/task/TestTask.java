package com.gbai.quartz.task;

import org.springframework.stereotype.Component;

/**
 * @program: study
 * @description:
 * @author: gbai
 * @create: 2019-01-07 11:44
 **/
@Component
public class TestTask {

    public void test(String msg) {
        System.out.println(msg);
    }
}
