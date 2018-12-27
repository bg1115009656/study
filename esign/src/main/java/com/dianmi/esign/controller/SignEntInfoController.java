package com.dianmi.esign.controller;
import com.dianmi.esign.core.BaseController;
import com.dianmi.esign.core.Result;
import com.dianmi.esign.core.ResultGenerator;
import com.dianmi.esign.model.ContractInfo;
import com.dianmi.esign.model.SignAccountInfo;
import com.dianmi.esign.model.SignEntInfo;
import com.dianmi.esign.model.TemplateInfo;
import com.dianmi.esign.service.ContractInfoService;
import com.dianmi.esign.service.SignEntInfoService;
import com.dianmi.esign.service.TemplateInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

/**
* Created by CodeGenerator on 2018/06/15.
*/
@RestController
@RequestMapping("/sign/ent/info")
public class SignEntInfoController {
    @Resource
    private SignEntInfoService signEntInfoService;

    @Resource
    private ContractInfoService contractInfoService;

    @Resource
    private TemplateInfoService templateInfoService;

    @PostMapping
    public Result add(@RequestBody SignEntInfo signEntInfo) {
        SignAccountInfo user = BaseController.getCurrentUser();
        signEntInfo.setEntId(user.getBelongEntId());
        signEntInfoService.save(signEntInfo);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        signEntInfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody SignEntInfo signEntInfo) {
        signEntInfoService.update(signEntInfo);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        SignEntInfo signEntInfo = signEntInfoService.findById(id);
        return ResultGenerator.genSuccessResult(signEntInfo);
    }

    /**
     * 展示该企业及其可签约企业摘要信息
     * @param page
     * @param size
     * @return
     */
    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        SignAccountInfo account = BaseController.getCurrentUser();
        PageHelper.startPage(page, size);
        List<SignEntInfo> list = signEntInfoService.findByEntId(account.getBelongEntId());
        list.stream().forEach(e -> {
            List<ContractInfo> contractInfos = contractInfoService.findByEntId(e.getEntId());
            Set<String> set = new HashSet<>();
            contractInfos.stream().forEach(s -> set.add(s.getUnionId()));
            if(contractInfos != null){
                e.setContractCount(contractInfos.size());
                e.setStaffCount(set.size());
            }
        });
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
