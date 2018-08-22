package com.mingzhe.credit.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.mingzhe.credit.manage.mapper")
@ComponentScan(basePackages = "com.mingzhe.credit")
public class CreditManageWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreditManageWebApplication.class, args);
    }
}
