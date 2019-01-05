package com.gbai.quartz.config;

import com.gbai.quartz.task.QuartzTask;
import org.quartz.*;
import org.quartz.spi.JobFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: study
 * @description: 定时任务配置
 * @author: gbai
 * @create: 2019-01-03 11:56
 **/
//@Configuration
//public class QuartzConfig {
//
//    @Bean
//    public JobDetail uploadTaskDetail() {
//        return JobBuilder.newJob(QuartzTask.class).withIdentity("quartzTask").storeDurably().build();
//    }
//
//    @Bean
//    public Trigger uploadTaskTrigger() {
//        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("*/5 * * * * ?");
//        return TriggerBuilder.newTrigger().forJob(uploadTaskDetail())
//                .withIdentity("quartzTask")
//                .withSchedule(scheduleBuilder)
//                .build();
//    }
//
//}
