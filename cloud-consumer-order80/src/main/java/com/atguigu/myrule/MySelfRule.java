package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: fengzai
 * @Date: 2021/1/19 9:42
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule (){
        return new RandomRule(); //定义随机
    }
}
