package com.dianmi.esign.service;

import com.dianmi.esign.core.Service;
import com.dianmi.esign.model.ContractInfo;

import java.util.List;


/**
 * Created by CodeGenerator on 2018/06/15.
 */

public interface ContractInfoService extends Service<ContractInfo> {

    List<ContractInfo> findByEntId(List<Integer> entIds,String status);
    List<ContractInfo> findByEntId(Integer entId);
    List<ContractInfo> findByUnionIdandEnt(String unionId,List<Integer> entids);
    List<ContractInfo> findByUnionId(String unionId);

}
