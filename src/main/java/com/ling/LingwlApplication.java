package com.ling;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ling.mapper")
public class LingwlApplication {

    public static void main(String[] args) {
        SpringApplication.run(LingwlApplication.class, args);
    }

}
