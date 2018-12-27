package com.dianmi.esign.service;
import com.dianmi.esign.model.ReviewInfo;
import com.dianmi.esign.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator on 2018/06/15.
 */
public interface ReviewInfoService extends Service<ReviewInfo> {

    List<ReviewInfo> findByEntUUIDAndAppStatus(String UUID,String approvStatus);
}
