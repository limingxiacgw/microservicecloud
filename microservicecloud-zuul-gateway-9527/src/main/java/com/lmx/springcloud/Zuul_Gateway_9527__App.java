package com.lmx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul_Gateway_9527__App {
    // http://myzuul.com:9527/microservicecloud-dept/dept/get/3
    public static void main(String[] args) {
        SpringApplication.run(Zuul_Gateway_9527__App.class, args);
    }
}
