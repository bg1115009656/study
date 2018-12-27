package com.dianmi.esign.controller;
import com.dianmi.esign.core.Result;
import com.dianmi.esign.core.ResultGenerator;
import com.dianmi.esign.model.EntInfo;
import com.dianmi.esign.service.EntInfoService;
import com.dianmi.esign.util.UUidUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/06/15.
*/
@RestController
@RequestMapping("/ent/info")
public class EntInfoController {
    @Resource
    private EntInfoService entInfoService;

    /**
     * 注册企业
     * @param entInfo
     * @return
     */
    @PostMapping
    public Result add(@RequestBody EntInfo entInfo) {
        entInfo.setEntUuid(UUidUtil.getUUID());
        entInfoService.save(entInfo);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        entInfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody EntInfo entInfo) {
        entInfoService.update(entInfo);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        EntInfo entInfo = entInfoService.findById(id);
        return ResultGenerator.genSuccessResult(entInfo);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<EntInfo> list = entInfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
