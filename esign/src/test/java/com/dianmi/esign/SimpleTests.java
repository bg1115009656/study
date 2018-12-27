package com.dianmi.esign;


import com.dianmi.esign.model.ContractInfo;
import com.dianmi.esign.service.ContractInfoService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Test;
import org.mockito.cglib.beans.BeanMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


@SpringBootTest
public class SimpleTests {

    @Autowired
    DataSource dataSource;
    @Resource
    ContractInfoService contractInfoService;
    @Test
    public void test(){

        ObjA a = new ObjA("xiaoming", "001");
        BeanMap beanMap = BeanMap.create(a);

        System.err.println(beanMap.get("name"));

    }


    @Data
    @AllArgsConstructor
    public class ObjA{
        private String name;
        private String number;

    }

    @Test
    public void test2() throws SQLException {
        List<ContractInfo> byEntId = contractInfoService.findByEntId(100012);
    }

}
