package com.lxm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard  // 开启dashboard可视化监控工具
@SpringBootApplication
public class DeptConsumer_Dashboard_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_Dashboard_App.class, args);
    }
}
