package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.JobEntityMapper;
import com.dianmi.esign.model.JobEntity;
import com.dianmi.esign.service.JobEntityService;
import com.dianmi.esign.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/01/03.
 */
@Service
@Transactional
public class JobEntityServiceImpl extends AbstractService<JobEntity> implements JobEntityService {
    @Resource
    private JobEntityMapper jobEntityMapper;

}
