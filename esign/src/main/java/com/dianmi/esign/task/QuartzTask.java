package com.dianmi.esign.task;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @program: ywzc-bss
 * @description:
 * @author: gbai
 * @create: 2019-01-22 17:33
 **/
public class QuartzTask  extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("hello quartz");
    }
}
