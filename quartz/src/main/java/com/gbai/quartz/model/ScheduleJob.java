package com.gbai.quartz.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @program: study
 * @description:
 * @author: gbai
 * @create: 2019-01-07 09:50
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "schedule_job")
public class ScheduleJob {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String beanName; //执行的类名

    private String methodName; //方法名

    private String params; //参数

    private String cronExpression; //cron表达式

    private Integer status; //任务状态 0，运行 1，暂停

    private String remark; //备注

    private Date createTime; //创建时间
}

