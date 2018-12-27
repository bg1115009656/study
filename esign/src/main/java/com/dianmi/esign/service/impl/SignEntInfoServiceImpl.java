package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.SignEntInfoMapper;
import com.dianmi.esign.model.SignEntInfo;
import com.dianmi.esign.service.SignEntInfoService;
import com.dianmi.esign.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2018/06/15.
 */
@Service
@Transactional
public class SignEntInfoServiceImpl extends AbstractService<SignEntInfo> implements SignEntInfoService {
    @Resource
    private SignEntInfoMapper signEntInfoMapper;

    @Override
    public List<SignEntInfo> findByEntId(Integer entid) {
        Condition cond = new Condition(SignEntInfo.class);
        Example.Criteria criteria = cond.createCriteria();
        criteria.andEqualTo("entId",entid).andEqualTo("status","VALID");
        List<SignEntInfo> list = signEntInfoMapper.selectByCondition(cond);
        return list;
    }
}
