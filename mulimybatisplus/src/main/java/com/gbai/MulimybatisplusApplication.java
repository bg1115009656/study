package com.gbai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gbai.dao*")
public class MulimybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MulimybatisplusApplication.class, args);
    }
}
