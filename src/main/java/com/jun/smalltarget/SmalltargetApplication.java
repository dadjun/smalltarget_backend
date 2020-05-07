package com.jun.smalltarget;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
@MapperScan("com.jun.smalltarget.dao")
public class SmalltargetApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmalltargetApplication.class, args);
    }

}
