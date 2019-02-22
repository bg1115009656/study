package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.ChildrenEduExpenseMapper;
import com.dianmi.esign.model.ChildrenEduExpense;
import com.dianmi.esign.service.ChildrenEduExpenseService;
import com.dianmi.esign.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/12/27.
 */
@Service
@Transactional
public class ChildrenEduExpenseServiceImpl extends AbstractService<ChildrenEduExpense> implements ChildrenEduExpenseService {
    @Resource
    private ChildrenEduExpenseMapper childrenEduExpenseMapper;

}
