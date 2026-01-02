package com.fan.fanbook.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fan.fanbook.auth.domain.mapper")
public class FanBookAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanBookAuthApplication.class, args);
    }

}
