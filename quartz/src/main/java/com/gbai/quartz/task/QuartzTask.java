package com.gbai.quartz.task;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @program: study
 * @description:
 * @author: gbai
 * @create: 2019-01-03 14:03
 **/
public class QuartzTask extends QuartzJobBean {



    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("hello quartz");
    }
}
