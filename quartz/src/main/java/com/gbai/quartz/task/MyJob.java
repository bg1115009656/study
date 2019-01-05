package com.gbai.quartz.task;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @program: study
 * @description:
 * @author: gbai
 * @create: 2019-01-05 11:48
 **/
public class MyJob implements Job {

    public MyJob(){}
    @Override
    //把要执行的操作，写在execute方法中
    public void execute(JobExecutionContext arg0) throws JobExecutionException
    {
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        System.out.println("测试Quartz"+ df.format(Calendar.getInstance().getTime()));
    }
}
