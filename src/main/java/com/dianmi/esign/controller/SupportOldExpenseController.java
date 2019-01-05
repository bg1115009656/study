package com.dianmi.esign.controller;
import com.dianmi.esign.core.Result;
import com.dianmi.esign.core.ResultGenerator;
import com.dianmi.esign.model.SupportOldExpense;
import com.dianmi.esign.service.SupportOldExpenseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/12/27.
*/
@RestController
@RequestMapping("/support/old/expense")
public class SupportOldExpenseController {
    @Resource
    private SupportOldExpenseService supportOldExpenseService;

    @PostMapping
    public Result add(@RequestBody SupportOldExpense supportOldExpense) {
        supportOldExpenseService.save(supportOldExpense);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        supportOldExpenseService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody SupportOldExpense supportOldExpense) {
        supportOldExpenseService.update(supportOldExpense);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        SupportOldExpense supportOldExpense = supportOldExpenseService.findById(id);
        return ResultGenerator.genSuccessResult(supportOldExpense);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SupportOldExpense> list = supportOldExpenseService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
