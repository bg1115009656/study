package com.dianmi.esign;


import com.dianmi.esign.dao.TemplateFieldsMapper;
import com.dianmi.esign.service.TemplateFieldsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EsignApplicationTests {

    @Resource
    TemplateFieldsService templateFieldsService;

    @Test
    public void test(){
        templateFieldsService.findById(1);
    }


}
