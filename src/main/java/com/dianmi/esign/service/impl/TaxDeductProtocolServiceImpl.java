package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.TaxDeductProtocolMapper;
import com.dianmi.esign.model.TaxDeductProtocol;
import com.dianmi.esign.service.TaxDeductProtocolService;
import com.dianmi.esign.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/12/27.
 */
@Service
@Transactional
public class TaxDeductProtocolServiceImpl extends AbstractService<TaxDeductProtocol> implements TaxDeductProtocolService {
    @Resource
    private TaxDeductProtocolMapper taxDeductProtocolMapper;

}
