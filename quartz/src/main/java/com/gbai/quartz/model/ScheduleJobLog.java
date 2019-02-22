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
 * @create: 2019-01-07 09:51
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "schedule_job_log")
public class ScheduleJobLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long jobId;

    private String beanName; //执行的类名

    private String methodName; //方法名

    private String params; //参数

    private Date createTime; //创建时间

    private Integer status;//执行状态

    private Long times;//耗时

    private String error;//错误原因
}
