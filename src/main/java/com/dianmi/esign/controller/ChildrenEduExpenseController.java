package com.dianmi.esign.controller;
import com.dianmi.esign.core.Result;
import com.dianmi.esign.core.ResultGenerator;
import com.dianmi.esign.model.ChildrenEduExpense;
import com.dianmi.esign.service.ChildrenEduExpenseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/12/27.
*/
@RestController
@RequestMapping("/children/edu/expense")
public class ChildrenEduExpenseController {
    @Resource
    private ChildrenEduExpenseService childrenEduExpenseService;

    @PostMapping
    public Result add(@RequestBody ChildrenEduExpense childrenEduExpense) {
        childrenEduExpenseService.save(childrenEduExpense);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        childrenEduExpenseService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody ChildrenEduExpense childrenEduExpense) {
        childrenEduExpenseService.update(childrenEduExpense);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ChildrenEduExpense childrenEduExpense = childrenEduExpenseService.findById(id);
        return ResultGenerator.genSuccessResult(childrenEduExpense);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ChildrenEduExpense> list = childrenEduExpenseService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
