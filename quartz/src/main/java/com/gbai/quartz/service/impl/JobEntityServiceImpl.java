package com.gbai.quartz.service.impl;

import com.gbai.quartz.core.AbstractService;
import com.gbai.quartz.dao.JobEntityMapper;
import com.gbai.quartz.model.JobEntity;
import com.gbai.quartz.service.JobEntityService;
import com.gbai.quartz.task.MyJob;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;


/**
 * Created by CodeGenerator on 2019/01/03.
 */
@Service
public class JobEntityServiceImpl extends AbstractService<JobEntity> implements JobEntityService {
    @Resource
    private JobEntityMapper jobEntityMapper;

//     注入任务调度器
    @Resource
    private Scheduler scheduler;

    //    测试quartz 框架 定时任务
    public void sendMail() throws Exception {
        //设置开始时间为1分钟后
        long startAtTime = System.currentTimeMillis() + 1000 * 5;
        //任务名称
        String name = UUID.randomUUID().toString();
        //任务所属分组
        String group = MyJob.class.getName();
        //创建任务
        JobDetail jobDetail = JobBuilder.newJob(MyJob.class).withIdentity(name,group).build();
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("*/5 * * * * ?");
        //创建任务触发器
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity(name,group).startAt(new Date(startAtTime)).withSchedule(scheduleBuilder).build();
        //将触发器与任务绑定到调度器内
        scheduler.scheduleJob(jobDetail, trigger);
    }
}
