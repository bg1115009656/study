package com.dianmi.esign.controller;
import com.dianmi.esign.core.Result;
import com.dianmi.esign.core.ResultGenerator;
import com.dianmi.esign.model.SignAccountInfo;
import com.dianmi.esign.service.SignAccountInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/06/15.
*/
@RestController
public class SignAccountInfoController {
    @Resource
    private SignAccountInfoService signAccountInfoService;


    public Result add( SignAccountInfo signAccountInfo) {
        signAccountInfoService.save(signAccountInfo);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        signAccountInfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/sign/account/info/logout")
    public Result update(@RequestBody SignAccountInfo signAccountInfo) {
        signAccountInfoService.update(signAccountInfo);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        SignAccountInfo signAccountInfo = signAccountInfoService.findById(id);
        return ResultGenerator.genSuccessResult(signAccountInfo);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SignAccountInfo> list = signAccountInfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
