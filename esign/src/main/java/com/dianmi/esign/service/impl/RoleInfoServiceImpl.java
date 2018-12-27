package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.RoleInfoMapper;
import com.dianmi.esign.model.RoleInfo;
import com.dianmi.esign.service.RoleInfoService;
import com.dianmi.esign.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/15.
 */
@Service
@Transactional
public class RoleInfoServiceImpl extends AbstractService<RoleInfo> implements RoleInfoService {
    @Resource
    private RoleInfoMapper roleInfoMapper;

}
