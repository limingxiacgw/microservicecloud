package com.lmx.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean { // boot -->spring applicationContext.xml-- @Configuration=applicationContext.xml
    @Bean
    @LoadBalanced  // springcloud Ribbon是基于Netflix Ribbon实现的一套客户端负载均衡的工具
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
