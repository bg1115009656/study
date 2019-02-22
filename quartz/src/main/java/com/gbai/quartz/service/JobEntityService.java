package com.gbai.quartz.service;


import com.gbai.quartz.core.Service;
import com.gbai.quartz.model.JobEntity;

/**
 * Created by CodeGenerator on 2019/01/03.
 */
public interface JobEntityService extends Service<JobEntity> {


    void sendMail()throws Exception ;
}
