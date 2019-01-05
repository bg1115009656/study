package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.HouseLoansExpenseMapper;
import com.dianmi.esign.model.HouseLoansExpense;
import com.dianmi.esign.service.HouseLoansExpenseService;
import com.dianmi.esign.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/12/27.
 */
@Service
@Transactional
public class HouseLoansExpenseServiceImpl extends AbstractService<HouseLoansExpense> implements HouseLoansExpenseService {
    @Resource
    private HouseLoansExpenseMapper houseLoansExpenseMapper;

}
