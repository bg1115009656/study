package com.gbai.quartz.service.impl;


import com.gbai.quartz.core.AbstractService;
import com.gbai.quartz.dao.PersonVerifyLogMapper;
import com.gbai.quartz.model.PersonVerifyLog;
import com.gbai.quartz.service.PersonVerifyLogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by CodeGenerator on 2019/01/03.
 */
@Service
@Transactional
public class PersonVerifyLogServiceImpl extends AbstractService<PersonVerifyLog> implements PersonVerifyLogService {
    @Resource
    private PersonVerifyLogMapper personVerifyLogMapper;

}
