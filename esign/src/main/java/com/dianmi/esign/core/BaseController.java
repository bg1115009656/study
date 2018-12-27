package com.dianmi.esign.core;

import com.dianmi.esign.model.SignAccountInfo;
import com.dianmi.esign.model.SignEntInfo;
import com.dianmi.esign.service.SignEntInfoService;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xpp
 * @date 2018/5/7 14:19
 */
public class BaseController {

    @Resource
    private static SignEntInfoService  signEntInfoService;

    public static  SignAccountInfo  getCurrentUser(){

        SignAccountInfo accountInfo = new SignAccountInfo();
        // accountInfo.setAccountUuid(111);
        return accountInfo;
    }

    /**
     * 获取当前企业所有的可签约企业
     * @return
     */
    public static List<Integer> getSignEnts(Integer entId){
        List<SignEntInfo> signEnts = signEntInfoService.findByEntId(entId);
        List<Integer> collect = signEnts.stream().map(SignEntInfo::getSignEntId).collect(Collectors.toList());
        return collect;
    }
}
