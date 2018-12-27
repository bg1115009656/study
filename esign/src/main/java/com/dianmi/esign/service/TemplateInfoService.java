package com.dianmi.esign.service;
import com.dianmi.esign.model.TemplateInfo;
import com.dianmi.esign.core.Service;
import io.swagger.models.auth.In;

import java.util.List;


/**
 * Created by CodeGenerator on 2018/06/15.
 */
public interface TemplateInfoService extends Service<TemplateInfo> {

    List<TemplateInfo> findByEntId(Integer entid);
    List<TemplateInfo> findByEntId(List<Integer> entids);
}
