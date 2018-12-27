package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.SignStaffInfoMapper;
import com.dianmi.esign.model.SignStaffInfo;
import com.dianmi.esign.service.SignStaffInfoService;
import com.dianmi.esign.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/21.
 */
@Service
@Transactional
public class SignStaffInfoServiceImpl extends AbstractService<SignStaffInfo> implements SignStaffInfoService {
    @Resource
    private SignStaffInfoMapper signStaffInfoMapper;

}
