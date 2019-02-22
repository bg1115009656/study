package com.dianmi.esign.controller;
import com.dianmi.esign.core.Result;
import com.dianmi.esign.core.ResultGenerator;
import com.dianmi.esign.model.HouseRentExpense;
import com.dianmi.esign.service.HouseRentExpenseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/12/27.
*/
@RestController
@RequestMapping("/house/rent/expense")
public class HouseRentExpenseController {
    @Resource
    private HouseRentExpenseService houseRentExpenseService;

    @PostMapping
    public Result add(@RequestBody HouseRentExpense houseRentExpense) {
        houseRentExpenseService.save(houseRentExpense);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        houseRentExpenseService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody HouseRentExpense houseRentExpense) {
        houseRentExpenseService.update(houseRentExpense);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        HouseRentExpense houseRentExpense = houseRentExpenseService.findById(id);
        return ResultGenerator.genSuccessResult(houseRentExpense);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<HouseRentExpense> list = houseRentExpenseService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
