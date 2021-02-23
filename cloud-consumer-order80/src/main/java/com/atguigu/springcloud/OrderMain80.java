package com.atguigu.springcloud;

import com.atguigu.myrule.MySelfRule;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: fengzai
 * @Date: 2020/12/8 10:45
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="cloud-payment-service",configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
