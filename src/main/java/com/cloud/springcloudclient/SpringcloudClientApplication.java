package com.cloud.springcloudclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.cloud.springcloudclient.mapper")
@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudClientApplication.class, args);
    }

}
