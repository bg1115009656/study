package com.dianmi.esign.controller;
import com.dianmi.esign.core.Result;
import com.dianmi.esign.core.ResultGenerator;
import com.dianmi.esign.model.EnterprisePosition;
import com.dianmi.esign.service.EnterprisePositionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/06/27.
*/
@RestController
@RequestMapping("/enterprise/position")
public class EnterprisePositionController {
    @Resource
    private EnterprisePositionService enterprisePositionService;

    @PostMapping
    public Result add(@RequestBody EnterprisePosition enterprisePosition) {
        enterprisePositionService.save(enterprisePosition);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        enterprisePositionService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody EnterprisePosition enterprisePosition) {
        enterprisePositionService.update(enterprisePosition);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        EnterprisePosition enterprisePosition = enterprisePositionService.findById(id);
        return ResultGenerator.genSuccessResult(enterprisePosition);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<EnterprisePosition> list = enterprisePositionService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
