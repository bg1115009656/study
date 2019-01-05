package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.HouseRentExpenseMapper;
import com.dianmi.esign.model.HouseRentExpense;
import com.dianmi.esign.service.HouseRentExpenseService;
import com.dianmi.esign.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/12/27.
 */
@Service
@Transactional
public class HouseRentExpenseServiceImpl extends AbstractService<HouseRentExpense> implements HouseRentExpenseService {
    @Resource
    private HouseRentExpenseMapper houseRentExpenseMapper;

}
