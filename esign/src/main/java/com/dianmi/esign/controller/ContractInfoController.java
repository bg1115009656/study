package com.dianmi.esign.controller;
import com.dianmi.esign.core.BaseController;
import com.dianmi.esign.core.Result;
import com.dianmi.esign.core.ResultGenerator;
import com.dianmi.esign.model.ContractInfo;
import com.dianmi.esign.model.SignAccountInfo;
import com.dianmi.esign.model.SignEntInfo;
import com.dianmi.esign.service.ContractInfoService;
import com.dianmi.esign.service.SignEntInfoService;
import com.dianmi.esign.util.UUidUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
* Created by CodeGenerator on 2018/06/15.
*/
@RestController
@RequestMapping("/contract/info")
public class ContractInfoController {
    @Resource
    private ContractInfoService contractInfoService;

    @Resource
    private SignEntInfoService signEntInfoService;

    @PostMapping
    public Result add(@RequestBody ContractInfo contractInfo) {
        SignAccountInfo user = BaseController.getCurrentUser();
        contractInfo.setContractUuid(UUidUtil.getUUID());
        contractInfoService.save(contractInfo);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String UUid) {
        ContractInfo info = contractInfoService.findById(UUid);
        info.setStatus("INVALID");
        contractInfoService.update(info);
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 单笔状态更新
     * 更新合同乙方签约状态（甲方默认为已签）signStatus状态有：待签(Signing)，已签（Signed），拒签（Refusal），归档（Archiving）
     * @param contractInfo
     * @return
     */
    @PutMapping
    public Result update(@RequestBody ContractInfo contractInfo) {
        contractInfoService.update(contractInfo);
        //已签状态调用e签宝签署接口
        return ResultGenerator.genSuccessResult();
    }


    /**
     * 通过合同UUID查询合同详情
     * @param uuid
     * @return
     */
    @GetMapping("/{uuid}")
    public Result detail(@PathVariable String uuid) {
        ContractInfo contractInfo = contractInfoService.findById(uuid);
        return ResultGenerator.genSuccessResult(contractInfo);
    }

    /**
     * 展示员工与该公司或其运作公司所签合同
     * @param unionid
     * @return
     */
    @GetMapping("/ByEnt")
    public Result findByUnionId(@RequestParam String unionid) {
        SignAccountInfo user = BaseController.getCurrentUser();
        List<Integer> signEnts = BaseController.getSignEnts(user.getBelongEntId());
        List<ContractInfo> contractInfo = contractInfoService.findByUnionIdandEnt(unionid,signEnts);
        return ResultGenerator.genSuccessResult(contractInfo);
    }
    /**
     * 展示本公司所签署合同
     * @param page
     * @param size
     * @return
     */
    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size,@RequestParam(defaultValue = "VALID") String status) {
        SignAccountInfo user = BaseController.getCurrentUser();
        List<SignEntInfo> byEntId = signEntInfoService.findByEntId(user.getBelongEntId());
        List<Integer> collect = byEntId.stream().map(e -> e.getSignEntId()).collect(Collectors.toList());
        PageHelper.startPage(page, size);
        List<ContractInfo> list = contractInfoService.findByEntId(collect,status);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
