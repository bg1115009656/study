package com.dianmi.esign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@EnableCaching
@EnableTransactionManagement // 启注解事务管理
@MapperScan("com.dianmi.esign.dao")
@SpringBootApplication
public class EsignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsignApplication.class, args);
	}
}
