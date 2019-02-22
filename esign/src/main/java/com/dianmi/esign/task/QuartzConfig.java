package com.dianmi.esign.task;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: study
 * @description: 简易定时任务配置(未做任务持久化)
 * @author: gbai
 **/
@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail uploadTaskDetail() {
        return JobBuilder.newJob(QuartzTask.class).withIdentity("quartzTask").storeDurably().build();
    }

    @Bean
    public Trigger uploadTaskTrigger() {
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("*/5 * * * * ?");
        return TriggerBuilder.newTrigger().forJob(uploadTaskDetail())
                .withIdentity("quartzTask")
                .withSchedule(scheduleBuilder)
                .build();
    }

}
