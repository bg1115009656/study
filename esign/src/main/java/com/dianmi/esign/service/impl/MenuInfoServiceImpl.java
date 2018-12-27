package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.MenuInfoMapper;
import com.dianmi.esign.model.MenuInfo;
import com.dianmi.esign.service.MenuInfoService;
import com.dianmi.esign.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/19.
 */
@Service
@Transactional
public class MenuInfoServiceImpl extends AbstractService<MenuInfo> implements MenuInfoService {
    @Resource
    private MenuInfoMapper menuInfoMapper;

}
