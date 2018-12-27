package com.dianmi.esign.controller;
import com.dianmi.esign.core.BaseController;
import com.dianmi.esign.core.Result;
import com.dianmi.esign.core.ResultGenerator;
import com.dianmi.esign.model.SignAccountInfo;
import com.dianmi.esign.model.TemplateInfo;
import com.dianmi.esign.service.TemplateInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/06/15.
*/
@RestController
@RequestMapping("/template/info")
public class TemplateInfoController {
    @Resource
    private TemplateInfoService templateInfoService;


    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        templateInfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody TemplateInfo templateInfo) {
        templateInfoService.update(templateInfo);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        TemplateInfo templateInfo = templateInfoService.findById(id);
        return ResultGenerator.genSuccessResult(templateInfo);
    }

    /**
     * 根据不同企业得到不同模板
     * @param id
     * @return
     */
    @GetMapping("/byEnt/{id}")
    public Result findByEntId(@PathVariable Integer id) {
        List<TemplateInfo> Infos = templateInfoService.findByEntId(id);
        return ResultGenerator.genSuccessResult(Infos);
    }

    /**
     * 展示该企业合同模板
     * @param page
     * @param size
     * @return
     */
    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        SignAccountInfo user = BaseController.getCurrentUser();
        PageHelper.startPage(page, size);
        List<TemplateInfo> list = templateInfoService.findByEntId(BaseController.getSignEnts(user.getBelongEntId()));
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    /**
     * 新增合同模板
     * @return
     */
    @PostMapping("/pdf")
    public Result uploadTpl(@RequestParam MultipartFile file){
        SignAccountInfo user = BaseController.getCurrentUser();

        return ResultGenerator.genSuccessResult();
    }
}
