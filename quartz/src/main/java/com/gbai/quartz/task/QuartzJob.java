package com.gbai.quartz.task;

import com.gbai.quartz.model.ScheduleJob;
import com.gbai.quartz.model.ScheduleJobLog;
import com.gbai.quartz.service.ScheduleJobLogService;
import com.gbai.quartz.util.JacksonUtil;
import com.gbai.quartz.util.SpringContextUtils;
import org.apache.commons.lang3.StringUtils;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * @program: study
 * @description:
 * @author: gbai
 * @create: 2019-01-07 09:41
 **/
public class QuartzJob extends QuartzJobBean {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        System.out.println("执行quartz任务。。。。。");

        String json = context.getMergedJobDataMap().getString("JOB_PARAM_KEY");
        //将获取的对象序列化的json 转化为实体类对象
        ScheduleJob scheduleJob = JacksonUtil.json2Pojo(json,ScheduleJob.class);

        Long jobId = scheduleJob.getId();
        String beanName = scheduleJob.getBeanName();
        String methodName = scheduleJob.getMethodName();
        String params = scheduleJob.getParams();

        //quartz没有被spring管理 所以通过其它方式获取service
        ScheduleJobLogService scheduleJobLogService = (ScheduleJobLogService) SpringContextUtils.getBean("scheduleJobLogServiceImpl");
        //保存任务记录日志
        ScheduleJobLog scheduleJobLog = new ScheduleJobLog();
        scheduleJobLog.setJobId(jobId);
        scheduleJobLog.setBeanName(beanName);
        scheduleJobLog.setMethodName(methodName);
        scheduleJobLog.setParams(params);
        scheduleJobLog.setCreateTime(new Date());

        long startTime = System.currentTimeMillis();

        try {
            Object targetClass = SpringContextUtils.getBean(beanName);
            Method method = null;
            //通过反射获取方法
            if (StringUtils.isNotBlank(params)) {
                method = targetClass.getClass().getDeclaredMethod(methodName, String.class);
            } else {
                method = targetClass.getClass().getDeclaredMethod(methodName);
            }

            ReflectionUtils.makeAccessible(method);//使方法具有public权限
            //根据反射执行方法
            if (StringUtils.isNotBlank(params)) {
                method.invoke(targetClass, params);
            } else {
                method.invoke(targetClass);
            }

            long endTime = System.currentTimeMillis() - startTime;

            scheduleJobLog.setStatus(0);//保存日志里的操作状态 0:成功
            scheduleJobLog.setTimes(endTime);//耗时多长时间

            logger.info("任务执行成功，任务ID：" + jobId + "，总耗时：" + endTime + "毫秒");

        } catch (Exception e) {
            long endTime = System.currentTimeMillis() - startTime;
            scheduleJobLog.setError(StringUtils.substring(e.toString(),2000));//错误消息
            scheduleJobLog.setStatus(1);//失败
            scheduleJobLog.setTimes(endTime);//耗时

            e.printStackTrace();
            logger.error("任务执行失败，任务ID："+jobId);
        } finally {
            //最后调用service保存定时任务日志记录
            scheduleJobLogService.save(scheduleJobLog);
        }

    }
}
