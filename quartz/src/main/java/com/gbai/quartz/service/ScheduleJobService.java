package com.gbai.quartz.service;

import com.gbai.quartz.core.Service;
import com.gbai.quartz.model.ScheduleJob;

public interface ScheduleJobService extends Service<ScheduleJob> {

    Long saveJob(ScheduleJob scheduleJob);

    void resumeJob(ScheduleJob scheduleJob);

    void runJob(Long jobId);

    void pauseJob(Long jobId);

    void updateJob(ScheduleJob scheduleJob);

    void deleteJob(Long jobId);
}
