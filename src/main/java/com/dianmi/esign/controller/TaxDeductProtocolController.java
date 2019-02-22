package com.dianmi.esign.controller;
import com.dianmi.esign.core.Result;
import com.dianmi.esign.core.ResultGenerator;
import com.dianmi.esign.model.TaxDeductProtocol;
import com.dianmi.esign.service.TaxDeductProtocolService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/12/27.
*/
@RestController
@RequestMapping("/tax/deduct/protocol")
public class TaxDeductProtocolController {
    @Resource
    private TaxDeductProtocolService taxDeductProtocolService;

    @PostMapping
    public Result add(@RequestBody TaxDeductProtocol taxDeductProtocol) {
        taxDeductProtocolService.save(taxDeductProtocol);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        taxDeductProtocolService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody TaxDeductProtocol taxDeductProtocol) {
        taxDeductProtocolService.update(taxDeductProtocol);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        TaxDeductProtocol taxDeductProtocol = taxDeductProtocolService.findById(id);
        return ResultGenerator.genSuccessResult(taxDeductProtocol);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TaxDeductProtocol> list = taxDeductProtocolService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
