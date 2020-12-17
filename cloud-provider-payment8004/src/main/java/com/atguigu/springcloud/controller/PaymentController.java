package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Author: fengzai
 * @Date: 2020/12/7 15:49 （日期和时间）
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private   String severPort;

    @GetMapping(value = "/payment/zk")
    public String paymentzk(){
        return "springcloud with zookeeper："+severPort+"\t"+ UUID.randomUUID().toString();
    }

}
