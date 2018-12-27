package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.TemplateInfoMapper;
import com.dianmi.esign.model.TemplateInfo;
import com.dianmi.esign.service.TemplateInfoService;
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
public class TemplateInfoServiceImpl extends AbstractService<TemplateInfo> implements TemplateInfoService {
    @Resource
    private TemplateInfoMapper templateInfoMapper;

    @Override
    public List<TemplateInfo> findByEntId(Integer entid) {
        Condition con = new Condition(TemplateInfo.class);
        Example.Criteria criteria = con.createCriteria();
        criteria.andEqualTo("belongEntId",entid).andEqualTo("status","VALID");
        List<TemplateInfo> templateInfos = templateInfoMapper.selectByCondition(con);
        return templateInfos;
    }

    @Override
    public List<TemplateInfo> findByEntId(List<Integer> entids) {
        Condition con = new Condition(TemplateInfo.class);
        Example.Criteria criteria = con.createCriteria();
        criteria.andIn("belongEntId",entids).andEqualTo("status","VALID");
        List<TemplateInfo> templateInfos = templateInfoMapper.selectByCondition(con);
        return templateInfos;
    }
}
