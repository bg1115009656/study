package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.TemplateFieldsMapper;
import com.dianmi.esign.model.TemplateFields;
import com.dianmi.esign.service.TemplateFieldsService;
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
public class TemplateFieldsServiceImpl extends AbstractService<TemplateFields> implements TemplateFieldsService {
    @Resource
    private TemplateFieldsMapper templateFieldsMapper;

    @Override
    public List<TemplateFields> findByTplNo(Integer tplNo) {
        Condition con = new Condition(TemplateFields.class);
        Example.Criteria criteria = con.createCriteria();
        criteria.andEqualTo("templateId",tplNo).andEqualTo("status","VALID");
        List<TemplateFields> templateFields = templateFieldsMapper.selectByCondition(con);
        return templateFields;
    }
}
