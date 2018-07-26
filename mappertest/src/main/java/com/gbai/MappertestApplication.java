package com.gbai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.gbai.mapper")
public class MappertestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MappertestApplication.class, args);
    }
}
