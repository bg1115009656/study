package com.dianmi.esign.model;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: esign
 * @description:
 * @author: gbai
 * @create: 2018-06-19 09:55
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExcelToField {

    @Excel(name = "合同字段", orderNum = "0")
    private String fieldName;

    @Excel(name = "文本域名称", orderNum = "1")
    private String fieldToTpl;
}
