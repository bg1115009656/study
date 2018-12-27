package com.dianmi.esign.controller;
import com.dianmi.esign.core.BaseController;
import com.dianmi.esign.core.Result;
import com.dianmi.esign.core.ResultGenerator;
import com.dianmi.esign.model.ExcelToField;
import com.dianmi.esign.model.SignAccountInfo;
import com.dianmi.esign.model.TemplateFields;
import com.dianmi.esign.service.TemplateFieldsService;
import com.dianmi.esign.util.ExcelUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.deploy.net.HttpResponse;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

/**
* Created by CodeGenerator on 2018/06/15.
*/
@RestController
@RequestMapping("/template/fields")
public class TemplateFieldsController {
    @Resource
    private TemplateFieldsService templateFieldsService;

    @PostMapping
    public Result add(@RequestBody TemplateFields templateFields) {
        templateFieldsService.save(templateFields);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        templateFieldsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody TemplateFields templateFields) {
        templateFieldsService.update(templateFields);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        TemplateFields templateFields = templateFieldsService.findById(id);
        return ResultGenerator.genSuccessResult(templateFields);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TemplateFields> list = templateFieldsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    /**
     * 导入模板对应字段
     * @return
     */
    @PostMapping("/importFields")
    public Result uploadExcel(@RequestParam MultipartFile file,@RequestParam Integer tplNo){
        SignAccountInfo user = BaseController.getCurrentUser();
        List<TemplateFields> byTplNo = templateFieldsService.findByTplNo(tplNo);
        if(byTplNo != null && byTplNo.size() > 0){
            List<Integer> collect = byTplNo.stream()
                    .map(field -> field.getFieldId())
                    .collect(Collectors.toList());
            templateFieldsService.deleteByIds(collect.toString());
        }
        List<ExcelToField> excelToFields = ExcelUtil.importExcel(file, 0, 1, ExcelToField.class);
        excelToFields.stream().forEach(field ->
            templateFieldsService.save(TemplateFields.builder()
            .fieldName(field.getFieldName())
            .fieldToTpl(field.getFieldToTpl())
            .createUser(user.getAccountUuid()).updateUser(user.getAccountUuid()).build())
        );
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 下载字段导入模板
     * @return
     */
    @GetMapping("/downloadFieldTpl")
    public Result downloadTemplate(HttpServletResponse response) throws IOException {
        FileInputStream in = new FileInputStream("");
        response.setHeader("Content-Disposition", "attachment;filename=" + new String("合同字段对应关系.xlsx".getBytes("gb2312"), "ISO8859-1"));
        response.setContentType("application/octet-stream");
        //response.setContentType("application/vnd.ms-excel;charset=utf-8");
        response.setCharacterEncoding("ISO8859-1");
        byte[] bytes = IOUtils.toByteArray(in);
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(bytes);
        outputStream.flush();
        outputStream.close();
        in.close();
        return ResultGenerator.genSuccessResult();
    }


}
