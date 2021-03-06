package com.gbai.quartz.controller;

import com.gbai.quartz.core.Result;
import com.gbai.quartz.core.ResultGenerator;
import com.gbai.quartz.model.JobEntity;
import com.gbai.quartz.service.JobEntityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/01/03.
*/
@RestController
@RequestMapping("/job/entity")
public class JobEntityController {
    @Resource
    private JobEntityService jobEntityService;
    @PostMapping
    public Result add(@RequestBody JobEntity jobEntity) {
        jobEntityService.save(jobEntity);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/sendMail")
    public Result sendMail() throws Exception {
        jobEntityService.sendMail();
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        jobEntityService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody JobEntity jobEntity) {
        jobEntityService.update(jobEntity);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        JobEntity jobEntity = jobEntityService.findById(id);
        return ResultGenerator.genSuccessResult(jobEntity);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<JobEntity> list = jobEntityService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
