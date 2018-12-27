package com.dianmi.esign.service;
import com.dianmi.esign.model.SignEntInfo;
import com.dianmi.esign.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator on 2018/06/15.
 */
public interface SignEntInfoService extends Service<SignEntInfo> {

    List<SignEntInfo> findByEntId(Integer entid);
}
