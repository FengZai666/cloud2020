package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: fengzai
 * @Date: 2020/12/8 11:08
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced  //LoadBalanced注解开启RestTemplate负载均衡功能。
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
