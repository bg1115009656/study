package com.gbai.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: study
 * @description:
 * @author: gbai
 * @create: 2018-09-11 16:41
 **/
@RestController
@RequestMapping("/hello")
public class HelloWorldController {


    @RequestMapping(method = RequestMethod.GET)
    public String sayHello() {
        return "Hello User!";
    }

}
