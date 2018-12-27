package com.dianmi.esign.controller;
import com.dianmi.esign.core.Result;
import com.dianmi.esign.core.ResultGenerator;
import com.dianmi.esign.model.SignStaffInfo;
import com.dianmi.esign.service.SignStaffInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/06/21.
*/
@RestController
@RequestMapping("/sign/staff/info")
public class SignStaffInfoController {
    @Resource
    private SignStaffInfoService signStaffInfoService;

    @PostMapping
    public Result add(@RequestBody SignStaffInfo signStaffInfo) {
        signStaffInfoService.save(signStaffInfo);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        signStaffInfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody SignStaffInfo signStaffInfo) {
        signStaffInfoService.update(signStaffInfo);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        SignStaffInfo signStaffInfo = signStaffInfoService.findById(id);
        return ResultGenerator.genSuccessResult(signStaffInfo);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SignStaffInfo> list = signStaffInfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
