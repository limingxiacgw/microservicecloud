package com.lmx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 本服务启动后悔自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
public class DeptConfigClient8001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConfigClient8001_App.class, args);
    }
}
