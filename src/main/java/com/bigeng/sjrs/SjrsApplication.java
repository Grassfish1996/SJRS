package com.bigeng.sjrs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bigeng.sjrs.mapper")
public class SjrsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SjrsApplication.class, args);
    }

}
