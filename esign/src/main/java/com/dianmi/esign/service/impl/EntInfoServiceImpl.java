package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.EntInfoMapper;
import com.dianmi.esign.model.EntInfo;
import com.dianmi.esign.service.EntInfoService;
import com.dianmi.esign.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/15.
 */
@Service
@Transactional
public class EntInfoServiceImpl extends AbstractService<EntInfo> implements EntInfoService {
    @Resource
    private EntInfoMapper entInfoMapper;

}
