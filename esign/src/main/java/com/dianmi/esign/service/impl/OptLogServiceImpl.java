package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.OptLogMapper;
import com.dianmi.esign.model.OptLog;
import com.dianmi.esign.service.OptLogService;
import com.dianmi.esign.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/15.
 */
@Service
@Transactional
public class OptLogServiceImpl extends AbstractService<OptLog> implements OptLogService {
    @Resource
    private OptLogMapper optLogMapper;

}
