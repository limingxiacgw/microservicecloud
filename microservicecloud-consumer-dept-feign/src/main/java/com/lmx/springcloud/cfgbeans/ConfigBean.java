package com.lmx.springcloud.cfgbeans;

import com.netflix.loadbalancer.*;
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

   /* *//**
     * 不使用默认的轮询，而使用随机算法
     * @return
     *//*
    @Bean
    public IRule myRuleRandom(){
        return new RandomRule(); // 默认使用轮询算法，指定了随机算法则用随机
    }

    *//**
     * 会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务和并发连接数据超过阈值的服务，然后对剩余的服务列表按照轮询访问。
     * @return
     *//*
    @Bean
    public IRule myRuleAvailablity(){
        return new AvailabilityFilteringRule();
    }

    *//**
     * 根据平均响应时间计算所有服务的权重，响应时间越快服务权重越大被选中的概率越高。
     * 刚启动时如果统计信息不足，则使用轮询策略，等统计信息足够，会切换到WeightedResponseTimeRule
     * @return
     *//*
    @Bean
    public IRule myRuleWeighted(){
        return new WeightedResponseTimeRule();
    }*/

    /**
     * 先按照轮询策略获取服务，如果服务失败则在指定时间内会进行充实，获取可用的服务
     * @return
     */
   /* @Bean
    public IRule myRuleRetry(){
        return new RetryRule();
    }*/

   /* *//**
     * 会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，然后选择一份并发量小的服务
     * @return
     *//*
    @Bean
    public IRule myRuleBestAvailable(){
        return new BestAvailableRule();
    }

    *//**
     * 默认规则，符合判断server所在区域的性能和server的可用性选择服务器
     * @return
     *//*
    @Bean
    public IRule myRuleZoneAvoidance(){
        return new ZoneAvoidanceRule();
    }*/


}
