package com.lmx.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义策略
 */
@Configuration
public class MyselfRule {
    /**
     * 自定义随机策略 注意使用了自定义的就不能写默认的，否则会找到2个bean
     * @return
     */
    @Bean
    public IRule myRule(){
        //return new RandomRule();
        return new MyselfRuleLmx();
    }
}
