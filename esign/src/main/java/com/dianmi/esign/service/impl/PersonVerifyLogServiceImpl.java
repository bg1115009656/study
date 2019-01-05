package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.PersonVerifyLogMapper;
import com.dianmi.esign.model.PersonVerifyLog;
import com.dianmi.esign.service.PersonVerifyLogService;
import com.dianmi.esign.core.AbstractService;
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
