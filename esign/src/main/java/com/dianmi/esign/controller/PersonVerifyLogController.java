package com.dianmi.esign.controller;
import com.dianmi.esign.core.Result;
import com.dianmi.esign.core.ResultGenerator;
import com.dianmi.esign.model.PersonVerifyLog;
import com.dianmi.esign.service.PersonVerifyLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/01/03.
*/
@RestController
@RequestMapping("/person/verify/log")
public class PersonVerifyLogController {
    @Resource
    private PersonVerifyLogService personVerifyLogService;

    @PostMapping
    public Result add(@RequestBody PersonVerifyLog personVerifyLog) {
        personVerifyLogService.save(personVerifyLog);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        personVerifyLogService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody PersonVerifyLog personVerifyLog) {
        personVerifyLogService.update(personVerifyLog);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        PersonVerifyLog personVerifyLog = personVerifyLogService.findById(id);
        return ResultGenerator.genSuccessResult(personVerifyLog);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<PersonVerifyLog> list = personVerifyLogService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
