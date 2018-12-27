package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.SignConfigMapper;
import com.dianmi.esign.model.SignConfig;
import com.dianmi.esign.service.SignConfigService;
import com.dianmi.esign.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/15.
 */
@Service
@Transactional
public class SignConfigServiceImpl extends AbstractService<SignConfig> implements SignConfigService {
    @Resource
    private SignConfigMapper signConfigMapper;

}
