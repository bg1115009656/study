package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.ContractInfoMapper;
import com.dianmi.esign.model.ContractInfo;
import com.dianmi.esign.service.ContractInfoService;
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
public class ContractInfoServiceImpl extends AbstractService<ContractInfo> implements ContractInfoService {
    @Resource
    private ContractInfoMapper contractInfoMapper;

    @Override
    public List<ContractInfo> findByEntId(List<Integer> list,String status) {
        Condition con = new Condition(ContractInfo.class);
        Example.Criteria criteria = con.createCriteria();
        criteria.andIn("signEnt", list).andEqualTo("status", status);
        List<ContractInfo> conlist = contractInfoMapper.selectByCondition(con);
        return conlist;
    }

    @Override
    public List<ContractInfo> findByEntId(Integer entId) {
        Condition con = new Condition(ContractInfo.class);
        Example.Criteria criteria = con.createCriteria();
        criteria.andEqualTo("signEnt",entId).andEqualTo("status","VALID");
        List<ContractInfo> infos = contractInfoMapper.selectByCondition(con);
        return infos;
    }

    @Override
    public List<ContractInfo> findByUnionIdandEnt(String unionId,List<Integer> entids) {
        Condition con = new Condition(ContractInfo.class);
        Example.Criteria criteria = con.createCriteria();
        criteria.andEqualTo("unionId",unionId).andIn("signEnt",entids).andEqualTo("status","VALID");
        List<ContractInfo> infos = contractInfoMapper.selectByCondition(con);
        return infos;
    }

    @Override
    public List<ContractInfo> findByUnionId(String unionId) {
        Condition con = new Condition(ContractInfo.class);
        Example.Criteria criteria = con.createCriteria();
        criteria.andEqualTo("unionId",unionId).andEqualTo("status","VALID");
        List<ContractInfo> infos = contractInfoMapper.selectByCondition(con);
        return infos;
    }
}
