package com.gbai.controller;

import com.alibaba.fastjson.JSON;
import com.gbai.annotation.ParameterModel;
import com.gbai.bean.StudentEntity;
import com.gbai.bean.TeacherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: mvctest
 * @description:
 * @author: gbai
 * @create: 2018-07-18 14:36
 **/
@RestController
public class IndexController
{
    @Autowired
    ApplicationContext applicationContext;
    /**
     * 装载参数测试
     * 1、不添加ParameterModel注解时查看结果
     * 2、添加ParameterModel注解时查看结果
     * @return
     */
    @RequestMapping(value = "/submit")
    public String resolver(@ParameterModel TeacherEntity teacher, @ParameterModel StudentEntity student)
    {
        String str = "";
        return "教师名称："+ JSON.toJSON(teacher.getName()) +"，学生名称："+student.getName()+"，学生年龄："+student.getAge();
    }
}