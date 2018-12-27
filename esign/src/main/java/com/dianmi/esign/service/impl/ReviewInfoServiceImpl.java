package com.dianmi.esign.service.impl;

import com.dianmi.esign.dao.ReviewInfoMapper;
import com.dianmi.esign.model.ReviewInfo;
import com.dianmi.esign.service.ReviewInfoService;
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
public class ReviewInfoServiceImpl extends AbstractService<ReviewInfo> implements ReviewInfoService {
    @Resource
    private ReviewInfoMapper reviewInfoMapper;

    @Override
    public List<ReviewInfo> findByEntUUIDAndAppStatus(String UUID,String approvStatus) {
        Condition con = new Condition(ReviewInfo.class);
        Example.Criteria criteria = con.createCriteria();
        criteria.andEqualTo("applyEntUuid",UUID).andEqualTo("reviewStatus",approvStatus).andEqualTo("status","VALID");
        List<ReviewInfo> list = reviewInfoMapper.selectByCondition(con);
        return list;
    }
}
