package com.gbai.quartz.controller;

import com.gbai.quartz.core.Result;
import com.gbai.quartz.core.ResultGenerator;
import com.gbai.quartz.model.ScheduleJob;
import com.gbai.quartz.service.ScheduleJobService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* Created by CodeGenerator on 2019/01/03.
*/
@RestController
@RequestMapping("/schedule/job")
public class ScheduleJobController {

    @Resource
    private ScheduleJobService scheduleJobService;

    @PostMapping("/addJob")
    public Result saveJob(@RequestBody ScheduleJob scheduleJob) {
        Long aLong = scheduleJobService.saveJob(scheduleJob);
        return ResultGenerator.genSuccessResult(aLong);
    }
    @GetMapping("/resumeJob")
    public Result resumeJob(@RequestParam Long jobId) {
        ScheduleJob scheduleJob = scheduleJobService.findById(jobId);
        if (scheduleJob == null) return ResultGenerator.genFailResult("找不到该任务");
        scheduleJobService.resumeJob(scheduleJob);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/runJob")
    public Result runJob(@RequestParam Long jobId) {
        scheduleJobService.runJob(jobId);
        return ResultGenerator.genSuccessResult();
    }
    @PostMapping("/updateJob")
    public Result updateJob(@RequestBody ScheduleJob scheduleJob) {
        scheduleJobService.updateJob(scheduleJob);
        return ResultGenerator.genSuccessResult();
    }
    @DeleteMapping("/deleteJob/{jobId}")
    public Result deleteJob(@PathVariable("jobId") Long jobId) {
        scheduleJobService.deleteJob(jobId);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/pauseJob")
    public Result pauseJob(@RequestParam Long jobId) {
        scheduleJobService.pauseJob(jobId);
        return ResultGenerator.genSuccessResult();
    }
}
