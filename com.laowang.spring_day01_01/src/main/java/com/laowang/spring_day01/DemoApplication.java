package com.laowang.spring_day01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 这个是springBoot项目的引导类
 * 引导类的意思就是：springBoot项目的启动是将引导类启动，从而让整个项目启动，
 * 引导类的启动需要借助 main办法（程序入口）
 *
 *
 * */
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
