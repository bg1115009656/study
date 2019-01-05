package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.SupportOldExpenseMapper;
import com.dianmi.esign.model.SupportOldExpense;
import com.dianmi.esign.service.SupportOldExpenseService;
import com.dianmi.esign.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/12/27.
 */
@Service
@Transactional
public class SupportOldExpenseServiceImpl extends AbstractService<SupportOldExpense> implements SupportOldExpenseService {
    @Resource
    private SupportOldExpenseMapper supportOldExpenseMapper;

}
