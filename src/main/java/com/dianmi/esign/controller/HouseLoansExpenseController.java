package com.dianmi.esign.controller;
import com.dianmi.esign.core.Result;
import com.dianmi.esign.core.ResultGenerator;
import com.dianmi.esign.model.HouseLoansExpense;
import com.dianmi.esign.service.HouseLoansExpenseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/12/27.
*/
@RestController
@RequestMapping("/house/loans/expense")
public class HouseLoansExpenseController {
    @Resource
    private HouseLoansExpenseService houseLoansExpenseService;

    @PostMapping
    public Result add(@RequestBody HouseLoansExpense houseLoansExpense) {
        houseLoansExpenseService.save(houseLoansExpense);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        houseLoansExpenseService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody HouseLoansExpense houseLoansExpense) {
        houseLoansExpenseService.update(houseLoansExpense);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        HouseLoansExpense houseLoansExpense = houseLoansExpenseService.findById(id);
        return ResultGenerator.genSuccessResult(houseLoansExpense);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<HouseLoansExpense> list = houseLoansExpenseService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
