package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.EnterprisePositionMapper;
import com.dianmi.esign.model.EnterprisePosition;
import com.dianmi.esign.service.EnterprisePositionService;
import com.dianmi.esign.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/27.
 */
@Service
@Transactional
public class EnterprisePositionServiceImpl extends AbstractService<EnterprisePosition> implements EnterprisePositionService {
    @Resource
    private EnterprisePositionMapper enterprisePositionMapper;

}
