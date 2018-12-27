package com.dianmi.esign.service;
import com.dianmi.esign.model.TemplateFields;
import com.dianmi.esign.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator on 2018/06/15.
 */
public interface TemplateFieldsService extends Service<TemplateFields> {

    List<TemplateFields> findByTplNo(Integer tplNo);
}
