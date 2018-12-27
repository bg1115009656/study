package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.SignAccountInfoMapper;
import com.dianmi.esign.model.SignAccountInfo;
import com.dianmi.esign.service.SignAccountInfoService;
import com.dianmi.esign.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/15.
 */
@Service
@Transactional
public class SignAccountInfoServiceImpl extends AbstractService<SignAccountInfo> implements SignAccountInfoService {
    @Resource
    private SignAccountInfoMapper signAccountInfoMapper;

}
