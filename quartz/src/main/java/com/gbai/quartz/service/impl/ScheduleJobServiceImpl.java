package com.gbai.quartz.service.impl;

import com.gbai.quartz.constant.QuartzEnum;
import com.gbai.quartz.core.AbstractService;
import com.gbai.quartz.dao.ScheduleJobMapper;
import com.gbai.quartz.model.ScheduleJob;
import com.gbai.quartz.service.ScheduleJobService;
import com.gbai.quartz.util.SchedulerUtils;
import org.quartz.Scheduler;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @program: study
 * @description:
 * @author: gbai
 * @create: 2019-01-07 10:11
 **/
@Service
public class ScheduleJobServiceImpl extends AbstractService<ScheduleJob> implements ScheduleJobService{

    @Resource
    private ScheduleJobMapper scheduleJobMapper;
    @Resource
    private Scheduler scheduler;
    @Override
    public Long saveJob(ScheduleJob scheduleJob) {
        scheduleJob.setStatus(QuartzEnum.PAUSE.getValue());
        scheduleJob.setCreateTime(new Date());
        scheduleJobMapper.insertSelective(scheduleJob);
        SchedulerUtils.createJob(scheduler,scheduleJob);
        return scheduleJob.getId();
    }

    @Override
    public void resumeJob(ScheduleJob scheduleJob) {
        scheduleJob.setStatus(QuartzEnum.RUNNING.getValue());
        scheduleJobMapper.updateByPrimaryKey(scheduleJob);
        SchedulerUtils.resumeJob(scheduler,scheduleJob.getId());
    }

    @Override
    public void runJob(Long jobId) {
        SchedulerUtils.run(scheduler,jobId);
    }

    @Override
    public void pauseJob(Long jobId) {
        SchedulerUtils.pauseJob(scheduler,jobId);
    }

    @Override
    public void updateJob(ScheduleJob scheduleJob) {
        SchedulerUtils.updateJob(scheduler,scheduleJob);
        scheduleJobMapper.deleteByPrimaryKey(scheduleJob.getId());

        scheduleJobMapper.updateByPrimaryKey(scheduleJob);
    }

    @Override
    public void deleteJob(Long jobId) {
        SchedulerUtils.deleteJob(scheduler,jobId);
    }

}
