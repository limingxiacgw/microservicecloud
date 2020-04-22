package com.lmx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.lmx.springcloud"})
//@ComponentScan("com.lmx.springcloud")
// 在启动该微服务的时候就能加载我们自定义的ribbon配置类，从而使配置类生效  如果使用默认的就不用加下面的注解
public class DeptConsumer80_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
    }
}
